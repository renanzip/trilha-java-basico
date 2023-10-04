package agendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    // Atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome))
            c.setNumero(novoNumero);
            contatoAtualizado = c;
            break;
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Renan Lima", 12345678);
        agendaContatos.adicionarContato("Renan Lima", 12345678);
        agendaContatos.adicionarContato("Marcela Sales", 78945612);
        agendaContatos.exibirContato();
        agendaContatos.atualizarNumeroContato("Renan Lima", 11111111);
        agendaContatos.exibirContato();
        agendaContatos.adicionarContato("Renan Lima", 555555555);
        agendaContatos.adicionarContato("Renan Lima", 555555555);
        agendaContatos.adicionarContato("Renan Lima", 555555555);
        agendaContatos.adicionarContato("Renan Lima", 555555555);
        agendaContatos.exibirContato();

    }

}
