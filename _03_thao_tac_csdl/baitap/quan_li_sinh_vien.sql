drop database if exists QuanLySinhVien;
CREATE DATABASE QuanLySinhVien;
USE QuanLySinhVien;
CREATE TABLE Class
(
    ClassID   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ClassName VARCHAR(60) NOT NULL,
    StartDate date    NOT NULL,
    Status    BIT
);
CREATE TABLE Student
(
    StudentId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    StudentName VARCHAR(30) NOT NULL,
    Address     VARCHAR(50),
    Phone       VARCHAR(20),
    Status      BIT,
    ClassId     INT         NOT NULL,
    FOREIGN KEY (ClassId) REFERENCES Class (ClassID)
);
CREATE TABLE `Subject`
(
    SubId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubName VARCHAR(30) NOT NULL,
    Credit  TINYINT     NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
    Status  BIT                  DEFAULT 1
);

CREATE TABLE Mark
(
    MarkId    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubId     INT NOT NULL,
    StudentId INT NOT NULL,
    Mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    UNIQUE (SubId, StudentId),
    FOREIGN KEY (SubId) REFERENCES Subject (SubId),
    FOREIGN KEY (StudentId) REFERENCES Student (StudentId)
);
insert into class
value (1,'C04','2021/7/21',1),
(2,'C04','2021/12/22',1),
(3,'C04','2021/10/21',1);
insert into Student
value (1,'hoang','da_nang','123456789',1,1),
	(2,'bao','da_nang','123456789',1,1),
	(3,'hung','da_nang','123456789',1,1);
insert into `Subject`
value (1,'bao',1,1),
 (2,'gia',7,1),
 (3,'hoang',8,1);

insert into mark
value(1,1,1,100,1),
(2,2,2,90,1),
(3,3,3,80,1);

select * 
from  student
where StudentName like 'h%'; -- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’

select * 
from class
where StartDate > '2021/12/1'; -- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12

select * 
from `Subject`
where Credit between 3 and 10  ; -- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.

update student
set ClassId = 2
where StudentName = 'hung'; -- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.



select StudentName,SubName ,mark
from mark 
inner join Student  on Student.StudentId = mark.StudentId
inner join `Subject` on `Subject`.SubId = Mark.SubId
order by Mark.mark asc;

