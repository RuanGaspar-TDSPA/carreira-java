// Criar uma classe Perfil para exibir a mensagem "Olá" e uma nova mensagem "Tudo bem?"

public class Perfil {
    public String cumprimento;
    public String pergunta;

    public Perfil() {
        this.cumprimento = "Olá!";
        this.pergunta = "Tudo bem?";
    }

    public Perfil (String cumprimento, String pergunta ){
        this.cumprimento = cumprimento;
        this.pergunta = pergunta;

    }

}
