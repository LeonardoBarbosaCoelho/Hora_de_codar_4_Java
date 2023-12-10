import java.util.Scanner;

public class SomaDosDoisMaiores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        System.out.print("Digite o quarto valor: ");
        double valor4 = scanner.nextDouble();

        System.out.print("Digite o quinto valor: ");
        double valor5 = scanner.nextDouble();

        double somaDosDoisMaiores = somaDosDoisMaiores(valor1, valor2, valor3, valor4, valor5);

        System.out.println("A soma dos dois maiores valores é: " + somaDosDoisMaiores);

        scanner.close();
    }

    public static double somaDosDoisMaiores(double a, double b, double c, double d, double e) {
        double menorValor = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        double somaDosDoisMaiores = a + b + c + d + e - menorValor;
        return somaDosDoisMaiores;
    }
}