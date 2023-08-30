/* let edad = parseInt(prompt("¿Cual es tu edad?"));

if (edad >= 18) {
    document.write(`<h1>Tu edad es ${edad}</h1>`);
    Swal.fire({
        icon: "success",
        title: `<h3>Eres mayor de edad</h3>`,
    });
} else {
    document.write(`<h1>Tu edad es ${edad} <i class="fa-solid fa-ban fa-flip" style="color: #e81111;"></i></h1>`);
    Swal.fire({
        icon: "error",
        title: "",
        title: `<h3>Eres menor de edad <i class="fa-solid fa-ban fa-flip" style="color: #e81111;"></i></h3>`,
    });
} */

/* (async () => {
    const { value: number } = await Swal.fire({
        icon: "question",
        title: `¿Cual es tu edad?`,
        input: "number",
    });

    if (number >= 18) {
        Swal.fire({
            icon: "success",
            title: `<h3>Eres mayor de edad</h3>`,
        });
    } else {
        Swal.fire({
            icon: "error",
            title: "Eres menor de edad",
        });
    }
})(); */

/* function calificacin()
{
    do {
        //Aquí se tuvo que usar var por que la wea no jalaba con let

        var calf = prompt("Ingresa tu calificación");

        if (Number(calf) == calf) {
            if (calf > 0 && calf < 10) {
                if (calf <= 3) {
                    alert("Tu calificación es muy deficiente");
                } else if (calf > 3 && calf <= 5) {
                    alert("Insuficiente");
                } else if (calf == 6) {
                    alert("Suficiente");
                } else if (calf == 7) {
                    alert("Bien");
                } else if (calf > 7 && calf <= 9) {
                    alert("Notable");
                } else if (calf == 10) {
                    alert("Sobresaliente");
                }
            } else {
                alert("Ingrese una calificación valida");
            }
        } else {
            if (calf != undefined) {
                alert("Ingrese una calificación");
            }
        }
    } while (calf != undefined);
}
calificacin();*/

/* const Toast = Swal.mixin({
    toast: true,
    position: 'top-end',
    showConfirmButton: false,
    timer: 3000,
    timerProgressBar: true,
    background: '#585a80',
    didOpen: (toast) => {
      toast.addEventListener('mouseenter', Swal.stopTimer)
      toast.addEventListener('mouseleave', Swal.resumeTimer)
    }
})

Toast.fire({
    icon:'success',
    title:"Fierro"
}) */

let fierro = () => Swal.fire({
    icon: 'success',
    title: `Fierro 🤠`,
    timer: 3000,
    timerProgressBar: true
});

function contarWord()
{
    let word = 'fierro'
    document.write(`<h1>${word.length}</h1>`);
}
contarWord();

let recortarCaracteres = () => {
    let word2 = 'Hola mundo';

    document.write(`<h1>${word2.slice(0, 5)}</h1>`);

};
recortarCaracteres();

