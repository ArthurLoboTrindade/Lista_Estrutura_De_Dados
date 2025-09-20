package questao_3;

public class DecimalToBinarie {

	public static void main(String[] args) {

		StringBuilder b = new StringBuilder();
		System.out.println(dec2bin(15, b));
	}

	private static StringBuilder dec2bin(int n, StringBuilder b) {
		if (n == 0) {
			return b;
		}
		return dec2bin(n / 2, b).append(n % 2);

	}
}
