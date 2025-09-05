package questao_13;

import java.util.ArrayList;

public class Campeonato implements ICampeonato {

	private String nome_do_campeonato;
	private ArrayList<Time> times_participantes;

	public Campeonato(String nome_do_campeonato, ArrayList<Time> times_participantes) {
		this.nome_do_campeonato = nome_do_campeonato;
		this.times_participantes = times_participantes;
	}

	public String getNome_do_campeonato() {
		return nome_do_campeonato;
	}

	public void setNome_do_campeonato(String nome_do_campeonato) {
		this.nome_do_campeonato = nome_do_campeonato;
	}

	public ArrayList<Time> getTimes_participantes() {
		return times_participantes;
	}

	public void setTimes_participantes(ArrayList<Time> times_participantes) {
		this.times_participantes = times_participantes;
	}

	@Override
	public boolean AlterarCampeonato() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RemoverCampeonato() {
		// TODO Auto-generated method stub
		return false;
	}

}
