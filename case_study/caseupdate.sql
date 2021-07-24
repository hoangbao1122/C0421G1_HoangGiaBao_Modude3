drop database if exists quan_li_furama;
create database quan_li_furama;
use quan_li_furama;
create table vi_tri(
	id_vi_tri int auto_increment primary key,
        ten_vi_tri varchar(20)
);
create table trinh_do(
	id_trinh_do  int auto_increment primary key ,
        trinh_do varchar(20)
);
create table bo_phan(
	id_bo_phan int auto_increment primary key,
        ten_bo_phan varchar(45)
);
create table nhan_vien(
	id_nhan_vien int not null auto_increment primary key,
        ho_ten varchar(50) not null,
        id_vi_tri int,
        id_trinh_do int,
        id_bo_phan int,
        ngay_sinh date not null,
        so_cmnd varchar(9),
        luong varchar(20),
        sdt varchar(10),
        email varchar(50),
        dia_chi varchar(50),
        foreign key(id_vi_tri)
        references vi_tri(id_vi_tri),
        foreign key(id_trinh_do)
        references trinh_do(id_trinh_do),
        foreign key (id_bo_phan)
        references bo_phan(id_bo_phan)
);
create table loai_khach(
	id_loai_khach int not null  primary key,
        ten_loai_khach varchar(20) not null
);
create table khach_hang(
	id_khach_hang int not null  primary key,
        id_loai_khach int not null,
        ho_ten varchar(20) not null,
	ngay_sinh date not null,
        so_cmnd varchar(9) not null,  
        sdt varchar(10) not null,
        email varchar(50) not null,
        dia_chi varchar(50) not null,
        
        foreign key (id_loai_khach)
        references loai_khach(id_loai_khach)
);
create table kieu_thue(
	id_kieu_thue int   primary key,
        ten_kieu_thue varchar(50) not null,
        gia int not null
  
);
create table loai_dich_vu(
	id_loai_dich_vu int primary key,
        ten_loai_dich_vu varchar(50)
);
create table dich_vu(
	id_dich_vu int not null primary key,
        ten_dich_vu varchar(50) not null,
        dien_tich int not null,
        so_tang int not null,
        so_nguoi_toi_da int not null,
        chi_phi_thue int not null,
        id_kieu_thue int not null,
        id_loai_dich_vu int not null,
        trang_thai varchar(50),
        foreign key(id_kieu_thue)
        references kieu_thue(id_kieu_thue),
        foreign key(id_loai_dich_vu)
        references loai_dich_vu(id_loai_dich_vu)

);
create table hop_dong(
	id_hop_dong int not null primary key,
        id_nhan_vien int not null,
        id_khach_hang int not null,
        id_dich_vu int not null,
        ngay_lam_hop_dong date not null,
        ngay_ket_thuc date not null,
        tien_dat_coc int not null,
	foreign key(id_nhan_vien)
        references nhan_vien(id_nhan_vien),
        
        foreign key(id_khach_hang)
        references khach_hang(id_khach_hang),
        
        foreign key(id_dich_vu)
        references dich_vu(id_dich_vu)
        
);
create table dich_vu_di_kem(
	id_dich_vu_di_kem int primary key,
        ten_dich_vu_di_kem varchar(50),
        gia int,
        don_vi varchar(50),
        trang_thai_kha_dung varchar(50)
);
create table hop_dong_chi_tiet(
	id_hop_dong_chi_tiet int primary key,
        id_hop_dong int not null,
        id_dich_vu_di_kem int not null,
        so_luong int,
        foreign key(id_hop_dong)
        references hop_dong(id_hop_dong),
        foreign key(id_dich_vu_di_kem)
        references dich_vu_di_kem(id_dich_vu_di_kem)
);

insert into vi_tri
value (1,'giam doc'),
	(2,'bao ve'),
        (3,'chu tich');
insert into trinh_do
value(1,'Trung cap'),
(2,'cao dang'),
(3,'dai hoc');
insert into bo_phan
value(1,'quan li '),
(2,'nhan vien lao cong'),
(3,'nhan viên');

insert into nhan_vien
value(1,'bao',1,1,1,'2000/11/23','123456789','10 củ','123456789','bao@gmail.com','da nang'),
(2,'gia',2,2,2,'2000/10/23','123456789','20 củ','123456789','giabao@gmail.com','da nang'),
(3,'hoang',3,3,3,'2000/10/23','123456789','20 củ','123456789','giabao@gmail.com','da nang');
insert into loai_khach
value(1,'Diamond'),
(2,'Gold'),
(3,'Silva');


