package estabelecimento;

import equipamentos.Impressora.Deskjet;
import equipamentos.Impressora.Impressora;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.multifuncional.EquipámentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        // Impressora l6902 = new EquipámentoMultifuncional();
        // l6902.imprimir();

        // a multifuncional pode utilizar a função imprimir, mas não podemos usar a dekjet para implementar a digitalização
        Deskjet deskjet = new Deskjet();

        // Implementando a função digitalizar na multifuncional
        Scanner scanner = new Scanner();



        EquipámentoMultifuncional mfc0962 = new EquipámentoMultifuncional();
        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = mfc0962;



        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();


    }

}
