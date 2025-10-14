package questao_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada<Integer> lsDpEncd = new ListaDuplamenteEncadeada<>();
		Scanner sc = new Scanner(System.in);
		String s;
		int i;
		char op, esc = 'e';
		do {
			System.out.println("O QUE DESEJAS: INSERIR - REMOVER - LISTAR - SAIR");
			do {
				s = sc.nextLine();
				op = s.charAt(0);
				op = Character.toLowerCase(op);
				
			} while (op != 'i' && op != 'r' && op != 'l' && op != 's' );
			if (op == 'i' || op == 'r' ) {
				do {
					System.out.println("Informe [E] - ESQUERDA(ÍNICIO) OU [D] - DIREITA(FIM)");
					s = sc.nextLine();
					esc = s.charAt(0);
					esc = Character.toLowerCase(esc);
				} while (esc != 'e' && esc != 'd');
			}
			switch (op) {
			case 'i':
				System.out.println("Número ímpar: ");
				do {
					
				    i = sc.nextInt();
				    sc.nextLine();
				    if (i % 2 == 0) {
				        System.out.println("Esse número não é ímpar, tente novamente: ");
				    }
				} while (i % 2 == 0);			
				
					if (esc=='e') {
						lsDpEncd.inserirListaEsquerda(i);
					}else {
						lsDpEncd.inserirListaDireita(i);
					}
					i=2;
					
				break;
			case 'r':
					if (esc=='e') {
						System.out.println("Removendo o elemento no ínicio da lista...");
						lsDpEncd.removerListaEsquerda();
					}else {
						System.out.println("Removendo o elemento no fim da lista...");
						lsDpEncd.removerListaDireita();
					}
				break;
			case 'l':
				lsDpEncd.imprimir();
				System.out.println("Os dados consultados foram: " + s);
				break;
			}
		} while (op != 's');

	}

}
