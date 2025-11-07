package questao_1;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		
		int op;
		
		do {
			System.out.println("");
			System.out.println("1- Inserir Livros na Pilha"
					+ "\n2- Consultar Livros na Pilha"
					+ "\n3- Remover Livro no Topo da Pilha"
					+ "\n4- Esvaziar Livros na Pilha"
					+ "\n5- Sair");
			do {
				System.out.println("\nQual opção: ");
				op = sc.nextInt();
				sc.nextLine();
			} while (op != 1 && op != 2 && op != 3 && op != 4 && op != 5 );
			switch (op) {
			case 1:
				boolean c = true;
				while(c) {
					System.out.println("Informe o nome do livro: ");
					String n =sc.nextLine();
					pilha.push(n);
					System.out.println("Deseja por mais livros? s/n");
					char opc = sc.nextLine().charAt(0);
					if(opc=='n') {
						c=false;
					}
				}
				break;
			case 2:
				if(pilha.isEmpty()) {
					System.out.println("Pilha vazia");
					break;
				}
				
				System.out.println("\nTodos livros na pilha: \nTOPO ↓");
				
				ListIterator<String> it = pilha.listIterator(pilha.size());
				while (it.hasPrevious()) {
				    System.out.println(it.previous());
				}
				
				break;
			case 3:
				System.out.println("Removendo topo: "+ pilha.pop());
				
				break;
			case 4:
				while(!pilha.isEmpty()) {
						pilha.pop();
					}
				
				break;
			}
			
		} while (op != 5);

        sc.close();
    }
	
}
