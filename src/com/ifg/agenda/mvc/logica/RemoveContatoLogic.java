package com.ifg.agenda.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ifg.agenda.dao.ContatoDao;
import com.ifg.agenda.modelo.Contato;
/**
 * Lógica para remover um contato. Implementa a interface Logica e durante sua
 * execução recebe um id pelo request e remove o contato no banco a partir deste
 * id .
 * 
 * @author ramirovictor
 *
 */
public class RemoveContatoLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		long id = Long.parseLong(req.getParameter("id"));
		
		Contato contato = new Contato();
		contato.setId(id);
		
		Connection connection = (Connection) req.getAttribute("conexao");
		ContatoDao dao = new ContatoDao(connection);
		dao.remove(contato);
		
		System.out.println("Ecluindo...");
				return "mvc?logica=ListaContatoLogic";
	}

}
