// Usando equals e equalsIgnoreCase
import java.util.Scanner;

public class Comparacao {
    String senha = "i301020";
    String usuario = "Asd10";
    private Scanner sc;

    public void autenticarIgnoreCase (Scanner sc) {
        System.out.println("Reescreva seu nome de usuário: Asd10 " +
                "(Use minúsculas ou maiúsculas");
        String entradaUsuario = sc.nextLine();
        if  (entradaUsuario.equalsIgnoreCase(this.usuario)) {
            System.out.println("Usuário autenticado");
        } else  {
            System.out.println("Usuário inválido");
        }
    }

    public void autenticar(Scanner sc) {
        System.out.println("Digite sua senha: ");
        String entradaSenha = sc.nextLine();
        if (entradaSenha.equals(this.senha)) {
            System.out.println("Senha autenticada");
        } else {
            System.out.println("Senha invalida");
        }
    }

}
