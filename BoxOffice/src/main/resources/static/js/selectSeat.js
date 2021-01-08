let selectedSeats = new Array();
let selectedSeatsMap = [];
const seatWrapper = document.querySelector(".seat-wrapper");
let clicked = "";
let div = "";

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

		input.addEventListener('click', function(e) {
			console.log(e.target.value);

			//중복방지 함수
			selectedSeats = selectedSeats.filter((element, index) => selectedSeats.indexOf(element) != index);

			//click class가 존재할때(제거해주는 toggle)
			if (input.classList.contains("clicked")) {
				input.classList.remove("clicked");
				clicked = document.querySelectorAll(".clicked");
				selectedSeats.splice(selectedSeats.indexOf(e.target.value), 1);
				clicked.forEach((data) => {
					selectedSeats.push(data.value);
				});
				//click class가 존재하지 않을때 (추가해주는 toggle)
			} else {
				input.classList.add("clicked");
				clicked = document.querySelectorAll(".clicked");
				clicked.forEach((data) => {
					selectedSeats.push(data.value);
				})
			}
			console.log(selectedSeats);
			document.getElementById("number").value = selectedSeats.length;
			document.getElementById("price").value = selectedSeats.length * 10000;
		})
	}
}