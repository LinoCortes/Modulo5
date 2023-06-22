<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
    <link rel="stylesheet" href="css/styles.css">
<title>Actualizar Administrativo</title>
</head>
<body>
		<body class="fondo">
  <!-- Navbar -->
   <jsp:include page="navbar.jsp" />
   <!-- End Navbar -->
    <div class="container mt-5">
        <h1 class="text-center">Administrativo </h1>

        <div class="row mt-5">
            <div class="col-4 offset-4">

                <form class="fondo-form" action="ServletCrudUsuario" method="POST" id="form-update-administrativo">
                    <div class="mb-3">
                        <label for="id" class="form-label">ID del usuario</label>
                        <input
                            type="number"
                            class="form-control"
                            id="id"
                            name="id"
                            value="${usuario.id}"
                            required
                            readonly
                        />
                    </div>

                    <div class="mb-3">
                        <label for="nombre" class="form-label">Nombre</label>
                        <input
                            type="text"
                            class="form-control"
                            id="nombre"
                            name="nombre"
                            value="${usuario.nombre}"
                            required
                        />
                    </div>

                    <div class="mb-3">
                        <label for="run" class="form-label">Run</label>
                        <input
                            type="text"
                            class="form-control"
                            id="run"
                            name="run"
                            value="${usuario.run}"
                            required
                        />
                    </div>

                    <div class="mb-3">
                        <label for="fecha_nacimiento" class="form-label">Fecha Nacimiento</label>
                        <input
                            type="text"
                            class="form-control"
                            id="fecha_nacimiento"
                            name="fecha_nacimiento"
                            value="${usuario.fecha_nacimiento}"
                            required
                        />
                    </div>
                     <div class="mb-3">
                        <label for="area" class="form-label">Area</label>
                        <input
                            type="text"
                            class="form-control"
                            id="area"
                            name="area"
                            value="${administrativo.area}"
                            required
                        />
                    </div>
                     <div class="mb-3">
                        <label for="exp_previa" class="form-label">Experiencia Previa</label>
                        <input
                            type="text"
                            class="form-control"
                            id="exp_previa"
                            name="exp_previa"
                            value="${administativo.exp_previa}"
                            required
                        />
                    </div>
					
					<input type="hidden" name="option" value="updateStudent">
                    <div class="d-grid gap-2">
                        <button type="submit" class="btn btn-success">Send</button>
                    </div>

                </form>
            </div>
        </div>
    </div>
		
</body>
</html>