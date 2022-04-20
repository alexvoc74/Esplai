var string = "Alex";
const number = 12345;
const array = [1, 2, 3];
let boolean = true;
let isNull = null;
let Undefined = undefined;
let isSymbol = Symbol('algo');
let isFunction = function() {
    var num = 3;
    var cuatro = 4;
    var resultado = 3 + 4;
    return console.log('Mi primera función es una suma de ' + num + " + " +  cuatro + ' = ' + resultado);
}

console.log(string + ": " +  ' esto es un ' +  typeof string);
console.log(number + ": " +  ' esto es un ' +  typeof number);
console.log(array + ": " +  ' esto es una  ' +  typeof array);
console.log(boolean + ": " +  ' esto es un ' +  typeof boolean);
console.log(isNull + ": " +  ' esto es un ' +  typeof isNull);
console.log(Undefined + ": " +  ' esto es un ' +  typeof Undefined);
/*console.log(Symbol(isSymbol) + ": " +  ' esto es un ' + typeof isSymbol());*/
isFunction();
