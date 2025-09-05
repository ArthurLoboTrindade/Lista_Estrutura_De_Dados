package questao_11;

public class Produto {

	private String nome;
	private int código, qtd_estoque;
	private double preço_unitario;

	public Produto(String nome, int código, int qtd_estoque, double preço_unitario) {
		this.nome = nome;
		this.código = código;
		this.qtd_estoque = qtd_estoque;
		this.preço_unitario = preço_unitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCódigo() {
		return código;
	}

	public void setCódigo(int código) {
		this.código = código;
	}

	public int getQtd_estoque() {
		return qtd_estoque;
	}

	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}

	public double getPreço_unitario() {
		return preço_unitario;
	}

	public void setPreço_unitario(double preço_unitario) {
		this.preço_unitario = preço_unitario;
	}

}
