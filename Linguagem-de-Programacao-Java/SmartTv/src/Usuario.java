public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        System.out.println(smartTv.ligada);
        smartTv.ligar ();
        System.out.println(smartTv.ligada);
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);
        
        smartTv.mudarCanal(13);
        System.out.println("Mudando para canal: " +smartTv.canal);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.desligar();
        System.out.println(smartTv.ligada);
    }
}
