let emojis = ['🥶', '🎪', '👑',' 🗝', '💰' , '🥐', '🌹', '🚀'];

let empuje = [];

//var boton = $('#button01');
//var display = $('#thingDisplay')



function iniciar() {
    empuje.push(emojis[0]);
    emojis.splice(0,1);
    console.log(emojis);
    $('p').remove('.pato');
    $('#thingDisplay').append(`<p class="pato">${empuje}</p>`);
    
}