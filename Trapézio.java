import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento da base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Digite o comprimento da base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Digite a altura do trapézio: ");
        double altura = scanner.nextDouble();

        double area = ((baseMaior + baseMenor) / 2) * altura;

        System.out.println("A área do trapézio é: " + area);

        scanner.close();
    }
}