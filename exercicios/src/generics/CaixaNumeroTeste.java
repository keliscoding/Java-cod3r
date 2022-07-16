package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		caixaA.guardar(2);
		
		CaixaNumero<Double> caixaB = new CaixaNumero<>();
		caixaB.guardar(2.0);
		
		CaixaNumero<Float> caixaC = new CaixaNumero<>();
		caixaC.guardar(3.4f);
	}
}
