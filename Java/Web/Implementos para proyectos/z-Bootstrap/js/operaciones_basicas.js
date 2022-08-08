
﻿function realizarOperacion(oper)
{
    // Leemos los valores de las cajas de texto: 
    var x = parseFloat($('#txtN1').val());
    var y = parseFloat($('#txtN2').val());
    //Realizamos la operación correspondiente: 
    switch (oper)
    {
        case 1:
            sumar(x, y);
            break;
            
        case 2:
            restar(x, y);
            break;
        
        case 3:
            multiplicar(x, y);
            break;
        
        case 4:
            dividir(x, y);
            break;
    }
}

function sumar(n1, n2)
{
//Configuramos una petición AJAX: 
$.ajax({
    
    type: "GET", 
    url : "api/opBas/sumar", 
    context : document.body, 
    data : {
                a: n1,
                b: n2
            }
        
    })
    .done(function(data)
        {
            // Leemos la propiedad result y la ponemos // en la caja de texto: 
            $('#txtResultado').val(data.result);
        });
}




