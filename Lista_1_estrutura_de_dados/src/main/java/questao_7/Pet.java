
package questao_7;

public class Pet implements IPet{

	public String nome, raça, telefone_tutor, data_de_nascimento;

	public Pet(String nome, String raça, String telefone_tutor, String data_de_nascimento) {
		this.nome = nome;
		this.raça = raça;
		this.telefone_tutor = telefone_tutor;
		this.data_de_nascimento = data_de_nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getData_de_nascimento() {
		return data_de_nascimento;
	}

	public void setData_de_nascimento(String data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}

	public String getTelefone_tutor() {
		return telefone_tutor;
	}

	public void setTelefone_tutor(String telefone_tutor) {
		this.telefone_tutor = telefone_tutor;
	}

	@Override
	public boolean AdicionarPet() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RemoverPet() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AtualizarPet() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
