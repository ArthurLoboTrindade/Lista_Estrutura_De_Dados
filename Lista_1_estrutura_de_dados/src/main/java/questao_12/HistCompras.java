package questao_12;

import java.util.ArrayList;

public class HistCompras implements IHistCompras {

	private ArrayList<Compra> compras;

	public ArrayList<Compra> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}

	public HistCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}

	@Override
	public boolean AdicionarCompra() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ListarCompras() {
		// TODO Auto-generated method stub
		return false;
	}
}
