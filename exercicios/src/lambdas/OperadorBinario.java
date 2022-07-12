package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = 
				(n1, n2) -> (n1 + n2)/2;
				
		double resultado = media.apply(9.8, 5.7);
		
		System.out.println(resultado);
		
		BiFunction<Double, Double, String> status = 
				(n1, n2) -> ((n1 + n2)/2) >= 7 ? "Aprovado" : "Reprovado"; 
				
		System.out.println(status.apply(9.8, 5.7));
			
	}
}
