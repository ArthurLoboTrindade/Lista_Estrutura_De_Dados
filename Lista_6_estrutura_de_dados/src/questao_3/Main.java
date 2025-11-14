package questao_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Queue<String> filaSuperMarket = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		
		int op;
		
		do {
			System.out.println(
					"\n1 - Inserir cliente \n"
					+ "2 - Consultar quantos clientes \n"
					+ "3 - Remover cliente \n"
					+ "4 - Sair \n"
					);
			do {
				System.out.println("\nQual opção: ");
				op = sc.nextInt();
				sc.nextLine();
			} while (op!=1 && op!=2 && op!=3 && op!=4);
			switch (op) {
			case 1: 
				System.out.println("\nNome do cliente que chegou?");
				String s = sc.nextLine();
				filaSuperMarket.add(s);
				System.out.println("Adicionado com sucesso...\n"
						+ "Cliente atual - "+ filaSuperMarket.peek().toUpperCase());
				break;
			case 2: 
				
				System.out.println("Quantidade atual de clientes na fila - "+filaSuperMarket.size());
				break;
			case 3:
				filaSuperMarket.poll();
				System.out.println("Chamando próximo cliente - " + filaSuperMarket.peek().toUpperCase());
				break;
			}
			
		} while (op!=4);
		
				
				
		
	}
	
}
