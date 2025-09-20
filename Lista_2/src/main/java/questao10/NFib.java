package questao10;

public class NFib {

	public static void main(String[] args) {
		
		
		System.out.println(fib(2));
		
	}

	private static int fib(int n) {
		return n < 2 ? n : fib(n - 1) + fib(n - 2);
	}

}
