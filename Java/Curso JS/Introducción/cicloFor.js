const nombres = [
    "Carlos",
    "Christian",
    "Christoher",
    "Estefania",
    "Erika",
    "Manuel",
    "Diego",
];
// nombres.forEach((nombre) => {
// 	console.log(nombre);
// });

/* 
	📌 Ciclo For
	Repite un bloque de código mientras se cumpla una condición.

	Expresión 1: Se ejecuta una sola vez antes de comenzar a repetir el bloque de código.
	Expresión 2: Una condicion, mientras se cumpla se ejecutara el bloque de código.
	Expresión 3: Esta expresion se ejecuta siempre y despues de que se ejecute el bloque de código.
*/

for (let i = 0; i < nombres.length; i++) {
    console.log(nombres[i]);
}

for (let i = 50; i >= 1; i--){
    console.log([i]);
}
