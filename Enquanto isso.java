import java.util.Scanner;

public class DivisaoComValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        double valor2;
        do {
            System.out.print("Digite o segundo valor (não pode ser zero nem negativo): ");
            valor2 = scanner.nextDouble();
        } while (valor2 <= 0);

        double resultado = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + resultado);

        scanner.close();
    }
}