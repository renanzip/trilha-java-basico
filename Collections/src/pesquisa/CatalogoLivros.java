package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos

    private List<Livro> livrosList;


    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }


    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
        

    }

    public List<Livro> pesquisaPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2023);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 1702);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2023);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 1980);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2015);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2000);
        catalogoLivros.adicionarLivro("Livro 6", "Autor 6", 1998);
        catalogoLivros.adicionarLivro("Livro 7", "Autor 7", 2006);

        //System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        //System.out.println(catalogoLivros.pesquisaPorIntervaloDeAnos(2022, 2024));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 2"));
    }
}
