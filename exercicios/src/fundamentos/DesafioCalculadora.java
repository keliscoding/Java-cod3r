package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		// + - * / %
		//usar apenas o que foi ensinado nesse módulo
		
		double num1, num2, answer;
		String operator;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		num1 = input.nextDouble();
		input.nextLine(); //limpar buffer
		
		System.out.println("Digite o segundo numero: ");
		num2 = input.nextDouble();
		input.nextLine(); //limpar buffer
		
		System.out.println("Digite o operador: + - * / %");
		operator = input.nextLine();
		
		answer = "+".equals(operator) ? num1 + num2 : 0;
		answer = "-".equals(operator) ? num1 - num2 : answer;
		answer = "*".equals(operator) ? num1 * num2 : answer;
		answer = "/".equals(operator) ? num1 / num2 : answer;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operator, num2, answer);
		
		input.close();
		
	}
}
