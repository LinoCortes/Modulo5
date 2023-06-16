<%@page import="modelo.Usuario"%>
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
			<div class="col-6 offset-3">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Nombre</th>
							<th scope="col">Run</th>
							<th scope="col">Fecha de nacimiento</th>
						</tr>
					</thead>
					<tbody class="table-group-divider">
						<!-- el ciclo for de java -->
						<% List<Usuario> usuarios = (List<Usuario>)request.getAttribute("usuarios");
                    	System.out.println("Prueba");
						System.out.println(usuarios);
                    	if(usuarios != null) {
                    	  for(Usuario s: usuarios ) {
                    %>
						<tr>
							<td><%= s.getNombre() %></td>
							<td><%= s.getRun() %></td>
							<td><%= s.getFechaNacimiento() %></td>
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
</body>
</html>