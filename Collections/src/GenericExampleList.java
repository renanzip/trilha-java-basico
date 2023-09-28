import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GenericExampleList {
    public static void main(String[] args) {
        
        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("teste");
        listaSemGenerics.add(0, "teste2");

        
        // Exemplo com Generics
        List<String> listaComGenerics = new ArrayList<>();
        listaComGenerics.add("Elemento 1");
        listaComGenerics.add("Elemento 2");
        listaComGenerics.add("Elemento 3");
        listaComGenerics.add("Elemento 4");
        listaComGenerics.add("Elemento 0");

        System.out.println(listaComGenerics.get(0));

        // Ordenação Alfabética
        Collections.sort(listaComGenerics);

        // Iterando sobre o vetor com Generics
        for(String elemento : listaComGenerics){
            System.out.println(elemento);
        }
       
        // Impressão por Índice
        System.out.println("");
        System.out.println("|===========================================|");
        System.out.println(" Impressão via número do índice: " + listaComGenerics.get(0));
        System.out.println("|===========================================|");
        
        // Impressão de espaço entre linhas ;)
        System.out.println("");
        
        //Iterando o vetor sem o Generics: necessário fazer cast (processo de conversão de tipo)
        for(Object elemento : listaComGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
        

        
    }
    
}
