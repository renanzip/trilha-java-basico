public class AdicionarItemCarrinho {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();       
        

        carrinhoDeCompras.adicionarItem("Balde Branco", 55.55, 102);
        carrinhoDeCompras.adicionarItem("Balde Magenta", 55.55, 102);
        carrinhoDeCompras.adicionarItem("Balde Amarelo", 55.55, 102);
        carrinhoDeCompras.adicionarItem("Balde Ciano", 55.55, 102);
        

        // System.out.println(carrinhoDeCompras.exibirTotalDeItensNoCarrinho());
        // carrinhoDeCompras.removerProduto("balde ciano");

    //    carrinhoDeCompras.obterItens();
       System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
    
}
