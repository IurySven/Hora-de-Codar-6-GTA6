fun main(){

    while (true){
        print("Escolha a Atividade\n" +
                "(1)Agenda\n" +
                "(2)Qual a nota?\n" +
                "(3)Nome e Altura\n" +
                "(4)Funcionários\n" +
                "Opções: ")
        when(val op = readln().toInt()){
            1 -> Agenda()
            2 -> QualaNota()
            3 -> NomeeAlturas()
            4 -> Funcionarios()

        }

    }

}