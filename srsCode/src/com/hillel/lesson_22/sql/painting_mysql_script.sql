CREATE TABLE utB (
	B_DATETIME datetime NOT NULL ,
	B_Q_ID int NOT NULL ,
	B_V_ID int NOT NULL ,
	B_VOL tinyint UNSIGNED NOT NULL 
); 


CREATE TABLE utQ (
	Q_ID int NOT NULL ,
	Q_NAME varchar (35) NOT NULL 
); 


CREATE TABLE utV (
	V_ID int NOT NULL ,
	V_NAME varchar (35) NOT NULL ,
	V_COLOR char (1) NOT NULL 
); 


ALTER TABLE utB  ADD 
	CONSTRAINT PK_utB PRIMARY KEY  NONCLUSTERED 
	(
		B_DATETIME,
		B_Q_ID,
		B_V_ID
	);   


ALTER TABLE utQ  ADD 
	CONSTRAINT PK_utQ PRIMARY KEY  NONCLUSTERED 
	(
		Q_ID
	);   


ALTER TABLE utV  ADD 
	CONSTRAINT PK_utV PRIMARY KEY  NONCLUSTERED 
	(
		V_ID
	);   


ALTER TABLE utB ADD 
	CONSTRAINT FK_utB_utQ FOREIGN KEY 
	(
		B_Q_ID
	) REFERENCES utQ (
		Q_ID
	);
    
ALTER TABLE utB ADD 
	CONSTRAINT FK_utB_utV FOREIGN KEY 
	(
		B_V_ID
	) REFERENCES utV (
		V_ID
	);

                                                                                                                                                                                                                                                                
