package qusetao_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main testelista = new Main();
		Lista_encadeada<String> L1 = new Lista_encadeada<>();
		Lista_encadeada<String> L2 = new Lista_encadeada<>();
		
		
		System.out.println("=== Lista 1 ===");
        System.out.println("Digite nomes (ou 'fim' para encerrar):");
        while (true) {
            String nome = sc.nextLine().toLowerCase();
            if (nome.equalsIgnoreCase("fim")) break;
            L1.adicionar(nome);
        }
        
        System.out.println("\nNomes adicionados a L1: ");
        L1.listar();

        System.out.println("\n=== Lista 2 ===");
        System.out.println("Digite nomes (ou 'fim' para encerrar):");
        while (true) {
            String nome = sc.nextLine().toLowerCase();
            if (nome.equalsIgnoreCase("fim")) break;
            L2.adicionar(nome);
        }
        System.out.println("\nNomes adicionados a L2: ");
        L2.listar();
		
        Lista_encadeada<String> L3 = L1.nomesComuns(L2);

        System.out.println("\n=== Nomes comuns às duas listas ===");
        L3.listar();

        sc.close();
		
	}
	

	private void listar(Lista_encadeada listaencadeada) {
		if (listaencadeada.vazio()) {
			System.out.println("Lista Vazia");
		} else {
			listaencadeada.listar();
		}
	}

}
