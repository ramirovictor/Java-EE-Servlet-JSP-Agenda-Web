package com.ifg.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * Crie uma lógica chamada AlteraContatoLogic e teste a mesma através de um link na listagem da
lista-contatos.jsp . 
Lembre-se, antes de chamar essa lógica é preciso criar uma outra lógica que
mostre os dados do contato em uma nova página, permitindo assim a alteração dos dados, e só
depois, no clique de um botão, que a alteração será de fato efetivada.
 */
public class AlteraContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		return "/WEB-INF/jsp/altera-contatos.jsp";
	}

}
