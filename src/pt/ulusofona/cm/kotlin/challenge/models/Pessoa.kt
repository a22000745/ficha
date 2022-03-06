package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import java.time.LocalDateTime
import java.util.*

class Pessoa(val nome : String, val dataDeNascimento : Date) {
    var posicao : Posicao = Posicao(0,0)
    var veiculos : MutableList<Veiculo?> = arrayListOf()
    var carta : Carta? = null
    fun comprarVeiculo(veiculo : Veiculo){
        veiculos.add(veiculo)
    }
    fun pesquisarVeiculo(identificador : String): Veiculo?{
        var encontrou = false
        var v : Veiculo? = null
        for(veiculo in veiculos) {
            if (veiculo != null) {
                if(veiculo.identificador == identificador){
                    encontrou = true
                    v = veiculo
                }
            }
        }
        if(!encontrou){
            throw VeiculoNaoEncontradoException()
        }else{
            return v
        }
    }
    fun venderVeiculo(identificador: String, comprador : Pessoa){
        val veiculo = pesquisarVeiculo(identificador)
        veiculos.remove(veiculo)
        comprador.veiculos.add(veiculo)
    }
    fun moverVeiculoPara(identificador: String, x : Int, y: Int){
        if(!temCarta()){
            throw PessoaSemCartaException(nome)
        }
        pesquisarVeiculo(identificador)?.posicao?.alterarPosicao(x,y)
    }
    fun temCarta() : Boolean {
        return carta != null
    }
    fun tirarCarta(){
        if ((LocalDateTime.now().dayOfYear - dataDeNascimento.year)< 18){
            throw MenorDeIdadeException()
        }else{
            carta = Carta()
        }
    }
    override fun toString() : String {
        var p = ""
        for(veiculo in veiculos){
            p += " | $veiculo"
        }
        return "Pessoa | $nome | $dataDeNascimento | $posicao$p"
    }
}