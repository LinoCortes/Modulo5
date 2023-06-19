<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/styles.css">
<title>Insert title here</title>
</head>
<body class="fondoCapacitacion">
	<jsp:include page="navbarLogin.jsp" />
	<h1 class="text-center">Crear Usuario</h1>

	<div class="container centered-form">
		<form class="custom-form">
			<select class="form-select" aria-label="Default select example" id="tipoUsuario" onchange="onChange()">
				<option selected>Tipo de usuario</option>
				<option value="1">Administrativo</option>
				<option value="2">Profesional</option>
				<option value="3">Cliente</option>
			</select>
			<div class="mb-3">
				<label class="form-label" id="nombrelabel">Nombre</label> 
				<input type="text" class="form-control" id="nombre" name="Nombre">
			</div>
			<div class="mb-3">
				<label class="form-label" id="runlabel">Run</label> 
				<input type="text" class="form-control" id="run" name="run">
			</div>
			<div class="mb-3">
				<label class="form-label" id="fechanacimientolabel">Fecha de nacimiento</label> 
				<input type="number" class="form-control" id="fechanacimiento" name="Fecha">
			</div>
			<div class="mb-3">
				<label class="form-label" id="arealabel">Área</label> <input
					type="text" class="form-control" id="area" name="area">
			</div>
			<div class="mb-3">
				<label class="form-label" id="expprevialabel">Experiencia Previa</label> 
				<input type="text" class="form-control" id="expprevia" name="expPrevia">
			</div>
			<div class="mb-3">
				<label class="form-label" id="rutlabel">Rut</label> 
				<input type="text" class="form-control" id="rut" name="rut">
			</div>
			<div class="mb-3">
				<label class="form-label" id="edadlabel">Edad</label> 
				<input type="text" class="form-control" id="edad" name="edad">
			</div>
			<div class="mb-3">
				<label class="form-label" id="apellidoslabel">Apellidos</label> 
				<input type="text" class="form-control" id="apellidos" name="apellidos">
			</div>
			<div class="mb-3">
				<label class="form-label" id="telefonolabel">Teléfono</label> 
				<input type="text" class="form-control" id="telefono" name="telefono">
			</div>
			<div class="mb-3">
				<label class="form-label" id="afplabel">AFP</label> 
				<input type="text" class="form-control" id="afp" name="afp">
			</div>
			<div class="mb-3">
				<label class="form-label" id="direccionlabel">Dirección</label> 
				<input type="text" class="form-control" id="direccion" name="direccion">
			</div>
			<div class="mb-3">
				<label class="form-label" id="comunalabel">Comuna</label> 
				<input type="text" class="form-control" id="comuna" name="comuna">
			</div>
			<div class="mb-3">
				<label class="form-label" id="titulolabel">Titulo</label> 
				<input type="text" class="form-control" id="titulo" name="titulo">
			</div>
			<div class="mb-3">
				<label class="form-label" id="fechaingresolabel">Fecha de Ingreso</label> 
				<input type="text" class="form-control" id="fechaingreso" name="FechaIngreso">
			</div>
			<button type="submit" class="btn btn-primary">Crear</button>
		</form>
	</div>





	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>		
	<script src="js/formularioUsuario.js"></script>
</body>
</html>