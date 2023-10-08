package apps;

import functions.TelefoneApp;

public class Phone implements TelefoneApp{

    @Override
    public void ligar() {
        System.out.println("..........");
        System.out.println("Discando");
        System.out.println("95555-5555");
        System.out.println("..........");
    }

    @Override
    public void atender() {
        System.out.println("..........");
        System.out.println("Número Desconhecido");
        System.out.println(":(");
        System.out.println("Chamada em andamento");
        System.out.println("..........");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo Correio de Voz...");
    }
    
}
