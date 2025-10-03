// Criar uma classe Estudos para exibir anotações de estudo
// (mudei para anotação pois não quis criar nome de classe no plural)

import java.util.Scanner;

public class Anotacao {
    public String titulo;
    public String nota;

    public Anotacao() {
    }
    public Anotacao(String titulo, String nota) {
        this.titulo = titulo;
        this.nota = nota;
    }

    public void anotar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Titulo do documento: ");
        this.titulo = input.nextLine();
        System.out.println("Nota: ");
        this.nota = input.nextLine();
    }
    public void exibirNota() {
        System.out.println("Titulo do documento: " + this.titulo);
        System.out.println("Nota: " + this.nota);
    }


}
