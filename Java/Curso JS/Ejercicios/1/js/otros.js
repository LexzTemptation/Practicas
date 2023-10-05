/* Célsius a Fahrenheit */
/* let convercionDeTemperatura = (celsius = 0) => {

    celsius = parseFloat(document.getElementById("valor").value);

    console.log(typeof celsius);

    let fahrenheit = ((9 / 5) * celsius + 32);

    (!celsius)
        ? (Swal.fire({
            icon: "warning",
            title: `<h3>Ingrese los grados célsius a convertir</h3>`,
            timer: 2000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }))
        : (Swal.fire({
            icon: "info",
            title: `<h3>${(' Los grados célsius son: "' + celsius + '", y a fahrenheit son: ' + fahrenheit)}</h3>`,
            timer: 3000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }));

} */

/* Valor de la hipotenusa */
/* let accionarFuncion = (cateto1 = 0, cateto2 = 0) => {

    cateto1 = parseFloat(document.getElementById("valor").value);
    cateto2 = parseFloat(document.getElementById("valor2").value);

    console.log(typeof cateto1, typeof cateto2);

    let hipotenusa = Math.sqrt((Math.pow(cateto1, 2)) + Math.pow(cateto2, 2));

    (!cateto1 || !cateto2)
        ? (Swal.fire({
            icon: "warning",
            title: `<h3>Ingrese un valor numerico para calcular la hipotenusa</h3>`,
            timer: 2000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }))
        : (Swal.fire({
            icon: "info",
            title: `<h3>${("El valor de la hipotenusa es: " + hipotenusa)}</h3>`,
            timer: 3000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }));

} */

/* logitudes de circunferencia */
/* let accionarFuncion = (radio = 0) => {

    radio = parseFloat(document.getElementById("valor").value);

    let longitud = 2 * Math.PI * radio;

    (!radio)
        ? (Swal.fire({
            icon: "warning",
            title: `<h3>Ingrese un valor numerico para calcular la logitud de la circunferencia</h3>`,
            timer: 2000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }))
        : (Swal.fire({
            icon: "info",
            title: `<h3>${("El valor de la logitud de la circunferencia es: " + longitud)}</h3>`,
            timer: 3000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }));

} */

/* Área de trapecio */
/* let accionarFuncion = (basMay = 0, basMen = 0, altura = 0) => {

    basMay = parseFloat(document.getElementById("valor").value);
    basMen = parseFloat(document.getElementById("valor2").value);
    altura = parseFloat(document.getElementById("valor3").value);

    let area = (((basMay + basMen)/2) * altura);

    (!basMen || !basMay || !altura)
        ? (Swal.fire({
            icon: "warning",
            title: `<h3>Ingrese un valor numerico para calcular el área del trapecio</h3>`,
            timer: 2000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }))
        : (Swal.fire({
            icon: "info",
            title: `<h3>${("El valor del area es: " + area)}</h3>`,
            timer: 3000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }));

} */

/* Media aritmética de tres números */
/* let accionarFuncion = (n1 = 0, n2 = 0, n3 = 0) => {

    n1 = parseFloat(document.getElementById("valor").value);
    n2 = parseFloat(document.getElementById("valor2").value);
    n3 = parseFloat(document.getElementById("valor3").value);

    let mediaAritmetica = ((n1 + n2 + n3) / 3);

    (!n1 || !n2 || !n3)
        ? (Swal.fire({
            icon: "error",
            title: `<h3>Ingrese un valor numerico para calcular la media aritmética</h3>`,
            timer: 2000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }))
        : (Swal.fire({
            icon: "info",
            title: `<h3>${("El valor de la media aritmética es: " + mediaAritmetica)}</h3>`,
            timer: 3000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }));

} */

/* Descuento del 15% */
/* let accionarFuncion = (totalCompra = 0) => {

    totalCompra = parseFloat(document.getElementById("valor").value);

    let descuento = (totalCompra*(15/100))
    let precioFinal = totalCompra - descuento;

    (!totalCompra)
        ? (Swal.fire({
            icon: "error",
            title: `<h3>Ingrese un valor numerico para calcular el descuento y el precio final</h3>`,
            timer: 2000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }))
        : (Swal.fire({
            icon: "info",
            title: `<h3>${("El descuento es: " + descuento + " y el precio final es: " + precioFinal)}</h3>`,
            timer: 3000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }));

} */

/* Calculo de salario de acuerdo a horas trabajadas */
/* let accionarFuncion = (horasTrabajadas = 0, valorPorHora = 0) => {

    horasTrabajadas = parseFloat(document.getElementById("valor").value);
    valorPorHora = parseFloat(document.getElementById("valor2").value);

    let salarioFinal = (horasTrabajadas * valorPorHora);

        (!horasTrabajadas || !valorPorHora)
        ? (Swal.fire({
            icon: "error",
            title: `<h3>Ingrese un valor numerico para calcular el salario final</h3>`,
            timer: 2000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }))
        : (Swal.fire({
            icon: "info",
            title: `<h3>${("El salario final es: " + salarioFinal)}</h3>`,
            timer: 3000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }));

} */

/* Calculo de salario con un 25% de aumento */
let accionarFuncion = (salario = 0) => {

    salario = parseFloat(document.getElementById("valor").value);

    let salarioFinal = (salario + (salario * (25/100)));

        (!salario)
        ? (Swal.fire({
            icon: "error",
            title: `<h3>Ingrese un valor numerico para calcular el salario final</h3>`,
            timer: 2000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }))
        : (Swal.fire({
            icon: "info",
            title: `<h3>${("Su salario final con 25% de aumento es de: " + salarioFinal)}</h3>`,
            timer: 3000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }));

}
