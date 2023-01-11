class Console {

    fun readInt(msg: String): Int {
        var retorno: Int? = null
        do {
            print(msg)
            var info: String? = readLine()

            if (info != null) {
                retorno = info.toIntOrNull()

                if (retorno == null || retorno <= 0) {
                    println("Valor inválido")
                }

            }
        } while (retorno == null || retorno <= 0)
        return retorno
    }

    fun readString(msg: String): String {
        var retorno: String? = null
        do {
            print(msg)
            var info: String? = readLine()

            if (info != null && info != "") {
                retorno = info.lowercase()
            } else {
                println("Valor inválido")
            }

        } while (retorno == null)
        return retorno
    }

}