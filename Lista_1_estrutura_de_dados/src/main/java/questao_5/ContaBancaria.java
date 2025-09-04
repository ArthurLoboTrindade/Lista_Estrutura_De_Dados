package questao_5;

public class ContaBancaria implements IContaBancaria {

	public String proprietario;
	public int id_conta;
	public Double saldo;

	public ContaBancaria(String proprietario, int id_conta, Double saldo) {
		this.proprietario = proprietario;
		this.id_conta = id_conta;
		this.saldo = saldo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getId_conta() {
		return id_conta;
	}

	public void setId_conta(int id_conta) {
		this.id_conta = id_conta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public boolean atualizar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean depositar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sacar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean visualizarSaldo() {
		// TODO Auto-generated method stub
		return false;
		}
	
}

