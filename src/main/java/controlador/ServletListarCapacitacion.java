package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.CapacitacionControlador;


@WebServlet("/ServletListarCapacitacion")
public class ServletListarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    CapacitacionControlador capacitacionControlador = new CapacitacionControlador();
    System.out.println("Dentro de capacitaciones");
    // System.out.println(studentController.findAllStundents()); []
    
    request.setAttribute("capacitaciones", capacitacionControlador.findAllCapacitacion());
    // reenviar esta informacion a un JSP
    RequestDispatcher dispatcher = request.getRequestDispatcher("/listarCapacitacion.jsp");
    dispatcher.forward(request, response);
  }
       
   
}