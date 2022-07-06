package classe;

public class Jantar {
	public static void main(String[] args) {
		Pessoa kelly = new Pessoa("Kelly", 65);
		
		Comida feijao = new Comida("feijao", 0.5);
		Comida arroz = new Comida("arroz", 0.5);
		
		System.out.println(kelly.peso);
		
		kelly.comer(feijao);
		kelly.comer(arroz);
		
		System.out.println(kelly.peso);
	}
}
