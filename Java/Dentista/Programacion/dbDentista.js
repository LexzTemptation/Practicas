/*Base de datos NoSQL Dentista*/

use clinicaDentista

/*AutoIncrement*/
db.counters.insert
(
   {
      _id: "idPaciente",
      seq: 1009
   }
)

/*Antes de ingresar un nuevo registro se tiene que convocar esta función*/
function getNextSequence(idPaciente) 
{
   var ret = db.counters.findAndModify
    (
          {
            query: { _id: idPaciente },
            update: { $inc: { seq: 1 } },
            new: true,

            upsert: true

          }
   );

   return ret.seq;
}

function insertDocument(doc, targetCollection) 
{
    while (1)
        {
            var cursor = targetCollection.find( {}, { _id: 1 } ).sort( { _id: -1 } ).limit(1);

            var seq = cursor.hasNext() ? cursor.next()._id + 1 : 1;

            doc._id = seq;

            var results = targetCollection.insert(doc);

            if( results.hasWriteError() ) 
                {
                    if( results.writeError.code == 11000 /* dup key */ )
                    continue;
                    
                    else
                    print( "unexpected error inserting data: " + tojson( results ) );
                }

        break;
    }
}



/*datos de los pacientes*/
db.paciente.insert
(
    {
        _id: getNextSequence("idPaciente"),
        nombre : "Emmanuel Alejandro",
        apellido_paterno : "Hernandez",
        apellido_materno : "Cornejo",
        fechaNac : new Date ('Dec 11, 1997'),
        direccion : { 
                        colonia : "Jardines de jerez",
                        calle : "Geranios 132"
                    },
    	telefono : 4776712536
    }
)

db.paciente.insert
(
    {
        _id: getNextSequence("idPaciente"),
        nombre : "Juana",
        apellido_paterno : "Delgado",
        apellido_materno : "Gamez",
        fechaNac : new Date ('1949-01-23'),
        direccion : { 
                        colonia : "Jardines de jerez",
                        calle : "Geranios 132"
                    },
    	telefono : 4772474233
    }
)

var paciente = db.paciente;

insertDocument
(
   {
        _id: getNextSequence("idPaciente"),
        nombre : "Luis Ángel",
        apellido_paterno : "Alvarez",
        apellido_materno : "Gutierrez",
        fechaNac : new Date ('1999-07-16'),
        direccion : { 
                        colonia : "León 1",
                        calle : "Algún sitio 102"
                    },
    	telefono : 4771234567
    },
   paciente
);


db.doctores.insertOne
(
	{
	"nombre":"Juan", 
	"apellidos":"Peña", 
	"experiencia, 45, 
	"nacimineto": new ISODate("1980-07-12"),
	 "estado":1
	 }
 )

db.getCollection('doctores').insertMany
(
    [
        {
            nombre : "Lawrence", 
            apellidos : "de Arabia", 
            experiencia : 37, 
            nacimineto : new Date("1969-10-05"), 
            estado : 2
        },
        {
            nombre : "Marina", 
            apellidos : "Arceli", 
            experiencia : 29, 
            nacimineto : new Date("1985-04-23"), 
            estado : 7
        }
    ]
);


