package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		//o ultimo a entrar é o primeiro a sair
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); //O hobbit
		System.out.println(livros.element()); //O hobbit
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll()); //null
		System.out.println(livros.remove()); //exception
		System.out.println(livros.pop()); //exception
	}
}
