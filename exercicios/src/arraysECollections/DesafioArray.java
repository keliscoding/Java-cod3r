package arraysECollections;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double soma = 0, media = 0;
		
		System.out.println("Quantas notas voce deseja informar?");
		int qtdNotas = input.nextInt();
		input.nextLine();
		
		double[] notas = new double[qtdNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %d\n", i+1);
			notas[i] = input.nextDouble();
			input.nextLine();
		}
		
		for(double nota: notas) {
			soma += nota;
		}
		
		media = soma / notas.length;
		
		System.out.printf("A media do aluno é %f", media);
		
		input.close();
	}
}
