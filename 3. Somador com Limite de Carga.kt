package fluxo

fun main() {
    var total = 0

    for (numero in 1..100) {

        if (numero % 10 == 0) {
            continue
        }

        total += numero

        if (total > 500) {
            break
        }
    }

    println("Total final: $total")
}