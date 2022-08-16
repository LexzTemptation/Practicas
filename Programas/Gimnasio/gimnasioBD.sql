
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
    lastName VARCHAR (70) NOT NULL DEFAULT '',
    gender VARCHAR (70) NOT NULL DEFAULT '',
    addressPerson VARCHAR (200) NOT NULL DEFAULT '',
    phone VARCHAR (15) NOT NULL DEFAULT ''
);

CREATE TABLE members
(
	idMember  INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	
	idPerson INT NOT NULL,
	idClass INT NOT NULL,
	
	PRIMARY KEY (idMember, idPerson, idClass),
	FOREIGN KEY (idPerson) REFERENCES person (idPerson),
	FOREIGN KEY (idClass) REFERENCES classes (idClass)
);

CREATE TABLE instructor
(
	idInstructor INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	degree TEXT DEFAULT NULL,
	
	idPerson INT NOT NULL,
	idClass INT NOT NULL,
	
	FOREIGN KEY (idPerson) REFERENCES person (idPerson),
	FOREIGN KEY (idClass) REFERENCES classes (idClass)
);

CREATE TABLE classes
(
	idClass INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	description TEXT DEFAULT NULL,
	
	idRoom INT NOT NULL,
	idInstructor INT NOT NULL,
	
	FOREIGN KEY (idRoom) REFERENCES rooms (idPerson),
	FOREIGN KEY (idInstructor) REFERENCES instructor (idInstructor)
)

CREATE TABLE courtSquash
(
	idCourt INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	locationCourt TEXT DEFAULT NULL,
	courtStatus TEXT DEFAULT NULL,
	reservation TEXT DEFAULT NULL
)


























































