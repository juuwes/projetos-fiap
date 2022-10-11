package implementacao;

import modelo.CD;
import modelo.Livro;

public class TestaHeranca {

	public static void main(String[] args) {

		CD cd = new CD();
		cd.setCodigo(1);
		cd.setDescricao("Californication");
		cd.setPreco(120.00);
		cd.setArtista("Red Hot Chili Peppers");
		cd.setQtdeFaixas(32);

		System.out.println(cd.toString());
		
		Livro livro = new Livro();
		livro.setCodigo(2);
		livro.setDescricao("Aprendendo Java");
		livro.setPreco(80.00);
		livro.setEditora("FIAP");
		livro.setIsbn(14523-5482);
		
		System.out.println(livro.toString());


	}
}
