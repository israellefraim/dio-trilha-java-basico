import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Insira o primeiro parâmetro: ");
            int primeiroParametro = input.nextInt();

            System.out.print("Insira o segundo parâmetro: ");
            int segundoParametro = input.nextInt();

            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\033[91m\nINSIRA UM VALOR NUMÉRICO INTEIRO");
        }
    }
    static void contar(int primeiroParametro, int segundoParametro)  {
        if (segundoParametro > primeiroParametro) {
            System.out.println("---------------------------------");
            int numeroContagens = segundoParametro - primeiroParametro;
            for (int i = 1; i <= numeroContagens; i++) System.out.println("Imprimindo o número " + i);
        }
        else {
            throw new ParametrosInvalidosException("\033[91m\nPARÂMETROS INVÁLIDOS: O SEGUNDO PARÂMETRO DEVE SER MAIOR QUE O PRIMEIRO\033[m");
        }
    }
}