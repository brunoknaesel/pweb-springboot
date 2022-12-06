const formulario = document.getElementById("formularioAula");
const botao = document.getElementById("botaoAgendar");
const itipoAula = document.getElementById("tipoAula");
const icategoria = document.getElementById("categoria");
const iinstrutor = document.getElementById("instrutor");
const idataAula = document.getElementById("dataAula");
const ihorarioAula = document.getElementById("horarioAula");

function cadastrar() {
	fetch("http://localhost:8087/aulas",
		{
			headers: {
				"Accept": "application/json",
				"Content-Type": "application/json"
			},
			method: "POST",
			body: JSON.stringify({
				tipoAula: itipoAula.value,
				categoria: icategoria.value,
				instrutor: iinstrutor.value,
				dataAula: idataAula.value,
				horarioAula: ihorarioAula.value
			})

		})
		.then(function(res) { console.log(res), alert("Aula cadastrada com sucesso") })
		.catch(function(res) { console.log(res) })
}

function limpar() {
	itipoAula.value = "",
		icategoria.value = "",
		iinstrutor.value = "",
		idataAula.value = "",
		ihorarioAula.value = ""
}

formulario.addEventListener("submit", function(event) {
	event.preventDefault();
	if (itipoAula.value != "" && icategoria.value != "" && iinstrutor.value != "" &&
		idataAula.value != "" && ihorarioAula.value != "") {

		cadastrar();
		limpar();
	}
	else {
		alert("Todos os campos devem serem preenchidos para agendar a aula!")
	}
});