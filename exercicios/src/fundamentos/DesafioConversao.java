package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	
	public static void main(String[] args) {
		Double salario1, salario2, salario3;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro salário: ");
		salario1 = Double.parseDouble(entrada.nextLine().replace(",", ".")); 
		System.out.println("Digite o segundo salário: ");
		salario2 = Double.parseDouble(entrada.nextLine().replace(",", "."));
		System.out.println("Digite o terceiro salário: ");
		salario3 = Double.parseDouble(entrada.nextLine().replace(",", ".")); 
		
		final double MEDIA = (salario1 + salario2 + salario3)/3;
		
		System.out.println(MEDIA);
		
		entrada.close();
	}
}
