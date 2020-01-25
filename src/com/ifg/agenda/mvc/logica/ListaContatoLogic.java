package com.ifg.agenda.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ifg.agenda.dao.ContatoDao;
import com.ifg.agenda.modelo.*;
/**
 * Classe cria uma lista de contatos através de uma instância da classe ContatoDao,
 * e guarda-a no request e retorna para a servelt controladora.
 * @author ramirovictor
 *
 */
public class ListaContatoLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		
		List<Contato> contatos = new ContatoDao().getLista();
		req.setAttribute("contatos",  contatos);
		return "/WEB-INF/jsp/lista-contatos.jsp";
	}

}
