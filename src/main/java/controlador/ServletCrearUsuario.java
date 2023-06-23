package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import implementacion.AdministrativoControlador;
import implementacion.CapacitacionControlador;
import implementacion.ClienteControlador;
import implementacion.ProfesionalControlador;
import interfaces.IAdministrativoControlador;
import modelo.Administrativo;
import modelo.Capacitacion;
import modelo.Cliente;
import modelo.Profesional;

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
		String fechaNacimiento = request.getParameter("fecha_nacimiento");
	
	
		switch (tipoUsuario) {
			case "1":
				String area = request.getParameter("area");
				String experienciaPrevia = request.getParameter("exp_previa");
				Administrativo administrativo = new Administrativo();
				administrativo.setNombre(nombre);
				administrativo.setRun(run);
    			administrativo.setFechaNacimiento(fechaNacimiento);
    			administrativo.setArea(area);
    			administrativo.setExperienciaPrevia(experienciaPrevia);
				System.out.println(administrativo.toString());
    			AdministrativoControlador administrativoControlador = new AdministrativoControlador();
				administrativoControlador.crearAdministrativo(administrativo);
				response.sendRedirect("ServletListarUsuarios");
			break;
			case "2":
				String titulo = request.getParameter("titulo");
				String fechaIngreso = request.getParameter("fecha_ingreso");
				Profesional profesional = new Profesional();
				profesional.setNombre(nombre);
				profesional.setRun(run);
				profesional.setFechaNacimiento(fechaNacimiento);
				profesional.setTitulo(titulo);
				profesional.setFechaIngreso(fechaIngreso);
				ProfesionalControlador profesionalControlador = new ProfesionalControlador();
				profesionalControlador.crearProfesional(profesional);
				response.sendRedirect("ServletListarUsuarios");
			break;
			case "3":
				String rut = request.getParameter("rut");
				int edad = Integer.parseInt(request.getParameter("edad"));
				String apellidos = request.getParameter("apellidos");
				String telefono = request.getParameter("telefono");
				String afp = request.getParameter("afp");
				String direccion = request.getParameter("direccion");
				String comuna = request.getParameter("comuna");
				System.out.println("en crear usuario (Cliente) Servlet");
				Cliente cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setRun(run);
				cliente.setFechaNacimiento(fechaNacimiento);
				cliente.setRut(rut);
				cliente.setEdad(edad);
				cliente.setApellidos(apellidos);
				cliente.setTelefono(telefono);
				cliente.setAfp(afp);
				cliente.setDireccion(direccion);
				cliente.setComuna(comuna);
				ClienteControlador clienteControlador = new ClienteControlador();
				clienteControlador.crearCliente(cliente);
				response.sendRedirect("ServletListarUsuarios");
			break;
			
		}
		

	}

}
