// Classe que chama os outros métodos dentro das classes

public static void main(String[] args) {
    IO.println("Bem-vindo ao Java 25!");

    Perfil perfil = new Perfil();
    Perfil perfil2 = new Perfil("Oi!", "Tudo bem e com você?");

    System.out.println(perfil.cumprimento);
    System.out.println(perfil.pergunta);

    System.out.println(perfil2.cumprimento);
    System.out.println(perfil2.pergunta);

    Anotacao nota1 = new Anotacao();
    nota1.anotar();
    System.out.println("Título: " + nota1.titulo);
    System.out.println("Nota: " + nota1.nota);

    Anotacao nota2 = new Anotacao("Memórias", "Quando sentei ao seu lado, " +
            "lembrei-me de Dona Rosa e como " +
            "se sentira quando nos despedimos.");
    nota2.exibirNota();

    Soma  soma = new Soma();
    soma.somar();

    Subtracao subtracao = new Subtracao();
    subtracao.subtrair();

}


