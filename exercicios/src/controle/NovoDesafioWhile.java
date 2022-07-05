package controle;

import java.util.Scanner;

public class NovoDesafioWhile {
	public static void main(String[] args) {
		int qtdNotasValidas = 0;
		
		//total é a soma de todas as notas
		double total = 0, nota = 0; 
		
		Scanner input = new Scanner(System.in);
		
		while(nota != -1) {
			System.out.println("Digite a nota do aluno: ");
			nota = input.nextDouble();
			
			if(nota != -1) {
				System.out.println("Digite uma nota válida.");
			} else if(nota <= 10 && nota >= 0) {
				total += nota;
				qtdNotasValidas++;
			} else {
				System.out.println("Saindo...");
			}
		}
		
		System.out.printf("A média da turma é: %.2f", total/qtdNotasValidas);
		
		input.close();
	}
}
