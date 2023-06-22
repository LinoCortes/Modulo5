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
import interfaces.IAdministrativoControlador;
import modelo.Administrativo;
import modelo.Capacitacion;
import modelo.Cliente;

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
		String nombre = request.getParameter("Nombre");
		String run = request.getParameter("run");
		String fechaNacimiento = request.getParameter("Fecha");
		String rut = request.getParameter("rut");
		int edad = Integer.parseInt(request.getParameter("edad"));
		String apellidos = request.getParameter("apellidos");
		String telefono = request.getParameter("telefono");
		String afp = request.getParameter("afp");
		String direccion = request.getParameter("direccion");
		String comuna = request.getParameter("comuna");
		String area = request.getParameter("area");
		String experienciaPrevia = request.getParameter("expPrevia");
		//String titulo = request.getParameter("titulo");
		//String fechaIngreso = request.getParameter("fechaIngreso");
	
		switch (tipoUsuario) {
			case "1":
				Administrativo administrativo = new Administrativo();
				administrativo.setNombre(nombre);
				administrativo.setRun(run);
    			administrativo.setFechaNacimiento(fechaNacimiento);
    			administrativo.setArea(area);
    			administrativo.setExperienciaPrevia(experienciaPrevia);
				AdministrativoControlador administrativoControlador = new AdministrativoControlador();
				administrativoControlador.crearAdministrativo(administrativo);
				response.sendRedirect("ServletListarUsuarios");
				break;
			case "2":
				break;
			case "3":
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
