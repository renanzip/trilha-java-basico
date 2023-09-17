public class UserSmartTv {
    public static void main (String[] args){
        SmartTv smartTv = new SmartTv();

        //vamos saber o estado atual da TV

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        //divisor
        System.out.println("----------------------------------------------------------------");
        //ligar a TV
        smartTv.ligar();
        //Aumentar volume
        smartTv.aumentarVolume();

        //imprimir o estado atual
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        //divisor
        System.out.println("----------------------------------------------------------------");
        //mudar canal
        smartTv.mudarCanal(45);

        //incrementar +1 canal. O resultado final esperado é 46
        smartTv.aumentarCanal();

        //novo status
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

    }
}
