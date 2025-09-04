package questao_1;

public class Livro implements ILivro{

	private String Titulo, Editora, Ano_de_Publicacao;

	public Livro(String titulo, String editora, String ano_de_Publicacao) {
		Titulo = titulo;
		Editora = editora;
		Ano_de_Publicacao = ano_de_Publicacao;
	}

	
	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getEditora() {
		return Editora;
	}

	public void setEditora(String editora) {
		Editora = editora;
	}

	public String getAno_de_Publicacao() {
		return Ano_de_Publicacao;
	}

	public void setAno_de_Publicacao(String ano_de_Publicacao) {
		Ano_de_Publicacao = ano_de_Publicacao;
	}

	@Override
	public boolean AdicionarLivro() {
		return false;
	}

	@Override
	public boolean EditarLivro() {
		return false;
	}

	@Override
	public boolean RemoverLivro() {
		return false;
	}

	@Override
	public boolean ListarLivro() {
		return false;
	}



}
