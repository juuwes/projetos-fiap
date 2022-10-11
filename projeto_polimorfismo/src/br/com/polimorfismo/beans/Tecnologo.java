package br.com.polimorfismo.beans;

public class Tecnologo extends Formacao {

 
	private boolean planoEstendido;

	@Override
	public boolean getAll() {
		return getDuracao() == 24;
	}

	@Override
	public void calcularMensalidade(double fator) {
		super.setMensalidade(getDuracao() * fator * 600);

	}

 
	public Tecnologo(String descricao, int duracao, float mensalidade, short periodo, boolean planoEstendido) {
		super(descricao, duracao, mensalidade, periodo);
		this.planoEstendido = planoEstendido;
	}

	public Tecnologo() {
		super();
	}

	public Tecnologo(String descricao, int duracao, float mensalidade, short periodo) {
		super(descricao, duracao, mensalidade, periodo);
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}

	@Override
	public String toString() {
		return super.toString() +  " Tecnologo [planoEstendido=" + planoEstendido + "]";
	}


}
//fommater formata tudo menos o bloc
