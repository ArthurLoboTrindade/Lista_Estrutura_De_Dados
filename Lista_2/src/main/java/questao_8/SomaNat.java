package questao_8;

public class SomaNat {

	public static void main(String[] args) {
		
	System.out.println(somaNaturais(10));
	}
	
	public static int somaNaturais(int n) {
		if(n>0) {
		return (n-1)+somaNaturais(n-1);
		}
		return 0;
	}
}
