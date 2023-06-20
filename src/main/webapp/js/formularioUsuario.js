
let tipoUsuario = document.querySelector("#tipoUsuario");
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
	switch (selectedOption) {
		case "Administrativo":
			edad.style.display = "none"
			edadLabel.style.display = "none"
			titulo.style.display = "none"
			tituloLabel.style.display = "none"
			fechaIngreso.style.display = "none"
			fechaIngresoLabel.style.display = "none"
			area.style.display="block"
			areaLabel.style.display="block"
			expPrevia.style.display="block"
			expPreviaLabel.style.display="block"
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
			break;
		case "Profesional":
			titulo.style.display="block"
			tituloLabel.style.display="block"
			fechaIngreso.style.display="block"
			fechaIngresoLabel.style.display="block"
			area.style.display="none"
			areaLabel.style.display="none"	
			expPrevia.style.display="none"
			expPreviaLabel.style.display="none"
			edad.style.display = "none"
			edadLabel.style.display = "none"
			comuna.style.display = "none"
			comunaLabel.style.display = "none"
			direccion.style.display = "none"
			direccionLabel.style.display = "none"
			afp.style.display="none"
			afpLabel.style.display="none"
			rut.style.display="none"
			rutLabel.style.display="none"
			apellidos.style.display="none"
			apellidosLabel.style.display="none"
			break;
		case "Cliente":
            fechaIngreso.style.display="block"
            fechaIngresoLabel.style.display="block"
            edad.style.display = "block"
            edadLabel.style.display = "block"
            comuna.style.display = "block"
            comunaLabel.style.display = "block"
            direccion.style.display = "block"
            direccionLabel.style.display = "block"
            afp.style.display="block"
            afpLabel.style.display="block"
            rut.style.display="block"
            rutLabel.style.display="block"
            apellidos.style.display="block"
            apellidosLabel.style.display="block"
            area.style.display = "none"
            areaLabel.style.display = "none"
            expPrevia.style.display = "none"
            expPreviaLabel.style.display = "none"
            titulo.style.display = "none"
            tituloLabel.style.display = "none"
            fechaIngreso.style.display = "none"
            fechaIngresoLabel.style.display = "none"		
	}
}