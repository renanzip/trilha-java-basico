import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Itens> listaDeItens;

    public CarrinhoDeCompras(){
        this.listaDeItens = new ArrayList<>();
    }

    //Construtor adição de item
    public void adicionarItem(String nome, double preco, int quantidade){
       Itens itens = new Itens(nome, preco, quantidade);
       this.listaDeItens.add(itens);
    }

    // Obter lista de item
    public void obterItens(){
        // System.out.println(listaDeItens);
        if(!listaDeItens.isEmpty()){
            System.out.println(this.listaDeItens);
        }else{
            System.out.println("Seu carrinho está vazio.");
        }
    }

    //Remover produtos
    public void removerProduto(String nome){
        List<Itens> itensParaRemover = new ArrayList<>();
        for(Itens i : listaDeItens){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        listaDeItens.removeAll(itensParaRemover);
    }

    // Exibir total de itens no carrinho
    public int exibirTotalDeItensNoCarrinho(){
        return listaDeItens.size();
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;

        if(!listaDeItens.isEmpty()){
            for(Itens item : listaDeItens){
               double valorItem = item.getPreco() * item.getQuantidade();
               valorTotal += valorItem; 
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

}

