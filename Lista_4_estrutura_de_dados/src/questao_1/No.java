package questao_1;

public class No<T> {
	private T valor;
	private No<T> anterior, proximo;

	public No<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(No<T> anterior) {
		this.anterior = anterior;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

}
