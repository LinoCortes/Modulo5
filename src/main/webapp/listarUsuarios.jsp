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
				<option selected>Tipo de usuario</option>
				<option value="1">Administrativo</option>
				<option value="2">Profesional</option>
				<option value="3">Cliente</option>
			</select>
			<jsp:include page="tablaAdministrativo.jsp" />
			<jsp:include page="tablaProfesional.jsp" />
			<jsp:include page="tablaCliente.jsp" />
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
