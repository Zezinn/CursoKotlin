fun ex1() {
    for (i in 1..50) {
        print("$i")
    }
}
fun ex2() {
    for (i in 50 downTo 1) {
        print("$i")
    }
}

fun ex3() {
    for (i in 1..50) {
        if(i % 5 == 0) {
            continue
        }
        print("$i")
    }
}

fun ex4() {
    var soma = 0;
    for (i in 1..500) {
        soma += i
    }
    println(soma)
}

fun ex5(n : Int) {


    for(i in 1..n) {
        for(j in 1..i) {
            print("#")
        }
        println()
    }
}

fun main() {
    //ex1()
    //ex2()
    //ex3()
    //ex4()
    ex5(10)
}