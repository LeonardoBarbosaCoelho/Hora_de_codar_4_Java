import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        double media = soma / 10;

        System.out.print("Números informados: ");
        for (double valor : valores) {
            System.out.print(valor + " ");
        }

        System.out.println("\nA média aritmética é: " + media);

        scanner.close();
    }
}