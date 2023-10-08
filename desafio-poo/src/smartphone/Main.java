package smartphone;

import apps.Itunes;
import apps.Phone;
import apps.Safari;
import functions.NavegadorApp;

public class Main {

    public static void main(String[] args) {
        
        //Reprodutor Musical
        Itunes itunes = new Itunes();
        // itunes.tocar();
        // itunes.pausar();        
        // itunes.selecionarMusica();


        //AppPhone
        Phone phone = new Phone();
        // phone.ligar();
        // phone.atender();
        // phone.iniciarCorreioVoz();

        Safari safari = new Safari();
        // safari.adicionarNovaAba();
        // safari.atualizarPagina();
        // safari.exibirPagina();

    }
    
}
