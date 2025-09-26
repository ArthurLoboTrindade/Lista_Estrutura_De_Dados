package questao_2;


public class Lista_encadeada {
	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;

	public void adicionar(Aluno valor) {
		Celula celula = new Celula();
		celula.setValor(valor);
		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}

	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		} else if (posicaoAtual == null) {
			posicaoAtual = primeiro;
			return true;
		} else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
	}

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}

	public void remover() {
		if (primeiro.getProximo() != null) {
			Celula celula = this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}

	}

	private Celula recuperarPenultimo(Celula celula) {
		if (celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());

	}

	public void listar() {
		Celula c = this.primeiro;
		while (c != null) {
			System.out.println(c.getValor().toString());
			c = c.getProximo();
		}
	}

	public int tamanho() {
		int cont = 0;
		do {
			if (temProximo()) {
				cont += 1;
			}
		} while (getPosicaoAtual() != ultimo);
		return cont;
	}

	public boolean vazio() {
		return primeiro == null ? true : false;
	}

	public void listarAlfabetico() {
		Aluno[] a = new Aluno[tamanho()];
		Celula c = this.primeiro;
		int i = 0;
		while (c != null) {
			a[i] = c.getValor();
			i++;
			c = c.getProximo();
		}
		boolean trocou;
		do {
			trocou = false;
			for (int ij = 0; ij < a.length - 1; ij++) {
				if (a[ij].getNome().compareToIgnoreCase(a[ij + 1].getNome()) > 0) {
					Aluno temp = a[ij];
					a[ij] = a[ij + 1];
					a[ij + 1] = temp;
					trocou = true;
				}
			}
		} while (trocou);

		for (Aluno aluno : a) {
			System.out.println(aluno.toString());
		}
	}

	public void pesquisarPorMatricula(int id) {
		Celula c = this.primeiro;
		while (c != null) {
			if (id == c.getValor().getMatricula()) {
				System.out.println("Aluno encontrado: " + c.getValor().toString());
				return;
			}
			c = c.getProximo();
		}
		System.out.println("Não está cadastrado.");

	}
	


}