drop  database if exists quanli_nguoidung;
create database quanli_nguoidung;
use quanli_nguoidung;
create table `user`(
	 id int primary key auto_increment,
	`name` varchar(50),
        `phone`varchar(11),
        `email`varchar(50),
        `address`varchar(50),
        `country` varchar(20)
);

insert into `user`
value(1,'Bảo','0123456789','hoangbaoasd@gmail.com','da_nang','Viet Nam');

insert into `user`
value(2,'Salah','987652311','baogia@gmail.com','Mĩ Tho','Mĩ');

insert into `user`
value(3,'KaKa','789541236','kaka@gmail.com','Rio','Barazill');

insert into `user`
value(4,'Hoàng','090512345','hoang@gmail.com','da_nang','Viet Nam');

select *
from `user`;

select id,name,phone,email,address,country
from user
where id = 1 ;

update `user`
set `name` = 'hoangbao' , `phone` = '0123456789',`email` = 'hoangboa',`address` = 'da_nang',`country` = 'aa'
where id = 1;

delete from `user` 
where id = 1;

select `id`,`name`,`phone`,`email`,`address`,`country`
from user
where country = 'Mĩ';

select id,name,phone,email,address,country
                    from `user` 
                    where country = 'Mĩ';
                    
                    
select `id`,`name`,phone,`email`,`address`,country
from `user`
order by `name` asc
