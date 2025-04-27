public class NovoSwitchCase {
    public static void main(String[] args) {
        int day = 3;

        switch (day) { // Não precisa mais de break; (ele já entende que cada case é isolado)
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Thursday");
            case 4 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid day");
        }

    }
}
