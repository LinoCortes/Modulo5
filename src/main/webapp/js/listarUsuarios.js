let tipoUsuario = document.querySelector("#tipoUsuario");
let tablaAdministrativo = document.querySelector("#tablaAdministrativo");
let tablaProfesional = document.querySelector("#tablaProfesional");
let tablaCliente = document.querySelector("#tablaCliente");



function onChange() {
	let selectedOption = tipoUsuario.options[tipoUsuario.selectedIndex].text;
	
	switch (selectedOption){
		case "Administrativo":
			tablaAdministrativo.style.display="block"
			tablaCliente.style.display="none"
			tablaProfesional.style.display="none"
			break;
		case "Profesional":
			tablaProfesional.style.display="block"
			tablaCliente.style.display="none"
			tablaAdministrativo.style.display="none"
			break;
		case "Cliente":
			tablaCliente.style.display="block"
			tablaProfesional.style.display="none"
			tablaAdministrativo.style.display="none"
			break;
		default:
			tablaProfesional.style.display="block"
			tablaAdministrativo.style.display="block"
			tablaCliente.style.display="block"
	} 
}