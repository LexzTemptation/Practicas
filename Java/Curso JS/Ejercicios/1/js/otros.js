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
let accionarFuncion = (radio = 0) => {

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

}
