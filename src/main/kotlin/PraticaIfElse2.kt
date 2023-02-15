fun quadrado() {
    print("Informe o lado 1: ")
    val lado1 = readLine()

    print("Informe o lado 2: ")
    val lado2 = readLine()

    if(lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if(x == y) {
            println("É um quadrado")
        } else {
            println("Não é um quadrado.")
        }
    }
}

fun triangulo() {
    print("Informe o lado 1: ")
    val lado1 = readLine()

    print("Informe o lado 2: ")
    val lado2 = readLine()

    print("Informe o lado 3: ")
    val lado3 = readLine()


    if(lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()
        if(x == y && y == z) {
            println("É um triângulo equilátero")
        } else {
            println("Não é um triângulo equilátero")
        }
    }
}


fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0 )
            println("Primeira string")
            else println("Segunda string")
        }
        println("Terceira string")
    }

fun portaria() {
    print("Qual sua idade?: ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado, menores de idade não são permitidos")
            return
        }
    }
    print("Qual é o tipo de convite?")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("NEGADO! CONVITE INVÁLIDO.")
            return
        }
            println("Qual o código do convite?")
            var codigo = readLine()

            if(codigo != null && codigo != "") {
                codigo = codigo.lowercase()
                if(tipoConvite == "comum" && codigo.startsWith("xt")) {
                    println("BEM VINDO!")
                }  else if (tipoConvite == "premium" || tipoConvite == "luxo" && codigo.startsWith("xl")){
                    println("BEM VINDO!")
                } else {
                    println("NEGADO! Convite inválido.")
                }
            }
        }
    }

fun main() {
    //quadrado()
    //triangulo()
    //qualASaida(4)
    portaria()
}