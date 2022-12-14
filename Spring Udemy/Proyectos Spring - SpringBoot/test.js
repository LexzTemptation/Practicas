db.counters.insert
(
   {
      _id: "id_persona",
      seq: 1009
   }
)

/*Antes de ingresar un nuevo registro se tiene que convocar esta función*/
function getNextSequence(id_persona) 
{
   var ret = db.counters.findAndModify
    (
          {
            query: { _id: id_persona },
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

/*datos de las personas*/
db.persona.insert
(
    {
        _id: getNextSequence("id_persona"),
        nombre : "Juan",
        apellido : "Perez",
        email : ('jpear@gmail.com '),
    	telefono : "1234567891"
    }
)

db.persona.insert
(
    {
        _id: getNextSequence("id_persona"),
        nombre : "Ramiro",
        apellido : "Leata",
        email : ('rleata@gmail.com '),
    	telefono : "987654321"
    }
)
    
db.persona.insert
(
    {
        _id: getNextSequence("id_persona"),
        nombre : "Martina",
        apellido : "Lawrence",
        email : ('mlaw@gmail.com '),
    	telefono : "38456583"
    }
)

db.persona.insert
(
    {
        _id: getNextSequence("id_persona"),
        nombre : "Paola",
        apellido : "Fran",
        email : ('pfra@gmail.com '),
    	telefono : "56345347"
    }
) 
   
show databases