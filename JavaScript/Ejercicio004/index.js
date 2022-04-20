let num1 = (Math.round(Math.random()*100));
let num2 = (Math.round(Math.random()*100));

let numeritos = function(num1, num2, num3){
    let suma = num1 + num2 + num3;
    return suma;
}
console.log('El resultado de la suma de valores es: ' + numeritos(1,20,50));

let nombre = function(nombre1, apellido1, apellido2){
    let completo = nombre1 + ' ' +  apellido1 + ' ' + apellido2 ;
    return completo;
}
console.log('\nTu nombre completo es: ' + nombre('Alex','Voces','Pato'));

let mayor = function(num1,num2){
    console.log('\n' + num1 + ' es el num1 generado aleatorio');
    console.log(num2 + ' es el num2 generado aleatorio');

    if(num1 > num2) {
        console.log('El número mayor es ' + num1);
    }
    else{
        console.log('El número mayor es ' + num2);
    }
}
mayor(num1,num2);