public class FormatadorCepExemplo1 {
    public static void main(String[] args) throws CepInvalidoException{

            String cepFormatado = formatarCep("1523149");
            System.out.println(cepFormatado);

    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException("O cep não corresponde com as regras de negócio");

        return "15.231-494";
    }
}
