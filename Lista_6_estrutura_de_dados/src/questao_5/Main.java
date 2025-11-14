package questao_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> filaPacientes = new LinkedList<String>();
		
		int op;
		
		do {
			System.out.println(
					"\n1 - Inserir Paciente \n"
					+ "2 - Atender Paciente \n"
					+ "3 - Verificar se há paciente \n"
					+ "4 - Próximo paciente a ser atendido \n"
					+ "5 - Pacientes aguardando \n"
					+ "6 - Sair \n"
					);
			do {
				System.out.println("\nQual opção: ");
				op = sc.nextInt();
				sc.nextLine();
			} while (op!=1 && op!=2 && op!=3 && op!=4 && op!=5 && op!=6);
			switch (op) {
			case 1: 
				System.out.println("\nNome do paciente?");
				String s = sc.nextLine();
				filaPacientes.add(s);
				System.out.println("Adicionado com sucesso...\n");
				break;
			case 2:
				System.out.println("\nAtendendo paciente - " + filaPacientes.poll());
				break;
			case 3:
				if(filaPacientes.isEmpty()) System.out.println("\nSem pacientes aguardando... (só paz)");
				else System.out.println("\nPacientes esperando na fila...");
				break;
			case 4:
				System.out.println("\nPróximo paciente - " + filaPacientes.peek());
				break;
			case 5: 
				System.out.println("Quantidade atual de pacientes na fila - "+filaPacientes.size());
				break;
			}
			
		} while (op!=6);
		
		
	}
}
