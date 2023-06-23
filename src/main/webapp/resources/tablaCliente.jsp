<%@page import="modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table id="tablaCliente" class="table table-striped">
	<thead>
		<tr>
			<th scope="col">#</th>
			<th scope="col">Nombre</th>
			<th scope="col">RUN</th>
			<th scope="col">Fecha de nacimiento</th>
			<th scope="col">RUT</th>
			<th scope="col">Edad</th>
			<th scope="col">Apellido</th>
			<th scope="col">Teléfono</th>
			<th scope="col">AFP</th>
			<th scope="col">Dirección</th>
			<th scope="col">Comuna</th>
		</tr>
	</thead>
	<tbody class="table-group-divider">
		<!-- el ciclo for de java para administrativos -->
		<%
		List<Cliente> clientes = (List<Cliente>) request.getAttribute("clientes");
		if (clientes != null) {
			for (Cliente s : clientes) {
		%>
		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getNombre()%></td>
			<td><%=s.getRun()%></td>
			<td><%=s.getFechaNacimiento()%></td>
			<td><%=s.getRut()%></td>
			<td><%=s.getEdad()%></td>
			<td><%=s.getApellidos()%></td>
			<td><%=s.getTelefono()%></td>
			<td><%=s.getAfp()%></td>
			<td><%=s.getDireccion()%></td>
			<td><%=s.getComuna()%></td>
			 <td>
               <a class="text-success" href="ServletUpdateUsuario?option=formUpdateCliente&id=<%=s.getId()%>"><i class="fa-solid fa-pen-to-square mx-3"></i></a>	 
             </td>
		</tr>
		<%
		}
		}
		%>
		<!-- fin del for de java -->
	</tbody>
</table>