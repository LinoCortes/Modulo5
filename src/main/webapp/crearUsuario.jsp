<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<div>
		<h1 class="text-center text-black col-md-4 mx-auto p-1">Crear
			usuario</h1>
	</div>

	<div class="col-xs-12 col-sm-12 col-md-6 mx-auto">
		<div class="card bg-dark text-white"
			style="border-radius: 1rem; margin-bottom: 110px;">
			<div class="card-body p-5">
				<form class="fondo-form" action="ServletCrearUsuario" method="post">
					<div class="mb-3">
						<label for="name" class="form-label">Tipo de usuario</label> <select
							class="form-select" aria-label="Default select example"
							id="tipoUsuario" onchange="onChange()" name="tipoUsuario">
							<option selected>Tipo de usuario</option>
							<option value="1">Administrativo</option>
							<option value="2">Profesional</option>
							<option value="3">Cliente</option>
						</select>
					</div>
					<div class="mb-3">
						<label class="form-label" id="nombrelabel">Nombre</label> <input
							type="text" class="form-control" id="nombre" name="nombre" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="runlabel">Run</label> <input
							type="text" placeholder="numérico, sin puntos, guión ni dv" class="form-control" id="run" name="run" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="fechanacimientolabel">Fecha
							de nacimiento</label> <input type="date" class="form-control"
							id="fechanacimiento" name="fecha_nacimiento" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="arealabel">Área</label> <input
							type="text" class="form-control" id="area" name="area" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="expprevialabel">Experiencia
							Previa</label> <input type="text" class="form-control" id="expprevia"
							name="exp_previa" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="rutlabel">Rut</label> <input
							type="text" class="form-control" id="rut" name="rut" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="edadlabel">Edad</label> <input
							type="number" placeholder="Numérico" class="form-control" id="edad" name="edad" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="apellidoslabel">Apellidos</label> <input
							type="text" class="form-control" id="apellidos" name="apellidos" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="telefonolabel">Teléfono</label> <input
							type="text" class="form-control" id="telefono" name="telefono" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="afplabel">AFP</label> <input
							type="text" class="form-control" id="afp" name="afp" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="direccionlabel">Dirección</label> <input
							type="text" class="form-control" id="direccion" name="direccion" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="comunalabel">Comuna</label> <input
							type="text" class="form-control" id="comuna" name="comuna" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="titulolabel">Titulo</label> <input
							type="text" class="form-control" id="titulo" name="titulo" required>
					</div>
					<div class="mb-3">
						<label class="form-label" id="fechaingresolabel">Fecha de
							Ingreso</label> <input type="date" class="form-control" id="fechaingreso"
							name="fecha_ingreso" required>
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
	<script src="js/formularioUsuario.js"></script>
</body>
</html>