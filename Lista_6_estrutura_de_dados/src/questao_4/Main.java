package questao_4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        FilaSala<Aluno> fila = new FilaSala<Aluno>();
        
        int op;
        
        do {
			System.out.println(
					"\n1 - Inserir Aluno \n"
					+ "2 - Consultar alunos \n"
					+ "3 - Sair"
					);
			do {
				System.out.println("\nQual opção: ");
				op = sc.nextInt();
				sc.nextLine();
			} while (op!=1 && op!=2 && op!=3);
			switch (op) {
			case 1: 
				System.out.println("\nNome do Aluno: ");
				String s = sc.nextLine();
				System.out.println("Idade do Aluno: ");
				int id = sc.nextInt();
				sc.nextLine();
				
				fila.inserir(new Aluno(s, id));
				break;
			case 2: 
				System.out.println("Conferindo lista de alunos...");
				fila.listar();
				break;
			}
			
		} while (op!=3);
        
        
	}
}
