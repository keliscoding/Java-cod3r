package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1.1234567888888888;
		System.out.println(a);
		
		//conversão explicita (CAST)
		//há possibilidade de perda de informação
		float b = (float)1.1234567888888888;
		
		System.out.println(b);
		
		//CAST é algo que devemos fugir
	}
}
