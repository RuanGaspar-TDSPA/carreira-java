// Criar uma classe Estudos para exibir anotações de estudo
// (mudei para anotação pois não quis criar nome de classe no plural)

import java.util.Scanner;

public class Anotacao {
    public String titulo;
    public String nota;
    private Scanner input;

    public Anotacao () {
        input = new Scanner(System.in);
    }

    public Anotacao(String titulo, String nota) {
        this.titulo = titulo;
        this.nota = nota;
    }

    public void anotar() {
        System.out.println("Titulo do documento: ");
        this.titulo = input.nextLine();
        System.out.println("Nota: ");
        this.nota = input.nextLine();
    }
    public void exibirNota() {
        System.out.println("Titulo do documento: " + this.titulo);
        System.out.println("Nota: " + this.nota);
    }
    public void fecharScanner() {
        input.close();
    }

}
