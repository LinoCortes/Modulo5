<%@page import="modelo.Administrativo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table id="tablaAdministrativo" class="table table-striped">
	<thead>
		<tr>
			<th scope="col">#</th>
			<th scope="col">Nombre</th>
			<th scope="col">RUN</th>
			<th scope="col">Fecha de nacimiento</th>
			<th scope="col">Área</th>
			<th scope="col">Experiencia previa</th>
		</tr>
	</thead>
	<tbody class="table-group-divider">
		<!-- el ciclo for de java para administrativos -->
		<%
		List<Administrativo> administrativos = (List<Administrativo>) request.getAttribute("administrativos");
		if (administrativos != null) {
			for (Administrativo s : administrativos) {
		%>
		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getNombre()%></td>
			<td><%=s.getRun()%></td>
			<td><%=s.getFechaNacimiento()%></td>
			<td><%=s.getArea()%></td>
			<td><%=s.getExperienciaPrevia()%></td>
			 <td>
               <a class="text-success" href="ServletUpdateAdministrativo?option=formUpdateAdministrativo&id=<%=s.getId()%>"><i class="fa-solid fa-pen-to-square mx-3"></i></a>	 
             </td>
		</tr>
		<%
		}
		}
		%>
		<!-- fin del for de java -->
	</tbody>
</table>