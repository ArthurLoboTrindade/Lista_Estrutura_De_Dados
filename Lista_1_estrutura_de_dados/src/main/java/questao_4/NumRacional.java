package questao_4;

public class NumRacional implements INumRacional {

	public Integer numerador, denominador;

	public NumRacional(Integer numerador, Integer denominador) {
		if (denominador == 0) {
			throw new IllegalArgumentException("Denominador não pode ser zero");
		}
		if (denominador < 0) {
			numerador = -numerador;
			denominador = -denominador;
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Integer getNumerador() {
		return numerador;
	}

	public void setNumerador(Integer numerador) {
		this.numerador = numerador;
	}

	public Integer getDenominador() {
		return denominador;
	}

	public void setDenominador(Integer denominador) {
		this.denominador = denominador;
	}

	@Override
	public boolean criarRacional() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean multiplicarRacional() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean somarRacional() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean testarIgualdade() {
		// TODO Auto-generated method stub
		return false;
	}

}
