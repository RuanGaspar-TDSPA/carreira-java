import java.util.Scanner;

public class ValorEntrega {
    public float calcularFrete (Scanner scanner){
        System.out.println("Digite a distância em Km:");
        int distancia = scanner.nextInt();
        scanner.nextLine();
        float preco = 0;
        System.out.println("Está chovendo?");
        String chuva = scanner.nextLine();

        if (distancia <= 5){
            distancia = 5;
        } else if (distancia <= 10) {
            distancia = 10;
        }  else {
            distancia = 15;
        }
        switch(distancia){
            case 5:
                preco = 5;
                break;
            case 10:
                preco = 8;
                break;
            case 15:
                preco = 10;
                break;
        }
        if(chuva.equalsIgnoreCase("sim") || chuva.equalsIgnoreCase("s")){
            preco += 2;
        }
        return preco;
    }

}
