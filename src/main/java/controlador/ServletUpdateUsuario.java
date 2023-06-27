package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.AdministrativoControlador;
import implementacion.ClienteControlador;
import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;
import implementacion.ProfesionalControlador;

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
		AdministrativoControlador administrativoControlador = new AdministrativoControlador();
		ProfesionalControlador profesionalControlador = new ProfesionalControlador();
		ClienteControlador clienteControlador = new ClienteControlador();
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String run = request.getParameter("run");
		String fechaNacimiento = request.getParameter("fecha_nacimiento");

		switch (option) {

		case "formUpdateAdministrativo":
			Administrativo administrativo = administrativoControlador.findAdministrativoById(id);
			request.setAttribute("administrativo", administrativo);
			url = "updateAdministrativo.jsp";
			break;
		case "formUpdateProfesional":
			Profesional profesional = profesionalControlador.findProfesionalById(id);
			request.setAttribute("profesional", profesional);
			url = "updateProfesional.jsp";
			break;
		case "formUpdateCliente":
			Cliente cliente = clienteControlador.findClienteById(id);
			request.setAttribute("cliente", cliente);
			url = "updateCliente.jsp";
			break;
		case "updateAdministrativo":
			String area = request.getParameter("area");
			String expPrevia = request.getParameter("exp_previa");
			Administrativo administrativoUpdate = new Administrativo(id, nombre, run, fechaNacimiento, area, expPrevia);
			administrativoControlador.updateAdministrativo(administrativoUpdate);
			url = "ServletListarUsuarios";
			break;
		case "updateProfesional":
			String titulo = request.getParameter("titulo");
			String fechaIngreso = request.getParameter("fecha_ingreso");
			Profesional profesionalUpdate = new Profesional(id, nombre, run, fechaNacimiento, titulo, fechaIngreso);
			System.out.println(profesionalUpdate.toString());
			profesionalControlador.updateProfesional(profesionalUpdate);
			url = "ServletListarUsuarios";
			break;
		case "updateCliente":
			String rut = request.getParameter("rut");
			int edad = Integer.parseInt(request.getParameter("edad"));
			String apellido = request.getParameter("apellido");
			String telefono = request.getParameter("telefono");
			String afp = request.getParameter("afp");
			String direccion = request.getParameter("direccion");
			String comuna = request.getParameter("comuna");
			Cliente clienteUpdate = new Cliente(id,run,rut,edad,nombre,apellido,telefono,afp,direccion,comuna,fechaNacimiento);
			clienteControlador.updateCliente(clienteUpdate);
			url = "ServletListarUsuarios";
			break;
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
}
