package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		int raio = 3;
		
		//final == const
		final double PI = 3.4;
		
		double area = PI * raio * raio;

		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area + "m2");
	}
}
