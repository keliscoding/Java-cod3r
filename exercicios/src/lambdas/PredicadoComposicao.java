package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = 
				num -> num >= 100 & num <= 999;
				
		boolean resultadoAND = isPar.and(isTresDigitos).test(30);
		boolean resultadoOR = isPar.or(isTresDigitos).test(30);
		
		System.out.println("AND: " + resultadoAND  + "\nOR: " + resultadoOR);
		
	
	} 
}
