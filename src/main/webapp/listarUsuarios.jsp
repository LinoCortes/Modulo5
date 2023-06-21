<%@page import="modelo.Cliente"%>
<%@page import="modelo.Profesional"%>
<%@page import="modelo.Administrativo"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="css/styles.css">
<title>Listar Usuarios</title>
</head>
<body class="fondoCapacitacion">
	<jsp:include page="navbarLogin.jsp" />
	<h1 class="text-center">Listar Usuarios</h1>
	<div class="container mt-5">
		<h2 class="text-center mb-4"></h2>
		<div class="row">
			<select class="form-select" aria-label="Default select example"
				id="tipoUsuario" name="tipoUsuario" onchange="onChange()">
				<option selected value="0">Tipo de usuario</option>
				<option value="1">Administrativo</option>
				<option value="2">Profesional</option>
				<option value="3">Cliente</option>
			</select>
			<table id="tabla" class="table">
				<thead>
					<tr>

						<th id="colid" scope="col">#</th>
						<th id="colnombre" scope="col">Nombre</th>
						<th id="colrun" scope="col">Run</th>
						<th id="colfechanacimiento" scope="col">Fecha de nacimiento</th>
						<th id="colapellidos" scope="col">Apellidos</th>
						<th id="coltelefono" scope="col">Telefono</th>
						<th id="colrut" scope="col">Rut</th>
						<th id="colrut" scope="col">Edad</th>
						<th id="colafp" scope="col">Afp</th>
						<th id="coldireccion" scope="col">Direccion</th>
						<th id="colcomuna" scope="col">Comuna</th>
						<th id="coltitulo" scope="col">Título</th>
						<th id="colfechaingreso" scope="col">Fecha Ingreso</th>
						<th id="colarea" scope="col">Area</th>
						<th id="colexpprevia" scope="col">Experiencia Previa</th>
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
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td><%=s.getArea()%></td>
						<td><%=s.getExperienciaPrevia()%></td>

					</tr>
					<!-- fin del for de java -->

					<%
					}
					}
					%>
					<!-- el ciclo for de java para profesionales -->
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
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td><%=s.getTitulo()%></td>
						<td><%=s.getFechaIngreso()%></td>
						<td></td>
						<td></td>

					</tr>
					<!-- fin del for de java -->

					<%
					}
					}
					%>
					<!-- el ciclo for de java para profesionales -->
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
						<td><%=s.getApellidos() %></td>
						<td><%=s.getTelefono() %></td>
						<td><%=s.getRut() %></td>
						<td><%=s.getEdad() %></td>
						<td><%=s.getAfp() %></td>
						<td><%=s.getDireccion() %></td>
						<td><%=s.getComuna() %></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<!-- fin del for de java -->

					<%
					}
					}
					%>
				</tbody>
			</table>
		</div>
	</div>
	</div>




	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
	<script src="js/listarUsuarios.js"></script>
</body>
</html>
