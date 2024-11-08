fun Agenda(){
    val contatos = mutableMapOf(
        "iury" to listOf("111111111", "rua 01"),
        "danilo" to listOf("222222222", "rua 02"),
        "gustavo" to listOf("333333333", "rua 03"),
        "kawan" to listOf("444444444", "rua 04"),
        "mari" to listOf("555555555", "rua 05"),
        "grazi" to listOf("666666666", "rua 06"),
        "helo" to listOf("777777777", "rua 07"),
        "celio" to listOf("888888888", "rua 08"),
        "gabriel" to listOf("999999999", "rua 09"),

        )

    while (true){
        println("Digite uma Opção:\n" +
                "(1) Adicionar Contato\n" +
                "(2) Pesquisar Contato\n" +
                "(3) Mostrar Todos os Contatos\n" +
                "(4) Sair")

        print("Opção: ")
        when(val op = readln().toInt()){
            1 -> AdicionarC(contatos)
            2 -> PesquisarC(contatos)
            3 -> MostrarC(contatos)
            4 -> return

        }

    }

}

//funções

fun AdicionarC(contatos: MutableMap<String, List<String>>){
    print("Digite um Nome: ")
    val nome = readln().toLowerCase()

    print("Numero: ")
    val numero = readln()

    print("Endereço: ")
    val endereco = readln()

    if (contatos.size == 10){

        println("Agenda Cheia")

    }else{

        contatos[nome] = listOf(numero, endereco)

        println("!Adicionado na Agenda!")

    }

}

fun PesquisarC(contatos: MutableMap<String, List<String>>) {
    print("Pesquisa: ")
    val nome = readln().toLowerCase()
    val dados = contatos[nome]

    if (dados != null) {
        println(
            "Numero ${dados[0]}\n" +
                    "Endereço ${dados[1]}\n"

        )

    } else {
        println("Nome não Existente")

    }
}


fun MostrarC(contatos: MutableMap<String, List<String>>){
    val sortedMap = contatos.toSortedMap()

    for ((nome, dados) in sortedMap){
        println("$nome\n" +
                "Numero: ${dados[0]}\n" +
                "Endereço: ${dados[1]}\n")

    }

}