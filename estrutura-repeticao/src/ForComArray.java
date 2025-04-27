public class ForComArray {
    public static void main(String[] args) {
        String[] nomes = {"ISRAEL", "LUIS", "PEDRO", "JOÃO"};

        // percorrer usando length
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("O aluno na posição " + i + " é " + nomes[i]);
        }

        // percorrer usando for-each, onde a variável aluno assume cada valor da array a cada iteração
        for (String aluno : nomes) {
            System.out.println(aluno);
        }
    }
}