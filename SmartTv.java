public class SmartTv {

    //Sistema para controle remote de Smart TV

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Métodos para manipular a Smart TV
    public void ligar(){
       ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        //aumenta o volume incrementando  1
        volume++;
    }

    public void diminuirVolume(){
        //aumenta o volume incrementando  1
        volume--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal++;
    }

}
