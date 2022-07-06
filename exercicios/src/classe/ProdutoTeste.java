package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("biscoito", 15.00);
		
		System.out.println(p1.precoComDesconto(0));
	}

}
