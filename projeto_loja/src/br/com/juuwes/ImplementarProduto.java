package br.com.juuwes;

import view.View;

public class ImplementarProduto {

	/**
	 * Este método chama JOptionPane para capturar um texto (String)
	 * 
	 * @param msg
	 * @return
	 */

	public static void main(String[] args) {

		Produto objProduto2 = new Produto(View.texto("Informe a descrição: "), View.texto("Informe a marca: "),
				View.inteiro("Informe o código: "), View.decimal("Informe o valor do produto: "),
				View.logico("O produto está ativo? "));

		System.out.println(objProduto2);
	}
}