package questao_4;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		Lista_encadeada listaencadeada = new Lista_encadeada();
		Scanner sc = new Scanner(System.in);
		
		m.addRegistro(listaencadeada);
		listaencadeada.listar();
		System.out.println("\nDigite a matrícula do aluno:");
		listaencadeada.buscaN(sc.nextInt());
		
		
		
		sc.close();

	}
	
	private void addRegistro(Lista_encadeada listaencadeada) {
		Random r = new Random();
		Aluno x = new Aluno("ed", "BES", r.nextInt(100));
		listaencadeada.adicionar(x);
		x = new Aluno("art", "ADS", r.nextInt(100));
		listaencadeada.adicionar(x);
		x = new Aluno("Jade", "Bes", r.nextInt(100));
		listaencadeada.adicionar(x);

	}
	
	
}
