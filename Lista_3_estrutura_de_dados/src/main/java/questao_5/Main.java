package questao_5;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		Lista_encadeada listaencadeada = new Lista_encadeada();
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamanho máximo da lista 7 elementos");
		System.out.println("Inserindo 6 elementos...");
		m.addInt(listaencadeada);
		listaencadeada.listar();
		System.out.println("");
		listaencadeada.addPrimeiro(sc.nextInt());
		System.out.println("");
		listaencadeada.listar();
		System.out.println("");
		listaencadeada.adicionar(sc.nextInt());
		
		
		sc.close();

	}
	
	public void addInt(Lista_encadeada lista) {
		Random r = new Random();
		for(int i=0; i<=6; i++) {
			lista.adicionar(r.nextInt(100));
		}
	}
	
}
