function validate() {
	let radioPratica = document.forms["formulario"]["pratica"].value;
	let categoria = document.forms["formulario"]["categoria"].value;
	let instrutores = document.forms["formulario"]["instrutores"].value;
	let dataaula = document.forms["formulario"]["dataaula"].value;
	let horarios = document.forms["formulario"]["horarios"].value;
	var resposta = "Favor preencher: \n\r";

	if (radioPratica == "" || categoria == "selecione" || instrutores == "selecione" || dataaula == "" || horarios == "selecione") {

		if (radioPratica == "") {
			resposta += "• Tipo aula\n";
		}
		if (categoria == "selecione") {
			resposta += "• Categoria\n";
		}
		if (instrutores == "selecione") {
			resposta += "• Instrutor\n";
		}
		if (dataaula == "") {
			resposta += "• Data da aula\n";
		}

		if (horarios == "selecione") {
			resposta += "• Horário da aula\n";
		}
		alert(resposta);
		return false;
	}
};

$(document).ready(function() {

	$('.subMenuBtn').click(function() {
		$(this).next('.subMenuConteudo').slideToggle();
		$(this).find('.dropdown').toggleClass('girar');
	});

});