package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}
	
	
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
