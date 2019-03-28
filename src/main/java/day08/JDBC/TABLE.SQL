create database test;
drop database if exists test;
use test;
create table test(
  num int auto_increment primary key ,
  name varchar(50) ,
  password long  not null
);
create database students;
select * from test;

drop table test;

show databases ;
select * from students.class;
drop database students;
drop database db_school;
insert into students.class values (null,'Class2','Jerry');

show full columns from students.class;
select * from scott.emp ;

update students.class set cname = 'Class3' where cname = 'Class2';