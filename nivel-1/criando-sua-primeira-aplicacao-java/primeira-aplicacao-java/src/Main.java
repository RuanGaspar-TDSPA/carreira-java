// Classe que chama os outros métodos dentro das classes

public static void main(String[] args) {
    IO.println("Bem-vindo ao Java 25!");

    Perfil perfil = new Perfil();
    Perfil perfil2 = new Perfil("Oi!", "Tudo bem e com você?");

    System.out.println("""
            ----- Menu de opções dos métodos e clases -----
            Escolha um número:
            1 ---> Perfil (cumprimento/pergunta) <-----------
            2 ---> Anotação (Exibir nota/gravar uma nota) <--
            3 ---> Soma (Exibir uma soma) <------------------
            4 ---> Subtração (Exibir uma subtração) <--------
            5 ---> Comparação (equals e equalsIgnoreCase) <--
            6 ---> Mensagem (Exibir textbox) <---------------
            7 ---> Filme (Exibir casting de var) <-----------
            8 ---> ConversorTemp (Exibe temperatura) <-------
            9 ---> Lógica (Exibe operações) <----------------
            """);

    Scanner sc = new Scanner(System.in);
    int opcao = sc.nextInt();
    switch (opcao) {
        case 1:
            System.out.println(perfil.cumprimento);
            System.out.println(perfil.pergunta);

            System.out.println(perfil2.cumprimento);
            System.out.println(perfil2.pergunta);
            break;
        case 2:
            Anotacao nota1 = new Anotacao();
            nota1.anotar();
            System.out.println("Título: " + nota1.titulo);
            System.out.println("Nota: " + nota1.nota);

            Anotacao nota2 = new Anotacao("Memórias", "Quando sentei ao seu lado, " +
                    "lembrei-me de Dona Rosa e como " +
                    "se sentira quando nos despedimos.");
            nota2.exibirNota();
            break;
        case 3:
            Soma  soma = new Soma();
            soma.somar();
            break;
        case 4:
            Subtracao subtracao = new Subtracao();
            subtracao.subtrair();
            break;
        case 5:
            Comparacao comparacao = new Comparacao();
            comparacao.autenticarIgnoreCase(sc);
            comparacao.autenticar(sc);
            break;
        case 6:
            Mensagem mensagem = new Mensagem();
            mensagem.exibirMensagem();
            break;
        case 7:
            Filme filme =  new Filme();
            filme.exibirCasting();
            break;
        case 8:
            ConversorTemp conversorTemp = new ConversorTemp();
            conversorTemp.converterTemperatura(sc);
            break;
        case 9:
            Logica logica = new Logica();
            logica.exibirMedia();
            logica.exibirCota();
            logica.exibirPalavraChave();
            logica.exibirTotal();
            logica.conversaoBRL();
            logica.preco();

            break;
    }
    sc.close();
}


