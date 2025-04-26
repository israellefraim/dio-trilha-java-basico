import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = input.nextInt();
        input.nextLine();

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = input.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = input.nextLine();

        System.out.println("Digite o valor em saldo: ");
        double saldo = input.nextDouble();

        System.out.println("\nOlá " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco, sua agência é ") + numeroAgencia.concat(", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque."));
    }
}