package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		//infere a variavel b que ela é do tipo double
		// igual o javascript?
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
//		c = 4.5
		// isso aqui da erro justamente pq não pode atribuir um tipo diferente do inicial, então é diferente de langs dinâmicas como js
		
		double d; // variavel foi declarada
		d = 132.57; // variavel foi inicializada
		System.out.println(d); //usada
		
		// não da pra fazer isso aí usando var, com var tem que declarar e atribuir ao mesmo tempo
	}
}
