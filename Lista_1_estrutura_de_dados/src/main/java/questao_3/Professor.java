package questao_3;

public class Professor implements IProfessor {

	private String nome;
	private Integer codigo_da_disciplina;

	public Professor(String nome, Integer codigo_da_disciplina) {
		this.nome = nome;
		this.codigo_da_disciplina = codigo_da_disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo_da_disciplina() {
		return codigo_da_disciplina;
	}

	public void setCodigo_da_disciplina(Integer codigo_da_disciplina) {
		this.codigo_da_disciplina = codigo_da_disciplina;
	}

	@Override
	public boolean adicionarProfessor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean atualizarProfessor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editarProfessor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removerProfessor() {
		// TODO Auto-generated method stub
		return false;
	}

}
