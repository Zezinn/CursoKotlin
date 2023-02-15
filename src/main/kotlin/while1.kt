fun while1() {
    val capCaixa = 2000
    val capBalao = 7

    var numBaloes = 0
    while ((numBaloes * capBalao) + capBalao < capCaixa) {
        numBaloes++
    }

    println("Na caixa d´água cabem $numBaloes.")
}

fun while2() {
    var i = 1
    while(i <= 50) {
        if ( i % 15 == 0 ) {
            print("FizzBuzz")
        } else if ( i % 3 ==0 ) {
            print("Buzz")
        } else if ( i % 5 == 0 ) {
            print("Fizz")
        } else {
            print(" $i ")
        }
        i++
    }
}

fun while3(str : String) {
    var i = str.length - 1
    while (i >= 0 ) {
        print(str[i])
        i--

    }
}

fun while4(str: String) : Boolean {
    val strLower = str.lowercase()

    var countx = 0
    var count0 = 0

    var i = 0
    while (i < strLower.length) {
        if (str[i] == 'x') {
            countx++
        } else if (str[i] == 'o') {
            count0++
        }
        i++
    }
    return ((countx == count0) && (countx != 0))
}

fun main() {
    //while1()
    //while2()
    //while3("Todo severino é Biu, mas nem todo Biu é Severino")
    println(while4("Xxxx"))
    println(while4("xxxxxssss"))
    println(while4("xxxxxo"))
    println(while4("bdeghjkjkj"))
    println(while4("oooooooooxzzzzz"))
    println(while4("xxxxxxx"))
}