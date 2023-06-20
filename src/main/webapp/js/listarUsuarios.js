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
let tabla = document.getElementById("tabla");
tabla.rows[i].cells[j].style.display = "none";
	

function onChange() {
	let selectedOption = tipoUsuario.options[tipoUsuario.selectedIndex].text;
	tabla.rows[i].cells[j].style.display = "none";
	for (var i = 0; i < tabla.rows.length; i++) {
		for (var j = 0; j < tabla.rows[i].cells.length; j++) {
			tabla.rows[i].cells[j].style.display = "none";
		}
	}
	switch (selectedOption) {
		case "Administrativo":
			for (var i = 0; i < tabla.rows.length; i++) {
				tabla.rows[i].cells[0].style.display = ""; // Mostrar la columna "Id"
				tabla.rows[i].cells[1].style.display = ""; // Mostrar la columna "Nombre"
				tabla.rows[i].cells[2].style.display = ""; // Mostar la columna "Run"
				tabla.rows[i].cells[3].style.display = ""; // Mostrar la columna "Fecha de Nacimiento"
				tabla.rows[i].cells[13].style.display = ""; // Mostrar la columna "area"
				tabla.rows[i].cells[14].style.display = ""; // Mostrar la columna "experiencia previa"
			}
			break;
		case "Profesional":
			for (var i = 0; i < tabla.rows.length; i++) {
				tabla.rows[i].cells[0].style.display = ""; // Mostrar la columna "Id"
				tabla.rows[i].cells[1].style.display = ""; // Mostrar la columna "Nombre"
				tabla.rows[i].cells[2].style.display = ""; // Mostar la columna "Run"
				tabla.rows[i].cells[3].style.display = ""; // Mostrar la columna "Fecha de Nacimiento"
				tabla.rows[i].cells[11].style.display = ""; // Mostrar la columna "titulo"
				tabla.rows[i].cells[12].style.display = ""; // Mostrar la columna "Fecha Ingreso"
			}
			break;
		case "Cliente":
			for (var i = 0; i < tabla.rows.length; i++) {
				tabla.rows[i].cells[0].style.display = ""; // Mostrar la columna "Id"
				tabla.rows[i].cells[1].style.display = ""; // Mostrar la columna "Nombre"
				tabla.rows[i].cells[2].style.display = ""; // Mostar la columna "Run"
				tabla.rows[i].cells[3].style.display = ""; // Mostrar la columna "Fecha de Nacimiento"
				tabla.rows[i].cells[4].style.display = ""; // Mostrar la columna "Apellidos"
				tabla.rows[i].cells[5].style.display = ""; // Mostrar la columna "Telefono"
				tabla.rows[i].cells[6].style.display = ""; // Mostrar la columna "Rut"
				tabla.rows[i].cells[7].style.display = ""; // Mostrar la columna "Edad"
				tabla.rows[i].cells[8].style.display = ""; // Mostrar la columna "Afp"
				tabla.rows[i].cells[9].style.display = ""; // Mostrar la columna "Direccion"
				tabla.rows[i].cells[10].style.display = ""; // Mostrar la columna "Comuna"
			}
			break;
	}
}