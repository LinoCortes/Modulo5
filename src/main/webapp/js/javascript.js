document.addEventListener('DOMContentLoaded', function() {
 //* formulario
let form = document.querySelector("#login-form");

let identificador = document.querySelector("#identificador");
let duracion = document.querySelector("#duracion");
let cantidadAsistente = document.querySelector("#cantidadAsistente");
let rutCliente = document.querySelector("#rutCliente");
let tematica = document.querySelector("#tematica");
let lugar = document.querySelector("#lugar");
let dia = document.querySelector("#dia");
let hora = document.querySelector("#hora");

  function validate() {
  
  let identificadorValue = identificador.value;
  let duracionValue = duracion.value;
  let cantidadAsistenteValue = cantidadAsistente.value;
  let rutClienteValue = rutCliente.value;
  let tematicaValue = tematica.value;
  let lugarValue = lugar.value;
  let diaValue = dia.value;
  let horaValue = hora.value;
  
  let soloNumero = /^\d+$/;
  
  if(!soloNumero.test(identificadorValue)) {
    document.querySelector("#identificadorHelp").innerHTML = "Por favor, ingresa un ID, numérico";
    return false;
  } 
  
  /*if(!Number.isInteger(duracionValue) || duracionValue < 0) {
    document.querySelector("#duracionHelp").innerHTML = "Por favor, ingresa la duración en minutos, numérico";
    return false;
  }
  
  if(!Number.isInteger(cantidadAsistenteValue) || cantidadAsistenteValue < 0) {
    document.querySelector("#cantidadAsistenteHelp").innerHTML = "Por favor, ingresa la cantidad de asistentes, numérico";
    return false;
  } 
  
  if(!Number.isInteger(rutClienteValue) || rutClienteValue < 99999999 ) {
    document.querySelector("#rutClienteHelp").innerHTML = "Por favor, ingresa un rut válido, numérico";
    return false;
  } 
    
  if(tematicaValue == null) {
    document.querySelector("#tematicaHelp").innerHTML = "Por favor, ingresa la tematica a tratar en la capacitación";
    return false;
  } 
  
  if(lugarValue == null ) {
    document.querySelector("#lugarHelp").innerHTML = "Por favor, ingresa un lugar de la capacitación";
    return false;
  } 
  
  if(!diaValue instanceof String) {
    document.querySelector("#diaHelp").innerHTML = "Por favor, escriba el día de la capacitación";
    return false;
  } 
  
  if(!horaValue instanceof String) {
    document.querySelector("#horaHelp").innerHTML = "Por favor, escriba la hora de la capacitación";
    return false;
  }*/
  
  //* Si todo esta bien pasaron todas las validaciones, retornamos TRUE
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