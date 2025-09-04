package questao_9;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	public String nome_cliente; 
	public Double valor_total;
	public List<Item> itens;
	
	public Pedido(String nome_cliente, List<Item> itens) {
		this.nome_cliente = nome_cliente;
		this.itens = itens;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public Double getValor_total() {
		return valor_total;
	}

	public void setValor_total(ArrayList<Item> itens) {
		for(Item i:itens) {
			valor_total+=i.getValor();
		};
	}
	
	
	
	
}
