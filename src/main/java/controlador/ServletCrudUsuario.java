package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.AdministrativoControlador;
import modelo.Administrativo;
import modelo.Usuario;

/**
 * Servlet implementation class ServletCrudUsuario
 */
@WebServlet("/ServletCrudUsuario")
public class ServletCrudUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String option = request.getParameter("option"); 
	    // creo la instancia del controlador
	    AdministrativoControlador administradorControlador = new AdministrativoControlador();
	    String url = "tablaAdministrativo.jsp";
	    System.out.println(option);
	    
	    switch (option) {
	    
	      /*case "deleteStudent": {
	        int idDelete = Integer.parseInt(request.getParameter("idStudent"));
	        // al controlador
	        studentController.deleteStudentById(idDelete);
	        url = "students.jsp";
	        request.setAttribute("students", studentController.findAllStundents());
	        break;
	      }
	      */
	      case "formUpdateStudent" : {
	         int id = Integer.parseInt(request.getParameter("id"));
	         // llamar al controlador
	         
	         AdministrativoControlador administrativo = administrativoControlador.findByIdAdministrativo(id);
	         
	         // url
	         url = "updateAdministrativo.jsp";
	         // enviar los atributos en la request
	         request.setAttribute("administrativo", administrativo);
	         break;
	      }
	      
	      /*case "updateStudent" : {
	        // toda la logica para actualizar al estudiante
	        int idStudent = Integer.parseInt(request.getParameter("id"));
	        String name = request.getParameter("name");
	        String lastname = request.getParameter("lastname");
	        String email  = request.getParameter("email");
	        
	        Student updateStudent = new Student(idStudent, name, lastname, email);
	        // llamar al controlador
	        studentController.updateStudent(updateStudent);
	        url = "students.jsp";
	        request.setAttribute("students", studentController.findAllStundents());
	        break;
	      }
	      */
	      default:
	        break;
	        
	    }
	    // fin switch
	    request.getRequestDispatcher(url).forward(request, response);
	    
	  }
	}
	

