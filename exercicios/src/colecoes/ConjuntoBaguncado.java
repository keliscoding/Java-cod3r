package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//nao aceita repeticao
		
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste")); //false
		System.out.println(conjunto.remove("Teste")); //true
		
		System.out.println(conjunto.contains("Teste")); //false
		System.out.println(conjunto.contains('x')); //true
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // união entre dois conjuntos
		conjunto.retainAll(nums); //interseção entre dois conjuntos
		
		
		System.out.println(conjunto);
	}
}
