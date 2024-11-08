fun NomeeAlturas(){
    val alturas = mutableMapOf(
        "iury" to listOf(1.9),
        "danilo" to listOf(1.8),
        "gustavo" to listOf(1.85),
        "kawan" to listOf(1.85),
        "mari" to listOf(1.4),
        "grazi" to listOf(1.5),
        "helo" to listOf(1.4),
        "celio" to listOf(1.6),
        "gabriel" to listOf(1.7),
        "malcom" to listOf(1.6),
        "tina" to listOf(1.5),
        )

    while (true){
        println("Digite uma Opção:\n" +
                "(1) Adicionar Altura\n" +
                "(2) Pesquisar Altura\n" +
                "(3) Mostrar a Media de Todos as Alturas\n" +
                "(4) Sair")

        print("Opção: ")
        when(val op = readln().toInt()){
            1 -> AdicionarAl(alturas)
            2 -> PesquisarAl(alturas)
            3 -> MediaAl(alturas)
            4 -> return

        }

    }

}

//funções

fun AdicionarAl(alturas: MutableMap<String, List<Double>>){
    print("Digite um Nome: ")
    val nome = readln().toLowerCase()

    print("Digite sua Altura(0.00): ")
    val altura = readln().toDouble()


    if (alturas.size == 15){

        println("Agenda Cheia")

    }else{

        alturas[nome] = listOf(altura)

        println("!Altura Adicionada!")

    }

}

fun PesquisarAl(alturas: MutableMap<String, List<Double>>) {
    val sortedMap = alturas.toSortedMap()

    print("Alturas:\n" +
            "(1) Menores ou Iguais a 1.5m\n" +
            "(2) Maiores que 1.5m\n" +
            "(3) Maiores que 1.5m e Menores que 2.0m\n")

    when(readln().toInt()){
        1 -> for ((nome, dados) in sortedMap) {
            val altura = dados[0]
            if (altura <= 1.5) {
            println("$nome\n" +
                    "Altura: $altura\n")
            }
        }

        2 -> for ((nome, dados) in sortedMap) {
            val altura = dados[0]
            if (altura > 1.5) {
                println("$nome\n" +
                        "Altura: $altura\n")
            }
        }

        3 -> for ((nome, dados) in sortedMap) {
            val altura = dados[0]
            if (altura > 1.5 && altura < 2.0) {
                println("$nome\n" +
                        "Altura: $altura\n")
            }

        }

    }

}


fun MediaAl(alturas: MutableMap<String, List<Double>>){

    var alturasoma = 0.0
    var media = 0.0
    for ((_, dados) in alturas) {
        alturasoma += dados[0]
    }
    media = alturasoma / alturas.size

    println("A Media de Todas as Alturas Cadastradas é de: $media")

}