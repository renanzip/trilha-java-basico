
public class Itens {
    private String nome;   
    private double preco;
    private int quantidade;


    public Itens(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Obtenção do nome
     public String getNome() {
        return nome;
    }

    // Obtenção do preço
     public double getPreco() {
        return preco;
    }

    // Obtenção da Quantidade
    public int getQuantidade(){
        return quantidade;
    }

    @Override
	public String toString() {
		return "Itens{" +
				"nome='" + nome + '\'' +
				", preco=" + preco +
				", quantidade=" + quantidade +
				'}';
	}

    
}
