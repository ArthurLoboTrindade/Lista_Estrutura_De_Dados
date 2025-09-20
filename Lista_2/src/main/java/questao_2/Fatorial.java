package questao_2;

public class Fatorial {

	public static void main(String[] args) {
		
		System.out.println(fatorial(5));
		
		
	}
	
	private static int fatorial(int n) {
		if (n>0) {
			return n*fatorial(n-1);
		}
		return 1;
	}
	
}
