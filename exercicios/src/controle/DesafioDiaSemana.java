package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		// Domingo => 1
		// quarta => 4
		// terça => 3
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana: ");
		String answer = input.next();
		
		//o melhor é usar equalsIgnoreCase
		if("domingo".equals(answer.toLowerCase())) {
			System.out.println("1");
		} else if("segunda".equals(answer.toLowerCase())) {
			System.out.println("2");
		} else if("terça".equals(answer.toLowerCase())) {
			System.out.println("3");
		} else if("quarta".equals(answer.toLowerCase())) {
			System.out.println("4");
		} else if("quinta".equals(answer.toLowerCase())) {
			System.out.println("5");
		} else if("sexta".equals(answer.toLowerCase())) {
			System.out.println("6");
		} else if("sabado".equals(answer.toLowerCase())) {
			System.out.println("7");
		} else {
			System.out.println("Opa, você digitou errado! :p");
		}
			
		input.close();
	}
}
