fun main(args: Array<String>) {

    quadrado()
    trianguloEquilatero()
    validacaoIngresso()

}

fun validacaoIngresso() {

    print("Qual a sua idade: ")
    val idadeX = readLine()

    if (idadeX != null) {
        val idade = idadeX.toInt()
        if (idade < 18) {
            println("Negado. Menores de idade não são permitidos.")
        } else {
            println("Qual o tipo de convite(comum, premium e luxo: ")
            val convite = readLine()

            if (convite != null) {
                val x: String = convite.uppercase()
                if (x == "COMUM" || x == "PREMIUM" || x == "LUXO") {
                    println("Codigo de convite(XL,XT): ")
                    val codigo = readLine()
                    if (codigo != null) {
                        val y: String = codigo.uppercase()
                        if (y == "XL" || y == "XT") {
                            print("Welcome!")
                        } else {
                            print("Negado. Convite invalido")
                        }
                    }
                } else {
                    print("Negado. Convite inválido")
                }
            }
        }
    }


}

fun quadrado(): Unit {
    print("Digite um numero: ")
    val ladoA = readLine()
    print("Digite um numero: ")
    val ladoB = readLine()

    if (ladoA != null && ladoB != null && ladoA != "" && ladoB != "") {
        val x = ladoA.toInt()
        val y = ladoB.toInt()

        if (x == y) {
            print("É um quadrado \n")
        } else {
            print("Não é um quadrado")
        }
    }
} // Unit é igual ao Void

fun trianguloEquilatero(): Unit {
    print("Digite um numero: ")
    val ladoA = readLine()
    print("Digite um numero: ")
    val ladoB = readLine()
    print("Digite um numero: ")
    val ladoC = readLine()

    if (ladoA != null && ladoA != "" && ladoB != null && ladoB != "" && ladoC != null && ladoC != "") {
        val x: Int
        x = ladoA.toInt()
        val y = ladoB.toInt()
        val z = ladoC.toInt()

        if (x == y && x == z) {
            println("É um triangulo equilatero")
        } else {
            print("Não é um triangulo equilatero")
        }

    } else println("Error")
}