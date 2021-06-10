/*
drop table outcomes;
drop table ships;
drop table classes;
drop table battles;
*/

CREATE TABLE Battles (
	name varchar (20) NOT NULL ,
	date datetime NOT NULL 
);


CREATE TABLE Classes (
	class varchar (50) NOT NULL ,
	type varchar (2) NOT NULL ,
	country varchar (20) NOT NULL ,
	numGuns tinyint NULL ,
	bore real NULL ,
	displacement int NULL 
); 


CREATE TABLE Ships (
	name varchar (50) NOT NULL ,
	class varchar (50) NOT NULL ,
	launched smallint NULL 
); 


CREATE TABLE Outcomes (
	ship varchar (50) NOT NULL ,
	battle varchar (20) NOT NULL ,
	result varchar (10) NOT NULL 
); 


ALTER TABLE Battles ADD 
	CONSTRAINT PK_Battles PRIMARY KEY  CLUSTERED 
	(
		name
	)   ;


ALTER TABLE Classes ADD 
	CONSTRAINT PK_Classes PRIMARY KEY  CLUSTERED 
	(
		class
	)   ;


ALTER TABLE Ships ADD 
	CONSTRAINT PK_Ships PRIMARY KEY  CLUSTERED 
	(
		name
	)   ;


ALTER TABLE Outcomes ADD 
	CONSTRAINT PK_Outcomes PRIMARY KEY  CLUSTERED 
	(
		ship,
		battle
	)   ;


ALTER TABLE Ships ADD 
	CONSTRAINT FK_Ships_Classes FOREIGN KEY 
	(
		class
	) REFERENCES Classes (
		class
	) ;


ALTER TABLE Outcomes ADD 
	CONSTRAINT FK_Outcomes_Battles FOREIGN KEY 
	(
		battle
	) REFERENCES Battles (
		name
	);

                                                                                                                                                                                                                                                               
/*----Classes------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Classes values('Bismarck','bb','Germany',8,15,42000);
insert into Classes values('Iowa','bb','USA',9,16,46000);
insert into Classes values('Kongo','bc','Japan',8,14,32000);
insert into Classes values('North Carolina','bb','USA',12,16,37000);
insert into Classes values('Renown','bc','Gt.Britain',6,15,32000);
insert into Classes values('Revenge','bb','Gt.Britain',8,15,29000);
insert into Classes values('Tennessee','bb','USA',12,14,32000);
insert into Classes values('Yamato','bb','Japan',9,18,65000);



                                                                                                                                                                                                                                                                 
/*----Battles------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Battles values('Guadalcanal','1942-11-15 00:00:00');
insert into Battles values('North Atlantic','1941-05-25 00:00:00');
insert into Battles values('North Cape','1943-12-26 00:00:00');
insert into Battles values('Surigao Strait','1944-10-25 00:00:00');
insert into Battles values ('#Cuba62a'   , '1962-10-20');
insert into Battles values ('#Cuba62b'   , '1962-10-25');



                                                                                                                                                                                                                                                                 
/*----Ships------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Ships values('California','Tennessee',1921);
insert into Ships values('Haruna','Kongo',1916);
insert into Ships values('Hiei','Kongo',1914);
insert into Ships values('Iowa','Iowa',1943);
insert into Ships values('Kirishima','Kongo',1915);
insert into Ships values('Kongo','Kongo',1913);
insert into Ships values('Missouri','Iowa',1944);
insert into Ships values('Musashi','Yamato',1942);
insert into Ships values('New Jersey','Iowa',1943);
insert into Ships values('North Carolina','North Carolina',1941);
insert into Ships values('Ramillies','Revenge',1917);
insert into Ships values('Renown','Renown',1916);
insert into Ships values('Repulse','Renown',1916);
insert into Ships values('Resolution','Renown',1916);
insert into Ships values('Revenge','Revenge',1916);
insert into Ships values('Royal Oak','Revenge',1916);
insert into Ships values('Royal Sovereign','Revenge',1916);
insert into Ships values('Tennessee','Tennessee',1920);
insert into Ships values('Washington','North Carolina',1941);
insert into Ships values('Wisconsin','Iowa',1944);
insert into Ships values('Yamato','Yamato',1941);
insert into Ships values('South Dakota','North Carolina',1941); 


                                                                                                                                                                                                                                                         
/*----Outcomes------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */
insert into Outcomes values('Bismarck','North Atlantic','sunk');
insert into Outcomes values('California','Surigao Strait','OK');
insert into Outcomes values('Duke of York','North Cape','OK');
insert into Outcomes values('Fuso','Surigao Strait','sunk');
insert into Outcomes values('Hood','North Atlantic','sunk');
insert into Outcomes values('King George V','North Atlantic','OK');
insert into Outcomes values('Kirishima','Guadalcanal','sunk');
insert into Outcomes values('Prince of Wales','North Atlantic','damaged');
insert into Outcomes values('Rodney','North Atlantic','OK');
insert into Outcomes values('Schamhorst','North Cape','sunk');
insert into Outcomes values('South Dakota','Guadalcanal','damaged');
insert into Outcomes values('Tennessee','Surigao Strait','OK');
insert into Outcomes values('Washington','Guadalcanal','OK');
insert into Outcomes values('West Virginia','Surigao Strait','OK');
insert into Outcomes values('Yamashiro','Surigao Strait','sunk');
insert into Outcomes values('California','Guadalcanal','damaged');


