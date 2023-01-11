class Portaria {
    private val console = Console()

    fun controle(): Unit{
        var idade: Int = console.readInt("Qual a sua idade: ")

        if(idade < 18){
            println("Negado. Menores de idade não são permitidos.")
        }

        var tipoConvite:String = console.readString("Qual o tipo do convite: ")

        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido.")
        }else{
            println(tipoConvite)
        }
    }

}