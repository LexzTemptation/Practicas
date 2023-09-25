/* 📌 Promise()

    Son estructuras que nosotros vamos a poder definir
    para decirle al navegador que queremos que espere
    a que nosotros terminemos de hacer una operación y
    que cuando nosotros terminemos la operación le vamos
    a avisar y le vamos a responder con los datos */

const promesa = new Promise((resolve, reject) => {
    // Acción que se ejecutara.
    setTimeout(() => {
        const exito = true;

        if (exito) {
            resolve("La operación tuvo exito");
        } else {
            reject("La operación no tuvo exito");
        }
    }, 1000);
});

promesa.then((mensaje) => {
    alert(mensaje);
});

promesa.catch((mensaje) => {
    alert(mensaje);
});
