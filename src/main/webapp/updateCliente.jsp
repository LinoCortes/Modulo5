<%@page import="modelo.Cliente"%>
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
				Cliente cliente = (Cliente)request.getAttribute("cliente");
				%>
				<form class="fondo-form" action="ServletUpdateUsuario" method="POST"
					id="form-update-cliente">
					<div class="mb-3">
						<label for="id" class="form-label">ID del usuario</label> <input
							type="number" class="form-control" id="id" name="id"
							value="${cliente.id}" required readonly />
					</div>

					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre</label> 
						<input type="text" class="form-control" id="nombre" name="nombre" value="<%=cliente.getNombre()%>" required />
					</div>

					<div class="mb-3">
						<label for="run" class="form-label">Run</label> 
						<input type="text" class="form-control" id="run" name="run" value="<%=cliente.getRun()%>" required />
					</div>

					<div class="mb-3">
						<label for="fecha_nacimiento" class="form-label">Fecha nacimiento</label> <input type="date" class="form-control" id="fecha_nacimiento"
							name="fecha_nacimiento" value="<%=cliente.getFechaNacimiento()%>"
							required />
					</div>
					<div class="mb-3">
						<label for="rut" class="form-label">RUT</label> 
						<input type="text" class="form-control" id="rut" name="rut" value="<%=cliente.getRut()%>" required />
					</div>
					<div class="mb-3">
						<label for="edad" class="form-label"> Edad</label> 
						<input type="number" class="form-control" id="edad" name="edad"	value="<%=cliente.getEdad()%>" required />
					</div>
					<div class="mb-3">
						<label for="apellido" class="form-label"> Apellido</label> 
						<input type="text" class="form-control" id="apellido" name="apellidos"	value="<%=cliente.getApellidos()%>" required />
					</div>
					<div class="mb-3">
						<label for="telefono" class="form-label"> Teléfono</label> 
						<input type="text" class="form-control" id="telefono" name="telefono"	value="<%=cliente.getTelefono()%>" required />
					</div>
					<div class="mb-3">
						<label for="afp" class="form-label">AFP</label> 
						<input type="text" class="form-control" id="afp" name="afp"	value="<%=cliente.getAfp()%>" required />
					</div>
					<div class="mb-3">
						<label for="direccion" class="form-label"> Direccion</label> 
						<input type="text" class="form-control" id="direccion" name="direccion"	value="<%=cliente.getDireccion()%>" required />
					</div>
					<div class="mb-3">
						<label for="comuna" class="form-label"> Comuna</label> 
						<input type="text" class="form-control" id="comuna" name="comuna" value="<%=cliente.getComuna()%>" required />
					</div>

					<input type="hidden" name="option" value="updateCliente">
					<div class="d-grid gap-2">
						<button type="submit" href="" class="btn btn-success">Actualizar</button>
					</div>

				</form>
			</div>
		</div>
	</div>

</body>
</html>