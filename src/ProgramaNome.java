//Como queremos utilizar o Scanner para ler os dados que o usu�rio vai digitar e ele nao � carregado por padrao, precisamos importar o Scanner para que o nosso programa entenda ele

import java.util.Scanner;

//Esse programa deve receber o nome do usu�rio e exibir este nome com uma msg de boas vindas
public class ProgramaNome {
	
	
	//letra maiuscula classes
	//letra min�scula da primeira palavra, objetos, m�todos
	public static void main(String[] args) {
		
		//A linha abaixo cria um  leitor para lermos o teclado do usu�rio
		Scanner leitor = new Scanner(System.in);
		
		//A linha abaixo cria uma vari�vel (espaco RAM) para guardar dados tipo String (textos)
		String nome;
		
		System.out.println("Por favor, digite seu nome");
		// A linha abaixo pega o texto digitado do usu�rio e guarda na vari�vel "nome"
		nome = leitor.nextLine();
		
		// Para lermos espaco sem espaco podemos usar nome = leitor.next();
		
		//Esse c�digo le texto do teclado do usu�rio
		System.out.println("Que legal que seu nome � " + nome);
		
		System.out.println(nome + ", fico feliz que voce esteja usando o meu programa");
		
		//Ap�s terminarmos de usar o leitor, precisamos fechar		
		leitor.close();

	}

}
