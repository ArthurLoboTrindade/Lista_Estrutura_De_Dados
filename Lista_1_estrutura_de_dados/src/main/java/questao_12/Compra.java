package questao_12;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra {

	private LocalDate data;
	private ArrayList<String> items;
	private double valor_total;
	public Compra(LocalDate data, ArrayList<String> ites, double valor_total) {
		this.data = data;
		this.items = ites;
		this.valor_total = valor_total;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public ArrayList<String> getItems() {
		return items;
	}
	public void setItems(ArrayList<String> items) {
		this.items = items;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	
	
	
}
