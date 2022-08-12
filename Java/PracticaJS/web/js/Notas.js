
//********************VER RESULTADOS EN CONSOLA********************

//*******Variables, USAR let ***************************
/*
var hola = "Hola Mundo"; 
let hello = "Hello World"; 
console.log(hola); 
console.log(hello); 
console.log(window); 
console.log(window.hola); 
console.log(window.hello); 

//*******Ambito de bloque*******

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

//*******Constantes*******
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

//*******Cadenas de texto*******
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
//*******Concatenación*******

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
//*******Números*******

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
//*******Boolean*******

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

//*******undefined, null & NaN*******

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


//*******Funciones mi vro*******

/*Una función es un bloque de código, autocontenido, que se puede definir una 
vez y ejecutar en cualquier momento. Opcionalmente, una función puede aceptar
parámetros y devolver un valor.

Las funciones en JavaScript son objetos, un tipo especial de objetos:

Se dice que las funciones son ciudadanos de primera clase porque pueden 
asignarse a un valor, y pueden pasarse como argumentos y usarse como un 
valor de retorno. */

//Función declarada
/*
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
    return 19;  //Si la función encuentra la parabra
                //reservada "return" ignora lo que
                //hay abajo de ella
    console.log("Dos");
    console.log("Tres");
    return "La función ha retornado una cadena de texto";
}

let valorDeFuncion = unaFuncionQueDevuelveUnValor();

console.log(valorDeFuncion);

function saludar(nombre = "Desconocido", edad = 0)
{
    console.log(`Hola mi nombre es ${nombre} y tengo ${edad} años.`);
}

saludar("Lexz", 24);
saludar();

funcionDeclarada();

function funcionDeclarada() 
{
console.log("Esto es un función declarada, puede" +
" invocarse en cualquier parte de nuestro código, incluso" +
" antes de que la función sea declarada");
}

funcionDeclarada();
*/

//función anónima 

/*funcionExpresada();*/
/*
const funcionExpresada = function ()
{
    console.log("Esto es una función expresada, es decir," +
    " una función quese le ha asignado como valor a una" +
    " variable, si invocamos esta función antes de su" +
    " definición JS nos dirá: 'Cannot access 'funcionExpresada'" +
    " before initialization'")
}

funcionExpresada();
*/

//*******Arrays*******

/* 
    Un arreglo(vector, array, matriz) es un conjunto de datos
    o una estructura de datos homogéneos que se encuentran ubicados
    en forma consecutiva en la memoria RAM (sirve para almacenar
    datos en forma temporal).
*/
/*
let a = [];
let b = [1, true, "Hola", ["A", "B", "C",[1, 2, 3]]]
console.log(a);
console.log(b);
console.log(b.length);
console.log(b[2]);
console.log(b[0]);
console.log(b[3]);
console.log(b[3][2]);
console.log(b[3][3][0]);

let c = Array.of("X","Y","Z",9,8,7);
console.log(c);

const d = Array(100).fill(false);
console.log(d);

const e = new Array();
console.log(e);

const f = new Array(1,2,3, true, false,);
console.log(f);

const rgb = ["Rojo", "Verde", "Azúl"];
console.log(rgb);

rgb.push("Negro");
console.log(rgb);

rgb.pop();
console.log(rgb)

rgb.forEach
(
    function(el, index)
    {
        console.log
        (`<li id="${index}"> ${el} </li>`);
    }
);
*/

//*******Objetos*******
/*
let a = new String("Hola");

console.log(a);

const b = {}; //Regresa un objeto
console.log(b); //Regresa lo que hay en "cons b"

const c = new Object(); //Regresa un objeto
console.log(c); //Regresa lo que hay en "cons c"
*/
/*
Dentro de un objeto a las variables se
le van a llamar atributos/propirdades
y a las funciones se les llama metodos
*//*
const lexz = 
{
    gt : "LexzTemptation",
    edad : 24,
    pasatiempos : 
        [
            "jugar videojuegos", 
            "hacer ejercicio", 
            "ser pro"
        ],
    soltero : true,
    contacto : 
        {
            email : "alejandrotemptation@gmail.com",
            twitter : "@LexzTemp",
            movil : 4771234567
        },
    saludar : function()
    {
        console.log("Hey!!");
    },

    decirMiGt : function()
    {
        console.log(`Mi GT es ${this.gt} y tengo ${this.edad} años`)
    }

}

console.log(lexz);
console.log(lexz["gt"]);
console.log(lexz["pasatiempos"]);
console.log(lexz.gt); 
//Esto es lo más común, las anterioes también se pueden utilizar, 
//pero hacerlo de esta forma es más común
console.log(lexz.soltero);
console.log(lexz.pasatiempos);
console.log(lexz.pasatiempos[1]);
console.log(lexz.contacto);
console.log(lexz.contacto.twitter);
lexz.saludar();
lexz.decirMiGt();

console.log(Object.keys(lexz)); //listado de llaves, gt, edad, pasatiempos, etc.
console.log(Object.values(lexz)) //listado de los valores de las llaves.
console.log(lexz.hasOwnProperty("gt")); //Regresa true por que tiene algo dentro de la propiedad
console.log(lexz.hasOwnProperty("sexo")); //Regresa false por no existe la llave
*/

//*******Tipos de operadores*******

// Operadores aritmeticos (+, -, *, /, %)

let a = 5 + (5 - 10) * 3;
console.log(a);

let modulo = 5 % 2;
console.log(modulo)

// Operadores relacionales (<, >, <=, >=, ==, ===, !=, !==)

// De esta forma solo regresa valores booleanos
console.log(8 > 9);
console.log(9 > 8);
console.log(8 >= 9);
console.log(9 >= 8);
console.log(7 < 7);
console.log(7 <= 7);
console.log(8 > 9);

// = 1 igual es asignación de variable 
// == 2 iguales es comparacion de valores 
// === 3 es comparación de tipo de dato y de valor

console.log(7 == 7);
console.log("7" == 7);
console.log(0 == false);

console.log("");

//Por buenas practicas es considerado hacer este tipo de
//comparación triple, doble igual es malas practicas

console.log(7 === 7);
console.log("7" === 7);
console.log(0 === false);

// Incremento y decremento (++, --)

let i = 2;
//i = i + 2;
//i += 3;
//i -= 3;

// Operador unario
i++;
i--;
//Expresiones más adecuadas las dos de arriba
++i;
--i;
console.log(i);
console.log(i++);
console.log(++i);

// Operadores lógicos

// ! = negación
// ||= or, con que una condicón se cumpla el or valida
// && = and

console.log(!true);
console.log(!false);
console.log((9 === 9) || console.log("9" === 9));
console.log((9 === 9) && console.log("9" === "9"));

//********************VER RESULTADOS EN CONSOLA********************

