import java.util.Scanner;
/*
Vimos como usar comparações para condicionais, integrar leitura do teclado com a classe Scanner, explorar alternativas
para condicionais e empregar estruturas de repetição como for e while. Esses conhecimentos constituem a base para o
desenvolvimento eficaz de programas em Java.
Para aprimorar essas habilidades, propomos atividades práticas (não obrigatórias). Vamos lá?
*/
public class Praticando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                --- Menu Principal ---
                1 - Exercício 1
                2 - Exercício 2
                3 - Exercício 3
                4 - Exercício 4
                5 - Exercício 5
                6 - Exercício 6
                """);
        switch(sc.nextInt()){
            case 1:
                // Exercício 1
                // Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba
                // "Número positivo", caso contrário, exiba "Número negativo".
                System.out.println("Digite um numero: ");
                int num = sc.nextInt();
                if (num < 0) {
                    System.out.println("Número negativo");
                } else {
                    System.out.println("Número positivo");
                }
                break;
            case 2:
                // Exercício 2
                // Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando
                // se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
                System.out.println("Digite dois numeros: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (num1 == num2) {
                    System.out.println("Números iguais");
                } else {
                    System.out.println("Números diferentes");
                    if(num1 > num2) {
                        System.out.println("Primeiro número é maior");
                    } else {
                        System.out.println("Segundo número é maior");
                    }
                }
                break;
            case 3:
                // Exercício 3
                // Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular
                // área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção
                // selecionada.
                System.out.println("""
                ---- Submenu ----
                1 - Calcular a área do quadrado
                2 - Calcular a área do círculo
                """);
                int opcao = sc.nextInt();
                sc.nextLine();
                switch(opcao){
                    case 1:
                        // Cálculo da área do quadrado
                        System.out.println("Digite o lado A");
                        int ladoA = sc.nextInt();
                        System.out.println("Digite o lado B");
                        int ladoB = sc.nextInt();
                        int calculo = ladoA * ladoB;
                        System.out.println("A área do quadrado é " + calculo);
                        break;
                    case 2:
                        System.out.println("""
                                Escolha o dado a inserir: 
                                A - Diâmetro
                                B - Raio
                                """);
                        String escolhaCirculo = sc.nextLine();

                        if (escolhaCirculo.equalsIgnoreCase("A")) {
                            System.out.println("Digite o valor do Diâmetro: ");
                            double d = sc.nextDouble();
                            double r = d/2;
                            double calculoCirc = Math.PI*(r * r);
                            System.out.println("A área do círculo é " + calculoCirc);

                        } else if (escolhaCirculo.equalsIgnoreCase("B")) {
                            System.out.println("Digite o valor do Raio: ");
                            double raio = sc.nextDouble();
                            double calculoRaio = Math.PI*(raio * raio);
                            System.out.println("A área do círculo é " + calculoRaio);
                        } else {
                            System.out.println("Opção invalida. Escolha entre A e B.");
                        }
                        break;
                        default:
                            System.out.println("Opção invalida. Escolha entre 1 e 2.");
                }
                break;
            case 4:
                // Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

                break;
            case 5:
                // Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é
                // par ou ímpar e exiba uma mensagem correspondente.
                break;
            case 6:
                // Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
                break;
                default:
                    System.out.println("Opço invalida. Escolha entre 1 e 6.");
        }
    }
}
