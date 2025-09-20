package questao13;

public class Repete {

	public static void main(String[] args) {
		String s = "aaa";
		char encontra = 'a';
		System.out.println(repete(s,encontra));
		
	}
	public static int repete(String s, char encontra) {
		if(s == null || s.isEmpty()) {
			return 0;
		}
		int repetiu = (encontra == s.charAt(0)) ? 1:0;
		return 	repetiu+repete(s.substring(1), encontra);
		
		
	}
}
