/* let edad = parseFloat(prompt("¿Cual es tu edad?"));

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
    timerProgressBar: true,
    background: '#3A4460',
    confirmButtonColor: '#009252',
    didOpen: (toast) => {
        toast.addEventListener('mouseenter', Swal.stopTimer)
        toast.addEventListener('mouseleave', Swal.resumeTimer)
    }
});

/* 1 */
/* function contarWord(wordf = "")
{
    // let word = 'fierro'
    // document.write(`<h1>${word.length}</h1>`);
    // console.log(word.length);

    wordf = document.getElementById("palabra").value;

    (!wordf)
        ? (Swal.fire({
            icon: "error",
            title: `<h3>Ingrese una palabra valida</h3>`,
            timer: 2000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }))
    :(Swal.fire({
        icon: "success",
        title: `<h3>${(' La parabra: "' + wordf + '", tiene: ' + wordf.length+" caracteres ")}</h3>`,
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

/* 2 */
/* let recortarCaracteres = () => {
    let word2 = 'Hola mundo';

    document.write(`<h1>${word2.slice(0, 5)}</h1>`);

    console.log(word2.slice(0, 5));
};
recortarCaracteres(); */

/* 3 */
/* let arreglo1 = (str = "", sep = undefined) => {
    (!str)
    ?console.warn("1")
    :(sep === undefined)
        ?console.warn("2")
        :console.info(str.split(sep))

    let string = 'Hola que tal?';

    document.write(`<h1>${string.split(' ')}</h1>`);
}
arreglo1('Hola que tal?', ' ');
 */

/* 4 */
/* let repeticion = () => {

    for (let i = 0; i < 3; i++) {
        document.write(`<h1>${"Hola mundo"}</h1>`);
        
    }
}
repeticion(); */

/* 5 */
/* let contarWord = (wordRev = "") => {

    wordRev = document.getElementById("valor").value;

    (!wordRev)
        ? (Swal.fire({
            icon: "error",
            title: `<h3>Ingrese una palabra valida</h3>`,
            timer: 2000,
            timerProgressBar: true,
            background: '#3A4460',
            confirmButtonColor: '#009252',
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
            }
        }))
        :
        (Swal.fire({
            icon: "success",
            title: `<h3>${(' La parabra: "' + wordRev + '", invertida es: ' +  wordRev.split("").reverse().join(""))}</h3>`,
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

/* 6 */



/* Operaciones básicas */
/* let operacion = () => {

    let n1, n2, sumaa, res, mult, div;
    let result;

    n1 = parseFloat(document.getElementById("fierro1").value);
    n2 = parseFloat(document.getElementById("fierro2").value);

    sumaa = (n1 + n2);
    res = (n1 - n2);
    mult = (n1 * n2);
    div = () => {
            if (n2 == 0)
            {
                return 0;
            }
            else
            {
                return n1 / n2;
            };
    };

    result = () => {
        return "Feli"
    }

    document.getElementById("sum").value = sumaa;
    document.getElementById("res").value = res;
    document.getElementById("mult").value = mult;
    document.getElementById("div").value = div();

    document.getElementById("txtR").innerHTML = result();

} */
