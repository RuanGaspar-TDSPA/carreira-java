import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ConversorMoeda {
    public BigDecimal cambio(Scanner scanner) {
        BigDecimal valor  = null;
        BigDecimal taxa = new BigDecimal("5.32");

        while (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Insira um valor positivo:");
            String entrada = scanner.nextLine().trim();

            entrada = entrada.replace(',', '.');

            try {
                valor = new BigDecimal(entrada);
                if (valor.compareTo(BigDecimal.ZERO) <= 0) {
                    System.out.println("O valor deve ser positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, digite um número válido");
            }
}
    return valor.multiply(taxa).setScale(2, RoundingMode.HALF_UP);
    }

}
