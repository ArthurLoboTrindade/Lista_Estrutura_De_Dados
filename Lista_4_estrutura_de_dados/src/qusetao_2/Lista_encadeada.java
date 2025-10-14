package qusetao_2;

public class Lista_encadeada<T> {  
	private Celula<T> primeiro, ultimo, posicaoAtual; 

	
	

	public void adicionar(T valor) { 
		Celula<T> celula = new Celula<>(); 
		celula.setValor(valor);
		if(primeiro ==null && ultimo ==null) {
			primeiro = celula;
			ultimo = celula;
		}else {							                     
			ultimo.setProximo(celula); 
			ultimo = celula;
		}
	}
	
	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		}else if(posicaoAtual == null){
			posicaoAtual = primeiro;
			return true;
		}else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
	}

	public Celula<T> getPosicaoAtual() {
		return posicaoAtual;
	}

	
	public void remover() {
		if(primeiro.getProximo() != null) {
			Celula<T> celula = this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
		
		
	}
	
	private Celula<T> recuperarPenultimo(Celula<T> celula) {
		if(celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
		
	}
	
	public void listar() {
		while(Lista_encadeada.this.temProximo()) {
				System.out.println(Lista_encadeada.this.posicaoAtual.getValor().toString());
		}
	}
	
	public boolean vazio() {
		return primeiro==null ? true : false;
	}
	
	public boolean contem(T dado) {
        Celula<T> aux = primeiro;
        while (aux != null) {
            if (aux.getValor().equals(dado)) {
                return true;
            }
            aux = aux.getProximo();
        }
        return false;
    }
	
	 public Lista_encadeada<T> nomesComuns(Lista_encadeada<T> outra) {
	        Lista_encadeada<T> resultado = new Lista_encadeada<>();
	        Celula<T> aux = primeiro;
	        while (aux != null) {
	            if (outra.contem(aux.getValor()) && !resultado.contem(aux.getValor())) {
	                resultado.adicionar(aux.getValor());
	            }
	            aux = aux.getProximo();
	        }
	        return resultado;
	    }


}