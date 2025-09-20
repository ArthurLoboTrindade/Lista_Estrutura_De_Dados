package questao_9;

public class PotenComplic {

	public static void main(String[] args) {
		int base = 2, expoente = -3;
		System.out.println(potencia(base, expoente));

	}

	public static int mult(int a, int b) {
		if (b == 0) {
			return 0;
		}
		if (b > 0) {
			return a + mult(a, b - 1);
		} else {
			return -mult(a, -b);
		}
	}

	public static double potencia(int base, int expoente) {
		if (expoente < 0) {
			return 1.0 / potencia(base, -expoente);
		}
		if (expoente == 0) {
			return 1;
		}
		return mult(base, (int)potencia(base, expoente-1));
	}

}
