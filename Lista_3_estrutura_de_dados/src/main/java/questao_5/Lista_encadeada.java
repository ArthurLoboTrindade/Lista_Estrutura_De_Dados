package questao_5;

public class Lista_encadeada {
	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;
	private int tamanho = 0;
	private final int limite = 7;
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getLimite() {
		return limite;
	}

	public void adicionar(Integer valor) {
		if(tamanho==limite) {
			System.out.println("Lista cheia!");
			return;
		}
		
		Celula celula = new Celula();
		celula.setValor(valor);
		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
		tamanho++;
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
	
	public void addPrimeiro(Integer valor) {
		if(tamanho==limite) {
			System.out.println("Lista cheia!");
			return;
		}
		
		Celula celula = new Celula();
	    celula.setValor(valor);

	    if (primeiro == null && ultimo == null) {
	        primeiro = celula;
	        ultimo = celula;
	    } else {
	        celula.setProximo(primeiro);
	        primeiro = celula;
	    }
	    tamanho++;
	}
}