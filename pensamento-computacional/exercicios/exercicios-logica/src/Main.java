import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Desconto desconto = new Desconto();
        ValorEntrega valorEntrega = new ValorEntrega();
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        // Organizando os métodos através de um menu simples:
        while (true){
            System.out.println("Escolha uma opção:");
            System.out.println("1. ValorEntrega");
            System.out.println("2. Desconto");
            System.out.println("3. ConversorMoeda");
            System.out.println("4. BalcãoCafeteria");
            System.out.println("0. Sair");

        int opcao = Integer.parseInt(scanner.nextLine());
        switch (opcao){
            case 1:
                float precoFrete = valorEntrega.calcularFrete(scanner);
                System.out.printf("O valor do frete é: R$ %.2f\n", precoFrete);
                break;
            case 2:
                int idade = desconto.validarIdade(scanner);
                System.out.println("Você possui carteira de estudante?");
                String respostaEstudante = scanner.nextLine();
                if (desconto.descontoPorIdade(idade)) {
                    System.out.println("Parabéns, você tem direito a desconto!");
                } else if (desconto.descontoEstudante(respostaEstudante)) {
                    System.out.println("Parabéns, estudante, você tem direito a desconto!");
                } else {
                    System.out.println("Sinto muito! Você pagará o valor integral.");
                }
                break;
            case 3:
                java.math.BigDecimal valorConvertido = conversorMoeda.cambio(scanner);
                System.out.println("Valor convertido: R$ " + valorConvertido
                        .setScale(2, RoundingMode.HALF_UP).toPlainString());
                break;
            case 4:
                Pedido pedidoCliente = Pedido.criarPedido(scanner);
                System.out.println("Nome do item: " + pedidoCliente.itens   );
                System.out.printf("O total do pedido é: R$ %.2f\n", pedidoCliente.total);
                break;
            case 0:
                System.out.println("Saindo...");
                scanner.close();
                return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
            System.out.println();

        }
    }
}
