package br.com.juuwes;

public class Produto {

	private String descricao;
	private String marca;
	private int codigo;
	private double valor;
	private boolean ativo;

	public Produto(String descricao, String marca, int codigo, double valor, boolean ativo) {
		super();
		this.descricao = descricao;
		this.marca = marca;
		this.codigo = codigo;
		this.valor = valor;
		this.ativo = ativo;
	}

	public Produto() {
		super();
	}

	@Override
	public String toString() {
		return "Produto [Descrição = " + descricao + ", Marca = " + marca + ", Código = " + codigo + ", Valor = " + valor
				+ ", Ativo = " + ativo + "]";
	}

	public String getValores() {
		return "Produto sem parcelar: " + valor + ". Produto parcelado: " + valor * 1.1;
	}

	/*
	 * private double calcDesconto() { return valor * 0.9; }
	 */

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getBasico() {
		return codigo + "-" + descricao;
	}

	public String getDetalheMarca() {
		return "A marca é: " + marca;
	}
}
