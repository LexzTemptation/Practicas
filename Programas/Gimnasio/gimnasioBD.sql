
CREATE DATABASE gym_vro;

USE gym_vro;

CREATE TABLE rooms
(
    idRoom INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    squareMeters FLOAT,
    locationRoom TEXT DEFAULT NULL,
    roomType TEXT DEFAULT NULL
);

CREATE TABLE fixtures
(
    idFixture INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    idRoom INT NOT NULL,
    roomDescription TEXT DEFAULT NULL,
    fixtureStatus TEXT DEFAULT NULL,

    PRIMARY KEY (idFixture, idRoom),
    FOREIGN KEY (idRoom) REFERENCES rooms (idRoom)

);

CREATE TABLE person
(
    idPerson INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    namePerson VARCHAR (70) NOT NULL DEFAULT '',
    lastName VARCHAR (70) NOT NULL DEFAULT '',,
    gender VARCHAR (70) NOT NULL DEFAULT '',
    addressPerson VARCHAR (200) NOT NULL DEFAULT '',
    phone VARCHAR (15) NOT NULL DEFAULT ''
);

































































