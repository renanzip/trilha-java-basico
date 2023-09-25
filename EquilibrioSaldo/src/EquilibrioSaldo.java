
/**
 * <h1>Desafios Java: Equilibrando o Saldo</h1>
 * U cliente digita nessa ordem os seguintes valores => Saldo, Deposito e Retirada e a aplicação atualiza o saldo final.
 * <p>
 * <b>Note:</b> Cumprindo o desafio Bootcamp Santander
 * 
 *
 * @author  Renan Lima
 * @version 1.0
 * @since   24/09/2023
 */
import java.util.Scanner;

public class EquilibrioSaldo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        
        float saldoAtual = scanner.nextFloat();        
        float valorDeposito = scanner.nextFloat();   
        float valorRetirada = scanner.nextFloat();        
        float saldoTotal = saldoAtual + valorDeposito;
        float saldoFinal = saldoTotal - valorRetirada;
        System.out.println("Saldo atualizado na conta: " + saldoFinal);
        
        
        
    }

   

    
        
    
}
