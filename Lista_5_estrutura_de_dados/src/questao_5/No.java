package questao_5;

public class No<T> {
	private T elemento;
	private No<T> proximo;

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	public T getValor() {
		return elemento;
	}

	public void setValor(T valor) {
		this.elemento = valor;
	}

}
