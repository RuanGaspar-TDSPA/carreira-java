import java.sql.SQLOutput;
import java.util.Scanner;

// Converter ºC --> ºF
public class ConversorTemp {

    public double converterTemperatura (Scanner sc) {

        System.out.println("Digite o temperatura em celcius: ");

        if (sc.hasNextDouble()) {
            double temperaturaC = sc.nextDouble();
            double temperaturaF = temperaturaC * 1.8 + 32;
            int temperaturaFCast = (int) temperaturaF;
            System.out.println("Temperatura em celcius: " + temperaturaC + " " +
                    "Temperatura em farenheit: " + temperaturaF);
            // casting para truncar temperatura em farenheit
            System.out.println("Temperatura em Farenheight no casting: " + temperaturaFCast);
            return temperaturaF;
        } else {
            System.out.println("Entrada inválida.");
            sc.next();
        }
    return converterTemperatura(sc);
    }
}
