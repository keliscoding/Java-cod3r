package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); //false
		System.out.println(condicao1 || condicao2); //true
		System.out.println(condicao1 ^ condicao2); //true //xor
		System.out.println(!condicao1); //false
		System.out.println(!condicao2); //true
		
		
		//Tabela verdade AND
		
		/*
		 * true && true	// T
		 * true && false // F
		 * false && true	//  F
		 * false && false // F
		 */
		
		// Tabela verdade OR
		
		/*
		 *  true || true // T
		 *  true || false // T
		 *  false || true // T
		 *  false || false // F
		 */
		
		// Tabela verdade XOR
		
		/*
		 * true ^ true // F
		 * true ^ false //T
		 * false ^ true //T
		 * false ^ false //F
		 */
	}
}
