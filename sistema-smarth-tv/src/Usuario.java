public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv =  new SmartTv();

        System.out.println("A televisão está ligada ? " + smartTv.ligada);
        smartTv.desligada();
        System.out.println("Novo status -> Tv ligada ? " + smartTv.ligada);
        smartTv.ligada();
        System.out.println("Novo status -> Tv ligada ? " + smartTv.ligada);
        

        System.out.println("Está no canal : " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Esta canal : " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Esta canal : " + smartTv.canal);
        
        
        System.out.println("No volume : " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume);

    }
}
