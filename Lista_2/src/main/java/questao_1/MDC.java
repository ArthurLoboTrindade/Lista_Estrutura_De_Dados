package questao_1;

public class MDC {

	public static void main(String[] args) {
		
		int a=4, b=5;
		System.out.println(mdc(a, b));
	}
	public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }
}
