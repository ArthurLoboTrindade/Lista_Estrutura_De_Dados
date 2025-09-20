package questao_5;

import java.util.Scanner;

public class InteirosAteN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int limite = sc.nextInt();
		inteiros(limite);
		sc.close();
		}
		
		public static void inteiros(int n) {
			if (n>1) {
				inteiros(n-1);
			}
			System.out.println(n);
		}
		

}
