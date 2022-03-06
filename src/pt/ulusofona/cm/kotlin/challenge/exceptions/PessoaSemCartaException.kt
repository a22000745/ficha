package pt.ulusofona.cm.kotlin.challenge.exceptions

class PessoaSemCartaException(val nome : String): Exception() {
    override fun toString() : String {
        return "$nome não tem carta para conduzir o veículo indicado"
    }
}