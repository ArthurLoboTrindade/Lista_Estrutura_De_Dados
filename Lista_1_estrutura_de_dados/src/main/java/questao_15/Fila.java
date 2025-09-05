package questao_15;

import java.util.ArrayList;

public class Fila implements IFila{

	private ArrayList<Paciente> filaDEespera;

	public Fila(ArrayList<Paciente> filaDEespera) {
		this.filaDEespera = filaDEespera;
	}

	public ArrayList<Paciente> getFilaDEespera() {
		return filaDEespera;
	}

	public void setFilaDEespera(ArrayList<Paciente> filaDEespera) {
		this.filaDEespera = filaDEespera;
	}

	@Override
	public boolean adicionarPaciente() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean chamarProximo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean listarPacientes() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
