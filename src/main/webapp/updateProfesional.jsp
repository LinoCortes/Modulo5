<%@page import="modelo.Profesional"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="css/styles.css">
<title>Actualizar Profesional</title>
</head>
<body>
<body class="fondo">
	<!-- Navbar -->
	<jsp:include page="resources/navbarLogin.jsp" />
	<!-- End Navbar -->
	<div class="container mt-5">
		<h1 class="text-center">Profesional</h1>

		<div class="row mt-5">
			<div class="col-4 offset-4">
				<%
				Profesional profesional = (Profesional) request.getAttribute("profesional");
				%>
				<form class="fondo-form" action="ServletUpdateUsuario" method="POST"
					id="form-update-profesional">
					<div class="mb-3">
						<label for="id" class="form-label">ID del usuario</label> <input
							type="number" class="form-control" id="id" name="id"
							value="${profesional.id}" required readonly />
					</div>

					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre</label> 
						<input type="text" class="form-control" id="nombre" name="nombre" value="<%=profesional.getNombre()%>" required />
					</div>

					<div class="mb-3">
						<label for="run" class="form-label">Run</label> 
						<input type="text" class="form-control" id="run" name="run" value="<%=profesional.getRun()%>" required />
					</div>

					<div class="mb-3">
						<label for="fecha_nacimiento" class="form-label">Fecha nacimiento</label> 
						<input type="date" class="form-control" id="fecha_nacimiento" name="fecha_nacimiento" value="<%=profesional.getFechaNacimiento()%>" required />
					</div>
					<div class="mb-3">
						<label for="area" class="form-label">Título</label> 
						<input type="text" class="form-control" id="titulo" name="titulo" value="<%=profesional.getTitulo()%>" required />
					</div>
					<div class="mb-3">
						<label for="exp_previa" class="form-label"> Fecha ingreso</label> 
						<input type="text" class="form-control" id="fecha_ingreso" name="fecha_ingreso"	value="<%=profesional.getFechaIngreso()%>" required />
					</div>

					<input type="hidden" name="option" value="updateProfesional">
					<div class="d-grid gap-2">
						<button type="submit" href="" class="btn btn-success">Actualizar</button>
					</div>

				</form>
			</div>
		</div>
	</div>

</body>
</html>