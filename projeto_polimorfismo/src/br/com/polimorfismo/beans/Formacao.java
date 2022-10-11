package br.com.polimorfismo.beans;

import br.com.polimorfismo.interfaces.Calculavel;

public abstract class Formacao implements Calculavel {

	private String descricao;
	private int duracao;
	private double mensalidade;
	private short periodo;

	public float retornarMedia(float notaPrimeiroSemestre, float notaSegundoSemestre) {
		return (notaPrimeiroSemestre + notaSegundoSemestre) / 2;
	}

	public float retornarMedia(float notaPrimeiroSemestre, float notaSegundoSemestre, float provaUm, float provaDois) {
		return (retornarMedia(notaPrimeiroSemestre, notaSegundoSemestre) * 80 / 100) + (provaUm + provaDois) / 2;
	}

	public float retornarMedia(float notaPrimeiroSemestre, float notaSegundoSemestre, float provaUm, float provaDois,
			float mediaUm, float mediaDois) {
		// @formatter:off
 		return (retornarMedia(notaPrimeiroSemestre, notaSegundoSemestre) * 50 / 100)
				+ ((provaUm + provaDois) / 2 * 20 / 100) 
				+ ((mediaUm + mediaDois) / 2 * 30 / 100);
 		// @formatter:on

	}

	public void definirDuracao() {
		if (this instanceof Medio) {
			this.duracao = 36;
		} else if (this instanceof Tecnologo) {
			this.duracao = 24;
		} else if (this.descricao.equalsIgnoreCase("ENGENHARIA")) {
			this.duracao = 60;
		} else {
			this.duracao = 48;
		}
	}

	// Construtores
	public Formacao(String descricao, int duracao, float mensalidade, short periodo) {
		super();
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
		this.periodo = periodo;
	}

	public Formacao() {
		super();
	}

	// Getters and Setters
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDuracao() {
		definirDuracao();
		return duracao;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public Periodo getPeriodo() {
		return Periodo.values()[(int)periodo-1];
	}

	public void setPeriodo(short periodo) {
		this.periodo = periodo;
	}

	@Override
	public String toString() {
		return "Formacao [descricao=" + descricao + ", duracao=" + duracao + ", mensalidade=" + mensalidade
				+ ", periodo=" + getPeriodo() + "]";
	}

}
