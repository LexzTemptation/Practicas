db.counters.insert
<<<<<<< HEAD
(
   {
      _id: "id_persona",
      seq: 1009
   }
=======

(

   {

      _id: "id_persona",

      seq: 1009

   }

>>>>>>> fc936fe89239a358fc9de7e26cc7b0350746a216
)



/*Antes de ingresar un nuevo registro se tiene que convocar esta funci�n*/

function getNextSequence(id_persona) 
<<<<<<< HEAD
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
=======

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

>>>>>>> fc936fe89239a358fc9de7e26cc7b0350746a216
}



function insertDocument(doc, targetCollection) 
<<<<<<< HEAD
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
=======

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

>>>>>>> fc936fe89239a358fc9de7e26cc7b0350746a216
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
<<<<<<< HEAD
    	telefono : "987654321"
    }
)

=======
    	telefono : "987654321",
        direccion: 
        {
            "calle": "Colon",
            "numero": 1200,
            "codigopostal": 5000
        }
    }
)

    

>>>>>>> fc936fe89239a358fc9de7e26cc7b0350746a216
db.persona.insert
(
    {
        _id: getNextSequence("id_persona"),
        nombre : "Martina",
        apellido : "Lawrence",
        email : ('mlaw@gmail.com '),
<<<<<<< HEAD
    	telefono : "38456583"
=======
    	telefono : "38456583",
        direccion: 
        {
            calle: "Dean Funes",
            numero: 23,
            codigopostal: 5002
        }
>>>>>>> fc936fe89239a358fc9de7e26cc7b0350746a216
    }
)



db.persona.insert
(
    {
        _id: getNextSequence("id_persona"),
        nombre : "Paola",
        apellido : "Fran",
        email : ('pfra@gmail.com '),
<<<<<<< HEAD
    	telefono : "56345347"
    }
) 
=======
    	telefono : "56345347",
        "direccion": 
        {
            "calle": "Colon",
            "numero": 150,
            "codigopostal": 5000
        }
    }
) 

   

>>>>>>> fc936fe89239a358fc9de7e26cc7b0350746a216
