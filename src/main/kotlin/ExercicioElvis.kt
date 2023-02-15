fun main() {
    val str : String? = null
    println(str ?: "nulo")

    val idade = 18
    val str2 = if (idade > 18) "Maior de idade" else "Menor de idade"
}