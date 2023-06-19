
let tipoUsuario = document.querySelector("#tipoUsuario");
let nombre = document.querySelector("#nombre");
let nombreLabel = document.querySelector("nombrelabel");
let run = document.querySelector("#run");
let runLabel = document.querySelector("#runlabel");
let fechaNacimiento = document.querySelector("#fechanacimiento");
let fechaNacimientoLabel = document.querySelector("#fechanacimientolabel");
let edad = document.querySelector("#edad");
let edadLabel = document.querySelector("#edadlabel");
let expPrevia = document.querySelector("#expprevia");
let expPreviaLabel = document.querySelector("#expprevialabel");
let rut = document.querySelector("#rut");
let rutLabel = document.querySelector("#rutlabel");
let area = document.querySelector("#area");
let areaLabel = document.querySelector("#arealabel");
let apellidos = document.querySelector("#apellidos");
let apellidosLabel = document.querySelector("#apellidoslabel");
let telefono = document.querySelector("#telefono");
let telefonoLabel = document.querySelector("#telefonolabel");
let afp = document.querySelector("#afp");
let afpLabel = document.querySelector("#afplabel");
let direccion = document.querySelector("#direccion");
let direccionLabel = document.querySelector("#direccionlabel");
let titulo = document.querySelector("#titulo");
let tituloLabel = document.querySelector("#titulolabel");
let fechaIngreso = document.querySelector("#fechaingreso");
let fechaIngresoLabel = document.querySelector("#fechaingresolabel");
let comuna = document.querySelector("#comuna");
let comunaLabel = document.querySelector("#comunalabel");

function onChange() {
	let selectedOption = tipoUsuario.options[tipoUsuario.selectedIndex].text;
	console.log(edad);
	console.log(afp);
	switch (selectedOption) {
		case "Administrativo":
			edad.style.display = "none"
			edadLabel.style.display = "none"
			titulo.style.display = "none"
			tituloLabel.style.display = "none"
			fechaIngreso.style.display = "none"
			fechaIngresoLabel.style.display = "none"
			comuna.style.display = "none"
			comunaLabel.style.display = "none"
			direccion.style.display = "none"
			direccionLabel.style.display = "none"
			afp.style.display="none"
			afpLabel.style.display="none"
			telefono.style.display="none"
			telefonoLabel.style.display="none"
			apellidos.style.display="none"
			apellidosLabel.style.display="none"
			rut.style.display="none"
			rutLabel.style.display="none"
		case "Profesional":
			edad.style.display="none"
			edadLabel.style.display="none"		
		case "Cliente":
			
	}
}