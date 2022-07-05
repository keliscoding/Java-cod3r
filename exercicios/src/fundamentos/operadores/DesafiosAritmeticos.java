package fundamentos.operadores;

public class DesafiosAritmeticos {
	public static void main(String[] args) {
		
		final int firstOp = (int) Math.pow((6 * (3 + 2)), 2)/(3*2);
		final int secondOp = (int) Math.pow((1-5) * (2-7)/2, 2);
		
		final int thirdOp = firstOp - secondOp;
		final int fourthOp = (int) Math.pow(thirdOp, 3);
		final int fifthOp = (int) Math.pow(10, 3);
		
		final int answer = fourthOp/fifthOp;
		System.out.println(answer);
	}
}
