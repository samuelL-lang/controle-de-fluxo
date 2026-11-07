package fluxo

fun main() {

    while (true) {

        println("===== MENU =====")
        println("1 - Opção 1")
        println("2 - Opção 2")
        println("3 - Manutenção")
        println("0 - Sair")

        val opcao = readLine()!!.toInt()

        if (opcao == 1 || opcao == 2) {
            println("Processando...")
        }

        else if (opcao == 3) {
            println("Módulo em manutenção")
            continue
        }

        else if (opcao == 0) {
            println("Encerrando programa...")
            break
        }
    }
}