class Pessoa(val anoNascimento: Int, var nome : String) {
    var doc : String? = null

    constructor(anoNascimento: Int, nome: String, doc : String) : this(anoNascimento, nome) {
        this.doc = doc
    }

    fun dormir(){

    }

    fun acordar() {

    }
}

fun main() {
    var pessoa : Pessoa = Pessoa(2002, "Zè Ricardo","10912228431" )

    pessoa.acordar()
    pessoa.dormir()
}