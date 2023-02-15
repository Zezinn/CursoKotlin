class Matematica {
    companion object NOME {
        val PI = 3.1415
        fun teste() {}

        init {
            println("Inicializado")
        }
    }

    object obj1 {
        val PI = 3.1415
        fun teste() {}

        init {

        }
    }
}

fun main() {
    Matematica.PI
    Matematica.PI
    Matematica.PI
}