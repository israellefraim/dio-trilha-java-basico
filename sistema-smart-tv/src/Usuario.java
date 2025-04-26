public class Usuario {
    static SmartTv smartTv = new SmartTv();

    public static void main(String[] args) throws Exception{
        Usuario.mostrarStatus();
        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(334);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        Usuario.mostrarStatus();


    }
    public static void mostrarStatus() {
        System.out.println("\nTV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("");
    }
}
