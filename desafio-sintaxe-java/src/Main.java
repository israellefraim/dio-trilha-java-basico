// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        double primeiraTransacao = scanner.nextDouble();
        double segundaTransacao = scanner.nextDouble();
        double terceiraTransacao = scanner.nextDouble();


        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double transacoes = primeiraTransacao + segundaTransacao + terceiraTransacao;
        double saldoFinal = saldoInicial - transacoes;

        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}