package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    @Override
    public String toString() {
        return "AgendaContatos [agendaContatoMap=" + agendaContatoMap + "]";
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        System.out.println(agendaContatos);

        agendaContatos.adicionarContato("Renan Lima", 123456789);
        agendaContatos.adicionarContato("Marcela da silva Sales", 789456123);
        agendaContatos.adicionarContato("Caio Sales da Silva", 456123789);
        agendaContatos.adicionarContato("Rafael Sales da Silva", 78912345);
        agendaContatos.adicionarContato("Caio Sales da Silva", 456);
        System.out.println(agendaContatos);

        agendaContatos.removerContato("Caio Sales da Silva");

        System.out.println(agendaContatos);
    }
}
