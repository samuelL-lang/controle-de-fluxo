package fluxo

fun main() {
    var saldo = 1000.0
    val saque = 150.0

    while (true) {

        if (saldo >= saque) {
            saldo -= saque
            println("Saque realizado: R$ $saque")
            println("Saldo atual: R$ $saldo")
        } else {
            println("Saldo Insuficiente")
            break
        }
    }
}