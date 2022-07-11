package lambdas;

//força que a interface tenha apenas um unico método, apesar disso é possível colocar métodos
// default e métodos estáticos sem problema algum
@FunctionalInterface
public interface Calculo {
	double executar(double a, double b);
	
	default String metodoDefault() {
		return "Sou um método default e não causo conflito";
	}
	
	static String metodoEstatico() {
		return "Sou um método estático e também não causo conflito";
	}
}
