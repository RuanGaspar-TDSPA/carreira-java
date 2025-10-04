// Exemplos de casting
public class Filmes {
    double media = (9.8 + 6.3 + 8.0 ) / 3;
    int anoDeLancamento;
    String sinopse = """
    Filme Top Gun
    Filme de aventura com ator dos anos 80
    Muito bom!
    Ano de lançamento """ + anoDeLancamento;
    public void exibirSinopse() {
        System.out.println(sinopse);
    }

    int classificacao = (int) (media /2);

    public void exibirClassificacao() {
        System.out.println(classificacao);
    }
    // casting implícito
    int x = 10;
    double y = x;
    // Casting explícito
    double v = 10.5;
    int w = (int) v;
    public void exibirCasting () {
        System.out.println(y);
        System.out.println(w);
    }

}
