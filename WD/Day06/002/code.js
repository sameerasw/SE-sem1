//fetch the button from the DOM
var button = document.querySelector("button");

//attach and event when the user clicks it
button.addEventListener("click", myfunction);

//create the fuction that will be called when the user clicks the button
function myfunction() {
    //shows an pop-up
    alert("Button clicked!");
}