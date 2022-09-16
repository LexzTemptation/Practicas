
CREATE DATABASE gym_vro;

USE gym_vro;

CREATE TABLE rooms
(
    idRoom INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    squareMeters FLOAT,
    locationRoom TEXT DEFAULT NULL
);

CREATE TABLE roomType
(
	cardio TEXT DEFAULT NULL,
	general TEXT DEFAULT NULL,
	muscular TEXT DEFAULT NULL,

	idRoom INT NOT NULL
);

CREATE TABLE fixtures
(
    idFixture INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    roomDescription TEXT DEFAULT NULL,
    fixtureStatus TEXT DEFAULT NULL,

	idRoom INT NOT NULL
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
	idClass INT NOT NULL
);


CREATE TABLE instructor
(
	idInstructor INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	degree TEXT DEFAULT NULL,

	idPerson INT NOT NULL,
	idClass INT NOT NULL

);

CREATE TABLE classes
(
	idClass INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	description TEXT DEFAULT NULL,

	idRoom INT NOT NULL,
	idInstructor INT NOT NULL
	
);

CREATE TABLE courtSquash
(
	idCourt INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	locationCourt TEXT DEFAULT NULL,
	courtStatus TEXT DEFAULT NULL
);

CREATE TABLE reservations
(
	dayTime DATE,	
	
	idMember INT NOT NULL,
	idCourt INT NOT NULL
);


--Añadiendo claves foraneas a tabla members
ALTER TABLE members
ADD KEY fk_members_person (idPerson),
ADD KEY fk_members_classes (idClass);

ALTER TABLE members
ADD CONSTRAINT fk_members_person FOREIGN KEY (idPerson) REFERENCES person (idPerson) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT fk_members_classes FOREIGN KEY (idClass) REFERENCES classes (idClass) ON DELETE CASCADE ON UPDATE CASCADE;

--Añadiendo claves foraneas a tabla instructor
ALTER TABLE instructor
ADD KEY fk_instructor_person (idPerson);

ALTER TABLE instructor
ADD CONSTRAINT fk_instructor_person FOREIGN KEY (idPerson) REFERENCES person (idPerson) ON DELETE CASCADE ON UPDATE CASCADE;

--Añadiendo claves foraneas a tabla classes
ALTER TABLE classes
ADD KEY fk_classes_room (idRoom),
ADD KEY fk_classes_instructor (idInstructor);

ALTER TABLE classes
ADD CONSTRAINT fk_classes_room FOREIGN KEY (idRoom) REFERENCES rooms (idRoom) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT fk_classes_instructor FOREIGN KEY (idInstructor) REFERENCES instructor (idInstructor) ON DELETE CASCADE ON UPDATE CASCADE;

--Añadiendo claves foraneas a tabla fixtures
ALTER TABLE fixtures
ADD KEY fk_fixtures_room (idRoom);

ALTER TABLE fixtures
ADD CONSTRAINT fk_fixtures_room FOREIGN KEY (idRoom) REFERENCES rooms (idRoom) ON DELETE CASCADE ON UPDATE CASCADE;

--Añadiendo claves foraneas a tabla reservations
ALTER TABLE reservations
ADD KEY fk_reservations_member (idMember),
ADD KEY fk_reservations_court (idCourt);

ALTER TABLE reservations
ADD CONSTRAINT fk_reservations_member FOREIGN KEY (idMember) REFERENCES members (idMember) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT fk_reservations_court FOREIGN KEY (idCourt) REFERENCES courtSquash (idCourt) ON DELETE CASCADE ON UPDATE CASCADE;

--Añadiendo claves foraneas a tabla reservations
ALTER TABLE roomType
ADD KEY fk_roomType_room (idRoom);

ALTER TABLE roomType
ADD CONSTRAINT fk_roomType_room FOREIGN KEY (idRoom) REFERENCES rooms (idRoom) ON DELETE CASCADE ON UPDATE CASCADE;

--DROP DATABASE gym_vro;




















































