package apps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import functions.ReprodutorMusical;

public class Itunes implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo -> Back In Black (Live at River Plate 2009)");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado-> Back In Black (Live at River Plate 2009)");
    }


    
    @Override
    public void selecionarMusica() {
        // lista de músicas

        List musicas = new ArrayList<>();
        musicas.add("Back In Black (Live at River Plate 2009)");
        musicas.add("Take on Me");
        musicas.add("Sou eu assim sem você");
        musicas.add("True collors");
        musicas.add("Mix Beatles");

        // System.out.println(musicas);

       for(int i =0; i < musicas.size(); i++){
        System.out.println(musicas.get(i));
       }

    }

}
