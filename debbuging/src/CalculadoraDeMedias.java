import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

                double media = calculaMediaDaTurma(alunos, scan);

                System.out.printf("Média da turma %.1f", media);
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nO VALOR INSERIDO DEVE SER NUMÉRICO\n");
            }
        }
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }

}