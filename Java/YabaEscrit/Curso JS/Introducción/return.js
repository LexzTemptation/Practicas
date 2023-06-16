const operacion = (tipo, numero1, numero2) => {

    /* let resultado; */

    if (tipo === "suma") {
        /* resultado = numero1 + numero2; */
        return numero1 + numero2;
    } else if (tipo === "resta") {
        /* resultado = numero1 + numero2; */
        return numero1 - numero2;
    }
    /* return resultado; */
};

let resultado = operacion("suma", 150, 111);
console.log(resultado);