/*----utQ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into utQ values(1,'Square # 01');
insert into utQ values(2,'Square # 02');
insert into utQ values(3,'Square # 03');
insert into utQ values(4,'Square # 04');
insert into utQ values(5,'Square # 05');
insert into utQ values(6,'Square # 06');
insert into utQ values(7,'Square # 07');
insert into utQ values(8,'Square # 08');
insert into utQ values(9,'Square # 09');
insert into utQ values(10,'Square # 10');
insert into utQ values(11,'Square # 11');
insert into utQ values(12,'Square # 12');
insert into utQ values(13,'Square # 13');
insert into utQ values(14,'Square # 14');
insert into utQ values(15,'Square # 15');
insert into utQ values(16,'Square # 16');
insert into utQ values(17,'Square # 17');
insert into utQ values(18,'Square # 18');
insert into utQ values(19,'Square # 19');
insert into utQ values(20,'Square # 20');
insert into utQ values(21,'Square # 21');
insert into utQ values(22,'Square # 22');
insert into utQ values(23,'Square # 23');
insert into utQ values(25,'Square # 25');


                                                                                                                                                                                                                                                                
/*----utV------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into utV values(1,'Balloon # 01','R');
insert into utV values(2,'Balloon # 02','R');
insert into utV values(3,'Balloon # 03','R');
insert into utV values(4,'Balloon # 04','G');
insert into utV values(5,'Balloon # 05','G');
insert into utV values(6,'Balloon # 06','G');
insert into utV values(7,'Balloon # 07','B');
insert into utV values(8,'Balloon # 08','B');
insert into utV values(9,'Balloon # 09','B');
insert into utV values(10,'Balloon # 10','R');
insert into utV values(11,'Balloon # 11','R');
insert into utV values(12,'Balloon # 12','R');
insert into utV values(13,'Balloon # 13','G');
insert into utV values(14,'Balloon # 14','G');
insert into utV values(15,'Balloon # 15','B');
insert into utV values(16,'Balloon # 16','B');
insert into utV values(17,'Balloon # 17','R');
insert into utV values(18,'Balloon # 18','G');
insert into utV values(19,'Balloon # 19','B');
insert into utV values(20,'Balloon # 20','R');
insert into utV values(21,'Balloon # 21','G');
insert into utV values(22,'Balloon # 22','B');
insert into utV values(23,'Balloon # 23','R');
insert into utV values(24,'Balloon # 24','G');
insert into utV values(25,'Balloon # 25','B');
insert into utV values(26,'Balloon # 26','B');
insert into utV values(27,'Balloon # 27','R');
insert into utV values(28,'Balloon # 28','G');
insert into utV values(29,'Balloon # 29','R');
insert into utV values(30,'Balloon # 30','G');
insert into utV values(31,'Balloon # 31','R');
insert into utV values(32,'Balloon # 32','G');
insert into utV values(33,'Balloon # 33','B');
insert into utV values(34,'Balloon # 34','R');
insert into utV values(35,'Balloon # 35','G');
insert into utV values(36,'Balloon # 36','B');
insert into utV values(37,'Balloon # 37','R');
insert into utV values(38,'Balloon # 38','G');
insert into utV values(39,'Balloon # 39','B');
insert into utV values(40,'Balloon # 40','R');
insert into utV values(41,'Balloon # 41','R');
insert into utV values(42,'Balloon # 42','G');
insert into utV values(43,'Balloon # 43','B');
insert into utV values(44,'Balloon # 44','R');
insert into utV values(45,'Balloon # 45','G');
insert into utV values(46,'Balloon # 46','B');
insert into utV values(47,'Balloon # 47','B');
insert into utV values(48,'Balloon # 48','G');
insert into utV values(49,'Balloon # 49','R');
insert into utV values(50,'Balloon # 50','G');
insert into utV values(51,'Balloon # 51','B');
insert into utV values(52,'Balloon # 52','R');
insert into utV values(53,'Balloon # 53','G');
insert into utV values(54,'Balloon # 54','B');
                                                                                                                                                                                                                                                                 
/*----utB------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into utB values('2003-01-01 01:12:01',1,1,155);
insert into utB values('2003-06-23 01:12:02',1,1,100);
insert into utB values('2003-01-01 01:12:03',2,2,255);
insert into utB values('2003-01-01 01:12:04',3,3,255);
insert into utB values('2003-01-01 01:12:05',1,4,255);
insert into utB values('2003-01-01 01:12:06',2,5,255);
insert into utB values('2003-01-01 01:12:07',3,6,255);
insert into utB values('2003-01-01 01:12:08',1,7,255);
insert into utB values('2003-01-01 01:12:09',2,8,255);
insert into utB values('2003-01-01 01:12:10',3,9,255);
insert into utB values('2003-01-01 01:12:11',4,10,50);
insert into utB values('2003-01-01 01:12:12',5,11,100);
insert into utB values('2003-01-01 01:12:13',5,12,155);
insert into utB values('2003-01-01 01:12:14',5,13,155);
insert into utB values('2003-01-01 01:12:15',5,14,100);
insert into utB values('2003-01-01 01:12:16',5,15,50);
insert into utB values('2003-01-01 01:12:17',5,16,205);
insert into utB values('2003-01-01 01:12:18',6,10,155);
insert into utB values('2003-01-01 01:12:19',6,17,100);
insert into utB values('2003-01-01 01:12:20',6,18,255);
insert into utB values('2003-01-01 01:12:21',6,19,255);
insert into utB values('2003-01-01 01:12:22',7,17,155);
insert into utB values('2003-01-01 01:12:23',7,20,100);
insert into utB values('2003-01-01 01:12:24',7,21,255);
insert into utB values('2003-01-01 01:12:25',7,22,255);
insert into utB values('2003-01-01 01:12:26',8,10,50);
insert into utB values('2003-01-01 01:12:27',9,23,255);
insert into utB values('2003-01-01 01:12:28',9,24,255);
insert into utB values('2003-01-01 01:12:29',9,25,100);
insert into utB values('2003-01-01 01:12:30',9,26,155);
insert into utB values('2003-01-01 01:12:31',10,25,155);
insert into utB values('2003-01-01 01:12:31',10,26,100);
insert into utB values('2003-01-01 01:12:33',10,27,10);
insert into utB values('2003-01-01 01:12:34',10,28,10);
insert into utB values('2003-01-01 01:12:35',10,29,245);
insert into utB values('2003-01-01 01:12:36',10,30,245);
insert into utB values('2003-01-01 01:12:37',11,31,100);
insert into utB values('2003-01-01 01:12:38',11,32,100);
insert into utB values('2003-01-01 01:12:39',11,33,100);
insert into utB values('2003-01-01 01:12:40',11,34,155);
insert into utB values('2003-01-01 01:12:41',11,35,155);
insert into utB values('2003-01-01 01:12:42',11,36,155);
insert into utB values('2003-01-01 01:12:43',12,31,155);
insert into utB values('2003-01-01 01:12:44',12,32,155);
insert into utB values('2003-01-01 01:12:45',12,33,155);
insert into utB values('2003-01-01 01:12:46',12,34,100);
insert into utB values('2003-01-01 01:12:47',12,35,100);
insert into utB values('2003-01-01 01:12:48',12,36,100);
insert into utB values('2003-01-01 01:13:01',4,37,20);
insert into utB values('2003-01-01 01:13:02',8,38,20);
insert into utB values('2003-01-01 01:13:03',13,39,123);
insert into utB values('2003-01-01 01:13:04',14,39,111);
insert into utB values('2003-01-01 01:13:05',14,40,50);
insert into utB values('2003-01-01 01:13:06',15,41,50);
insert into utB values('2003-01-01 01:13:07',15,41,50);
insert into utB values('2003-01-01 01:13:08',15,42,50);
insert into utB values('2003-01-01 01:13:09',15,42,50);
insert into utB values('2003-01-01 01:13:10',16,42,50);
insert into utB values('2003-01-01 01:13:11',16,42,50);
insert into utB values('2003-01-01 01:13:12',16,43,50);
insert into utB values('2003-01-01 01:13:13',16,43,50);
insert into utB values('2003-01-01 01:13:14',16,47,50);
insert into utB values('2003-01-01 01:13:15',17,44,10);
insert into utB values('2003-01-01 01:13:16',17,44,10);
insert into utB values('2003-01-01 01:13:17',17,45,10);
insert into utB values('2003-01-01 01:13:18',17,45,10);
insert into utB values('2003-02-01 01:13:19',18,45,10);
insert into utB values('2003-03-01 01:13:20',18,45,10);
insert into utB values('2003-04-01 01:13:21',18,46,10);
insert into utB values('2003-05-01 01:13:22',18,46,10);
insert into utB values('2003-06-11 01:13:23',19,44,10);
insert into utB values('2003-01-01 01:13:24',19,44,10);
insert into utB values('2003-01-01 01:13:25',19,45,10);
insert into utB values('2003-01-01 01:13:26',19,45,10);
insert into utB values('2003-02-01 01:13:27',20,45,10);
insert into utB values('2003-03-01 01:13:28',20,45,10);
insert into utB values('2003-04-01 01:13:29',20,46,10);
insert into utB values('2003-05-01 01:13:30',20,46,10);
insert into utB values('2003-02-01 01:13:31',21,49,50);
insert into utB values('2003-02-02 01:13:32',21,49,50);
insert into utB values('2003-02-03 01:13:33',21,50,50);
insert into utB values('2003-02-04 01:13:34',21,50,50);
insert into utB values('2003-02-05 01:13:35',21,48,1);
insert into utB values('2000-01-01 01:13:36',22,50,50);
insert into utB values('2001-01-01 01:13:37',22,50,50);
insert into utB values('2002-01-01 01:13:38',22,51,50);
insert into utB values('2002-06-01 01:13:39',22,51,50);
insert into utB values('2003-01-01 01:13:05',4,37,185);




