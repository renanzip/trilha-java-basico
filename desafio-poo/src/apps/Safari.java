package apps;

import functions.NavegadorApp;

public class Safari implements NavegadorApp{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo páginado G1");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba à direita");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("Atualizando a página");
    }
    
}
