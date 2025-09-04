package questao_2;

public class Aluno implements IAluno{

	private String nome, semestre;

	public Aluno(String nome, String semestre) {
		this.nome = nome;
		this.semestre = semestre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	@Override
	public boolean adicionarAluno() {
		return false;
	}

	@Override
	public boolean editarAluno() {
		return false;
	}

	@Override
	public boolean removerAluno() {
		return false;
	}

	@Override
	public boolean atualizarAluno() {
		return false;
	}

	
	
}
