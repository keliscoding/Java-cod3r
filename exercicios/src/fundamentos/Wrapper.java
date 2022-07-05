package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		
		//wrappers são versões objeto dos tipos primitivos
		
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("1000"); //int
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.1F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
	}
}
