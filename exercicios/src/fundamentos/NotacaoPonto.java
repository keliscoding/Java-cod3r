package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s.toUpperCase();
		
		System.out.println(s);
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		String y = "Bom dia X"
					.replace("X", "Kelly")
					.toUpperCase()
					.concat("!!!");
		
		System.out.println(y);
		
		//tipos primitivos não tem o operador "."
	}
}
