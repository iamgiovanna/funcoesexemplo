inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T{
    println("Entrando com método $nomeFuncao")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado ...")
    }
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>){
    val resultado = executarComLog("soma"){
        somar(4,5)
    }
    println(resultado)
}