package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dento do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1244);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1834);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1214);
        conjuntoConvidados.adicionarConvidado("Convidado 50", 1204);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1204);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1204);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dento do Set de convidados");
        conjuntoConvidados.exibirConvidados();
    }
    
}
