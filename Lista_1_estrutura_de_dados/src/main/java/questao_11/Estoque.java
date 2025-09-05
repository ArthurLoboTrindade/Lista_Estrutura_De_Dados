package questao_11;

import java.util.ArrayList;

public class Estoque implements IEstoque{

	private ArrayList<Produto> produtos;

	public Estoque(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public boolean AdicionarProduto() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RemoverProduto() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ListarProdutos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean EditarProdutos() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
