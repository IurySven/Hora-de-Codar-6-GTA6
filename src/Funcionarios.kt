fun Funcionarios() {
    val funcionarios = mutableMapOf<Int, List<Any>>(
        1 to listOf("iury", 1500.0),
        2 to listOf("danilo", 2000.0),
        3 to listOf("gustavo", 1700.0),
        4 to listOf("kawan", 1300.0),
        5 to listOf("mari", 1600.0),
        6 to listOf("grazi", 1600.0),
        7 to listOf("helo", 2000.0),
        8 to listOf("celio", 1500.0),
        9 to listOf("gabiel", 35000.0),
        10 to listOf("otavio", 0.0),
        11 to listOf("guilherme", 10.0),
        12 to listOf("malcom", 2000.0),
        13 to listOf("tina", 1600.0),
        14 to listOf("dessa", 1700.0),
        15 to listOf("murilo", 1600.0),
        16 to listOf("luiz", 2000.0),
        17 to listOf("fran", 1200.0),
        18 to listOf("mateus", 1800.0),
    )
    var count = funcionarios.size

    while (true) {
        println(
            "\nDigite uma Opção:\n" +
                    "(1) Cadastrar Funcionarios\n" +
                    "(2) Pesquisar Funcionarios\n" +
                    "(3) Mostrar Funcionarios com Salários Maiores R$1.000,00\n" +
                    "(4) Mostrar Funcionarios com Salários Menores R$1.000,00\n" +
                    "(5) Mostrar Funcionarios com Salários Iguais R$1.000,00\n" +
                    "(6) Sair"
        )

        print("Opção: ")
        when (readln().toInt()) {
            1 -> {
                if (count < 20) {
                    cadastrarFuncionarios(funcionarios)
                    count++
                } else {
                    println("Máximo de 20 funcionarios já cadastrados.")
                }
            }

            2 -> pesquisarFuncionarios(funcionarios)
            3 -> mostrarFuncionariosSalario(funcionarios, "maior")
            4 -> mostrarFuncionariosSalario(funcionarios, "menor")
            5 -> mostrarFuncionariosSalario(funcionarios, "igual")
            6 -> return
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}

fun cadastrarFuncionarios(funcionarios: MutableMap<Int, List<Any>>) {
    print("Digite a matrícula: ")
    val matricula = readln().toInt()

    print("Digite o nome: ")
    val nome = readln()

    print("Digite o salário: ")
    val salario = readln().toDouble()

    funcionarios[matricula] = listOf(nome, salario)
    println("Funcionario cadastrado com sucesso!")
}

fun pesquisarFuncionarios(funcionarios: MutableMap<Int, List<Any>>) {
    print("Digite a matrícula para pesquisa: ")
    val matricula = readln().toInt()

    val dados = funcionarios[matricula]

    if (dados != null) {
        println("Matrícula: $matricula\nNome: ${dados[0]}\nSalário: R$${dados[1]}")
    } else {
        println("Funcionario não encontrado.")
    }
}

fun mostrarFuncionariosSalario(funcionarios: MutableMap<Int, List<Any>>, criterio: String) {
    val sortedMap = funcionarios.toSortedMap()

    for ((matricula, dados) in sortedMap) {
        val salario = dados[1].toString().toDouble()

        when (criterio) {
            "maior" -> if (salario > 1000.0) imprimirFuncionarios(matricula, dados)
            "menor" -> if (salario < 1000.0) imprimirFuncionarios(matricula, dados)
            "igual" -> if (salario == 1000.0) imprimirFuncionarios(matricula, dados)
        }
    }
}

fun imprimirFuncionarios(matricula: Int, dados: List<Any>) {
    println("Matrícula: $matricula\nNome: ${dados[0]}\nSalário: R$${dados[1]}")
}
