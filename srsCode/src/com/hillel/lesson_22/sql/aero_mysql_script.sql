/*
drop table pass_in_trip;
drop table  passenger;
drop table  trip;
drop table  company;

*/
CREATE TABLE Company (
	ID_comp int NOT NULL ,
	name char (10) NOT NULL 
);


CREATE TABLE Pass_in_trip (
	trip_no int NOT NULL ,
	date datetime NOT NULL ,
	ID_psg int NOT NULL ,
	place char (10) NOT NULL 
);


CREATE TABLE Passenger (
	ID_psg int NOT NULL ,
	name char (20) NOT NULL 
);


CREATE TABLE Trip (
	trip_no int NOT NULL ,
	ID_comp int NOT NULL ,
	plane char (10) NOT NULL ,
	town_from char (25) NOT NULL ,
	town_to char (25) NOT NULL ,
	time_out datetime NOT NULL ,
	time_in datetime NOT NULL 
);


ALTER TABLE Company  ADD 
	CONSTRAINT PK2 PRIMARY KEY
	(
		ID_comp
	);   


ALTER TABLE Pass_in_trip  ADD 
	CONSTRAINT PK_pt PRIMARY KEY  CLUSTERED 
	(
		trip_no,
		date,
		ID_psg
	);   


ALTER TABLE Passenger  ADD 
	CONSTRAINT PK_psg PRIMARY KEY  CLUSTERED 
	(
		ID_psg
	);   


ALTER TABLE Trip  ADD 
	CONSTRAINT PK_t PRIMARY KEY  CLUSTERED 
	(
		trip_no
	);   


ALTER TABLE Pass_in_trip ADD 
	CONSTRAINT FK_Pass_in_trip_Passenger FOREIGN KEY 
	(
		ID_psg
	) REFERENCES Passenger (
		ID_psg
	);

ALTER TABLE Pass_in_trip ADD 
	CONSTRAINT FK_Pass_in_trip_Trip FOREIGN KEY 
	(
		trip_no
	) REFERENCES Trip (
		trip_no
	);


ALTER TABLE Trip ADD 
	CONSTRAINT FK_Trip_Company FOREIGN KEY 
	(
		ID_comp
	) REFERENCES Company (
		ID_comp
	);

                                                                                                                                                                                                                                                                 
