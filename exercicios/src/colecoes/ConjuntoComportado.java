package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//Set<String> listaAprovados = new HashSet<>(); //HashSet não respeita a ordem de inserção
		SortedSet<String> listaAprovados = new TreeSet<>(); //TreeSet garante a ordem de inserção, TreeSet faz parte do SortedSet
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
	
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>(); 
		
		nums.add(1);
		nums.add(25);
		nums.add(14);
		nums.add(200);
	}
}
