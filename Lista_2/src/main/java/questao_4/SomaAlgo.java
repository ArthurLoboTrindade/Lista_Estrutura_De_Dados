package questao_4;

import java.util.Scanner;

public class SomaAlgo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		String numero = Integer.toString(s);
		System.out.println(somaralga(numero));
		sc.close();
	}

	public static int somaralga(String numero) {
		if (numero.isEmpty()) {
			return 0;
		}
		int algCh = Character.getNumericValue(numero.charAt(0));
		String restoDaString = numero.substring(1);
		return algCh + somaralga(restoDaString);

	}

}
