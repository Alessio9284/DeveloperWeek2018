/* script.js */
var i = 0;
window.onload = function()
{
	// Get the modal
	var modal = document.getElementById('myModal');

	// Get the button that opens the modal
	var btn = document.getElementById("Fattura");

	// Get the <span> element that closes the modal
	var span = document.getElementsByClassName("close")[0];

	// When the user clicks the button, open the modal 
	btn.onclick = function()
	{
		modal.style.display = "block";
	}

	// When the user clicks on <span> (x), close the modal
	span.onclick = function()
	{
		modal.style.display = "none";
	}

	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event)
	{
		if (event.target == modal)
		{
			modal.style.display = "none";
		}
	}
}

function aggiungi() //prendere i dari del form e lo stampa a schermo 
{
	$("#myModal").hide();
	var element = document.createElement("tr");
	
	if(i%2 == 0) //decide se la riga ha un colore chiaro o scuro
	{
		element.setAttribute("class", "coloreChiaro");
	}
	else
	{
		element.setAttribute("class", "coloreScuro");
	}
	
	if(document.getElementById("IF").checked)
	{
		element.innerHTML = (
			"<td>" + $("#ID").val() + "</td>" +
			"<td>" + $("#Data").val() + "</td>" +
			"<td>incasso fattura</td>" +
			"<td>" + $("#Importo").val() + "</td>" +
			"<td>" + $("#IDA").val() + "</td>" +
			"<td>" + $("#A").val() + "</td>"
		);
	}
	else
	{
		element.innerHTML = (
			"<td>" + $("#ID").val() + "</td>" +
			"<td>" + $("#Data").val() + "</td>" +
			"<td>emissione fattura</td>" +
			"<td>" + $("#Importo").val() + "</td>" +
			"<td>" + $("#IDA").val() + "</td>" +
			"<td>" + $("#A").val() + "</td>"
		);
	}
	
	document.getElementById("Salva").appendChild(element);
	i++;
}
