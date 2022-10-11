package modelo;

import interfaces.Tributavel;

public abstract class Produto implements Tributavel{
	protected int codigo;
	protected double preco;
	protected String descricao;

	public Produto(int codigo, double preco, String descricao) {
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}

	public Produto() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", preco=" + preco + ", descricao=" + descricao;
	}	

}