CREATE TABLE Income (
	code int NOT NULL ,
	point tinyint NOT NULL ,
	date datetime NOT NULL ,
	inc decimal(12,2) NOT NULL 
);


CREATE TABLE Outcome (
	code int NOT NULL ,
	point tinyint NOT NULL ,
	date datetime NOT NULL ,
	`out` decimal(12,2) NOT NULL 
); 


CREATE TABLE Income_o (
	point tinyint NOT NULL ,
	date datetime NOT NULL ,
	inc decimal(12,2) NOT NULL 
); 


CREATE TABLE Outcome_o (
	point tinyint NOT NULL ,
	date datetime NOT NULL ,
	`out` decimal(12,2) NOT NULL 
); 


ALTER TABLE Income  ADD 
	CONSTRAINT PK_Income PRIMARY KEY  NONCLUSTERED 
	(
		code
	);   


ALTER TABLE Outcome  ADD 
	CONSTRAINT PK_Outcome PRIMARY KEY  NONCLUSTERED 
	(
		code
	)   ;


ALTER TABLE Income_o  ADD 
	CONSTRAINT PK_Income_o PRIMARY KEY  NONCLUSTERED 
	(
		point,
		date
	)   ;


ALTER TABLE Outcome_o  ADD 
	CONSTRAINT PK_Outcome_o PRIMARY KEY  NONCLUSTERED 
	(
		point,
		date
	)   ;

                                                                                                                                                                                                                                                                 
/*----Income------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Income values(1,1,'2001-03-22 00:00:00',15000.00);
insert into Income values(2,1,'2001-03-23 00:00:00',15000.00);
insert into Income values(3,1,'2001-03-24 00:00:00',3600.00);
insert into Income values(4,2,'2001-03-22 00:00:00',10000.00);
insert into Income values(5,2,'2001-03-24 00:00:00',1500.00);
insert into Income values(6,1,'2001-04-13 00:00:00',5000.00);
insert into Income values(7,1,'2001-05-11 00:00:00',4500.00);
insert into Income values(8,1,'2001-03-22 00:00:00',15000.00);
insert into Income values(9,2,'2001-03-24 00:00:00',1500.00);
insert into Income values(10,1,'2001-04-13 00:00:00',5000.00);
insert into Income values(11,1,'2001-03-24 00:00:00',3400.00);
insert into Income values(12,3,'2001-09-13 00:00:00',1350.00);
insert into Income values(13,3,'2001-09-13 00:00:00',1750.00);



                                                                                                                                                                                                                                                                 
/* Outcome */
insert into Outcome values(1,1,'2001-03-14 00:00:00',15348.00);
insert into Outcome values(2,1,'2001-03-24 00:00:00',3663.00);
insert into Outcome values(3,1,'2001-03-26 00:00:00',1221.00);
insert into Outcome values(4,1,'2001-03-28 00:00:00',2075.00);
insert into Outcome values(5,1,'2001-03-29 00:00:00',2004.00);
insert into Outcome values(6,1,'2001-04-11 00:00:00',3195.04);
insert into Outcome values(7,1,'2001-04-13 00:00:00',4490.00);
insert into Outcome values(8,1,'2001-04-27 00:00:00',3110.00);
insert into Outcome values(9,1,'2001-05-11 00:00:00',2530.00);
insert into Outcome values(10,2,'2001-03-22 00:00:00',1440.00);
insert into Outcome values(11,2,'2001-03-29 00:00:00',7848.00);
insert into Outcome values(12,2,'2001-04-02 00:00:00',2040.00);
insert into Outcome values(13,1,'2001-03-24 00:00:00',3500.00);
insert into Outcome values(14,2,'2001-03-22 00:00:00',1440.00);
insert into Outcome values(15,1,'2001-03-29 00:00:00',2006.00);
insert into Outcome values(16,3,'2001-09-13 00:00:00',1200.00);
insert into Outcome values(17,3,'2001-09-13 00:00:00',1500.00);
insert into Outcome values(18,3,'2001-09-14 00:00:00',1150.00);



                                                                                                                                                                                                                                                                 
/* Income_o */
insert into Income_o values(1,'2001-03-22 00:00:00',15000.00);
insert into Income_o values(1,'2001-03-23 00:00:00',15000.00);
insert into Income_o values(1,'2001-03-24 00:00:00',3400.00);
insert into Income_o values(1,'2001-04-13 00:00:00',5000.00);
insert into Income_o values(1,'2001-05-11 00:00:00',4500.00);
insert into Income_o values(2,'2001-03-22 00:00:00',10000.00);
insert into Income_o values(2,'2001-03-24 00:00:00',1500.00);
insert into Income_o values(3,'2001-09-13 00:00:00',11500.00);
insert into Income_o values(3,'2001-10-02 00:00:00',18000.00);

                                                                                                                                                                                                                                                                 
/* Outcome_o  */
insert into Outcome_o values(1,'2001-03-14 00:00:00',15348.00);
insert into Outcome_o values(1,'2001-03-24 00:00:00',3663.00);
insert into Outcome_o values(1,'2001-03-26 00:00:00',1221.00);
insert into Outcome_o values(1,'2001-03-28 00:00:00',2075.00);
insert into Outcome_o values(1,'2001-03-29 00:00:00',2004.00);
insert into Outcome_o values(1,'2001-04-11 00:00:00',3195.04);
insert into Outcome_o values(1,'2001-04-13 00:00:00',4490.00);
insert into Outcome_o values(1,'2001-04-27 00:00:00',3110.00);
insert into Outcome_o values(1,'2001-05-11 00:00:00',2530.00);
insert into Outcome_o values(2,'2001-03-22 00:00:00',1440.00);
insert into Outcome_o values(2,'2001-03-29 00:00:00',7848.00);
insert into Outcome_o values(2,'2001-04-02 00:00:00',2040.00);
insert into Outcome_o values(3,'2001-09-13 00:00:00',1500.00);
insert into Outcome_o values(3,'2001-09-14 00:00:00',2300.00);
insert into Outcome_o values(3,'2002-09-16 00:00:00',2150.00);
