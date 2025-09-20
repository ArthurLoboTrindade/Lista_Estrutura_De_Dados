package questao_7;

public class Palindromo {

	public static void main(String[] args) {
		
		String texto = "uva";
		
		String textoLimpo = texto.toLowerCase().replaceAll("[^a-z0-9]", "");
		
		System.out.println(palindrom(textoLimpo));
	}
	
	public static String palindrom(String texto) {
		String s = "É um palindromo";
		String n = "Não é um palindromo";
		
		if(texto.length()<=1) {
			return s;
		}
		
		char in = texto.charAt(0);
		char ult = texto.charAt(texto.length()-1);
		if(in==ult) {
			String mid = texto.substring(1, texto.length()-1);
			return palindrom(mid);
		}else {
			return n;
		}
		
	}
	
}
