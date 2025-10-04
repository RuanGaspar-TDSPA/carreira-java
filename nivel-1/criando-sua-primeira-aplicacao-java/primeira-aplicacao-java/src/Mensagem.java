// Exibir mensagem usando text box
public class Mensagem {
    String nome = "João";
    int aulas = 4;
    String mensagem = """
            Olá, %s!
            Boas vindas ao curso de Java.
            Teremos %d aulas para te mostrar 
            o que é preciso para você dar o 
            seu primeiro mergulho na linguagem!""".formatted(nome, aulas);
    public void exibirMensagem () {
        System.out.println(mensagem);

    }

}
