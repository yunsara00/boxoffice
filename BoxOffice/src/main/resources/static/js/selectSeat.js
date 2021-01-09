let selectedSeats = new Array();
let selectedSeatsMap = [];
const seatWrapper = document.querySelector(".seat-wrapper");
let clicked = "";
let div = "";
var reservedSeat = document.getElementById("reservedSeat").value;
var seatArr = reservedSeat.split(",");


for (let i = 0; i < 7; i++) {
	div = document.createElement("div");
	seatWrapper.append(div);

	for (let j = 1; j <= 10; j++) {
		const input = document.createElement('input');
		input.type = "button";
		input.name = "seats"
		input.classList = "seat";

		var content = "";
		switch (i) {
			case 0: content = "A"; break;
			case 1: content = "B"; break;
			case 2: content = "C"; break;
			case 3: content = "D"; break;
			case 4: content = "E"; break;
			case 5: content = "F"; break;
			case 6: content = "G"; break;
		}
		input.value = content + j;

		div.append(input);

		for (var k = 0; k < seatArr.length; k++) {
			if (input.value == seatArr[k]) {
				input.style.backgroundColor = 'gray';
			} else {
				input.addEventListener('click', function(e) {

					selectedSeats = selectedSeats.filter((element, index) => selectedSeats.indexOf(element) != index);

					if (input.classList.contains("clicked")) {
						input.classList.remove("clicked");
						clicked = document.querySelectorAll(".clicked");
						selectedSeats.splice(selectedSeats.indexOf(e.target.value), 1);
						clicked.forEach((data) => {
							selectedSeats.push(data.value);
						});

					} else {
						input.classList.add("clicked");
						clicked = document.querySelectorAll(".clicked");
						clicked.forEach((data) => {
							selectedSeats.push(data.value);
						})
					}

					document.getElementById("seatList").value = selectedSeats;
					document.getElementById("number").value = selectedSeats.length;
					document.getElementById("payment_price").value = selectedSeats.length * 10000;
				})
			}
		}


	}
}