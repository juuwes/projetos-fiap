package br.com.polimorfismo.implementacao;

import br.com.polimorfismo.beans.Bacharelado;
import br.com.polimorfismo.beans.Formacao;
import br.com.polimorfismo.beans.Medio;
import br.com.polimorfismo.beans.Tecnologo;
import br.com.polimorfismo.view.View;

public class TesteFormacao {

	public static void main(String[] args) {

		int tpFormacao = 0;
		String msg = "";
		do {
			// @formatter:off
 			  msg = "Qual formação deseja cadastrar?"  
						 + "\n1 - Bacharelado"
						 + "\n2 - Tecnologo"
						 + "\n3 - Nível Médio" ;
 			// @formatter:on
			tpFormacao = View.numero(msg);
		} while (tpFormacao <= 0 || tpFormacao > 3);

		Formacao formacao = null;

		
		if (tpFormacao == 1) {
			formacao = new Bacharelado();
			formacao.setDescricao(View.texto("Informe o nome do curso"));
			((Bacharelado) formacao).setCargaHorariaDoEstagio(View.numero("Informe a carga horária do estágio"));
			((Bacharelado) formacao).setProjetoConclusao(View.texto("Informe o nome do Projeto de Conclusão"));
			((Bacharelado) formacao).getAll();
		} else if (tpFormacao == 2) {
			formacao = new Tecnologo();
			formacao.setDescricao(View.texto("Informe o nome do curso"));
			((Tecnologo) formacao).setPlanoEstendido(View.logico("Possui plano estendido?"));
			((Tecnologo) formacao).getAll();
		} else {
			formacao = new Medio();
			formacao.setDescricao(View.texto("Informe o nome do curso"));
			((Medio) formacao).setTipo(View.texto("Qual foi o tipo do seu ensino médio?"));
			((Medio) formacao).getAll();
		}

		formacao.setPeriodo(View.numero("Informe período do curso: \n1 - Matutino\n2 - Vespertino \n3 - Noturno"));
		
		formacao.calcularMensalidade(formacao.getPeriodo().ordinal()/100);

		System.out.println(formacao);

	}
}
