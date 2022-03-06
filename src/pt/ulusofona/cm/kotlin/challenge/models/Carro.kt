package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

class Carro(var motor: Motor, identificador: String) : Veiculo(identificador, posicao, dataDeAquisicao), Movimentavel, Ligavel {
    /*verride var posicao : Posicao = Posicao(0,0)
    override var dataDeAquisicao : Date = Date()*/
    override fun ligar() {
        if(motor.ligado){
            throw VeiculoLigadoException()
        }
        motor.ligado = true;
    }

    override fun desligar() {
        if(!motor.ligado){
            throw VeiculoDesligadoException()
        }
        motor.ligado = false
    }

    override fun estaLigado(): Boolean {
        return motor.ligado
    }
    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicao(x,y)
    }
    override fun toString() : String{
        return "Veiculo | $identificador | $posicao | $dataDeAquisicao | $motor"
    }
}