public class Main {
    public static void main(String[] args) {
        System.out.println("\033[31mIniciou do programa no método main.");
        a();
        System.out.println("\033[31mFinalizou do programa no método main.");
    }

    // Quando não informa se o metodo é public ou private, ele se torna public por padrão
     static void a() {
        System.out.println("\033[32mEntrou no método a.");
        b();
        System.out.println("\033[32mFinalizou o método a.");
    }

    static void b() {
        System.out.println("\033[33mEntrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("\033[33mFinalizou o método b.");
    }

    static void c(){
        System.out.println("\033[34mEntrou no método c.");
        Thread.dumpStack();
        System.out.println("\033[34mFinalizou o método c.");
    }

}