
function muestraOpcion()
{
    var opciones = document.getElementByName("eleccion");
    
    for(let i=0; i < opciones.length; i++)
    {
        console.log(opciones);
        if (opciones[i].cheked)
        {
            alert(opciones[i].value);
        }
    }
}
