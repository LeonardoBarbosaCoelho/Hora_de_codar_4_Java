import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();

        System.out.print("Digite a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A área do losango é: " + area);

        scanner.close();
    }
}