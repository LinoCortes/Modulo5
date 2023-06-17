package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Capacitacion;
import implementacion.CapacitacionControlador;

/**
 * Servlet implementation class ServletCrearCapacitacion
 */
@WebServlet("/ServletCrearCapacitacion")
public class ServletCrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	   // Obtener los parámetros de la solicitud POST
    			System.out.println("Dentro de crear capacitaicon");
    	    	int identificador = Integer.parseInt(request.getParameter("identificador"));
    			int duracion = Integer.parseInt(request.getParameter("duracion"));
    			int cantidadAsistentes = Integer.parseInt(request.getParameter("cantidadAsistentes"));
    			String rutCliente = request.getParameter("rutCliente");
    			String tematica = request.getParameter("tematica");
    			String dia = request.getParameter("dia");
    			String hora = request.getParameter("hora");
    			String lugar = request.getParameter("lugar");

    			// Crear el objeto Capacitacion
    			Capacitacion capacitacion = new Capacitacion();
    			capacitacion.setIdentificador(identificador);
    			capacitacion.setDuracion(duracion);
    			capacitacion.setCantidadAsistentes(cantidadAsistentes);
    			capacitacion.setRutCliente(rutCliente);
    			capacitacion.setTematica(tematica);
    			capacitacion.setDia(dia);
    			capacitacion.setHora(hora);
    			capacitacion.setLugar(lugar);

    			// Insertar la capacitación en la base de datos
    			Capacitacion crearCapacitaciones  = new Capacitacion();
    			CapacitacionControlador capacitacionControlador = new CapacitacionControlador();
    			capacitacionControlador.crearCapacitaciones(capacitacion);

    			// Redirigir a una página de éxito o mostrar un mensaje de éxito
    			response.sendRedirect("ServletListarCapacitacion");
    	    
    	    }  	
       
}
   

