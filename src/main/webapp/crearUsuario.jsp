<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	<link rel="stylesheet" href="css/styles.css">
<title>Insert title here</title>
</head>
<body class="fondoCapacitacion">
	<jsp:include page="navbarLogin.jsp" />
	<h1 class="text-center">Crear Usuario</h1>

	    <div class="container centered-form">
        <form class="custom-form">
            <div class="mb-3">
                <label for="capacitacionId" class="form-label">Nombres</label>
                <input type="text" class="form-control" id="Nombres" name="Nombres">
            </div>
            <div class="mb-3">
                <label for="horarioCapacitacion" class="form-label">Rut</label>
                <input type="time" class="form-control" id="Rut" name="Rut">
            </div>
            <div class="mb-3">
                <label for="duracionCapacitacion" class="form-label">Fecha de nacimiento</label>
                <input type="number" class="form-control" id="Fecha" name="Fecha">
            </div>
            <button type="submit" class="btn btn-primary">Crear</button>
        </form>
    </div>





	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>