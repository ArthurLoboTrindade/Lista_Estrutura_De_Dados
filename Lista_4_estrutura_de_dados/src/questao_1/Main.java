package questao_1;

import java.util.Iterator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada<Integer> lsDpEncd = new ListaDuplamenteEncadeada<>();
		System.out.println("Fazendo inclusão de numeros:");
		inclusaoNumerosInteiros(lsDpEncd);
		
		
	}

	public static void inclusaoNumerosInteiros(ListaDuplamenteEncadeada<Integer> lsDpEncd) {
		Random r = new Random();
		for (int j = 0; j < 5; j++) {
			System.out.println("Incluindo a esquerda...");
			lsDpEncd.inserirListaEsquerda(r.nextInt(100));
			System.out.println("Consultando a esquerda..."+lsDpEncd.consultarEsq());
			
			System.out.println("");
			System.out.println("Incluindo a direita...");
			lsDpEncd.inserirListaDireita(r.nextInt(100));
			System.out.println("Consultando a direita..."+lsDpEncd.consultarDir());
			
			System.out.println("");
		}
		
		
		
	}

}
