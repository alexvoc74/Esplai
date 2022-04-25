let emojis = ['🥶', '🎪', '👑',' 🗝', '💰' , '🥐', '🌹', '🚀'];

let empuje = [];

//var boton = $('#button01');
//var display = $('#thingDisplay')



function iniciar() {
    empuje.push(emojis[random()]);
    console.log(emojis);
    $('p').remove('.pato');
   $('#thingDisplay').append(`<p class="pato">[${empuje}]</p>`);
}

function drop(){
    empuje.unshift(emojis[random()]);
    console.log(emojis);
    $('p').remove('.pato');
   $('#thingDisplay').append(`<p class="pato">[${empuje}]</p>`);
}

function insertAt(){

    var input = document.getElementById('nums'),
        nums = input.value;
    empuje.splice(nums, 0, emojis[random()]);
    $('p').remove('.pato');
   $('#thingDisplay').append(`<p class="pato">[${empuje}]</p>`);
}
function pop() {
    empuje.pop(emojis[random()]);
    console.log(emojis);
    $('p').remove('.pato');
   $('#thingDisplay').append(`<p class="pato">[${empuje}]</p>`);
}
function shift() {
    empuje.shift(emojis[random()]);
    console.log(emojis);
    $('p').remove('.pato');
   $('#thingDisplay').append(`<p class="pato">[${empuje}]</p>`);
}

function removeAt() {
    var input = document.getElementById('numR'),
        numR = input.value;
    empuje.splice(numR, 1);
    $('p').remove('.pato');
   $('#thingDisplay').append(`<p class="pato">[${empuje}]</p>`);
}

function random(){
    numero = Math.random()*7;
    numero = Math.floor(numero);
    return  numero;
}

$(document).ready(function(){
    $('#button01').click(() => {
        $('.array')
            .animate({top: '200px'});
    });
});

