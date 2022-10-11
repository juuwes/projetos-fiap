package modelo;

public class CD extends Produto {
	private String artista;
	private int qtdeFaixas;

	public double calcularImposto() {
		return super.getPreco() * 0.15;
	}

	public CD() {
		super();
	}

	public CD(int codigo, double preco, String descricao, String artista, int qtdeFaixas) {
		super(codigo, preco, descricao);
		this.artista = artista;
		this.qtdeFaixas = qtdeFaixas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getQtdeFaixas() {
		return qtdeFaixas;
	}

	public void setQtdeFaixas(int qtdeFaixas) {
		this.qtdeFaixas = qtdeFaixas;
	}

	@Override
	public String toString() {
		return "CD [artista=" + artista + ", qtdeFaixas=" + qtdeFaixas + ", " + super.toString() + "]";
	}

}
