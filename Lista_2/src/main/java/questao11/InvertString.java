package questao11;

public class InvertString {

	public static void main(String[] args) {
		String s = "um ovo";
		System.out.println(invertS(s));
	}
	
	public static String invertS(String s) {
		if (s == null || s.length() <= 1) {
			return s;
		}
		
		char fL = s.charAt(0);
		String resto = s.substring(1);
		return invertS(resto)+fL;
		
	}
}
