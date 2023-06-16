package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.UsuarioControlador;

/**
 * Servlet implementation class ServletListarUsuarios
 */
@WebServlet("/ServletListarUsuarios")
public class ServletListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    UsuarioControlador usuarioControlador = new UsuarioControlador();
	    System.out.println("Dentro de usuarios");
	    // System.out.println(studentController.findAllStundents()); []
	    
	    request.setAttribute("usuarios", usuarioControlador.findAllUsuario());
	    // reenviar esta informacion a un JSP
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/listarUsuarios.jsp");
	    dispatcher.forward(request, response);
	  }
	       

}
