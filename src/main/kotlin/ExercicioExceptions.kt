fun main() {
    try {
        val s: String? = null
        println(s!!.length)

        val a = 10/0
    } catch (e: NullPointerException) {
        println("A variável é nula.")
    } catch (e: ArithmeticException) {
        println("Não é possível dividir por zero.")
    }
    println("Fim")
}