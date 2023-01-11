package control

import businiss.ConviteBusiniss
import entity.Convite

class Portaria {
    private val console = Console()
    private val conviteBusiniss = ConviteBusiniss()
    init {
        println("Portaria inicializada")
        println(this.controle())
    }

    private fun controle(): String {
        var idade: Int = console.readInt("Qual a sua idade: ")

        if (idade < 18) {
            return ("Negado. Menores de idade não são permitidos.")
        }

        var tipoConvite: String = console.readString("Qual o tipo do convite: ")
        if( conviteBusiniss.validaConvite(tipoConvite) ){
            return "Negado! Convite Inválido."
        }

        var codigo: String = console.readString("Qual o codigo do convite: ")
        val convite = Convite(tipoConvite, codigo)

        if (conviteBusiniss.codigoConvite(convite)){
            return "Negado! Convite Inválido."
        }


        return "TODO!"
    }

}