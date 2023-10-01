public class Carro extends Veiculo {   




    private void confereCambio(){
        System.out.println("Cambio em neutro");
    }

    private void confereCombustivel(){
        System.out.println("Tanque cheio");
    }

    private void confereAr(){
        System.out.println("Ar desligado");
    }


    public void ligar(){
        confereCambio();
        confereCombustivel();
        confereAr();
        System.out.println("carro Ligado.");

        
    }

    
    
}
