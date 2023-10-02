package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }


    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaporAltura = new ArrayList(pessoaList);
        Collections.sort(pessoaporAltura, new ComparatorPorAltura());
        return pessoaporAltura;
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }


    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Renan Lima da Silva", 38, 1.78);
        ordenacaoPessoa.adicionarPessoa("Marcela da Silva Sales", 34, 1.68);
        ordenacaoPessoa.adicionarPessoa("Rafael Sales da Silva", 5, 1.30);
        ordenacaoPessoa.adicionarPessoa("Caio Sales da Silva", 1, 0.60);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        // System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}

