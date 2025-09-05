package questao_14;

import java.time.LocalDate;

public class Empregado implements IEmpregado {

	private String nome, cargo;
	private double salário;
	private LocalDate dataDeAdmissão;

	public Empregado(String nome, String cargo, double salário, LocalDate dataDeAdmissão) {
		this.nome = nome;
		this.cargo = cargo;
		this.salário = salário;
		this.dataDeAdmissão = dataDeAdmissão;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public LocalDate getDataDeAdmissão() {
		return dataDeAdmissão;
	}

	public void setDataDeAdmissão(LocalDate dataDeAdmissão) {
		this.dataDeAdmissão = dataDeAdmissão;
	}

	public double getSalário() {
		return salário;
	}

	public void setSalário(double salário) {
		this.salário = salário;
	}

	@Override
	public boolean adicionarEmpregado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removerEmpregado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editarEmpregado() {
		// TODO Auto-generated method stub
		return false;
	}

}
