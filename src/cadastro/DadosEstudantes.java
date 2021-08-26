package cadastro;

import java.util.Scanner;

public class DadosEstudantes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		System.out.print("Digite seu nome: ");
		nome = leitor.nextLine();
		int idade;
		System.out.print("Digite sua idade: ");
		idade = leitor.nextInt();
		leitor.nextLine();
		String curso;
		System.out.print("Digite seu curso: ");
		curso = leitor.nextLine();
		int periodo;
		System.out.print("Digite seu período: ");
		periodo = leitor.nextInt();
		System.out.println("Cadastro de estudantes"
							+"\n----------------------"
							+"\nNome: " + nome
							+"\nIdade: " + idade
							+"\nCurso: " + curso
							+"\nPeríodo:" + periodo + "°");

	}

}
