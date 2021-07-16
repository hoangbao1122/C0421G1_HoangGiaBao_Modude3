
use manager;

 create table student(
	`id` int,
    `name` varchar(50), 
    `address` varchar(50),
    `email` varchar(50),
    `date` date
);


insert into student
values(1,'bao','nguyen luong bang','hoangbaoasd@gmail.com','2000-11-23');

insert into student
values(2,'hoang','nguyen luong bang','hoang@gmail.com','200-11-25');

select * 
from student