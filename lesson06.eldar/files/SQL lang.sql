-- single line comment

/*
multi line comment
*/

/*
 To create a database in localhost named db1 and connect to it do the following:
 1. start the dbms.
 2. start ij.bat
 2. use  the connect command together with the database url and the create parameter:
 connect 'jdbc:derby://localhost:1527/db1;create=true';
 
 To connect to an existing database you can ommit the create parameter:
 connect 'jdbc:derby://localhost:1527/db1';
*/

-- select (read)
-- DML - Data Maipulation Language - (create, update, delete)
-- DDL - Data Definition Language - create, drop, truncate and alter tables





-- create a table
CREATE TABLE persons(id INTEGER, name VARCHAR(20), age INTEGER)
CREATE TABLE books(title VARCHAR(30) PRIMARY KEY, author VARCHAR(30), price FLOAT, publication DATE)

-- drop a table
DROP TABLE persons

-- alter table - add column
ALTER TABLE persons ADD height FLOAT

-- alter table - drop column
ALTER TABLE persons DROP COLUMN height

-- data manipulations
-- create
INSERT INTO persons values(101, 'Dani', 25)
INSERT INTO books values('Java 1', 'Eldar', 120.66, '2017-08-25')
INSERT INTO books values('Java 2', 'Eldar', 130.75, '2018-08-25')
INSERT INTO books values('Java 3', 'David', 120.75, '2019-03-01')
-- read
SELECT * FROM persons

-- alias and operations
select title, price, price * 0.9 as "discount price" from books
-- distict
select distinct author from books

-- between
select * from persons where age between 10 and 20
select * from persons where age not between 10 and 20

-- in
select * from persons where name in ('Dani', 'Avi')
select * from persons where name not in ('Dani', 'Avi')

-- top
select * from persons fetch first row only
select * from persons fetch next 3 rows only
select * from persons offset 2 rows fetch next 2 rows only
select * from persons order by id offset 2 rows fetch next 2 rows only
select * from persons order by id desc offset 2 rows fetch next 2 rows only

-- types
-- https://docs.oracle.com/cd/E19501-01/819-3659/gcmaz/
-- https://db.apache.org/derby/docs/10.5/ref/crefsqlj31068.html







-- =============================
-- constraints
-- create a parent table with a primary key:

-- syntax option 1
CREATE TABLE customers(
customer_id INTEGER GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
customer_name VARCHAR(20) UNIQUE NOT NULL, 
customer_age INTEGER NOT NULL, 
PRIMARY KEY(customer_id)
)

-- syntax option 2
CREATE TABLE customers(
customer_id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
customer_name VARCHAR(20) UNIQUE NOT NULL, 
customer_age INTEGER NOT NULL
)

-- to insert records do not specify the auto generated field
INSERT INTO customers(customer_name, customer_age) VALUES('Dan', 36)

/* create a child table with a primary key and foreign key which references the PK in the parent table */
-- syntax option 1
CREATE TABLE orders(
order_id INTEGER GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
order_number INTEGER NOT NULL, 
customer_id INTEGER, 
PRIMARY KEY(order_id), 
FOREIGN KEY(customer_id) REFERENCES customers(customer_id)
)

-- to insert records do not specify the auto generated field
INSERT INTO orders(order_number, customer_id) VALUES(736, 1)

-- syntax option 2
CREATE TABLE orders(
order_id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
order_number INTEGER NOT NULL, 
customer_id INTEGER REFERENCES customers(id))

-- JOIN
-- inner join
SELECT orders.order_id, customers.customer_name FROM orders INNER JOIN customers ON orders.customer_id=customers.customer_id
select customers.customer_id, customers.customer_name, orders.* from customers inner join orders on customers.customer_id=orders.customer_id;


create table company(id int primary key, name varchar(25))
create table customer(id int primary key, name varchar(25))
create table coupon(id int primary key, name varchar(25))
create table company_coupon(company_id int REFERENCES company(id), coupon_id int REFERENCES coupon(id), primary key(company_id, coupon_id))
create table customer_coupon(customer_id int REFERENCES customer(id), coupon_id int REFERENCES coupon(id), primary key(customer_id, coupon_id))

-- check constraint

-- create a table with a constraint
CREATE TABLE persons(id INTEGER, name VARCHAR(20), age INTEGER CHECK(age>=0 && age<=120))
-- add a named constraint
ALTER TABLE persons ADD CONSTRAINT CHK_age CHECK (age>=18)
-- drop a named constraint
ALTER TABLE persons DROP CONSTRAINT CHK_age
-- add an unnamed constraint
ALTER TABLE persons ADD CHECK (age>=18)

-- default constraint
CREATE TABLE persons(id INTEGER, name VARCHAR(20), age INTEGER DEFAULT 18)

-- auto increment
CREATE TABLE persons(id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1) , name VARCHAR(20), age INTEGER DEFAULT 18)



-- auto commit
autocommit off
autocommit on
rollback
commit

