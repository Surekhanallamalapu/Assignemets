create database Student;
use Student;
create table Student(StudentName varchar(20), StudentId int primary key ,Department varchar(20));
insert into Student values('vinay',1,'Systemengineer');
insert into Student values('lukky',2,'developer');
insert into Student values('bharat',3,'software enginner');
insert into Student values('ram',4,'architect');
insert into Student values('suma',5,'Testing');
insert into Student values('anjali',6,'hr');
insert into Student values('kiran',7,'cloudarchitect');
insert into Student values('chinna',8,'software developer');
insert into Student values('hamsa',9,'testing');
insert into Student values('arjun',10,'developer');
select* from Student;
alter table Student add column city varchar(20);
update Student set city='Banglore' where StudentId>5;
update Student set city='Manglore' where StudentId=3;
update Student set city='Mysore' where StudentId=4;
update Student set city='Banglore' where StudentId<=2;
update Student set city='Mysore' where StudentId=5;
alter table Student add column Course varchar(20) not null default 'Java';
alter table Student add column Mystate integer;
alter table Student modify Mystate varchar(20);
alter table Student change Mystate state varchar(20);
alter table Student add column Zipcode integer;

update Student set Course='Angular' where StudentId<3;
update Student set Course='Spring' where StudentId>3 and StudentId<8;

select * from Student order by StudentName;
Alter table Student drop column Zipcode;
select distinct Course from Student;
select StudentName as Stud_name,StudentId as Stud_id,city as Stud_city,Department as Stud_department,Course as Stud_course,state as Stud_state from student;

 