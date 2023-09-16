public class OperadoresComparacao {
    public static void main (String[] args){


        //Estudo de Operadores em Java:

       /* Operadores de comparação*/

        // ( == ) Igual: Este operador verifica se os dados entre variáveis são iguais
        int value1 = 12345678;
        int value2 = 12345678;

        //dondicao para validacao
        if(value1 == value2){
            System.out.println("Valores iguais");
        }else{
            System.out.println("Valores diferentes");
        }


        //( != ) Diferente: Este operador vefifica se os dados contidos entre variáveis são diferentes, o retorno para diferente é booleano true.

        int dif1 = 21;
        int dif2 = 1;

        //dondicao para validacao
        if(dif1 != dif2){

            System.out.println("Valores diferentes");
        }else{

            System.out.println("Valores iguais");
        }

        //( < ) Menor: Este operador vefifica se os dados contidos em uma variável é menor que a outra.
        int menor1 = 21;
        int menor2 = 111;


        if(menor1 < menor2){

            System.out.println("Valor 1 menor que valor 2");
        }else{

            System.out.println("valor 1 maior que valor 2");
        }


        //( > ) Maior: Este operador vefifica se os dados contidos em uma variável é maior que a outra.
        int maior1 = 211;
        int maior2 = 111;


        if(maior1 > maior2){

            System.out.println("Valor 1 maior que valor 2");
        }else{

            System.out.println("valor 1 menor que valor 2");
        }

        //( >= ) Maior igual: Este operador vefifica se os dados contidos em uma variável é maior ou igual que a outra.
        int var1 = 11;
        int var2 = 111;

        //dondicao para validacao
        if(var1 >= var2){
            System.out.println("Variavel 1 é igual ou maior que variável 2");
        }else{
            System.out.println("Variável 2 maior que variável 1");
        }

        //( <= ) Menor igual: Este operador vefifica se os dados contidos em uma variável é menor ou igual que a outra.
        int variavel1 = 111;
        int variavel2 = 111;

        //dondicao para validacao
        if(variavel1 <= variavel2){
            System.out.println("Variavel 1 é igual ou menor que variável 2");
        }else{
            System.out.println("Variável 2 maior que variável 1");
        }


    }
}
