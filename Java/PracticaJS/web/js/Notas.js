
//********************VER RESULTADOS EN CONSOLA********************

//Variables, USAR let ***************************
/*
var hola = "Hola Mundo"; 
let hello = "Hello World"; 
console.log(hola); 
console.log(hello); 
console.log(window); 
console.log(window.hola); 
console.log(window.hello); 
//Ambito de bloque

console.log("***************var*************")
var musica = "Rock"; 
console.log("Variable Música antes del Bloque", musica);
{
    var musica = "Pop"; 
    console.log("Variable Música dentro del Bloque", musica);
}
console.log("Variable Música antes del Bloque", musica);

console.log("***************let************")
let musica2 = "Rock"; 
console.log("Variable Música antes del Bloque", musica2);
{
    let musica2 = "Pop"; 
    console.log("Variable Música dentro del Bloque", musica2);
}
console.log("Variable Música antes del Bloque", musica2);
*/

//Constantes*******************************
/*Const = constantes, se usan cuando sabemos que alguna "variable"
 *no va a cambiar su valor.
 */

/*
const PI = 3.1416;
//const nueve;
console.log(PI);

//let nos deja manipular constantes
let a;
a = "Kenny";
console.log(a);

let objeto = 
{
    nombre : "Kenny",
    edad : 24
}
console.log(objeto);


//Arreglo, colección de datos
let colores = ["blanco", "negro", "rojo"];
colores.push("anaranjado");
console.log(colores);
*/

//Cadenas de texto****************************
/*
let nombre = "Alejandro";
let apellido = 'Cornejo';
let saludo = new String("Saludo");
let lorem = "      Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed diam nonumy eirmod tempor invidunt ut labore et dolor. Ut enim ad minim ven   ";
console.log(nombre, apellido, saludo);
console.log
(
    nombre.length, //Da el texto en consola
    apellido.length, 
    saludo.length,
    nombre.toUpperCase(), //Todo en mayusculas
    apellido.toLowerCase(),//Todo en minusculas
    lorem.includes("amet"),//Busca la palabra, y dependiendo de 
    lorem.includes("lexz"),//esta está en el texto, da un true o false
    lorem,
    lorem.trim(), //Quita los espacios del inicio y del final
    lorem.split(" "), //Toma un conjunto de elementos y lo que hacemos 
                      //en este elemento es separar y cuenta los espacios en blanco
    lorem.split(",") //en este elemento separa por comas
);
*/

/*
//Concatenación

let nombre = "Alejandro";
let apellido = 'Cornejo';

let saludo = "Hola " + nombre + " " + apellido + '.'
console.log(saludo);


//Interpolación de variables
//Template String

//Las comillas simples invertidas nos ayudan a hacer concatenaciones
//más limpias junto con codigo 'natural' (engl+fn+esc = ````)
let saludo2 = `Hola ${nombre} ${apellido}.`
console.log(saludo2);

let ul = 
`<ul>
 <li>Primavera</li>
 <li>Verano</li>
 <li>Otoño</li>
 <li>Invierno</li>
</ul>`;

console.log(ul);
*/

/*
//Números

let a = 2;
let b = new Number(4);
let c = 7.19683030247;
let d = "4.7dvorak";

console.log(a,b);
console.log(c.toFixed(1)); //El metodo to fix define cuantos decimales
console.log(c.toFixed(5)); //va a tener un valor numerico
console.log(parseInt(c));  //Valor Entero
console.log(parseFloat(c));//Valor Flotante
console.log(typeof c, typeof d); //Tipo de la variable
console.log(a + b); //Hace una suma
console.log(c + d); //Concatenación
console.log(c + parseInt(d));   //parseInt está convirtiendo la cadena en
console.log(c + parseFloat(d)); //números enteros, con parseInt vemos 
                                //un error de ceros de más, pero parseFloat
                                //lo resuelve
console.log(c + Number.parseInt(d));  //Number se puede agregar o no 
console.log(c + Number.parseFloat(d));//hablando de números
*/

/*
//Boolean

let verdadero = true;
let falso = false;
let v = Boolean(true);
let f = Boolean(false);

console.log(verdadero, falso);
console.log(v, f);
console.log(typeof verdadero, typeof falso);
console.log(Boolean(1));
console.log(Boolean(0));
console.log(Boolean(" "));
console.log(Boolean(""));
*/

//undefined, null & NaN

/*null y undefined representan una variable de un valor ausente 
  undefined: Es una propiedad del objeto global, es decir, una variable de alcance global.
             Indica que no se ha inicializado la variable y que el valor está ausente.
  null:      Es un literal (no una propiedad del objeto global como podría ser undefined). 
             Indica la ausencia de un valor.
*/

/*
let indefinida;
console.log(indefinida);

let nulo = null;
console.log(nulo);

// NaN - Not a Number
let noEsUnNumero = "hey" * 2;
console.log(noEsUnNumero);
*/

/**/
//Funciones mi vro

/*Una función es un bloque de código, autocontenido, que se puede definir una 
vez y ejecutar en cualquier momento. Opcionalmente, una función puede aceptar
parámetros y devolver un valor.

Las funciones en JavaScript son objetos, un tipo especial de objetos:

Se dice que las funciones son ciudadanos de primera clase porque pueden 
asignarse a un valor, y pueden pasarse como argumentos y usarse como un 
valor de retorno. */

//Función declarada

function estoEsUnaFunción()
{
    console.log("Uno");
    console.log("Dos");
    console.log("Tres");
}

//Invocación de funciones

estoEsUnaFunción();

function unaFuncionQueDevuelveUnValor()
{
    console.log("Uno");
    console.log("Dos");
    console.log("Tres");
    return "La función ha retornado una cadena de texto";
}

let valorDeFuncion = unaFuncionQueDevuelveUnValor();

console.log(valorDeFuncion);







//********************VER RESULTADOS EN CONSOLA********************

