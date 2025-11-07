package questao_5;

public class Pilha<T> {

	private No<T> topo;

		
	public void inicializarPilha() {
		this.topo = null;
	}
	
	public void push(T element) {
		No<T> novo = new No<>();
		novo.setValor(element);
		novo.setProximo(topo);
		topo = novo;		
	}
	
	public T pop(){
		if(topo==null) {
			System.out.println("Pilha está vazia");
			return null;
		}
		
		T removido = topo.getValor();
		topo = topo.getProximo();
		return removido;
	}
	
	public boolean isVazio() {
		return topo == null;		
	}
	
		
	

}
