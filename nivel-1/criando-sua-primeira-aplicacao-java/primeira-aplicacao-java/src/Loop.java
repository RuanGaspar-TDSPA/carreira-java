import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme ");
            nota = entrada.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Média da avaliação " + mediaAvaliacao/3);
    }
}
