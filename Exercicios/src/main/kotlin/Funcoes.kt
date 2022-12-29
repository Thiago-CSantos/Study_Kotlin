
/*
Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
minutos e segundos. Saída desejada:
2 anos equivalem a:
24 meses
730 dias
17520 horas
1051200 minutos
63072000 segundos
1
2 Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
3 Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
4 Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).
Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
b. Escrever uma função para a troca de letras e impressão do valor final.
c. String final deve estar com todas as letras minúsculas.
5
Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se
sim, transforme-as.
 */
fun main(args: Array<String>) {

    tranformandoAnos(2)
    println(qtdCaracter("thiago carretero dos santos"))
    println(cuboNumero(5f))
    println(converterMilhas(9f))
    print(trocaLetra("MetallicA"))

}

fun trocaLetra(str: String): String{
    val frase: String = str.replace("a", "x", true)
    return frase
}

fun converterMilhas(num: Float): Float = num *1.6f
    //val x: Double = num * 1.6
    //return x


fun cuboNumero(n:Float):Float = n*n*n
    //return n*n*n


fun qtdCaracter(str: String): Int = str.length
    //val n:Int = str.length
   // return n


fun tranformandoAnos(x:Int): Unit{
    val meses: Int = x * 12
    val dias: Int = x * 365
    val horas: Int = dias * 24
    val minutos: Int = horas * 60
    val segundos: Int = minutos * 60

    println("Anos: $x")
    println("Meses: $meses")
    println("dias: $dias")
    println("horas: $horas")
    println("minutos: $minutos")
    println("segundos: $segundos")
}