package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

open class Motor(var cavalos : Int, var cilindrada : Int, var ligado : Boolean){
    override fun toString() : String {
        return "Motor | $cavalos | $cilindrada | $ligado"
    }
}