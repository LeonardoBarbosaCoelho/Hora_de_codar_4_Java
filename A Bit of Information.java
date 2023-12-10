import java.util.Scanner;

public class SaudacaoIdadeUsuario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idadeUsuario = scanner.nextInt();

        System.out.println("Olá, " + nomeUsuario + ", sua idade é " + idadeUsuario + " anos.");
        scanner.close();
    }
}