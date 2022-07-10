package oo.heranca.desafio;

public class Pista {
	public static void main(String[] args) {
		
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		System.out.println("Velocidade atual do Civic => " + civic.velocidadeAtual);
		System.out.println("Velocidade atual da Ferrari => " + ferrari.velocidadeAtual);
		
		civic.acelerar();
		ferrari.acelerar();
		
		System.out.println("Velocidade atual do Civic => " + civic.velocidadeAtual);
		System.out.println("Velocidade atual da Ferrari => " + ferrari.velocidadeAtual);
		
	}
}
