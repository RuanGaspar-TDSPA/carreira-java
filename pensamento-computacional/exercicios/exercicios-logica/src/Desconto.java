import java.util.Scanner;

public class Desconto {
    public int validarIdade(Scanner scanner) {
        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        while (idade < 1 || idade > 110) {
            System.out.println("Insira uma idade válida.");
            idade = scanner.nextInt();
            scanner.nextLine();
        }
        return idade;
    }
    public boolean descontoPorIdade(int idade) {
        return idade < 18;
    }
    public boolean descontoEstudante(String resposta){
        return resposta.equalsIgnoreCase("sim" ) || resposta.equalsIgnoreCase("s");
    }
}
