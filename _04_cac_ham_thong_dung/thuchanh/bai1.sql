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
(3,3,3,10,1);

select  Address,count(StudentId) as 'so luong hoc vien'
from Student
group by Address;

-- Bước 3: Tính điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG
select Student.StudentId,Student.StudentName,AVG(Mark)
from Student  join Mark  on Student.StudentId = Mark.StudentId
group by Student.StudentId,Student.StudentName;

--  Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
select Student.StudentId, Student.StudentName,AVG(Mark)
from Student join Mark on Student.StudentId = Mark.StudentId
group by Student.StudentId,Student.StudentName
Having avg (Mark)>15;

select Student.StudentId, Student.StudentName,AVG(Mark)
from Student join Mark on Student.StudentId = Mark.StudentId
group by Student.StudentId,Student.StudentName
Having avg (Mark) >= all (SELECT AVG(Mark) FROM Mark GROUP BY Mark.StudentId) ;

