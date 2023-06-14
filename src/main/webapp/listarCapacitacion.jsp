<%@page import="modelo.Capacitacion"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="css/styles.css">
<title>Listar Capacitación</title>
</head>
<body class="fondoCapacitacion">
	<jsp:include page="navbarLogin.jsp" />
	<h1 class="text-center">Listar Capacitaciones</h1>

	<div class="container mt-5">
        <h2 class="text-center mb-4">Lista de Capacitaciones</h2>
        <div class="row">
            <div class="col-6 offset-3">
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
                      
                    <% } 
                    }
                     %>
                    </tbody>
                  </table>
            </div>
        </div>
    </div>
	
	<script	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
</body>
</html>