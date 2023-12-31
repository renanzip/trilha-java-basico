import java.util.Scanner;

public class ControleDeFluxo {
 	public static void main(String[] args) {
        //Solicitando os parametros 1 e 2 ao usuário
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();


		try {
			//método de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception.getMessage());
		}

		scanner.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;

		//realizar o for para imprimir os números com base na variável contagem

		if (contagem > 0) {
			for (int i = 0; i < contagem; i ++) {
				System.out.println("Imprimindo o número " + (i + 1));
			}
		} else {
			throw new ParametrosInvalidosException();
		}

	}
}