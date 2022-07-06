package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data(1, 8, 1997);

		Data d2 = new Data();
		
		d2.dia = 15;
		d2.mes = 10;
		d2.ano = 1997;
		
		Data d3 = new Data();
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
	}
}
