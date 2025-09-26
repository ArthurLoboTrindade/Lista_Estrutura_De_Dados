package questao_1;

public class Main {

	public static void main(String[] args) {

		Main testelista = new Main();
		Lista_encadeada listaencadeada = new Lista_encadeada();
		testelista.listar(listaencadeada);
		testelista.size(listaencadeada);

		testelista.addRegistro(listaencadeada);
		System.out.println("Adicionando Professores!!");
		System.out.println("Esses são os professores armazenados ");
		testelista.listar(listaencadeada);

		System.out.println("");

		System.out.println("Agora vamos remover o ultimo!!");

		testelista.removerUltimo(listaencadeada);
		System.out.println("Professor removido");
		System.out.println("A lista ficou assim: ");
		testelista.listar(listaencadeada);
		System.out.println("");
		testelista.size(listaencadeada);
		
		System.out.println("Apagando todos os elementos");
		testelista.apagarTodosRegistros(listaencadeada);
		testelista.listar(listaencadeada);

	}

	private void addRegistro(Lista_encadeada listaencadeada) {
		Professor p = new Professor("Angela Peixoto", "ADS");
		listaencadeada.adicionar(p);
		p = new Professor("Oswaldo Requião", "ADS");
		listaencadeada.adicionar(p);
		p = new Professor("Mario Jorge", "ADS");
		listaencadeada.adicionar(p);

	}

	private void removerUltimo(Lista_encadeada listaencadeada) {
		listaencadeada.remover();

	}

	private void apagarTodosRegistros(Lista_encadeada listaencadeada) {
		listaencadeada.apagarTUDO();
	}

	private void listar(Lista_encadeada listaencadeada) {
		if (listaencadeada.vazio()) {
			System.out.println("Lista Vazia");
		} else {
			listaencadeada.listar();
		}
	}

	private void size(Lista_encadeada listaencadeada) {
		System.out.println(listaencadeada.tamanho() + " elementos");
	}

}
