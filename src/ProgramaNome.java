//Como queremos utilizar o Scanner para ler os dados que o usuário vai digitar e ele nao é carregado por padrao, precisamos importar o Scanner para que o nosso programa entenda ele

import java.util.Scanner;

//Esse programa deve receber o nome do usuário e exibir este nome com uma msg de boas vindas
public class ProgramaNome {
	
	
	//letra maiuscula classes
	//letra minúscula da primeira palavra, objetos, métodos
	public static void main(String[] args) {
		
		//A linha abaixo cria um  leitor para lermos o teclado do usuário
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma variável (espaco RAM) para guardar dados tipo String (textos)
		String nome;
		
		System.out.println("Por favor, digite seu nome");
		// A linha abaixo pega o texto digitado do usuário e guarda na variável "nome"
		nome = leitor.nextLine();
		
		// Para lermos espaco sem espaco podemos usar nome = leitor.next();
		
		//Esse código le texto do teclado do usuário
		System.out.println("Que legal que seu nome é " + nome);
		
		System.out.println(nome + ", fico feliz que voce esteja usando o meu programa");
		
		//Após terminarmos de usar o leitor, precisamos fechar		
		leitor.close();

	}

}
