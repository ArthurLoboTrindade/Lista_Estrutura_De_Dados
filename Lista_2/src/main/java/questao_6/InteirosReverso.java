package questao_6;

import java.util.Scanner;

public class InteirosReverso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int limite = sc.nextInt();
		inteiros(limite);
		sc.close();
		}
		
		public static void inteiros(int n) {
			
			System.out.println(n);
			if (n>0) {
				inteiros(n-1);
			}
			
		}

}
