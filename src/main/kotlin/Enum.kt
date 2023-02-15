enum class Prioridade(val value: Int) {
    Baixa(1) {
        override fun toString(): String {
            return "Prioridade baixa: $value"
        }
    },
    Media(5),
    Alta(15)
}

fun main() {
    for (p in Prioridade.values()) {
        println(p)
    }
}