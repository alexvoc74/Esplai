/* Ejercicio
1. A partir de la pizza sustituΓ­as todos los elemento del array por
cervezas:ππ―π£πππ±πππ₯©

Ejercicio 2. Encontrar si existe un elemento en el array que sea una piΓ±a. πππππ

Ejercicio
3. Quita la piΓ±a del siguiente array. πππππ

Ejercicio 4. A partir del siguiente array
πππππ convierte todas las fresas en π

Ejercicio 5. AΓ±ade el siguiente icono π₯΅ inmediatamente despuΓ©s del cada
πΆοΈ en el siguiente array: πΆοΈπ₯πΆοΈπ₯πΆοΈπ₯

Ejercicio 6. AΓ±ade una π
cartas comodΓ­n entre medio de dos cartas . Por ejemplo:π΄ππ΄ En el
siguiente array:
π΄π΄π΄ππ΄π΄π΄ */

let emoji = ['π','π―','π£','π','π','π±','π','π','π₯©'];

/*emoji.forEach(function(pizza, cerveza) {
  console.log('En el indice ' + pizza + ' hay este valor: '+  cerveza);
  
});*/
for(var i = 0; i < emoji.length; i++)
{
    
    if(emoji[i] == 'π') {
      emoji.fill('πΊ', i+1);
    }
}

console.log(emoji);

//Ejercicio 2

let piΓ±a = ['π','π','π','π','π'];

for(var i = 0; i < piΓ±a.length; i++)
{
    
    if(piΓ±a[i] =='π') {
      console.log('\nComes piΓ±a en la posicion ' + (i+1));
    }
}

//Ejercicio 3
function splise() {
  let index = piΓ±a.indexOf('π');
  console.log(piΓ±a);
  piΓ±a.splice(index,1);
  console.log(piΓ±a);
}
splise();

//Ejercicio 4

frutas = ['π', 'π', 'π', 'π' , 'π'];

for(var i = 0; i < frutas.length; i++) {
  frutas[i] = frutas[i].replace('π', 'π');
}

console.log(frutas);

//Ejercicio 5

hot = ['πΆοΈ', 'π₯', 'πΆοΈ', 'π₯', 'πΆοΈ', 'π₯'];

for(var i = 0; i < hot.length; i++){

  if( hot[i] == ['πΆοΈ']) {
    hot.splice(i+1, 0, 'π₯΅');
  }
  
}

console.log(hot);

//Ejercicio 6


cartas = ['π΄','π΄','π΄','π','π΄','π΄','π΄'];

for(var i = 0; i < cartas.length; i++){

  if( cartas[i] == ['π΄'] && cartas[i+1] == ['π΄']){
    cartas.splice(i+1,0, 'π');
  }
  
}

console.log(cartas);