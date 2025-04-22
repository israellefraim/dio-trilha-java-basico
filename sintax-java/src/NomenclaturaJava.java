public class NomenclaturaJava {
// Classes começam com uma letra maiúscula e, se a palavra for composta, cada palavra subsequente também deve começar com maiúscula.
// O nome da classe dentro desse arquivo deve ser igual ao nome do arquivo, começando com maiúscula.

    public static void main(String[] args) {
        int idade;
        String nomeCompleto;
        // As variáveis devem ser escritas em letras minúsculas.
        // Se a variável for composta por várias palavras, a primeira palavra começa com minúscula e as palavras subsequentes começam com maiúsculas (camelCase).

        final int VALOR_MAXIMO = 100;
        final double PI = 3.14d;
        // Variáveis finais (constantes) devem ser escritas em letras maiúsculas, separadas por underscores (_).
        // O uso de letras maiúsculas torna evidente que a variável é uma constante e não deve ser modificada.

        String nome = nomeCompleto("Israel", "Sousa");
        System.out.println(nome);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
        // Os métodos devem ser nomeados com verbos no infinitivo que descrevem o que eles fazem.
        // Siga o padrão camelCase para nomear métodos.
    }
}