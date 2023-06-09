<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
	<link rel="stylesheet" href="css/styles.css">
<title>Listar Usuarios</title>
</head>
<body class="fondoCapacitacion">
	<jsp:include page="navbar.jsp" />
	<h1 class="text-center">Listar Usuarios</h1>


	   <div class="container">
        <h2>Llena los siguientes campos para listar a los usuarios.</h2>
        <form id="capacitacionForm">
            <div class="mb-3">
                <label for="capacitacionId" class="form-label">Rut</label>
                <input type="text" class="form-control" id="rut" name="rut">
            </div>
            <div class="mb-3">
                <label for="fechaCapacitacion" class="form-label">nombre</label>
                <input type="date" class="form-control" id="nombre" name="nombre">
            </div>
            <div class="mb-3">
                <button type="button" class="btn btn-primary" onclick="listarCapacitaciones()">Listar usuarios</button>
            </div>
        </form>
        <div id="listaCapacitaciones"></div>
    </div>




<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>