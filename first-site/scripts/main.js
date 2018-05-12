var myHeading = document.querySelector('h1');
myHeading.textContent = 'Hello world!';

// var iceCream = 'chocolate';
// if (iceCream === 'chocolate') {
//   alert('Yay, I love chocolate ice cream!');
// } else {
//   alert('Awwww, but chocolate is my favorite...');
// }
var myImage = document.querySelector('img');
myImage.onclick = function() {
    var mySrc = myImage.getAttribute('src');
    if(mySrc === 'images/macbook.jpg') {
      myImage.setAttribute ('src','images/i_mac.png');
    } else {
      myImage.setAttribute ('src','images/macbook.jpg');
    }
}


// var test = true;
// if (test){
//   myHeading.textContent = 'Hello world - true!';
// } else {
//   myHeading.textContent = 'Hello world! - wrong';
// }


var myButton = document.querySelector('button');
function setUserName() {
  var myName = prompt('Please enter your name.');
  localStorage.setItem('name', myName);
  myHeading.textContent = 'Hello, ' + myName;
}


if(!localStorage.getItem('name')) {
  setUserName();
} else {
  var storedName = localStorage.getItem('name');
  myHeading.textContent = 'Hello, ' + storedName;
}

myButton.onclick = function() {
  setUserName();
}
