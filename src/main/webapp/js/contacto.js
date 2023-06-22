
var formElement = document.getElementById("formulario");

formElement.addEventListener('submit', function(ev) {

	ev.preventDefault();

  var formData = new FormData(formElement);

  for(var pair of formData.entries()) {
    console.log(pair[0]+ ', '+ pair[1]);
  }
  formulario.reset();
});