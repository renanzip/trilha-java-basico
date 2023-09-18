import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){

         //Criação do objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Mensagem de Boas-vindas
        System.out.println("-----Bem vindo ao Banco do Desenvolvedores --");
        System.out.println("-----Aqui seu código rende dinheiro --");

        //Solicitação da Agência
        System.out.println("Por favor, informe o numero da Agência sem o dígito: ");
        int agencia = scanner.nextInt();

        //Solicitação do dígito da agencia
        System.out.println("Informe o Dígito da sua agência. Apenas o número: ");
        int digitoAgencia = scanner.nextInt();
        
        //Solicitação da conta1234
        System.out.println("Informe o número da conta: ");
        int conta = scanner.nextInt();

        //Solicitação do Nome
        System.out.println("Informe seu Nome: ");
        String nome = scanner.next();

        //Solicitação do nome completo
        System.out.println("Informe seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Informe o valor a ser depositado em conta corrente para abertura da conta: Exemplo: 237.48 ");
        float deposito = scanner.nextFloat();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + "-" + digitoAgencia + ", conta " + conta + " e seu saldo de R$ " + deposito + " já está disponível para saque.");

        //Agradecimento
        System.out.println("Obrigado pela confiança em nossos serviços :)");



    }
    
}
