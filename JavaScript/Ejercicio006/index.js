/*let mes = (Math.round(Math.random()*12)); //Introduce un num del 1 al 12 */
let mes = (Math.floor(Math.random()*12 + 1));

/*while(mes !== 0 ){
    let mes = (Math.floor(Math.random()*12 + 1));
    console.log(mes);
} Probando si entra en 0 o 13 */
console.log(mes);
switch(mes){
    case 1:
        console.log('Enero');
        break;
    case 2:
        console.log('Febrero');
        break;
    case 3:
        console.log('Marzo');
        break;
    case 4:
        console.log('Abril');
        break; 
    case 5:
        console.log('Mayo');
        break; 
    case 6:
        console.log('Junio');
        break;     
    case 7:
        console.log('Julio');
        break;
    case 8:
        console.log('Agosto');
        break;
    case 9:
        console.log('Septiembre');
        break;
    case 10:
        console.log('Octubre');
        break;
    case 11:
        console.log('Noviembre');
        break;      
    case 12:
        console.log('Diciembre');
        break;        
}

/*Parte2*/

let string = '1';

switch(string) {
    case '1':
    console.log(parseInt(string));
    break;
    case '2':
    console.log(parseInt(string));
    break;
    case '3':
    console.log(parseInt(string));
    break;
    case '4':
    console.log(parseInt(string));
    break;  
    case '5':
    console.log(parseInt(string));
    break;
}


