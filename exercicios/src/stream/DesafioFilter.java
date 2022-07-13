package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFilter {
	public static void main(String[] args) {
		
		List<String> nomes = Arrays.asList("Lara", "Anna", "Ayla", "Keity", "Miranda", "Bruna", "Shala");
		Predicate<String> namesWithFourLetters = name -> name.length() == 4;
		Predicate<String> nameStartWithAnA = name -> name.charAt(0) == 'A';
		UnaryOperator<String> message = name -> "Parabéns " + name + ", você passou no filtro!";		
		
		nomes.stream()
			.filter(namesWithFourLetters)
			.filter(nameStartWithAnA)
			.map(message)
			.forEach(System.out::println);	
	}
}
