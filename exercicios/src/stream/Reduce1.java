package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (acc, num) -> acc + num;
		  
		int value = nums.parallelStream().reduce(100, soma);
		
		int value2 = nums.stream().reduce(0, soma);
		
		int value3 = nums.parallelStream().reduce(0, soma);
		
		//efeito colateral causado pelo parallelStream + reduce 
		System.out.println(value);
		
		//sem efeito colateral
		System.out.println(value2);
		System.out.println(value3);
		
		// Resultado foi um Optional<Integer>
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
		
	}
}
