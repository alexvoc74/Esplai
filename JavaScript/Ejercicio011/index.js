// APRENDIENDO A DEBUGEAR

let numero = 1;
let i = 0;

do{
  if( i == 0) {
    i++;
    numero--;
    console.log(numero);
  }else{
    numero++;
    console.log(numero);
  }
}while (numero < 5);

//El programa coge un numero, que le establecemos 1. Y mira si es la primero posiscion (0), restando un valor pq cuando entra en
//el if,le suma un i++ (que es la posicion), entonces como el valor es 1, le restamos 1 para que empiece por 0. Va sumando valores hasta 5 y los imprime por pantalla.