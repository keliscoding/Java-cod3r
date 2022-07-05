package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String answer = "";
		
		while(!answer.equalsIgnoreCase("sair")) {
			System.out.println("Digite algo:");
			answer = input.next();
		}
		
		System.out.println("Você saiu do laço :p");
		
		input.close();
	}
}
