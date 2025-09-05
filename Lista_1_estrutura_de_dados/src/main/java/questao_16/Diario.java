package questao_16;

import java.util.ArrayList;

public class Diario implements IDiario {

	public ArrayList<Nota> anotacoes;

	public Diario(ArrayList<Nota> anotacoes) {
		this.anotacoes = anotacoes;
	}

	public ArrayList<Nota> getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(ArrayList<Nota> anotacoes) {
		this.anotacoes = anotacoes;
	}

	@Override
	public boolean adicionarNota() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removerNota() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editarNota() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
