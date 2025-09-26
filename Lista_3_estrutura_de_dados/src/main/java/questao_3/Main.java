package questao_3;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		Lista_encadeada listaencadeada = new Lista_encadeada();
		Scanner sc = new Scanner(System.in);
		
		m.addInt(listaencadeada);
		listaencadeada.listar();
		System.out.println("");
		listaencadeada.pesquisarNumero(sc.nextInt());
		System.out.println("");
		m.index(listaencadeada);
		
		
		sc.close();

	}
	
	public void addInt(Lista_encadeada lista) {
		Random r = new Random();
		for(int i=0; i<=15; i++) {
			lista.adicionar(r.nextInt(100));
		}
	}
	
	public void index(Lista_encadeada lista) {
		lista.indexTodos();
	}
	
}
