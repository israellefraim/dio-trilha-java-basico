public class Operadores2
{
    public static void main(String[] args) {
        int a = 3, b = 5;
        String resultado;

        resultado = (b == a && b > a) ? "Sim" : "Não";

        System.out.println(resultado);

        resultado = (b == a || b > a) ? "Sim" : "Não";

        System.out.println(resultado);
    }
}
