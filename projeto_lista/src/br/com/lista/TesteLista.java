package br.com.lista;

import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class TesteLista {

	public static void main(String[] args) {

		List<String> cargos = new ArrayList<String>();
		cargos.add("DBA");
		cargos.add("Analista");
		cargos.add("Desenvolvedor");
//		System.out.println(cargos);
//		Collections.sort(cargos);
//		System.out.println(cargos);

// metodo get() retorna o objeto com base na posição
		for (int i = 0; i < 3; i++) {
			System.out.println(cargos.get(i).toUpperCase());
		}
		String cargo = JOptionPane.showInputDialog("O que deseja pesquisar?");
// metodo indexOf procura o objeto e retorna sua posição
		if (cargos.indexOf(cargo) >= 0) {
			System.out.println("Existe!");
		} else {
			System.out.println("Não Existe!");
		}
	}

}
