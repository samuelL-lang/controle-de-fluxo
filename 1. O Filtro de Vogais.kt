package fluxo

import kotlin.text.iterator

fun main() {
    val palavra = "Universidade"

    for (letra in palavra) {

        if (letra in "aeiouAEIOU") {
            continue
        }

        print(letra)
    }
}