insert into khach_hang
value(1,1,'bao','2000-11-10','123456789','0123456789','hoangbaoasd@gmail.com','vinh'),
(2,2,'hoang','1988-1-10','201456789','7894561','bao@gmail.com','da nang'),
(3,3,'gia','1999-2-10','201456789','75123365','gia@gmail.com','quang binh');


insert into kieu_thue
value(1,'thuê full',100),
(2,'thuê 1 phần',200),
(3,'thuê ',300);
insert into loai_dich_vu
value(1,'null'),
(2,'null'),
(3,'null');


insert into dich_vu
value(1,'Villa',400,2,10,1000000 ,1,1,'còn'),
(2,'Home',400,2,10,3000000 ,2,2,'còn'),
(3,'Room',400,2,10,3000000 ,3,3,'còn');

insert into hop_dong
value(1,1,1,1,'2012-7-20','2012-7-25',10000000),
(2,2,2,2,'2012-10-25','2012-10-30',10000000),
(3,3,3,3,'2018-10-25','2012-10-30',10000000);


insert into dich_vu_di_kem
value(1,'thêm kẹo',1000000,1,'còn hàng'),
(2,'thêm bánh',10000000,1,'còn hàng'),
(3,'thêm cơm',10000000,1,'còn hàng');

insert into hop_dong_chi_tiet
value (1,1,1,1),
(2,2,2,2),
(3,3,3,3),
(4,1,1,1);


-- 2
select * 
from nhan_vien
where `ho_ten` Like 'h%' or 'g%' or 'b%' and length(`ho_ten`)<16;
-- 3
select *
from khach_hang
where (year(curdate()) - year(ngay_sinh)) between 18 and 50 and (khach_hang.dia_chi = 'da nang' or 'quang tri');


-- 4 
select hop_dong.id_hop_dong,hop_dong.id_khach_hang, h.so_luong,kh.ho_ten,l.ten_loai_khach
from hop_dong 
left join hop_dong_chi_tiet h on h.id_hop_dong = hop_dong .id_hop_dong 
inner join khach_hang kh on kh.id_khach_hang =  hop_dong.id_khach_hang
inner join loai_khach l on kh.id_loai_khach = l.id_loai_khach
where l.ten_loai_khach = 'Diamond'
order by h.so_luong asc;

  --       5
 select khach_hang.id_khach_hang,khach_hang.ho_ten,loai_khach.ten_loai_khach,hop_dong.id_hop_dong,dich_vu.ten_dich_vu,hop_dong.ngay_lam_hop_dong,hop_dong.ngay_ket_thuc,sum(dich_vu.chi_phi_thue +hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia ) as total
 from khach_hang
  inner join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
  inner join hop_dong on khach_hang.id_khach_hang = hop_dong.id_khach_hang
  inner join dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu 
  inner join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
  inner join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
group by khach_hang.id_khach_hang;
-- 6 
-- 
select d.id_dich_vu,d.ten_dich_vu,d.dien_tich,d.chi_phi_thue,l.ten_loai_dich_vu,h.ngay_lam_hop_dong
from dich_vu d
inner join loai_dich_vu l on d.id_loai_dich_vu = l.id_loai_dich_vu
inner join hop_dong h on d.id_dich_vu = h.id_dich_vu
where month(h.ngay_lam_hop_dong)  not in (1 or 2 or 3) ;

-- 7 
select d.id_dich_vu,d.ten_dich_vu,d.dien_tich,d.so_nguoi_toi_da,d.chi_phi_thue,l.ten_loai_dich_vu
from dich_vu d
inner join loai_dich_vu l on l.id_loai_dich_vu = d.id_loai_dich_vu 
inner join hop_dong h on h.id_dich_vu = d.id_dich_vu
where year(h.ngay_lam_hop_dong) = 2018;

-- 8 
select distinct h.ho_ten
from khach_hang h;

-- 9
-- 10
select h.id_hop_dong,h.ngay_lam_hop_dong,h.ngay_ket_thuc,h.tien_dat_coc,hop_dong_chi_tiet.so_luong,count(hop_dong_chi_tiet.id_hop_dong) as so_lan_su_dung
from hop_dong h 
inner join hop_dong_chi_tiet on h.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
group by h.id_hop_dong;

-- 11
select loai.ten_loai_khach,kh.dia_chi
from  hop_dong h
inner join khach_hang kh on kh.id_khach_hang = h.id_khach_hang
inner join  loai_khach loai on loai.id_loai_khach = kh.id_khach_hang  
where loai.ten_loai_khach = 'Diamond' and  kh.dia_chi = 'vinh' or 'quang ngai'

-- 12
