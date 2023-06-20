let tipoUsuario = document.querySelector("#tipoUsuario");
let edad = document.querySelector("#coledad");
let expPrevia = document.querySelector("#colexpprevia");
let rut = document.querySelector("#colrut");
let area = document.querySelector("#colarea");
let apellidos = document.querySelector("#colapellidos");
let telefono = document.querySelector("#coltelefono");
let afp = document.querySelector("#colafp");
let direccion = document.querySelector("#coldireccion");
let titulo = document.querySelector("#coltitulo");
let fechaIngreso = document.querySelector("#colfechaingreso");
let comuna = document.querySelector("#colcomuna");

function onChange(){
	let selectedOption = tipoUsuario.options[tipoUsuario.selectedIndex].text;
	
	switch (selectedOption){
		case "Administrativo":
			area.style.visibility=""
			expPrevia.style.visibility=""
			edad.style.visibility = "collapse"
			titulo.style.visibility = "collapse"
			fechaIngreso.style.visibility ="collapse"
			comuna.style.visibility = "collapse"
			direccion.style.visibility = "collapse"
			afp.style.visibility= "collapse"
			telefono.style.visibility= "collapse"
			apellidos.style.visibility= "collapse"
			rut.style.visibility="collapse"
			break;
		case "Profesional":
			titulo.style.display="block"
			fechaIngreso.style.display="block"
			area.style.display="none"	
			expPrevia.style.display="none"
			edad.style.display = "none"
			comuna.style.display = "none"
			direccion.style.display = "none"
			afp.style.display="none"
			rut.style.display="none"
			apellidos.style.display="none"
			break;
		case "Cliente":
			fechaIngreso.style.display="block"
            edad.style.display = "block"
            comuna.style.display = "block"
            direccion.style.display = "block"
            afp.style.display="block"
            rut.style.display="block"
            apellidos.style.display="block"
            area.style.display = "none"
            expPrevia.style.display = "none"
            titulo.style.display = "none"
            fechaIngreso.style.display = "none"	
			break;
	}
}