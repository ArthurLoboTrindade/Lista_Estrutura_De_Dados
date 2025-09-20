package questao12;

public class SomaArray {

	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 4, 5 };

		System.out.println(somaArray(i, 0));

	}

	public static int somaArray(int[] i, int o) {
		if (o == i.length) {
			return 0;

		}

		return i[o] + somaArray(i, o + 1);
	}
}
