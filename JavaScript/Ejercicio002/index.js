const nombre = (nombre, apellidos) => {
    console.log("Hola " + nombre + apellidos);
}


function parte2(boolean){
    console.log(boolean);
}

const infinito  = function(...valores) {
    valores.forEach(element => {
        console.log(element);
    });
}
nombre('Alex', ' Voces');
parte2(true);
infinito(1,2,3,4,5);