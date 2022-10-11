package modelo;

public class Livro extends Produto {
	private long isbn;
	private String editora;

	public double calcularImposto() {
		return super.getPreco() * 0.05;
	}

	public Livro() {
		super();
	}

	public Livro(int codigo, double preco, String descricao, long isbn, String editora) {
		super(codigo, preco, descricao);
		this.isbn = isbn;
		this.editora = editora;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", editora=" + editora + ", codigo=" + codigo + ", preco=" + preco
				+ ", descricao=" + descricao + "]";
	}
	
	

}
