package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import implementacion.AdministrativoControlador;
import implementacion.CapacitacionControlador;
import interfaces.IAdministrativoControlador;
import modelo.Administrativo;
import modelo.Capacitacion;

/**
 * Servlet implementation class ServletCrearUsuario
 */
@WebServlet("/ServletCrearUsuario")
public class ServletCrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletCrearUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtener los parámetros de la solicitud POST
		String tipoUsuario = request.getParameter("tipoUsuario");
		String nombre = request.getParameter("nombre");
		String run = request.getParameter("run");
		String fechaNacimiento = request.getParameter("fechaNacimiento");
		int rut = Integer.parseInt(request.getParameter("rut"));
		int edad = Integer.parseInt(request.getParameter("edad"));
		String apellidos = request.getParameter("apellidos");
		String telefono = request.getParameter("telefono");
		String afp = request.getParameter("afp");
		String direccion = request.getParameter("direccion");
		String comuna = request.getParameter("comuna");
		String area = request.getParameter("area");
		String experienciaPrevia = request.getParameter("experienciaPrevia");
		String titulo = request.getParameter("titulo");
		String fechaIngreso = request.getParameter("fechaIngreso");
		
		switch (tipoUsuario) {
			case "1":
				Administrativo administrativo = new Administrativo();
				administrativo.setNombre(nombre);
    			administrativo.setRun(run);
    			administrativo.setFechaNacimiento(fechaNacimiento);
    			administrativo.setArea(area);
    			administrativo.setExperienciaPrevia(experienciaPrevia);
				AdministrativoControlador administrativoControlador = new AdministrativoControlador();
				break;
			case "2":
				break;
			case "3":
				break;
			
		}
		
		
		
		
//		int duracion = Integer.parseInt(request.getParameter("duracion"));
//		int cantidadAsistentes = Integer.parseInt(request.getParameter("cantidadAsistentes"));
//		String rutCliente = request.getParameter("rutCliente");
//		String tematica = request.getParameter("tematica");
//		String dia = request.getParameter("dia");
//		String hora = request.getParameter("hora");
//		String lugar = request.getParameter("lugar");
//
//		// Crear el objeto Capacitacion
//		Capacitacion capacitacion = new Capacitacion();
//		capacitacion.setIdentificador(identificador);
//		capacitacion.setDuracion(duracion);
//		capacitacion.setCantidadAsistentes(cantidadAsistentes);
//		capacitacion.setRutCliente(rutCliente);
//		capacitacion.setTematica(tematica);
//		capacitacion.setDia(dia);
//		capacitacion.setHora(hora);
//		capacitacion.setLugar(lugar);
//
//		// Insertar la capacitación en la base de datos
//		Capacitacion crearCapacitaciones = new Capacitacion();
//		CapacitacionControlador capacitacionControlador = new CapacitacionControlador();
//		capacitacionControlador.crearCapacitaciones(capacitacion);
//
//		// Redirigir a una página de éxito o mostrar un mensaje de éxito
//		response.sendRedirect("ServletListarCapacitacion");

	}

}
