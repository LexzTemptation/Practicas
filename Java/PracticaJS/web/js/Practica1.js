
/* let a = prompt ("Ingrese las horas trabajadas");

let b = prompt ("Ingrese el sueldo por hora");

document.write(a * b); */

let salario  = 1000, comision, numAutVend, totalVenta, total;

numAutVend = prompt ("Ingrese el numero de autos vendidos en el mes por el vendedor");

totalVenta = prompt ("Ingrese el total de las ventas por el vendedor");

function operacion(comision, totalVenta, total) 
{
    function comision(numAutVend)
    {
        numAutVend * 150;

        return numAutVend;
    };

    function totalVenta(numAutVend)
    {
        numAutVend * 0.5
        return numAutVend;
    };

    function total(salario, comision, totalVenta)
    {
        salario + comision + totalVenta

        return salario;
    };
}

document.write (operacion(total));





