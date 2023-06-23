<%@page import="modelo.Usuario"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
	integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
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
		<h1 class="text-center text-black col-md-4 mx-auto p-1">Listar
			usuarios</h1>
	</div>
	<div class="container mt-5">
		<div class="card text-white"
			style="border-radius: 1rem; margin-bottom: 110px;">
			<div class="card-body p-5">
				<h2 class="text-center"></h2>
				<div class="row">
					<div class="col-6 offset-3">
						<select class="form-select" aria-label="Default select example"
							id="tipoUsuario" name="tipoUsuario" onchange="onChange()">
							<option selected>Tipo de usuario</option>
							<option value="1">Administrativo</option>
							<option value="2">Profesional</option>
							<option value="3">Cliente</option>
						</select>
					</div>
					<div class="col-6 offset-3">
						<jsp:include page="resources/tablaAdministrativo.jsp" />
						<jsp:include page="resources/tablaProfesional.jsp" />
						<jsp:include page="resources/tablaCliente.jsp" />
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="resources/footer.jsp" />
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
	<script src="js/listarUsuarios.js"></script>
</body>
</html>