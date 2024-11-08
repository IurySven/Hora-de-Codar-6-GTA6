fun QualaNota(){
    val alunos = mutableMapOf(
        "iury" to listOf("7", "Aprovado"),
        "danilo" to listOf("10", "Aprovado"),
        "gustavo" to listOf("8", "Aprovado"),
        "kawan" to listOf("6", "Aprovado"),
        "mari" to listOf("7", "Aprovado"),
        "grazi" to listOf("8", "Aprovado"),
        "helo" to listOf("10", "Aprovado"),
        "celio" to listOf("4", "Reprovado"),
        "gabriel" to listOf("10", "Aprovado"),
        "otavio" to listOf("0", "Expulso"),
        "guilherme" to listOf("-8", "Marketing"),
        "malcom" to listOf("10", "Aprovado"),
        "tina" to listOf("8", "Aprovado"),
        "dessa" to listOf("9", "Aprovado"),
        "murilo" to listOf("8", "Aprovado"),
        "luiz" to listOf("3", "Reprovado"),
        "fran" to listOf("4", "Reprovado"),
        "matheus" to listOf("9", "Aprovado"),


        )

    while (true){
        println("Digite uma Opção:\n" +
                "(1) Adicionar Aluno\n" +
                "(2) Pesquisar Aluno\n" +
                "(3) Mostrar Todos os Alunos\n" +
                "(4) Sair")

        print("Opção: ")
        when(val op = readln().toInt()){
            1 -> AdicionarA(alunos)
            2 -> PesquisarA(alunos)
            3 -> MostrarA(alunos)
            4 -> return

        }

    }

}

//funções

fun AdicionarA(alunos: MutableMap<String, List<String>>){
    print("Digite um Nome de um Aluno: ")
    val nome = readln().toLowerCase()

    print("Media: ")
    val media = readln().toString()

    val situacao = when {
        media >= 5.toString() -> "Aprovado"
        media <= (-1).toString() -> "Marketing"
        media == 0.toString() -> "Expulso"
        media < 5.toString() -> "Reprovado"
        else -> "Indefinido" }


    if (alunos.size == 20){

        println("Medias Cheia")

    }else{

        alunos[nome] = listOf(media, situacao)

        println("!Adicionado na Lista de Medias!")

    }

}

fun PesquisarA(alunos: MutableMap<String, List<String>>) {
    print("Pesquisa: ")
    val nome = readln().toLowerCase()
    val dados = alunos[nome]

    if (dados != null) {
        println(
            "Media ${dados[0]}\n" +
                    "${dados[1]}\n"

        )

    } else {
        println("Nome não Existente")

    }
}


fun MostrarA(alunos: MutableMap<String, List<String>>){
    val sortedMap = alunos.toSortedMap()

    for ((nome, dados) in sortedMap){
        println("$nome\n" +
                "Media: ${dados[0]}\n" +
                "${dados[1]}\n")

    }

}