<%@ page language="java" contentType="text/html; charset=UTF-8"
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
	<div>
		<h1 class="text-center text-black col-md-4 mx-auto mt-5 p-4">Contacto</h1>
	</div>
	<div class="row container-fluid mx-auto">
		<div class="col-xs-12 col-sm-12 col-md-4 mx-auto">
			<div class="card bg-dark text-white" style="border-radius: 1rem;">
				<div class="card-body p-5">
					<form class="fondo-form" action="ServletContacto" method="post">
						<div class="mb-3">
							<label for="name" class="form-label">Nombre</label> <input
								type="text" class="form-control" id="name" name="name" required />
						</div>

						<div class="mb-3">
							<label for="email" class="form-label">Email</label> <input
								type="email" class="form-control" id="email" name="email"
								required />

						</div>
						<div class="mb-3">
							<label for="email" class="form-label">Mensaje</label>
							<textarea class="form-control" id="message" name="message"
								rows="4" required></textarea>

						</div>
						<div class="d-grid gap-2 pb-4 pt-4">
							<button type="submit" class="btn btn-primary">Enviar</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="resources/footer.jsp" />

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>