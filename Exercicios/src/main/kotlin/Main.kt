fun main(args: Array<String>) {
    /*
        * a. Crie um novo arquivo com uma função main.
        * b. Declare uma variável mutável capaz de armazenar seu nome completo.
        * c. Declare uma variável de texto sem valor algum.
        * d. Declare uma variável imutável com o menor tipo de dado possível capaz de armazenar o número que você calça.
        * e. Declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000).
        * f. Declare uma variável capaz de armazenar a população do Brasil (211.000.000).
        * g. Imprima o valor do PIB per capita.
        * h. Rode seu programa de maneira que não tenha erros de compilação ou execução.
      **/

    // b)
    var nome: String = "Thiago Carretero dos Santos"
    println(nome)

    // c)
    var texto: String

    // d)
    val numCalçado: Byte = 39
    println(numCalçado)

    // e)
    val PIB: Long = 1609000000000
    println(PIB)

    // f)
    val populacao: Int = 213993441
    println(populacao)

    // g)
    val PIB_perCapita: Double = 254360000000.0
    println("PIB 3º trimestre de 2022 $PIB_perCapita")

    val soma = sum(5, 10)

    println(soma)

}
fun sum(a: Int, b: Int): Int{
    return a + b
}