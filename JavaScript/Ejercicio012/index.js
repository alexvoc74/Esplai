/* Ejercicio
1. A partir de la pizza sustituías todos los elemento del array por
cervezas:🍔🌯🍣🍕🍜🍱🍙🍘🥩

Ejercicio 2. Encontrar si existe un elemento en el array que sea una piña. 🍕🍕🍍🍕🍕

Ejercicio
3. Quita la piña del siguiente array. 🍕🍕🍍🍕🍕

Ejercicio 4. A partir del siguiente array
🍓🍋🍓🍋🍓 convierte todas las fresas en 🍄

Ejercicio 5. Añade el siguiente icono 🥵 inmediatamente después del cada
🌶️ en el siguiente array: 🌶️🥛🌶️🥛🌶️🥛

Ejercicio 6. Añade una 🃏
cartas comodín entre medio de dos cartas . Por ejemplo:🎴🃏🎴 En el
siguiente array:
🎴🎴🎴🃏🎴🎴🎴 */

let emoji = ['🍔','🌯','🍣','🍕','🍜','🍱','🍙','🍘','🥩'];

/*emoji.forEach(function(pizza, cerveza) {
  console.log('En el indice ' + pizza + ' hay este valor: '+  cerveza);
  
});*/
for(var i = 0; i < emoji.length; i++)
{
    
    if(emoji[i] == '🍕') {
      emoji.fill('🍺', i+1);
    }
}

console.log(emoji);

//Ejercicio 2

let piña = ['🍕','🍕','🍍','🍕','🍕'];

for(var i = 0; i < piña.length; i++)
{
    
    if(piña[i] =='🍍') {
      console.log('\nComes piña en la posicion ' + (i+1));
    }
}

//Ejercicio 3
function splise() {
  let index = piña.indexOf('🍍');
  console.log(piña);
  piña.splice(index,1);
  console.log(piña);
}
splise();

//Ejercicio 4

frutas = ['🍓', '🍋', '🍓', '🍋' , '🍓'];

for(var i = 0; i < frutas.length; i++) {
  frutas[i] = frutas[i].replace('🍓', '🍄');
}

console.log(frutas);

//Ejercicio 5

hot = ['🌶️', '🥛', '🌶️', '🥛', '🌶️', '🥛'];

for(var i = 0; i < hot.length; i++){

  if( hot[i] == ['🌶️']) {
    hot.splice(i+1, 0, '🥵');
  }
  
}

console.log(hot);

//Ejercicio 6


cartas = ['🎴','🎴','🎴','🃏','🎴','🎴','🎴'];

for(var i = 0; i < cartas.length; i++){

  if( cartas[i] == ['🎴'] && cartas[i+1] == ['🎴']){
    cartas.splice(i+1,0, '🃏');
  }
  
}

console.log(cartas);