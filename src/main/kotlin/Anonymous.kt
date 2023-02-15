interface Event {
    fun onSuccess()
}

class Programa {
    fun salvar(e: Event, function: () -> Unit) {
        println("Abrindo conexões")
        println("Salvando valores")
        println("Sucesso. Conexões fechadas")
        e.onSuccess()
    }
}

fun main() {
    val p = Programa()
    p.salvar(object : Event) {
        override fun onSuccess() {
            print("On success!")
        }
    }
}