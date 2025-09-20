package questao15;

public class MMC {

	public static void main(String[] args) {
		System.out.println(mmc(10, 2));
	}
	
	public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }

    public static int mmc(int a, int b) {
        return (a / mdc(a, b)) * b;
    }
	 
}
