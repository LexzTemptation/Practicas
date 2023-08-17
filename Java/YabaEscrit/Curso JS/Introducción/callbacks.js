/* 📌 callback()
    Funciones que se pueden pasar como parametro a otra función 
    con el fin de que una funcion pueda llamar/ejecutar otra función.*/

const obtenerPostsDeUsuario = (usuario, callback) => {
    console.log(`Obteniendo los post de ${usuario} ...`);

    setTimeout(() => {
        let posts = ["Post1", "Post2", "Post3"];
        callback(posts);
    }, 2000);
};

obtenerPostsDeUsuario("carlos", (posts) => {
    console.log(posts);
    return posts;
});
