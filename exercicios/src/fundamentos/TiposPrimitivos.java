package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos númericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos númericos reais
		
		float salario = 11_445.44F; //tem que colocar o F pq por padrão o ponto flutuante eh um double
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		
		//não existe truthy no java :( 
		boolean estaDeFerias = false; // true
		
		//Tipo caractere 
		char status = 'A'; //Ativo
		// da pra usar unicodes como char tb, tipo \u00023
		
		//Dias de empresa
		
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens 
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}
}
