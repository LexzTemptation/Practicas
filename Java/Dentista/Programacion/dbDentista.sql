
CREATE DATABASE clinicaDentista;

USE clinicaDentista;

CREATE TABLE pacientes
(
    idPaciente INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(30),
    apellido_paterno VARCHAR(20),
    apellido_materno VARCHAR(20),
    fechaNac DATE,
   -- edad INT,
    direccion VARCHAR(100),
    telefono VARCHAR(15)
);

CREATE TABLE citas
(
    idCita INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    fecha DATE,
    hora DATE
);

CREATE TABLE agenda
(
    idPaciente INT NOT NULL,
    idCita INT NOT NULL,

    PRIMARY KEY (idPaciente, idCita),
    FOREIGN KEY (idPaciente) REFERENCES pacientes (idPaciente),
    FOREIGN KEY (idCita) REFERENCES citas (idCita)

--    idPaciente INT NOT NULL REFERENCES pacientes,
--    idCita INT NOT NULL REFERENCES citas
);

INSERT INTO pacientes VALUES 
(
    1010, 
    "Emmanuel Alejandro", 
    "Hernandez", 
    "Cornejo", 
    '1997-12-11',
    --24, 
    "Jardines de jerez Geranios #132", 
    4776712536
);
--53581968687
INSERT INTO pacientes VALUES 
(
    default, -- o null, que da el efecto del  AUTO_INCREMENT que proporciona el numero que le sigue del registro anterior
    "Juana", 
    "Delgado", 
    "Gamez", 
    '1949-01-23',
    --73, 
    "Jardines de jerez Geranios #132", 
    4772474233
);

SELECT * FROM pacientes;

--Actualizar un registro, SET es para el registro a actualizar
UPDATE pacientes SET edad = 25 WHERE nombre = "Emmanuel Alejandro";

SELECT * FROM pacientes;

--Esta consulta muesta la edad de los pacientes en base al año
SELECT idPaciente, nombre, fechaNac, CURRENT_DATE AS 'fecha del sistema', 
DATE(CURRENT_DATE) - DATE(fechaNac) AS 'edad' FROM pacientes;



SELECT idPaciente,nombre,apellido_paterno,apellido_materno,fechaNac,direccion,telefono FROM pacientes;
