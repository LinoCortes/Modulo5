<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/stylesform.css">
<title>Creador Capacitaciones</title>
</head>
<body class="fondoCapacitacion">
	<jsp:include page="navbarLogin.jsp" />
	<h1 class="text-center">Crear Capacitación</h1>

	<div class="container centered-form">
		<form id="login-form" action="ServletCrearCapacitacion" method="post">
			<div class="mb-3">
				<label for="capacitacionId" class="form-label">Identificador</label>
				<input id="identificador" placeholder="Numérico" class="form-control" name="identificador">
				<small id="identificadorHelp" class="form-text text-danger"></small>
			</div>
			<div class="mb-3">
				<label for="duracion" class="form-label">Duracion de la capacitación</label> 
				<input type="text" placeholder="Numérico" id="duracion" name="duracion">
				<small id="duracionHelp" class="form-text text-danger"></small>
			</div>
			<div class="mb-3">
				<label for="cantidadAsistentes" class="form-label">Cantidad Asistentes de la Capacitación</label> 
				<input type="text" placeholder="Numérico" class="form-control" id="cantidadAsistentes" name="cantidadAsistentes"> 
				<small id="cantidadAsistenteHelp" class="form-text text-danger"></small>
			</div>
			<div class="mb-3">
				<label for="rut_cliente" class="form-label">Rut Cliente</label> 
				<input type="text" placeholder="Numérico sin puntos, guión ni dv, <99999999" class="form-control" id="rutCliente" name="rutCliente">
				<small id="rutClienteHelp" class="form-text text-danger"></small> 
			</div>
			<div class="mb-3">
				<label for="tematica" class="form-label">Tematica de la	capacitación </label> 
				<input type="text" class="form-control" id="tematica" name="tematica"> 
				<small id="tematicaHelp" class="form-text text-danger"></small>
			</div>
			<div class="mb-3">
				<label for="lugar" class="form-label">Lugar de la capacitación</label> 
				<input type="text" class="form-control" id="lugar" name="lugar"> 
				<small id="lugarHelp" class="form-text text-danger"></small>
			</div>
			<div class="mb-3">
				<label for="Dia" class="form-label">Dia de la Capacitación</label>
				<input type="date" placeholder="Lunes, Martes..." class="form-control" id="dia" name="dia"> 
				<small id="diaHelp" class="form-text text-danger"></small> 
			</div>
			<div class="mb-3">
				<label for="hora" class="form-label">Horario de la capacitación</label> 
				<input type="time" placeholder="HH:MM" class="form-control" id="hora" name="hora"> 
				<small id="horaHelp" class="form-text text-danger"></small> 
			</div>
			<button type="submit" class="btn btn-primary">Crear</button>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
	<script src="js/javascript.js"></script>
</body>
</html>