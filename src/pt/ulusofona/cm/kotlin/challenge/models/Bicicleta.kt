package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

class Bicicleta(identificador: String, posicao: Posicao, dataDeAquisicao: Date) : Veiculo(identificador, posicao, dataDeAquisicao), Movimentavel {
    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicao(x,y)
    }
    override fun toString() : String{
        return "Veiculo | $identificador | $posicao | $dataDeAquisicao"
    }
}