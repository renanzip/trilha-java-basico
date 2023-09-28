public class SistemaCadastro {
    public static void main(String[] args) {
        
        Pessoa cliente = new Pessoa("320.302.148-09", "Renan Lima da Silva");

        cliente.setEndereco("Rua José da Costa Lima");




        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getNome());
    }
    
}
