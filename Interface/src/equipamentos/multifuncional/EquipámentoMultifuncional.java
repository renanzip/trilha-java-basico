package equipamentos.multifuncional;

import equipamentos.Impressora.Impressora;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;

public class EquipámentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar(){
        System.out.println("IMPRIMINDO NA MULTIFUNCIONAL..");
    }

    public void digitalizar(){
        System.out.println("DIGITALIZANDO NA MULTIFUNCIONAL");
    }

    public void imprimir(){
        System.out.println("IMPRIMINDO NA MULTIFUNCIONAL");
    }

    
}
