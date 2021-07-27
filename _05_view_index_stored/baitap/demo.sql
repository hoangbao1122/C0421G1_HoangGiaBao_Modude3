DROP DATABASE IF EXISTS demo;

CREATE DATABASE demo;
USE demo;
CREATE TABLE products (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
        product_code VARCHAR(50),
	product_name VARCHAR(50),
	product_price DOUBLE,
	product_amount INT,
	product_description VARCHAR(50),
	product_status VARCHAR(50)
);

INSERT INTO products (product_code,product_name,product_price,product_amount,product_description,product_status)
VALUES ('M12', 'dien thoai', 300000, 2, 'dien thoai', 'còn hàng'),
		('M14', 'may giat', 10000, 0, 'may giat', 'hết hàng'),
        ('G12', 'di dong', 40000, 10, 'st', 'còn hàng'),
        ('S12', 'quat', 26000, 5, 'samsum', 'còn hàng');