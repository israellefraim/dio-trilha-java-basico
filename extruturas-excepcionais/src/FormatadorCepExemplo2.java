public class FormatadorCepExemplo2 {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("1523149");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // System.out.println("O cep não corresponde com as regras de negócio");
            System.out.println(e.getMessage());
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            // não precisa de mensagem no formato de texto String
            throw new CepInvalidoException("O cep não corresponde com as regras de negócio");

        return "15.231-494";
    }
}
