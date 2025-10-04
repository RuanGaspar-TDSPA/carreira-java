/*
1 - Crie um programa que realize a média de duas notas decimais e exiba o resultado.

2 - Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da
variável double para int e imprima o resultado.

3 - Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua
valores a essas variáveis e concatene-as em uma mensagem.

4 - Declare uma variável do tipo double precoProduto e uma variável do tipo int
(quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade
e apresente o resultado em uma mensagem.

5 - Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a
essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a
conversão do valor em dólares para reais e imprima o resultado formatado.

6 - Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa
variável, representando o preço original de um produto. Em seguida, declare uma
variável do tipo double percentualDesconto e atribua um valor percentual de desconto
ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o
ao preço original e imprima o novo preço com desconto.

*/

import org.w3c.dom.ls.LSOutput;

public class Logica {
    // 1
    public double exibirMedia () {
        double nota1 = 9.5;
        double nota2 = 10.0;
        double media = (nota1 + nota2) / 2;
        System.out.println("media = " + media);
        return media;
    }

    // 2
    public void exibirCota () {
        double cota = 31.52;
        int cota2 = (int) cota;
        System.out.println("Original double: " + cota);
        System.out.println("Cota após casting para int: " + cota2);
    }
    // 3
    public void exibirPalavraChave () {
        char letra = 'A';
        String resto = "belha";
        System.out.println("Mensagem concatenada" + letra + resto);
    }
    // 4
    public void exibirTotal () {
        double precoProduto = 3.99;
        int quantidade = 2;
        double total = precoProduto * quantidade;
        System.out.println("O total é: " + total);
    }
    // 5
    public void conversaoBRL () {
        double valorEmDolares = 100.0;
        double cotacaoDolar = 4.94;
        double valorEmReais = valorEmDolares * cotacaoDolar;
        System.out.printf("O valor em BRL é: R$ %.2f%n", valorEmReais);
    }
    // 6
    public void preco () {
        double precoOriginal = 6.30;
        double percentualDesconto = 10.0;
        double desconto = precoOriginal * (percentualDesconto / 100);
        double precoFinal = precoOriginal - desconto;
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Preço com desconto: R$ %.2f%n", precoFinal);
    }


}
