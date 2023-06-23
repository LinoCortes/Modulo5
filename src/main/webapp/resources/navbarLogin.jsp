<%@ page session="true" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav
	class="navbar navbar-expand-lg bg-dark border-bottom border-bottom-dark"
	data-bs-theme="dark">
	<div class="container-fluid">
		<a class="navbar-brand">Asesorias de riesgo</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto px-4">
                 <li class="nav-item px-3">
                     <a class="nav-link active" href="index.jsp">Inicio</a>
                 </li>
                 <li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" role="button"
					data-bs-toggle="dropdown" aria-expanded="false"> Usuario </a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="crearUsuario.jsp">Crear
								usuario</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="ServletListarUsuarios">Listar
								usuario</a></li>
						<li><a class="dropdown-item" href="contacto.jsp">Contacto</a></li>
				    </ul>
				 </li>
				 <li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" role="button"
					data-bs-toggle="dropdown" aria-expanded="false"> Capacitación </a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="ServletListarCapacitacion">Listar
								capacitación</a></li>
						<li><a class="dropdown-item" href="crearCapacitacion.jsp">Crear
								capacitación</a></li>
				    </ul>
				 </li>
             </ul>
			<c:if test="${not empty sessionScope.usuario}">
				<div class="d-flex justify-content-between align-items-center">
					<p class="text-white-50 mx-3 my-2">
						Bienvenido <span class="fw-bold text-capitalize">${sessionScope.usuario}</span>
					</p>

					<form class="form-inline" action="ServletLogout" method="post">
						<button class="btn btn-outline-danger my-2 my-sm-0" type="submit">Cerrar
							sesión</button>
					</form>
				</div>

			</c:if>
		</div>
	</div>
</nav>