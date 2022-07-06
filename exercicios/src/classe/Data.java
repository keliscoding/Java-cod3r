package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {	
		String diaFormatado = String.valueOf(dia);
		String mesFormatado = String.valueOf(mes);
		
		if(dia < 10) {
			diaFormatado = "0" + dia;
		}
		
		if(mes < 10) {
			mesFormatado = "0" + mes;
		}
		
		return String.format("%s/%s/%d", diaFormatado, mesFormatado, ano);
	}
}
