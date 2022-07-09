package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add => Adicionam elementos na fila
		//Diferença é o comportamento quando a fila está cheia.
		//Add retorna uma exceção e offer retorna um booleano
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element => obtem o proximo elemento da fila sem remover
		//O comportamento do peek e do element muda quando a fila estiver vazia 
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção
		System.out.println(fila.element());
		
		
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
		
		
		//poll retorna e remove o elemento que está na frente, quando não há mais elementos ele retorna null
		//O comportamento do pool e do remove muda quando a fila estiver vazia 
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); //null
		System.out.println(fila.remove()); //retorna uma exceção
		
	}
}
