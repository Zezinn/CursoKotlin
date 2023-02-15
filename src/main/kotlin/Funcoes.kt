fun converteAnos(anos: Int) {
    println("$anos anos equivalem a: ")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}

fun caracters(str : String) : Int {
    return str.length
}
fun cubo(n : Int) : Int {
    return n * n * n
}

fun milhasKm(milhas : Float) : Float {
    return milhas * 1.6f
}
fun trocaLetra(str: String) {
    println(str.replace("a","x", ignoreCase = true).lowercase())
}

fun main() {
    //converteAnos(5)
    println(caracters("tchubiraum daumdaum"))
    println(cubo(6))
    println(milhasKm(12f))
    trocaLetra("Aioleaiole ASASY xiadhisuh XIAUSDHIUH xxx aaa")
}