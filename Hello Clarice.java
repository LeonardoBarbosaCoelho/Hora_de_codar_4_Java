import java.util.Scanner;


public class SaudacaoUsuario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite seu nome: ");
    
        String nomeUsuario = scanner.nextLine();

        System.out.println("Olá, " + nomeUsuario);
        scanner.close();
    }
}