<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Page-Risks-Prevention</title>
<meta name="author" content="Grupo 7">


<!--Google fonts-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin="">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;500&amp;display=swap"
	rel="stylesheet">

<!-- Bootstrap 5.1.3 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<!--iconos-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"
	integrity="sha384-DyZ88mC6Up2uqS4h/KRgHuoeGwBcD4Ng9SiP4dIRy0EXTlnuz47vAwmeGwVChigm"
	crossorigin="anonymous">

<!--Mi estilo-->
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body class="hero-section-login">
	<jsp:include page="resources/navbarLogin.jsp" />
	<h1 class="text-center">Crear Capacitación</h1>

	<div class="container centered-form">
		<div class="card bg-dark text-white col-md-7 mx-auto"
			style="border-radius: 1rem; margin-bottom: 110px;">
			<div class="card-body p-5">
				<form id="login-form" action="ServletCrearCapacitacion"
					method="post">
					<div class="mb-3">
						<label for="capacitacionId" class="form-label">Identificador</label>
						<input id="identificador" placeholder="Numérico"
							class="form-control" name="identificador">
					</div>
					<div class="mb-3">
						<label for="duracion" class="form-label">Duracion de la
							capacitación</label> <input class="form-control" placeholder="Numérico"
							id="duracion" name="duracion" type="number">
					</div>
					<div class="mb-3">
						<label for="cantidadAsistentes" class="form-label">Cantidad
							asistentes</label> <input type="number" placeholder="Numérico"
							class="form-control" id="cantidadAsistentes"
							name="cantidadAsistentes">
					</div>
					<div class="mb-3">
						<label for="rut_cliente" class="form-label">Rut Cliente</label> <input
							type="text"
							placeholder="Numérico sin puntos, guión ni dv, <99999999"
							class="form-control" id="rutCliente" name="rutCliente">
					</div>
					<div class="mb-3">
						<label for="tematica" class="form-label">Tematica</label> <input
							type="text" class="form-control" id="tematica" name="tematica">
					</div>
					<div class="mb-3">
						<label for="lugar" class="form-label">Lugar</label> <input
							type="text" class="form-control" id="lugar" name="lugar">
					</div>
					<div class="mb-3">
						<label for="Dia" class="form-label">Dia</label> <input type="date"
							class="form-control" id="dia" name="dia">
					</div>
					<div class="mb-3">
						<label for="hora" class="form-label">Horario</label> <input
							type="time" placeholder="HH:MM" class="form-control" id="hora"
							name="hora">
					</div>
					<div class="d-grid gap-2 pt-4">
						<button type="submit" class="btn btn-primary">Crear</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="resources/footer.jsp" />
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
	<script src="js/validacionesCapacitacion.js"></script>
</body>
</html>