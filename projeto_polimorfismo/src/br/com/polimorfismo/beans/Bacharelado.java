package br.com.polimorfismo.beans;

public class Bacharelado extends Formacao {

	private short cargaHorariaDoEstagio;

	private String projetoConclusao;

	@Override
	public boolean getAll() {
		return getDuracao() == 48 || getDuracao() == 60;
	}

	@Override
	public void calcularMensalidade(double fator) {
		// @formatter:off
 		super.setMensalidade(
				(getDuracao() * fator * 600) 
				+ (getCargaHorariaDoEstagio() * 12)
				);
 		// @formatter:on

	}

	public Bacharelado() {
		super();
	}

	public Bacharelado(String descricao, int duracao, float mensalidade, short periodo, short cargaHoraria,
			String projetoConclusao) {
		super(descricao, duracao, mensalidade, periodo);
		this.cargaHorariaDoEstagio = cargaHoraria;
		this.projetoConclusao = projetoConclusao;
	}

	public short getCargaHorariaDoEstagio() {
		return cargaHorariaDoEstagio;
	}

	public void setCargaHorariaDoEstagio(short cargaHoraria) {
		this.cargaHorariaDoEstagio = cargaHoraria;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	@Override
	public String toString() {
		return super.toString() + " Bacharelado [cargaHorariaDoEstagio=" + cargaHorariaDoEstagio + ", projetoConclusao="
				+ projetoConclusao + "]";
	}

}