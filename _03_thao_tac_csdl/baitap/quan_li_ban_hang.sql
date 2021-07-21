drop database if exists manager_ban_hang;
create database manager_ban_hang;
use manager_ban_hang;
create table customer(
	`c_id` int primary key,
        `c_name` varchar(50),
        `c_age` int
);
create table `order`(
	`o_id` int primary key,
        `c_id` int,
        `o_date` date,
        `o_total_price` varchar(50),
        
        foreign key(`c_id`)
        references customer(`c_id`)
);
create table product(
	p_id int primary key,
	p_name varchar(50),
        p_price varchar(20)
);
create table `order_detail`(
	o_id int primary key,
        p_id int ,
        od_qty varchar(50),
        foreign key (o_id)
        references `order`(o_id),
        
        foreign key (p_id)
        references product(p_id)
);

insert into customer
value (1,'Minh Quan',10),
	(2,'Hoang Bao',20),
        (3,'Bao Hoang',50);
insert into `order`
value(1,1,'2006/2/3','null'),   
(2,2,'2006/2/3','null'),  
(3,1,'2006/2/3','null');
insert into product   
value (1,'May Giat',3),
(2,'Quat',5),
(3,'Bep',7);
insert into order_detail
value(1,1,1),
(2,2,2);


-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select o_id,o_date,o_total_price	
from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select *
from `order`
inner join Customer on customer.c_id = `order`.c_id;   

--         Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select *
from Customer
left join `order` on Customer.c_id = `order`.c_id
where `order`.c_id is null ;

select  `order`.o_id ,`order`.o_date ,product.p_price ,sum(product.p_price) as o_total_price
from `order_detail`
inner join `order` on `order`.o_id = order_detail.o_id
inner join product on product.p_id = order_detail.p_id;
