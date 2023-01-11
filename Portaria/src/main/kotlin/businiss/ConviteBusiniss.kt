package businiss

import entity.Convite

class ConviteBusiniss {

    fun validaConvite(tipoConvite: String): Boolean {
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            return true
        } else {
            return false
        }
    }

    fun codigoConvite(convite: Convite): Boolean {

        if (convite.tipo == "comum" && convite.codigo.startsWith("xt")) {
            return false
        }
        else if ((convite.tipo == "premium" || convite.tipo == "luxo") && convite.codigo.startsWith("xl")) {
           return false
        }
        else {
            return true
        }
    }

}