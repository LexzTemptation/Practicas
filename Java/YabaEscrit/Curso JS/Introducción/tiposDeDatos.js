/* 📌 Tipos de datos que podemos guardar en las variables:
	string - Cadena de Texto
	number - Numero
	boolean - Booleano (verdadero o falso)
	object - Objeto
	function - Funciones

	null - Valor nulo
	undefined - Valor sin definir
*/
// 📌 Cadena de Texto
const nombre = "Carlos"; //Si a esto se le quita las comillas lo va a tomar como una variable
                         //la cual no existe
const parrafo = "Este es un 'parrafo'";
const parrafo2 = 'Este es un "parrafo"';
// const parrafo3 = 'Este es un \'parrafo\'';

// 📌 Numero
const numero = 4;
const numero2 = -4.123;

// 📌 Boleano
const usuarioConectado = false;
const mayorQue = 10 > 2; //Esto solo va a dar un valor booleano en consola

console.log(mayorQue); //Esto solo va a dar un valor booleano en consola

// 📌 Arrays - Arreglos
const arreglo = ["texto", 456, true, { propiedad: "valor" }, [1, 2, 3]];
console.log(arreglo);

// 📌 Objeto
const persona = {
    nombre: "Carlos",
    edad: 27,
    carro: {
        marca: "...",
        color: "negro",
    },
};
console.log(persona)

// 📌 Function
function hola() {
    console.log("Hola");
}

hola();

// 📌 Null
// Normalmente lo usamos cuando queremos especificar que un valor sea nulo.
const miVariable = null;

console.log(miVariable)

// 📌 Undefined
// Undefined se usa para indicarnos que un valor no esta definido.
const miVariable2 = undefined;
console.log(miVariable2);
