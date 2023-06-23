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
<body>
	<jsp:include page="resources/navbar.jsp" />
	<header id="inicio" class="hero-section">
		<h1>Asesorías de riesgo, charlas y capacitaciones ¡¡¡</h1>
		<h2 class="text-dark">Cuenta con nosotros y gestionamos y
			minimizamos los riesgos en tu negocio.</h2>
	</header>

	<section>
		<div class="container-fluid py-5 d-none d-sm-block">
			<h1 class="text-center cambioColor">¿Que hacemos?</h1>
			<hr class="hero-line mx-auto bg-info">
			<div class="row container-fluid mx-auto">
				<div class="col-xs-12 col-sm-12 col-md-4 col-12 py-3"
					data-bs-toggle="modal" data-bs-target="#exampleModal">
					<div class="iconos bg-dark">
						<i class="fas fa-mountain fa-2x" data-bs-toggle="tooltip"
							data-bs-placement="bottom" title=""
							data-bs-original-title="Lorem ipsum odit"
							aria-label="Lorem ipsum odit"></i>
					</div>
					<p class="text-dark">Nuestros servicios de asesoría de riesgo
						abarcan todas las etapas del proceso de gestión de riesgos. Desde
						la identificación y el análisis inicial de los riesgos potenciales
						hasta la implementación de estrategias de mitigación efectivas,
						estamos aquí para guiarte en cada paso del camino. Utilizamos
						enfoques y metodologías probadas, combinados con las últimas
						herramientas tecnológicas, para ofrecerte una evaluación precisa y
						una visión clara de los riesgos que enfrentas.</p>
				</div>

				<div class="col-xs-12 col-sm-12 col-md-4 col-12 py-3"
					data-bs-toggle="modal" data-bs-target="#exampleModal">
					<p class="text-dark">Nuestro enfoque se basa en la colaboración
						y la transparencia. Creemos en establecer una relación cercana con
						nuestros clientes, trabajando de la mano contigo para comprender
						tus objetivos, desafíos y prioridades. Esto nos permite brindarte
						soluciones personalizadas que se alineen con tu visión empresarial
						y te ayuden a tomar decisiones informadas y estratégicas.</p>
					<div class="iconos bg-dark">
						<i class="fas fa-mountain fa-2x" data-bs-toggle="tooltip"
							data-bs-placement="bottom" title=""
							data-bs-original-title="Lorem ipsum odit"
							aria-label="Lorem ipsum odit"></i>
					</div>
				</div>

				<div class="col-xs-12 col-sm-12 col-md-4 col-12 py-3"
					data-bs-toggle="modal" data-bs-target="#exampleModal">
					<div class="iconos bg-dark">
						<i class="fas fa-mountain fa-2x" data-bs-toggle="tooltip"
							data-bs-placement="bottom" title=""
							data-bs-original-title="Lorem ipsum odit"
							aria-label="Lorem ipsum odit"></i>
					</div>
					<p class="text-dark text-center">Te invitamos a explorar
						nuestra página web y descubrir cómo nuestros servicios de asesoría
						de riesgo pueden ayudarte a proteger tu negocio y alcanzar un
						crecimiento sostenible. No dudes en contactarnos para obtener más
						información o programar una consulta. Estamos aquí para ayudarte a
						navegar por el complejo mundo de los riesgos empresariales y
						garantizar el éxito a largo plazo de tu organización.</p>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="resources/footer.jsp" />
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>

</html>