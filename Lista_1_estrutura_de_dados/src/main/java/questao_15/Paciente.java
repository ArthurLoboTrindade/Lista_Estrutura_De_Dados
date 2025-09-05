package questao_15;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	private boolean prioridade;
	private LocalDate horário_chegada;
	
	public Paciente(String nome, boolean prioridade, LocalDate horário_chegada) {
		this.nome = nome;
		this.prioridade = prioridade;
		this.horário_chegada = horário_chegada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isPrioridade() {
		return prioridade;
	}

	public void setPrioridade(boolean prioridade) {
		this.prioridade = prioridade;
	}

	public LocalDate getHorário_chegada() {
		return horário_chegada;
	}

	public void setHorário_chegada(LocalDate horário_chegada) {
		this.horário_chegada = horário_chegada;
	}
	
	
	
}
