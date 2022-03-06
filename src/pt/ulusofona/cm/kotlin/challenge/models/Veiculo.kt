package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

open class Veiculo(val identificador: String, open var posicao: Posicao, open val dataDeAquisicao: Date) {
    fun requerCarta() : Boolean{
        return false;
    }
    override fun toString() : String{
        return "Veiculo | $identificador | $posicao | $dataDeAquisicao"
    }
}