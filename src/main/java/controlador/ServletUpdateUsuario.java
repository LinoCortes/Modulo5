package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Administrativo;
import modelo.Profesional;
import service.AdministrativoService;
import service.ProfesionalService;

/**
 * Servlet implementation class ServletUpdateUsuario
 */
@WebServlet("/ServletUpdateUsuario")
public class ServletUpdateUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "index.jsp";
		String option = request.getParameter("option");
		int id = Integer.parseInt(request.getParameter("id"));
		
		switch (option) {

		case "formUpdateAdministrativo":
			AdministrativoService administrativoService = new AdministrativoService();
			Administrativo administrativo = administrativoService.findAdministrativoById(id);
			request.setAttribute("administrativo", administrativo);
			url = "updateAdministrativo.jsp";
			break;
		case "formUpdateProfesional":
			ProfesionalService profesionalService = new ProfesionalService();
			Profesional profesional = profesionalService.findProfesionalById(id);
			request.setAttribute("profesional",profesional);
			url = "updateProfesional.jsp";
			break;
		}

		request.getRequestDispatcher(url).forward(request, response);
	}
}
