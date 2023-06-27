package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		RequestDispatcher requestDispatcher;
		if(usuario.equals("admin") && password.equals("1234")) {
			HttpSession session = request.getSession();
			session.setAttribute("usuario", usuario); // se anade un atributo adicional a la session que es el nombre de usuario(admi)
			requestDispatcher = request.getRequestDispatcher("contacto.jsp");
		}else {
			requestDispatcher = request.getRequestDispatcher("login.jsp");
		}
		
		requestDispatcher.forward(request, response);
	
	}

}