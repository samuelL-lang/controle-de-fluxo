package fluxo

fun main() {
    val alvo = 29
    var ehPrimo = true

    for (numero in 2 until alvo) {

        if (alvo % numero == 0) {
            ehPrimo = false
            break
        }
    }

    if (ehPrimo) {
        println("$alvo é primo")
    } else {
        println("$alvo não é primo")
    }
}