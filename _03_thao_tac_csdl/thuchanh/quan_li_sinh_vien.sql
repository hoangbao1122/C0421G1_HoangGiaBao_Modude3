drop database  if exists quan_li_sinh_vien; 
create database quan_li_sinh_vien;
use quan_li_sinh_vien;
create table class(
	class_id int  auto_increment primary key,
        class_name varchar(50) not null,
        start_date date not null,
        `status` int not null
);
create table student(
	student_id int  auto_increment primary key,
        student_name varchar(50) not null,
        address varchar(50) not null,
        phone varchar(10) not null,
        `status` bit default 1,
        class_id int,
        foreign key (class_id)
        references class(class_id) 
);
create table `subject`(
	sub_id int auto_increment primary key  ,
        sub_name varchar(50) not null,
        credit tinyint default 1 check(credit >=1),
        `status` bit default 1 
        );
create table mark(
	mark_id int auto_increment primary key, 
        sub_id int ,
        student_id int,
        mark float default 0 check ( mark between 0 and 100),
        exam_time TINYINT default 1 ,
        foreign key (sub_id)
        references `subject`(sub_id),
        foreign key (student_id)
        references `student`(student_id)
	
);

insert into class
value(1,'a1','2000/11/23',1);
insert into class
value(2,'a2','2000/1/23',1);
insert into class
value(3,'a3','2000/2/23',1);

insert into student
value(1,'bao','da_nang','0123456789',1,1);
insert into student
value(2,'hoang','da_nang','0123456789',1,2);
insert into student
value(3,'gia','da_nang','0123456789',1,3);
insert into student
value(4,'nam','da_nang','0123456789',1,3);

insert into `subject`
value(1, 'CF', 5, 1),
	(2, 'C', 6, 1),
          (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
insert into mark (sub_id,student_id,mark,exam_time)
value(1,1,100,10),
	(2, 2, 10, 2),
        (3, 2, 5, 2),
       (4, 1, 12, 1);


select * 
from student
where `status` = true;

select * 
from `subject` 
where credit < 10;

select *
from student s
inner join class c on s.student_id = c.class_id ;

select * 
from student s
inner join class c on s.student_id = c.class_id
where c.class_name = 'a1';

select *  -- // hien thi ra mon hoc CF
from student s
inner join mark m on s.student_id = m.student_id join `subject` sub on m.sub_id = sub.sub_id;

select *  -- // hien thi ra mon hoc CF
from student s
inner join mark m on s.student_id = m.student_id join `subject` sub on m.sub_id = sub.sub_id
where sub.sub_name = 'cf';
