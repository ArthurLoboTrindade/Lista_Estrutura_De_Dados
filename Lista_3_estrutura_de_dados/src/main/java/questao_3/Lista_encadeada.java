package questao_3;

public class Lista_encadeada {
	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;

	public void adicionar(Integer valor) {
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

	public void pesquisarNumero(int n) {
		Celula c = this.primeiro;
		int i = 0;
		while(c!=null) {
			if(n==c.getValor()) {
				System.out.println("Numero: "+c.getValor() +" no Index:" + i);
				return;
			}
			c = c.getProximo();
			i++;
			
		}
	}

	public void indexTodos() {
		Celula c = this.primeiro;
		int i = 0;
		while (c != null) {
			System.out.println(c.getValor() + " está na posição: " + i);
			i++;
			c = c.getProximo();
		}
	}
}