document.addEventListener('DOMContentLoaded', function() {
 //* formulario
let form = document.querySelector("#login-form");

let identificador = document.querySelector("#identificador");
let duracion = document.querySelector("#duracion");
let cantidadAsistentes = document.querySelector("#cantidadAsistentes");
let rutCliente = document.querySelector("#rutCliente");
let tematica = document.querySelector("#tematica");
let lugar = document.querySelector("#lugar");
let dia = document.querySelector("#dia");
let hora = document.querySelector("#hora");

  function validate() {
  
  
  var identificador = document.getElementById("identificador").value;
  var duracion = document.getElementById("duracion").value;
  var cantidadAsistentes = document.getElementById("cantidadAsistentes").value;
  var rutCliente = document.getElementById("rutCliente").value;
  var tematica = document.getElementById("tematica").value;
  var dia = document.getElementById("dia").value;
  var hora = document.getElementById("hora").value;
  var lugar = document.getElementById("lugar").value;
  
  
  var numericRegex = /^[0-9]+$/;

  if (!numericRegex.test(identificador) || !numericRegex.test(duracion) || !numericRegex.test(cantidadAsistentes) || !numericRegex.test(rutCliente)) {
    alert("Identificador, Duracion, cantidad de asistentes y rut cliente deben ser del tipo numérico");
    return false;
  }

  var rutCliente = parseInt(rutCliente, 10);
  if (rutCliente >= 99999999) {
    alert("El campo rut debe ser menor a 99,999,999");
    return false;
  }

 if (identificador === "" || duracion === "" || cantidadAsistentes === "" ||  rutCliente === "" || 
 tematica === "" || 
 dia === "" || 
 hora === "" || 
 lugar === "") {
    alert("Todos los campos deben ser completados");
    return false;
  }
  	return true;
  }

   form.addEventListener("submit", function(event) {	
	  if(!validate()) {
	    event.preventDefault();
	  } else {
	    alert("El formulario se envio correctamente");
	  }
	});

});