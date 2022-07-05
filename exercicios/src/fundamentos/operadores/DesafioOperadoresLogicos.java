package fundamentos.operadores;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		//trabalho na terca (V ou F)
		//trabalho na quinta (V ou F)
		
		boolean terca = true; // => tv 32
		boolean quinta = true; // => tv 50
		
		//qualquer certo => sorvete
		
		//tudo deu errado => casa
			
		boolean comprouTV32 = terca ^ quinta;
		boolean comprouTV50 = quinta && terca;
		
		boolean tomouSorvete = terca || quinta;
		boolean ficouEmCasa = !tomouSorvete;
		
	}
}
