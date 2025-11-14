package questao_4;

public class FilaSala<T> {

	private No<Aluno> inicio, fim;
	
	public FilaSala() {
		this.inicio = null;
		this.fim = null;
	}

	public boolean	taVazia() {
		return this.inicio == null;
	}
	
	public void inserir(Aluno aluno) {
		No<Aluno> novoNo = new No<Aluno>(aluno);
		
		if(taVazia()) {
			this.inicio = this.fim = novoNo;
			System.out.println("Primeiro Aluno na fila");
			return;
		}
		
		if (aluno.getIdade()<this.inicio.getElemento().getIdade()) {
			novoNo.setProximo(this.inicio);
			this.inicio = novoNo;
			System.out.println(inicio.getElemento().getNome() + " é o mais novo... \nInserindo no começo da fila");
			return;
		}
		
		try {
			No<Aluno> atual = inicio;
			while(atual.getProximo() != null && atual.getProximo().getElemento().getIdade()<= aluno.getIdade()) {
				atual = atual.getProximo();
			}
			
			novoNo.setProximo(atual.getProximo());
			atual.setProximo(novoNo);
			
			if(novoNo.getProximo()==null) {
				fim = novoNo;
				System.out.println(novoNo.getElemento().getNome()+" é o mais velho... \nInserindo no fim.");
			}else {
				System.out.println("Inserindo no meio...");
			}
			
		}catch (NullPointerException e) {
			System.err.println("Erro de referência nula ao percorrer a fila dinâmica.");
		}
	}
	
	public void listar() {
        if (taVazia()) {
            System.out.println("A fila está vazia.");
            return;
        }
        System.out.println("\n--- Visualização Dinâmica ---");
        No<Aluno> aux = inicio;
        while (aux != null) {
            System.out.println(aux.getElemento().toString());
            aux = aux.getProximo();
        }
       
        System.out.println("-----------------------------");
    }
	
	
}
