// Ejercicio 08 parte 1,2 y 3

function reemplazo(string) {
    let nuevaPalabra = string.replace(/a/g,"o");
    return nuevaPalabra
  }
  function empieza(string) {
    return console.log(string.startsWith("aca"));
  }

  function repeat(string) {
    return console.log(string.repeat(3));
    
  }

  console.log(reemplazo(prompt()));
  empieza("academia");
  empieza("escuela");
  repeat("hola");


