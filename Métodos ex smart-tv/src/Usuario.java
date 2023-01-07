public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.print("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.print("Canal Atual: " + smartTv.canal);

        System.out.print("Volume Atual " + smartTv.volume);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.print("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status => TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status => TV Ligada? " + smartTv.ligada);
    }
}
