import java.util.Scanner;

public class MediaAritmeticaEInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (maior que o primeiro): ");
        int numero2 = scanner.nextInt();

        double media = (numero1 + numero2) / 2.0;

        System.out.println("A média aritmética dos dois números é: " + media);

        System.out.println("Números inteiros entre " + numero1 + " e " + numero2 + ":");
        for (int i = numero1 + 1; i < numero2; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}