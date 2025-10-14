package questao_3;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada<Aluno> lsDpEncd = new ListaDuplamenteEncadeada<>();
		Scanner sc = new Scanner(System.in);
		String s;
		int i;
		
		System.out.println("Fazendo inclusão de 5 alunos:");
		inclusaoAlunos(lsDpEncd);
		lsDpEncd.imprimir();
		
		System.out.println("Nome do aluno a inserir na esquerda: ");
		s = sc.nextLine();
		System.out.println("Qual idade do aluno a inserir na esquerda: ");
		i = sc.nextInt();
		sc.nextLine();
		lsDpEncd.inserirListaEsquerda(new Aluno(s, i));
		
		System.out.println("");
		
		System.out.println("Nome do aluno a inserir na direita: ");
		s = sc.nextLine();
		System.out.println("Qual idade do aluno a inserir na direita: ");
		i = sc.nextInt();
		sc.nextLine();
		lsDpEncd.inserirListaDireita(new Aluno(s, i));
			
		lsDpEncd.imprimir();
	
	}

	public static void inclusaoAlunos(ListaDuplamenteEncadeada<Aluno> lsDpEncd) {
		lsDpEncd.inserirListaDireita(new Aluno("Eric", 15));
		lsDpEncd.inserirListaDireita(new Aluno("Kaue", 8));
		lsDpEncd.inserirListaDireita(new Aluno("Lilian", 15));
		lsDpEncd.inserirListaDireita(new Aluno("Joao", 16));
		lsDpEncd.inserirListaDireita(new Aluno("Junior", 15));
		
		
	}

}
