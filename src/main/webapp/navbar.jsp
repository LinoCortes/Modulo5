<%@ page session="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg bg-dark border-bottom border-bottom-dark" data-bs-theme="dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="home.jsp">Trabajo Grupal Modulo 5</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Login</a>
        </li>
        
        
      </ul>
      
     <c:if test="${not empty sessionScope.usuario}">
     	<div class="d-flex justify-content-between align-items-center">
    	<p class="text-white-50 mx-3 my-2"> Bienvenido <span class="fw-bold text-capitalize">${sessionScope.usuario}</span></p>

	    <form class="form-inline" action="ServletLogout" method="post">    
	    	<button class="btn btn-outline-danger my-2 my-sm-0" type="submit">Cerrar sesión</button>
	    </form>
		</div>
     
     </c:if>
    </div>
  </div>
</nav>