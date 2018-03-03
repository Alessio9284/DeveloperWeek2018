/* script.js */
$(document).ready(
	function()
	{
		$("#registrazione").hide();
	}
);

function aggiungiFattura()
{
	$("#registrazione").show().css("background-color", "rgba(135, 206, 235, 0.9)");
	/*
	var dati = [];
	
	dati.push($("#ID").val());
	dati.push($("#Data").val());
	dati.push($("").val());
	dati.push($("#Importo").val());
	dati.push($("#IDA").val());
	dati.push($("#A").val());
	
	for(var i = 0; i < dati.length; i++)
	{
		$("#Salva").append("<td>" + dati[i] + "</td>")
	}
	*/
}
