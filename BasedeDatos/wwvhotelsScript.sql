CREATE database wwvhoteldb;/*COMANDO PARA CREAR LA BASE DE DATOS*/
use wwvhoteldb; /*COMANDO PARA USAR LA BASE DE DATOS*/
/*COMANDO PARA CREAR UNA TABLA*/
create table ROOM(
ID	INT	NOT NULL 	AUTO_INCREMENT	primary KEY,
ROOM_NUMBER		INT	NOT NULL ,		
ROOM_TYPE		VARCHAR (45)	NOT NULL	,	
BEDS_NUMBER		INT	NOT NULL, 		
VACANCY		BOOLEAN	NOT NULL, 		
CUSTOMER_ID		INT	NOT NULL ,		
ROOM_PRICE		DOUBLE	NOT NULL 		
)