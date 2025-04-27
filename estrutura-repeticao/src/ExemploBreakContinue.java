public class ExemploBreakContinue {

    public static void main(String[] args) {

        System.out.println("Exemplo com \033[93mcontinue\033[m:");
        // Usando continue
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("Número 3 encontrado. Pulando para próxima iteração...");
                continue;  // Pula o restante do código para o número 6
            }
            System.out.println(i);
        }

        // Usando break
        System.out.println("\nExemplo com \033[93mbreak\033[m:");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("Número 3 encontrado. Encerrando loop...");
                break;  // Encerra o loop quando i é igual a 6
            }
            System.out.println(i);
        }

        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3);
    }
}
