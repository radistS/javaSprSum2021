USE `hillelTest`;



CREATE TABLE Laptop (
	code int NOT NULL ,
	model varchar (50) NOT NULL ,
	speed smallint NOT NULL ,
	ram smallint NOT NULL ,
	hd real NOT NULL ,
	price decimal(12,2) NULL ,
	screen tinyint NOT NULL 
); 

CREATE TABLE PC (
	code int NOT NULL ,
	model varchar (50) NOT NULL ,
	speed smallint NOT NULL ,
	ram smallint NOT NULL ,
	hd real NOT NULL ,
	cd varchar (10) NOT NULL ,
	price decimal(12,2) NULL 
); 


CREATE TABLE Product (
	maker varchar (10) NOT NULL ,
	model varchar (50) NOT NULL ,
	type varchar (50) NOT NULL 
); 


CREATE TABLE Printer (
	code int NOT NULL ,
	model varchar (50) NOT NULL ,
	color char (1) NOT NULL ,
	`type` varchar (10) NOT NULL ,
	price decimal(12,2) NULL 
); 


ALTER TABLE Laptop ADD 
	CONSTRAINT PK_Laptop PRIMARY KEY 
	(
		code
	);   


ALTER TABLE PC ADD 
	CONSTRAINT PK_pc PRIMARY KEY 
	(
		code
	);   


ALTER TABLE Product ADD 
	CONSTRAINT PK_product PRIMARY KEY 
	(
		model
	);   


ALTER TABLE Printer ADD 
	CONSTRAINT PK_printer PRIMARY KEY 
	(
		code
	);   


ALTER TABLE Laptop ADD 
	CONSTRAINT FK_Laptop_product FOREIGN KEY 
	(
		model
	) REFERENCES Product (
		model
	);


ALTER TABLE PC ADD 
	CONSTRAINT FK_pc_product FOREIGN KEY 
	(
		model
	) REFERENCES Product (
		model
	);


ALTER TABLE Printer ADD 
	CONSTRAINT FK_printer_product FOREIGN KEY 
	(
		model
	) REFERENCES Product (
		model
	);

/*----Product------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Product values('B','1121','PC')
,('A','1232','PC')
,('A','1233','PC')
,('E','1260','PC')
,('A','1276','Printer')
,('D','1288','Printer')
,('A','1298','Laptop')
,('C','1321','Laptop')
,('A','1401','Printer')
,('A','1408','Printer')
,('D','1433','Printer')
,('E','1434','Printer')
,('B','1750','Laptop')
,('A','1752','Laptop')
,('E','2113','PC')
,('E','2112','PC');


                                                                                                                                                                                                                                                                 
/*----PC------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into PC values(1,'1232',500,64,5,'12x',600)
,(2,'1121',750,128,14,'40x',850)
,(3,'1233',500,64,5,'12x',600)
,(4,'1121',600,128,14,'40x',850)
,(5,'1121',600,128,8,'40x',850)
,(6,'1233',750,128,20,'50x',950)
,(7,'1232',500,32,10,'12x',400)
,(8,'1232',450,64,8,'24x',350)
,(9,'1232',450,32,10,'24x',350)
,(10,'1260',500,32,10,'12x',350)
,(11,'1233',900,128,40,'40x',980)
,(12,'1233',800,128,20,'50x',970)
;

                                                                                                                                                                                                                                                                 
/*----Laptop------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Laptop values(1,'1298',350,32,4,700,11)
,(2,'1321',500,64,8,970,12)
,(3,'1750',750,128,12,1200,14)
,(4,'1298',600,64,10,1050,15)
,(5,'1752',750,128,10,1150,14)
,(6,'1298',450,64,10,950,12)
;


                                                                                                                                                                                                                                                                 
/*----Printer------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Printer values(1,'1276','n','Laser',400)
,(2,'1433','y','Jet',270)
,(3,'1434','y','Jet',290)
,(4,'1401','n','Matrix',150)
,(5,'1408','n','Matrix',270)
,(6,'1288','n','Laser',400)
;