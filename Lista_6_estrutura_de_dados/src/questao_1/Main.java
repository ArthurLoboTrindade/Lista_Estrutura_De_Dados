package questao_1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Queue<String> filaDeMusica = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		
		int op;
		
		do {
			System.out.println(
					"\n1 - Inserir musica na playlist \n"
					+ "2 - Consultar música \n"
					+ "3 - Remover música \n"
					+ "4 - Sair \n"
					);
			do {
				System.out.println("\nQual opção: ");
				op = sc.nextInt();
				sc.nextLine();
			} while (op!=1 && op!=2 && op!=3 && op!=4);
			switch (op) {
			case 1: 
				System.out.println("\nQual música será adicionada?");
				String s = sc.nextLine();
				filaDeMusica.add(s);
				System.out.println("Adicionado com sucesso...");
				break;
			case 2: 
				System.out.println("\nMúsicas atuais: \n");
				Iterator<String> lIt = filaDeMusica.iterator();
				while (lIt.hasNext()) {
					String musica = lIt.next();
					if(musica.equals(filaDeMusica.peek())) {
					System.out.println("Tocando Agora - "+musica);
					}else {
					System.out.println("Proxima música - "+musica);
					}
				}
				break;
			case 3:
				filaDeMusica.poll();
				System.out.println("Passando para próxima música... Tocando - " + filaDeMusica.peek().toUpperCase());
				break;
			}
			
		} while (op!=4);
		
		
		
	}
	
}
