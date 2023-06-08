<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
	<link rel="stylesheet" href="css/stylesform.css">
<title>Contacto</title>
</head>
<body>
  <h1>Formulario de Contacto</h1>
  <div class="container">
    <form action="#" method="post">
      <div class="form-group">
        <label for="name">Nombre:</label>
        <input type="text" id="name" name="name" required>
      </div>
      <div class="form-group">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
      </div>
      <div class="form-group">
        <label for="message">Mensaje:</label>
        <textarea id="message" name="message" rows="4" required></textarea>
      </div>
      <input type="submit" value="Enviar">
    </form>
  </div>
</body>