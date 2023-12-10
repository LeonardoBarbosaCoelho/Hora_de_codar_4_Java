import java.util.Scanner;

public class CalculoMediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosAprovados = 0;

        do {
            double somaNotas = 0;
            for (int i = 1; i <= 6; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double mediaFinal = somaNotas / 6;

            if (mediaFinal >= 6.5) {
                System.out.println("Aluno aprovado! Média final: " + mediaFinal);
                alunosAprovados++;
            } else {
                System.out.println("Aluno reprovado. Média final: " + mediaFinal);
            }

            System.out.print("Calcular a média de outro aluno? (S/N): ");
            char resposta = scanner.next().charAt(0);

            if (resposta != 'S' && resposta != 's') {
                break; 
            }

        } while (true);

        System.out.println("Total de alunos aprovados: " + alunosAprovados);

        scanner.close();
    }
}