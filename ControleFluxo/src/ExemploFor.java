public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = {"Renan", "Marcela", "Caio", "Rafael", "Scooby", "Toody"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //Laço de repetição for otimizado
        String minhaFmilia[] = {"Renan", "Marcela", "Caio", "Rafael", "Scooby", "Toody"};

        for(String familia : minhaFmilia){
            
            System.out.println("O nome do familiar é: " + familia);
        }

    }
    
}
