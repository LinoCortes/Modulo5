package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Administrativo;
import service.AdministrativoService;

/**
 * Servlet implementation class ServletUpdateUsuario
 */
@WebServlet("/ServletUpdateAdministrativo")
public class ServletUpdateAdministrativo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "index.jsp";
		AdministrativoService administrativoService = new AdministrativoService();
		String option = request.getParameter("option");

		switch (option) {

		case "formUpdateAdministrativo":
			int id = Integer.parseInt(request.getParameter("id"));
			// llamar al controlador
			Administrativo administrativo = administrativoService.findAdministrativoById(id);
			request.setAttribute("administrativo", administrativo);
			url = "updateAdministrativo.jsp";
			break;
		}

		request.getRequestDispatcher(url).forward(request, response);
	}
}
