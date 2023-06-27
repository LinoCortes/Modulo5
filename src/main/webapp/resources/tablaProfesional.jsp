<%@page import="modelo.Profesional"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class = "table-responsive-xl">	  
  <table id="tablaProfesional" class="table table-striped">
	<thead>
		<tr>
			<th scope="col">#</th>
			<th scope="col">Nombre</th>
			<th scope="col">RUN</th>
			<th scope="col">Fecha de nacimiento</th>
			<th scope="col">Título</th>
			<th scope="col">Fecha de ingreso</th>
		</tr>
	</thead>
	<tbody class="table-group-divider">
		<!-- el ciclo for de java para administrativos -->
		<%
		List<Profesional> profesionales = (List<Profesional>) request.getAttribute("profesionales");
		if (profesionales != null) {
			for (Profesional s : profesionales) {
		%>
		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getNombre()%></td>
			<td><%=s.getRun()%></td>
			<td><%=s.getFechaNacimiento()%></td>
			<td><%=s.getTitulo()%></td>
			<td><%=s.getFechaIngreso()%></td>
			 <td>
               <a class="text-success" href="ServletUpdateUsuario?option=formUpdateProfesional&id=<%=s.getId()%>"><i class="fa-solid fa-pen-to-square mx-3"></i></a>	 
             </td>
		</tr>
		<%
		}
		}
		%>
		<!-- fin del for de java -->
	</tbody>
  </table>
</div>  