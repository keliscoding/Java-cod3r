package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		
		
		double fahrenheit = 70;
		final int AJUSTE = 32;
		//se dividir pelos números inteiros, o java vai transformar o resultado em inteiro e vai dar ruim, logo tem que transformar os numeros em double
		final double MULTIPLICADOR = 5.0/9.0;
		double celsius = ( fahrenheit - AJUSTE ) * MULTIPLICADOR;
		
		System.out.println(String.format("%.2f", celsius));
	}
}
