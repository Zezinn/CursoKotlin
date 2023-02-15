fun main() {
    //endereco(cidade = "cidade", rua = "street", estado = "los santos")
    //println(media(abc = false, notas = 10f, 8f, 2, "", false, 98f))

    arrayOf(2,2,3,6,2,6,45f, false)
    "sdkibiridop".startsWith("sd")
}

fun endereco(rua: String, cidade: String, estado : String, cep : String = "", num : Int = 0) {

}

//fun media(vararg notas: Float) : Float {
    //var soma = 0f
   // for (n in notas) {
     //   soma += n
    //}
    //return ( soma / notas.size)
//}

fun <T, J> media(abc: J, vararg notas : T) : Float {
    var soma = 0f
    for (n in notas) {
        if ( n is Float) {
            soma += n
        }
    }
    return (soma / notas.size)
}