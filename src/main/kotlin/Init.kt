class Animal(var especie : String) {

    var fala : String = ""
    init {
        if (especie == "calopsita") {
            fala = "fiufiu"
        } else if (especie == "bode") {
            fala = "béeee"
        }
    }
    fun falar() {
        println(fala)
    }
}

fun main() {
    Animal("calopsita").falar()
}