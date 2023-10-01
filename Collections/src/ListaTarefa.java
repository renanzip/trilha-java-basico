import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }       

    // Construtor para adição de Tarefas
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // Construtor para Remoção de Tarefas
    public void removerTarefa(String descricao){
        
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }            
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    // Construtor para Obter o total de tarefas (int)
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    // Construtor para obter as Descrições
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");        
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");

        

        // listaTarefa.removerTarefa("Tarefa 2");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
