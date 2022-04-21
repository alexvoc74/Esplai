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


