fun main(args: Array<String>) {

    for (i in 1..50) {
        print("$i ")
    }
    println(" ")
    for (i in 50 downTo 1) {
        print(" $i")
    }
    println()
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
    }
    println()
    var x: Int = 0
    for (i in 1..500) {
        x = x + i

        print(" $x")
    }
    println()
    print("Digite um numero: ")
    var n = readLine()
    var contador: Int = 0
    if (n != null) {
        var n1: Int = n.toInt()

        for (i in 1..n1) {

            contador = i
            for (j in 1..contador) {
                print("#")
                contador++
            }
            println()
        }
    }


}