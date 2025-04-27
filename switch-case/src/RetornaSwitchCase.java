public class RetornaSwitchCase {
    public static void main(String[] args) {
        int day = 4;

        String nomeDia = switch (day) { //Aqui, o switch retorna um valor que é atribuído direto na variável nomeDia
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            default -> {
                System.out.println("Invalid day");
                yield "Unknown"; //  yield é tipo um return, mas dentro do switch
            }
        };

        System.out.println(nomeDia);
    }
}
