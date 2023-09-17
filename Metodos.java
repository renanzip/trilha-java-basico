public class Metodos {


        /*
        *Métodos

        Todas as ações das aplicações são consideradas métodos.
        Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.
        Critério de nomeação de Métodos
        Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:
        Deve ser nomeado como verbo;
        Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

        * Em Java não existem métodos globais, eles devem ser sempre definidos dentro de uma classe
        *
        * Convenção para criação de métodos:
        * Qual é a proposta principal do método?
        * Qual tipo de retorno esperado após executado o método?
        * Caso o método não retorne nenhum valor, ele será representado pela palavra void.
        * Quais parâmetros serão necessário para exceuçãp do código? Ex: para a operação de soma, dois parametros são necessários.
        * O método possui risco de apresentar excessão? É necessário tratar as excessões
        * Qual a visibilidade do método? Visivel para toda aplicação, pacotes, herança ou apenas a nível da própria classe?
        *

        */

/*
    public double somar(int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
        return ... ;
    }

    public void imprimir(String texto){
        //LOGICA - FINALIDADE DO MÉTODO
        //AQUI NÃO PRECISA DO RETURN
        //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }
    // throws Exception : indica que o método ao ser utilizado
    // poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{}

    // este método não pode ser visto por outras classes no projeto
    private void metodoPrivado(){}

    //alguns equívocos estruturais
    public void validar(){
        //este método deveria retornar algum valor
        //no caso boolean (true ou false)
    }
    public void calcularEnviar(){
        //um método deve representar uma única responsabilidade
    }
    public void gravarCliente(String nome, String cpf, Integer telefone, ....){
        //este método tem a finalidade de gravar
        //informações de um cliente, por que não criar
        //um objeto cliente e passar como parâmetro ?
        //veja abaixo
    }
    public void gravarCliente(Cliente cliente){}
    //ou
    public void gravar(Cliente cliente){}
*/


}
