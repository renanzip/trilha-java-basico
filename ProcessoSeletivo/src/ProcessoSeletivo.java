import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        String[] candidatos = {"Renan", "Rafael", "Marcela", "Caio", "Helena"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

    }

    //impressão dos cadidatos selecionados
    static void imprimirSelecionados(){
        String[] candidatos = {"Renan", "Rafael", "Marcela", "Caio", "Helena"};
        System.out.println("Lista de candidatos por índice do elemento: ");
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            //elas precisarão sofre alterações para não entrar em loop
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }

    //Método auxiliar
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
    

    //Seleção dos candidatos
    static void selecaoCandidatos(){
        String[] candidatos = {"Renan", "Rafael", "Marcela", "Caio", "Helena", "Redrigo", "Noah", "Miguel", "Sara", "Rogério", "Simone", "Davi", "Samira", "Lorena", "Elaine"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados <5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " Foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }
    }

    //O método valorPretendido retorna um valor randomico entre 1800 a 2200 simulando a pretensão salarial dos candidatos
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    //Analisa os candidatos com base na pretensão salarial
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
    
}
