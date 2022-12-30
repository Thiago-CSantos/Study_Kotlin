fun main(args: Array<String>) {

    var caixa = 2000
    var balao = 7
    var numBaloes = 0
    while ((balao * numBaloes) + balao <= caixa) {
        numBaloes++
    }
    println("$numBaloes \n ${numBaloes * balao}")

    var num = 1

    while (num <= 50) {

        if (num % 3 == 0) {
            print("${num}Buzz ")
        }
        if (num % 5 == 0) {
            println("${num}Fizz ")
        }
        if (num % 3 == 0 && num % 5 == 0) {
            println("${num}FizzBuzz ")
        }
        num++
    }


    print(vereficarString("xxooox"))

    //imprimir()


}

fun vereficarString(str: String): Boolean {

    var n: Int = str.length
    var cont: Int = 0
    var x: Int = 0
    var y: Int = 0

    while (n > cont) {
        cont++
        if (str[cont - 1] == 'x') {

            x++
        }
        if (str[cont - 1] == 'o') {

            y++
        }
    }
    if (x == y) {
        return true
    } else {
        return false
    }

}


fun imprimir(): Unit {

    var str = readLine()
    if (str != null) {
        var contador: Int = 0
        var n = str.length

        while (contador < n) {
            contador++
            println("${str.reversed()[contador - 1]} $n")

        }
    }
}