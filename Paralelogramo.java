import java.util.Scanner;

public class AreaParalelogramo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do paralelogramo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do paralelogramo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do paralelogramo é: " + area);

        scanner.close();
    }
}