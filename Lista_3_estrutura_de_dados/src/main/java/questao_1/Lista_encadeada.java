package questao_1;

public class Lista_encadeada {  
	private Celula primeiro; 
	private Celula ultimo; 
	private Celula posicaoAtual;
	
	

	public void adicionar(Professor valor) { 
		Celula celula = new Celula(); 
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

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}

	
	public void remover() {
		if(primeiro.getProximo() != null) {
			Celula celula = this.recuperarPenultimo(this.primeiro);
			ultimo = celula;
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
		
		
	}
	
	private Celula recuperarPenultimo(Celula celula) {
		if(celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
		
	}
	
	public void listar() {
//		if(primeiro==null) {
//			System.out.println("Lista vazia");
//			return;
//		}
		while(Lista_encadeada.this.temProximo()) {
				System.out.println(Lista_encadeada.this.posicaoAtual.getValor().toString());
		}
	}
	
	public int tamanho() {
		int cont =0;
		do {
			if(temProximo()) {
				cont+=1;
			}
		}
		while (getPosicaoAtual()!=ultimo); 
		return cont;
	}
	
	public boolean vazio() {
		return primeiro==null ? true : false;
	}
	
	public void apagarTUDO() {
		while(primeiro!=null) {
			remover();
		}
	}

}