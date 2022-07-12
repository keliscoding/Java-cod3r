package lambdas;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {

		Locale br = new Locale("pt", "BR");
		Currency brl = Currency.getInstance(br);
		NumberFormat brlFormat = NumberFormat.getCurrencyInstance(br);
		
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal = n -> n.preco - (n.preco * n.desconto);
		UnaryOperator<Double> imposto = n -> n >= 2500 ? n - ( n * 0.085 ) : n ;
		UnaryOperator<Double> frete = n -> n >= 3000 ? n + 100 :  n + 50;	
		Function<Double, String> formatar = n -> brlFormat.format(n);
		
		String resultado = precoReal
				.andThen(imposto)
				.andThen(frete)
				.andThen(formatar)
				.apply(p);
		
		System.out.println(resultado);
	}
}
