package com.ifg.agenda.mvc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ifg.agenda.mvc.logica.Logica;
/**
 * Servlete controladora. Controla que ação será executada para cada requisição,
 * e que JSP será utilizado.
 * 
 * Tem responsabilidade de redirecionar para uma página JSP ou para qualquer
 * outra lógica ao final da execução das lógicas, por meio do método executa que
 * retorna um simples String
 * 
 * @author ramirovictor
 *
 */
@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametro = request.getParameter("logica");
		String nomeDaClasse = "com.ifg.agenda.mvc.logica."+ parametro;
		
		try {
			Class classe = Class.forName(nomeDaClasse);
			
			Logica logica = (Logica) classe.newInstance();
			String pagina = logica.executa(request, response);
			
			request.getRequestDispatcher(pagina).forward(request, response);
;		}catch(Exception e) {
	throw new ServletException("A lógica de negócio causou um exeção", e);
}
	}

}
