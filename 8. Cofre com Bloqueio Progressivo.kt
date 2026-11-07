package fluxo

fun main() {

    val senhaCorreta = "1234"
    var acesso = false

    for (tentativa in 1..5) {

        val senha = readLine()!!

        if (senha == senhaCorreta) {
            println("Acesso permitido!")
            acesso = true
            break
        } else {
            println("Senha incorreta!")

            if (tentativa == 3) {
                println("Cofre travado administrativamente")
                break
            }
        }
    }

    if (!acesso) {
        println("Acesso negado!")
    }
}