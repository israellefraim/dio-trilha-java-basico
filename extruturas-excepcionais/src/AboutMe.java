import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = input.nextLine();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = input.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = input.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = input.nextDouble();


            System.out.println("\nOlá me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é de " + altura + "m");
        } catch (InputMismatchException e) {
            System.out.println("\033[91m\nO campo de idade e altura precisam ser numéricos!\033[m");
        } finally {
            System.out.println("\033[mPrograma encerrado\033[m");
        }
    }
}