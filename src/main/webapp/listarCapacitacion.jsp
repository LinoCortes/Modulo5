<%@page import="modelo.Capacitacion"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			Capacitaciones</h1>
	</div>

	<div class="container mt-5">
		<div class="card text-white"
			style="border-radius: 1rem; margin-bottom: 110px;">
			<div class="card-body p-5">
				<h2 class="text-center mb-4"></h2>
				<div class="row">
					<div class="col-6 offset-3">
					  <div class= "table-responsive-xl">
						<table class="table">
							<thead>
								<tr>
									<th scope="col">#</th>
									<th scope="col">Identificador</th>
									<th scope="col">Duracion</th>
									<th scope="col">Asistentes</th>
									<th scope="col">Rut</th>
									<th scope="col">Tematica</th>
									<th scope="col">Dia</th>
									<th scope="col">Hora</th>
									<th scope="col">Lugar</th>
								</tr>
							</thead>
							<tbody class="table-group-divider">
								<!-- el ciclo for de java -->
								<% List<Capacitacion> capacitaciones = (List<Capacitacion>)request.getAttribute("capacitaciones");
		                    	System.out.println(capacitaciones);
		                    	if(capacitaciones != null) {
		                    	  for(Capacitacion s: capacitaciones ) {
		                    %>
								<tr>
									<td><%= s.getId() %></td>
									<td><%= s.getIdentificador()%></td>
									<td><%= s.getDuracion()%></td>
									<td><%= s.getCantidadAsistentes()%></td>
									<td><%= s.getTematica()%></td>
									<td><%= s.getRutCliente()%></td>
									<td><%= s.getDia()%></td>
									<td><%= s.getHora()%></td>
									<td><%= s.getLugar()%></td>

									<td>
										<!--  <a class="text-success" href="ServeltCrudStudent?option=formUpdateStudent&idStudent=<%=s.getId()%>"><i class="fa-solid fa-pen-to-square mx-3"></i></a>	 
		                         
		 						 <a class="text-danger" href="ServeltCrudStudent?option=deleteStudent&idStudent=<%=s.getId()%>"><i class="fa-solid fa-trash"></i></a>
		                        -->
									</td>
								</tr>
								<!-- fin del for de java -->

								<%
								}
								}
								%>
							</tbody>
						</table>
					  </div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="resources/footer.jsp" />
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
		integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
		crossorigin="anonymous"></script>
</body>
</html>