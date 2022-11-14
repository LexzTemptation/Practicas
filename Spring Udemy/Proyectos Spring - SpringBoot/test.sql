
CREATE DATABASE test;

USE test;

CREATE TABLE persona
(
    id_persona INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(45),
    apellido VARCHAR(45),
    email VARCHAR(45),
    telefono VARCHAR(45)
);

INSERT INTO persona VALUES 
(
    1010, 
    "Juan", 
    "Perez", 
    "jpear@gmail.com", 
    "1234567891"
);

INSERT INTO persona VALUES 
(
    default, 
    "Ramiro", 
    "Leata", 
    "rleata@gmail.com", 
    "987654321"
);

INSERT INTO persona VALUES 
(
    default, 
    "Martina", 
    "Lawrence", 
    "mlaw@outlook.com", 
    "38456583"
);

INSERT INTO persona VALUES 
(
    default, 
    "Paola", 
    "Fran", 
    "pfra@yahoo.com", 
    "56345347"
);

