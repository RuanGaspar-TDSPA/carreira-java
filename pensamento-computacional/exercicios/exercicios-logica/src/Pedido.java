import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    public List<String> itens;
    public double total;

    public Pedido(List<String> itens, double total) {
        this.itens = itens;
        this.total = total;
    }
    public static Pedido criarPedido (Scanner scanner) {
        List<String> itens = new ArrayList<>();
        double total = 0.0;

        String adicionar;
        do {
            System.out.println("Digite o nome do produto:");
            String item = scanner.nextLine();
            itens.add(item);

            System.out.println("Digite a quantidade do produto:");
            int quantidade = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite a valor do produto:");
            double valor = Double.parseDouble(scanner.nextLine());

            total += quantidade * valor;

            System.out.println("Deseja adicionar mais produtos?(s/n)");
            adicionar = scanner.nextLine();

        } while (adicionar.equalsIgnoreCase("Sim") || adicionar.equalsIgnoreCase("s"));

        System.out.println("O cliente possui cadastro? (s/n)");
        String cadastro =  scanner.nextLine();

        if (cadastro.equalsIgnoreCase("Sim") || cadastro.equalsIgnoreCase("s")) {
            total = total * 0.90;
        }
        return new Pedido(itens, total);
    }
}
