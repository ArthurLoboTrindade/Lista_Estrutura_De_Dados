package questao_8;

public class Hotwheels implements IHotwheels{

	private String nome, modelo, ano_lançamento, colecao;

	public Hotwheels(String nome, String modelo, String ano_lançamento, String colecao) {
		this.nome = nome;
		this.modelo = modelo;
		this.ano_lançamento = ano_lançamento;
		this.colecao = colecao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno_lançamento() {
		return ano_lançamento;
	}

	public void setAno_lançamento(String ano_lançamento) {
		this.ano_lançamento = ano_lançamento;
	}

	public String getColecao() {
		return colecao;
	}

	public void setColecao(String colecao) {
		this.colecao = colecao;
	}

	@Override
	public boolean AdicionarHotwheels() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RemoverHotwheels() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AtualizarHotwheels() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
