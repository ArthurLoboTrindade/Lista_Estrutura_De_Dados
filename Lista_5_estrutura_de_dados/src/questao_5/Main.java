package questao_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Pilha<String> tarefaPassoaPasso = new Pilha<>();
		tarefaPassoaPasso.inicializarPilha();
		Scanner sc = new Scanner(System.in);
		
		boolean continuar = true;
		
		System.out.println("Fale o passo a passo da tarefa: ");
		
		int i = 1;
		while(continuar) {
			System.out.print(i+"° passo: ");
			String s = sc.nextLine();
			StringBuilder sb =  new StringBuilder();
			sb.append(i+"° passo: "+s);
			i++;
			s = sb.toString();
			tarefaPassoaPasso.push(s);
			System.out.println("Tem próximo passo? S/N");
			char op = sc.nextLine().charAt(0);
			if(op=='n') {
				continuar = false;
			}
			
		}
		
		Pilha<String> tarefaAoContrario = new Pilha<>();
		tarefaAoContrario.inicializarPilha();
		while(!tarefaPassoaPasso.isVazio()) {
			tarefaAoContrario.push(tarefaPassoaPasso.pop());
		}
		
		while(!tarefaAoContrario.isVazio()) {
			System.out.println(tarefaAoContrario.pop());
			System.out.println("Enter quando completar esse passo");
			sc.nextLine();
			if(tarefaAoContrario.isVazio()) {
				System.out.println("Tarefa concluida!");
			}
		}
		
		sc.close();
	}

}
