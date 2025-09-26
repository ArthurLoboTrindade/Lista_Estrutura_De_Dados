package questao_1;

public class Professor {

	private String nome, curso;

	public Professor(String nome, String curso) {
		this.nome = nome;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Professor(a): "+nome+" - Do curso: " + curso;
	}
	
}
