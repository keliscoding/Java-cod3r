package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double -> Double
		
		
		//esse tipo de cast é perigoso pois, só irá dar certo se o tipo retornado pelo abrir for inteiro
		// Integer coisa = (Integer) caixaA.abrir(); -> classCastException -> runtime error
		
		Double coisaA = (double) caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}
}
