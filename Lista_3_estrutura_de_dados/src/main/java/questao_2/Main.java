package questao_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Main testelista = new Main();
		Lista_encadeada listaencadeada = new Lista_encadeada();
		testelista.listar(listaencadeada);

		testelista.addRegistro(listaencadeada);
		System.out.println("Adicionando Alunos!!");
		System.out.println("Esses são os Alunos armazenados ");
		testelista.listar(listaencadeada);
		
		System.out.println("\nDigite a matrícula: ");
		testelista.pesquisar(listaencadeada, sc.nextInt());
		
		System.out.println("");
		System.out.println("Listando em ordem:");
		listaencadeada.listarAlfabetico();

		System.out.println("");

		System.out.println("Agora vamos remover o ultimo!!");

		testelista.removerUltimo(listaencadeada);
		System.out.println("Aluno removido");
		System.out.println("A lista ficou assim: ");
		testelista.listar(listaencadeada);
		
		System.out.println("");
		System.out.println("Listando em ordem:");
		listaencadeada.listarAlfabetico();

	}

	private void addRegistro(Lista_encadeada listaencadeada) {
		Aluno x = new Aluno("ed", "BES", 123);
		listaencadeada.adicionar(x);
		x = new Aluno("art", "ADS", 1234);
		listaencadeada.adicionar(x);
		x = new Aluno("Jade", "Bes", 3131);
		listaencadeada.adicionar(x);

	}

	private void removerUltimo(Lista_encadeada listaencadeada) {
		listaencadeada.remover();

	}

	private void listar(Lista_encadeada listaencadeada) {
		if (listaencadeada.vazio()) {
			System.out.println("Lista Vazia");
		} else {
			listaencadeada.listar();
		}
	}

	private void pesquisar(Lista_encadeada lisEncadeada, int id) {
		lisEncadeada.pesquisarPorMatricula(id);
	}
}
