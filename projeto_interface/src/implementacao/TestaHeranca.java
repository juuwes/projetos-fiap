package implementacao;

import modelo.CD;

public class TestaHeranca {

	public static void main(String[] args) {

		CD objeto = new CD();
		objeto.setCodigo(1);
		objeto.setDescricao("Apocalipson");
		objeto.setPreco(120.00);
		objeto.setArtista("Joelma");
		objeto.setQtdeFaixas(32);

		System.out.println(objeto.toString());

	}
}
