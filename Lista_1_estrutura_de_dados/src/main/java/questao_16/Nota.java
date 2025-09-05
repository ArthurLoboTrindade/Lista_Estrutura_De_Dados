package questao_16;

import java.time.LocalDate;

public class Nota {

	private LocalDate data_da_nota;
	private String titulo, anotacao;

	public Nota(LocalDate data_da_nota, String titulo, String anotacao) {
		this.data_da_nota = data_da_nota;
		this.titulo = titulo;
		this.anotacao = anotacao;
	}

	public LocalDate getData_da_nota() {
		return data_da_nota;
	}

	public void setData_da_nota(LocalDate data_da_nota) {
		this.data_da_nota = data_da_nota;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnotacao() {
		return anotacao;
	}

	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}

}
