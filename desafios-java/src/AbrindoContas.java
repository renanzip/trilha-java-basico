import java.util.Scanner;

public class AbrindoContas {
    public static void main(String[] args) {

        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        // TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setNumero(numeroConta);
        contaBancaria.setTitular(nomeTitular);
        contaBancaria.setSaldo(saldo);

        
        System.out.println("Informacoes:");
        System.out.println("Conta: " + contaBancaria.getNumero());
        System.out.println("Titular: " + contaBancaria.getTitular());
        System.out.println("Saldo R$ " + contaBancaria.getSaldo());
        

       
        // TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public void Bancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

