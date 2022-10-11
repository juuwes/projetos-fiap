package br.com.polimorfismo.beans;

public class Medio extends Formacao {

	private String tipo;

	@Override
	public boolean getAll() {
		return getDuracao() == 36;
	}

	@Override
	public void calcularMensalidade(double fator) {
		super.setMensalidade(getDuracao() * fator * 500);
	}

	public Medio() {
		super();
	}

	public Medio(String descricao, int duracao, float mensalidade, short periodo, String tipo) {
		super(descricao, duracao, mensalidade, periodo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " Medio [tipo=" + tipo + "]";
	}

}
