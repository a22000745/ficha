package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException

open class Posicao(var x : Int, var y : Int) {
    fun alterarPosicao(x : Int, y : Int){
        if(x == this.x && y == this.y){
            throw AlterarPosicaoException()
        }
        this.x = x
        this.y = y
    }
    override fun toString() : String {
        return "Posicao | x:$x | y$y"
    }
}