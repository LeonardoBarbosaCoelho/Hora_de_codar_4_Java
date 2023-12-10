import java.util.Scanner;

public class MediaDoSemestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota da avaliação " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / 4;

        System.out.println("A média do semestre é: " + media);

        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado.");
        }
        scanner.close();
    }
}