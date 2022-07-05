package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println(" dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salario: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Kelly");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("\n\nNome = " + nome);
		
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("\n\n%s tem %d anos", nome, idade);
		
		//importante fechar o scanner quando acabar de usar
		entrada.close();
		
		//importante limpar o buffer após usar o nextInt ou nextDouble, limpa usando um nextLine() logo em seguida :) 
	}
}