/*----Company------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Company values(1,'Don_avia  ');
insert into Company values(2,'Aeroflot  ');
insert into Company values(3,'Dale_avia ');
insert into Company values(4,'air_France');
insert into Company values(5,'British_AW');


                                                                                                                                                                                                                                                                 
/*----Passenger------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Passenger values(1,'Bruce Willis        ');
insert into Passenger values(2,'George Clooney      ');
insert into Passenger values(3,'Kevin Costner       ');
insert into Passenger values(4,'Donald Sutherland   ');
insert into Passenger values(5,'Jennifer Lopez      ');
insert into Passenger values(6,'Ray Liotta          ');
insert into Passenger values(7,'Samuel L. Jackson   ');
insert into Passenger values(8,'Nikole Kidman       ');
insert into Passenger values(9,'Alan Rickman        ');
insert into Passenger values(10,'Kurt Russell        ');
insert into Passenger values(11,'Harrison Ford       ');
insert into Passenger values(12,'Russell Crowe       ');
insert into Passenger values(13,'Steve Martin        ');
insert into Passenger values(14,'Michael Caine       ');
insert into Passenger values(15,'Angelina Jolie      ');
insert into Passenger values(16,'Mel Gibson          ');
insert into Passenger values(17,'Michael Douglas     ');
insert into Passenger values(18,'John Travolta       ');
insert into Passenger values(19,'Sylvester Stallone  ');
insert into Passenger values(20,'Tommy Lee Jones     ');
insert into Passenger values(21,'Catherine Zeta-Jones');
insert into Passenger values(22,'Antonio Banderas    ');
insert into Passenger values(23,'Kim Basinger        ');
insert into Passenger values(24,'Sam Neill           ');
insert into Passenger values(25,'Gary Oldman         ');
insert into Passenger values(26,'Clint Eastwood      ');
insert into Passenger values(27,'Brad Pitt           ');
insert into Passenger values(28,'Johnny Depp         ');
insert into Passenger values(29,'Pierce Brosnan      ');
insert into Passenger values(30,'Sean Connery        ');
insert into Passenger values(31,'Bruce Willis        ');
insert into Passenger values(37,'Mullah Omar         ');



                                                                                                                                                                                                                                                                 
/*----Trip------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Trip values(1100,4,'Boeing    ','Rostov                   ','Paris                    ','1900-01-01 14:30:00','1900-01-01 17:50:00');
insert into Trip values(1101,4,'Boeing    ','Paris                    ','Rostov                   ','1900-01-01 08:12:00','1900-01-01 11:45:00');
insert into Trip values(1123,3,'TU-154    ','Rostov                   ','Vladivostok              ','1900-01-01 16:20:00','1900-01-01 03:40:00');
insert into Trip values(1124,3,'TU-154    ','Vladivostok              ','Rostov                   ','1900-01-01 09:00:00','1900-01-01 19:50:00');
insert into Trip values(1145,2,'IL-86     ','Moscow                   ','Rostov                   ','1900-01-01 09:35:00','1900-01-01 11:23:00');
insert into Trip values(1146,2,'IL-86     ','Rostov                   ','Moscow                   ','1900-01-01 17:55:00','1900-01-01 20:01:00');
insert into Trip values(1181,1,'TU-134    ','Rostov                   ','Moscow                   ','1900-01-01 06:12:00','1900-01-01 08:01:00');
insert into Trip values(1182,1,'TU-134    ','Moscow                   ','Rostov                   ','1900-01-01 12:35:00','1900-01-01 14:30:00');
insert into Trip values(1187,1,'TU-134    ','Rostov                   ','Moscow                   ','1900-01-01 15:42:00','1900-01-01 17:39:00');
insert into Trip values(1188,1,'TU-134    ','Moscow                   ','Rostov                   ','1900-01-01 22:50:00','1900-01-01 00:48:00');
insert into Trip values(1195,1,'TU-154    ','Rostov                   ','Moscow                   ','1900-01-01 23:30:00','1900-01-01 01:11:00');
insert into Trip values(1196,1,'TU-154    ','Moscow                   ','Rostov                   ','1900-01-01 04:00:00','1900-01-01 05:45:00');
insert into Trip values(7771,5,'Boeing    ','London                   ','Singapore                ','1900-01-01 01:00:00','1900-01-01 11:00:00');
insert into Trip values(7772,5,'Boeing    ','Singapore                ','London                   ','1900-01-01 12:00:00','1900-01-01 02:00:00');
insert into Trip values(7773,5,'Boeing    ','London                   ','Singapore                ','1900-01-01 03:00:00','1900-01-01 13:00:00');
insert into Trip values(7774,5,'Boeing    ','Singapore                ','London                   ','1900-01-01 14:00:00','1900-01-01 06:00:00');
insert into Trip values(7775,5,'Boeing    ','London                   ','Singapore                ','1900-01-01 09:00:00','1900-01-01 20:00:00');
insert into Trip values(7776,5,'Boeing    ','Singapore                ','London                   ','1900-01-01 18:00:00','1900-01-01 08:00:00');
insert into Trip values(7777,5,'Boeing    ','London                   ','Singapore                ','1900-01-01 18:00:00','1900-01-01 06:00:00');
insert into Trip values(7778,5,'Boeing    ','Singapore                ','London                   ','1900-01-01 22:00:00','1900-01-01 12:00:00');
insert into Trip values(8881,5,'Boeing    ','London                   ','Paris                    ','1900-01-01 03:00:00','1900-01-01 04:00:00');
insert into Trip values(8882,5,'Boeing    ','Paris                    ','London                   ','1900-01-01 22:00:00','1900-01-01 23:00:00');



                                                                                                                                                                                                                                                                 
/*----Pass_in_trip------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Pass_in_trip values(1100,'2003-04-29 00:00:00',1,'1a        ');
insert into Pass_in_trip values(1123,'2003-04-05 00:00:00',3,'2a        ');
insert into Pass_in_trip values(1123,'2003-04-08 00:00:00',1,'4c        ');
insert into Pass_in_trip values(1123,'2003-04-08 00:00:00',6,'4b        ');
insert into Pass_in_trip values(1124,'2003-04-02 00:00:00',2,'2d        ');
insert into Pass_in_trip values(1145,'2003-04-05 00:00:00',3,'2c        ');
insert into Pass_in_trip values(1181,'2003-04-01 00:00:00',1,'1a        ');
insert into Pass_in_trip values(1181,'2003-04-01 00:00:00',6,'1b        ');
insert into Pass_in_trip values(1181,'2003-04-01 00:00:00',8,'3c        ');
insert into Pass_in_trip values(1181,'2003-04-13 00:00:00',5,'1b        ');
insert into Pass_in_trip values(1182,'2003-04-13 00:00:00',5,'4b        ');
insert into Pass_in_trip values(1187,'2003-04-14 00:00:00',8,'3a        ');
insert into Pass_in_trip values(1188,'2003-04-01 00:00:00',8,'3a        ');
insert into Pass_in_trip values(1182,'2003-04-13 00:00:00',9,'6d        ');
insert into Pass_in_trip values(1145,'2003-04-25 00:00:00',5,'1d        ');
insert into Pass_in_trip values(1187,'2003-04-14 00:00:00',10,'3d        ');
insert into Pass_in_trip values(8882,'2005-11-06 00:00:00',37,'1a        '); 
insert into Pass_in_trip values(7771,'2005-11-07 00:00:00',37,'1c        '); 
insert into Pass_in_trip values(7772,'2005-11-07 00:00:00',37,'1a        '); 
insert into Pass_in_trip values(8881,'2005-11-08 00:00:00',37,'1d        '); 
insert into Pass_in_trip values(7778,'2005-11-05 00:00:00',10,'2a        '); 
insert into Pass_in_trip values(7772,'2005-11-29 00:00:00',10,'3a        ');
insert into Pass_in_trip values(7771,'2005-11-04 00:00:00',11,'4a        ');
insert into Pass_in_trip values(7771,'2005-11-07 00:00:00',11,'1b        ');
insert into Pass_in_trip values(7771,'2005-11-09 00:00:00',11,'5a        ');
insert into Pass_in_trip values(7772,'2005-11-07 00:00:00',12,'1d        ');
insert into Pass_in_trip values(7773,'2005-11-07 00:00:00',13,'2d        ');
insert into Pass_in_trip values(7772,'2005-11-29 00:00:00',13,'1b        ');
insert into Pass_in_trip values(8882,'2005-11-13 00:00:00',14,'3d        ');
insert into Pass_in_trip values(7771,'2005-11-14 00:00:00',14,'4d        ');
insert into Pass_in_trip values(7771,'2005-11-16 00:00:00',14,'5d        ');
insert into Pass_in_trip values(7772,'2005-11-29 00:00:00',14,'1c        ');

