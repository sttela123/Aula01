import java.util.Scanner;
//cursor ao lado da palavra ctrl espaco para escolher a biblioteca
public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//Criando uma vari�vel capaz de armazenarr valores num�ricos com casas decimais
		double valor1;
		double valor2;
		double soma, subtracao, divisao, multiplicacao;
		
		System.out.println("Por favor, digite o primeiro valor");
		
		valor1 = leitor.nextDouble();
		
		System.out.println("Por favor, digite o segundo valor");
		valor2 = leitor.nextDouble();
		
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / valor2;
		
		System.out.println("A soma entre os dois valores informados � " + soma);
		System.out.println("A subtracao entre os dois valores informados � " + subtracao);
		System.out.println("A multiplicacao entre os dois valores informados � " + multiplicacao);
		System.out.println("A divisao entre os dois valores informados � " + divisao);
		
		leitor.close();
	}

}
