package questao_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Contato> filaCallcenter = new LinkedList<>();

		int op;
		
		do {
			System.out.println(
					"\n1 - Inserir contato \n"
					+ "2 - Próximo contato \n"
					+ "3 - sair \n"
					);
			do {
				System.out.println("\nQual opção: ");
				op = sc.nextInt();
				sc.nextLine();
			} while (op!=1 && op!=2 && op!=3 );
			switch (op) {
			case 1: 
				System.out.println("\nNome do cliente? ");
				String s = sc.nextLine();
				System.out.println("Numéro completo: ");
				String n = sc.nextLine();
				filaCallcenter.add(new Contato(s, n));
				System.out.println("Adicionado com sucesso...\n");
				break;
			case 2: 
				if(filaCallcenter.isEmpty()) {
					System.out.println("\nSem clientes para entrar em contato");
				}else {
					System.out.println("Próximo cliente a ser contactado\n"+filaCallcenter.poll());
				}
				break;
			}
			
		} while (op!=3);
		
	}

}
