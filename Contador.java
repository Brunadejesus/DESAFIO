import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);// comando de interação
		System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("Iniciar contagem: ");
		System.out.print("\n Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print(" Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

		try {
			
			contar (parametroUm, parametroDois); //chamando o métod o contendo a lógica de contagem
		
		}  catch ( Exception ex) {
		
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws Exception {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		if (parametroUm >=parametroDois){

			throw new Exception (" O segundo parâmetro deve ser maior que o primeiro.");

		}
		
		int contagem = parametroDois - parametroUm;
		for (int i =1;i<=contagem;i++){

		System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("Imprimindo o número: "+ i); //realizar o for para imprimir os números com base na variável contagem
		System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

		}

		
	}


}
	