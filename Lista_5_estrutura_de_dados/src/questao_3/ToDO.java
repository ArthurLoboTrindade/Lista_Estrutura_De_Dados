package questao_3;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class ToDO {

	public static void main(String[] args) {
		Stack<String> toDo = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		
		int op;
		
		do {
			System.out.println("\n1 - Inserir tarefa na pilha \n"
					+ "2 - Obter a próxima tarefa da pilha \n"
					+ "3 - Sair ");
			do {
				System.out.println("\nQual opção: ");
				op = sc.nextInt();
				sc.nextLine();
			} while (op!=1 && op!=2 && op!=3);
			switch (op) {
			case 1: 
				System.out.println("\nQual tarefa será adicionada?");
				String s = sc.nextLine();
				toDo.add(s);
				System.out.println("\nTarefas atuais: \n");
				int i=1;
				ListIterator<String> lIt = toDo.listIterator(toDo.size());
				while (lIt.hasPrevious()) {
					System.out.println(i+"º -"+lIt.previous());
					i++;
				}
				break;
			case 2: 
				System.out.println("\nObtendo próxima tarefa...");
				toDo.pop();
				System.out.println(toDo.peek());
				break;
			}
			
		} while (op!=3);

	}

}
