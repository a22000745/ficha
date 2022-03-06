package pt.ulusofona.cm.kotlin.challenge.models

open class Date(val dia : Int, val mes : Int, val ano : Int) {
    override fun toString() : String{
        return "$dia-$mes-$ano"
    }
}