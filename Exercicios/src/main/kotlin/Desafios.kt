fun main(args: Array<String>) {

    AnaEpaula()

}

fun AnaEpaula(): Unit {
    val salario: Float = 10000f
    var saldoPaula: Float = 0f
    var saldoAna: Float = 0f
    var mes = 0

    do {
        saldoAna += (salario * 0.05f) + (salario * 0.05f) + (saldoAna * 0.002f)

        saldoPaula += (salario * 0.008f) + (saldoPaula * 0.008f)

        println("$saldoAna e $saldoPaula")
        mes++
    } while (saldoAna > saldoPaula)

    print(mes)


}