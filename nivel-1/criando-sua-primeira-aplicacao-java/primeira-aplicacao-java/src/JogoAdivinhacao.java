import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100) + 1;
        int numeroTentativas = 0;
        int maxTentativas = 5;
        Scanner entrada = new Scanner(System.in);
        int tentativa = 0;
        boolean acertou = false;

        System.out.println("Adivinhe o número: " + maxTentativas + " tentativas");

        while(numeroTentativas < maxTentativas){
            System.out.println("Tentativa " + (numeroTentativas + 1) + ":");
            tentativa = entrada.nextInt();
            numeroTentativas++;

            if (tentativa == numero) {
                System.out.println("Parabéns, acertou!");
                acertou = true;

            } else if (tentativa > numero) {
                System.out.println("Número menor que isso");
            } else {
                System.out.println("Número maior que isso");
            }
        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram. O número era " + numero);
        }

    }
}
