create table customers (
customer_id varchar(10) primary key,
customer_name varchar(20),
address varchar(20),
phone_no bigint,
email_id varchar(20)
);

create table delivery_partners(
partner_id varchar(10) primary key,
partner_name varchar(20),
phone_no bigint,
rating int
);

create table hotel_details(
hotel_id varchar(10) primary key,
hotel_name varchar(20),
hotel_type varchar(20),
rating int
);

create table orders(
order_id varchar(10) primary key,
customer_id varchar(10),
hotel_id varchar(10),
partner_id varchar(10),
order_date date,
order_amount int,
foreign key (customer_id) references customers(customer_id),
foreign key (hotel_id) references hotel_details(hotel_id),
foreign key (partner_id) references delivery_partners(partner_id)
);

-- insert into customers (customer_id,customer_name,address,phone_no,email_id)
-- values
-- ('C001','Alice','123 Main St','9876543210','alice@gmail.com'),
-- ('C002','bob','123 Main road','9876543219','bob@gmail.com');
insert into Customers(customer_id,customer_name,address,phone_no,email_id)
values
('cust1001','thomas','kochi',9856325486,'thomas@gmail.com'),
('cust1002','charles','allepy',9856365486,'charles@gmail.com'),
('cust1003','sudhakar','kochi',9856323869,'sudhakar@gmail.com'),
('cust1004','jagadish','ernakulam',9856326666,'jagadish@gmail.com'),
('cust1005','albert','allepy',9856325489,'albert@gmail.com'),
('cust1006','ashwin','kannur',9856325670,'ashwin@gmail.com');

insert into delivery_partners(partner_id,partner_name,phone_no,rating)
values
('DP001','JHON',9876543210,4),
('DP002','JHN',9876543216,5),
('DP003','JHO',9876543214,3);

insert into hotel_details(hotel_id,hotel_name,hotel_type,rating)
values
('h001','The Taj','Laxury',5),
('h002','The queen','Budget',3);

insert into orders(order_id,customer_id,hotel_id,partner_id,order_date,order_amount)
values
('O001','C001','h001','DP001','2024-10-10',5000),
('O002','C002','h002','DP002','2024-10-11',4000);

SELECT partner_id,partner_name,phone_no
from delivery_partners
where rating between 3 and 5
order by partner_id;

update Customers
set phone_no = 9876543210
where customer_id = 'cust1004'

select * from customers 
where customer_id = 'cust1004'

select customer_id, customer_name,address,phone_no
from Customers
where email_id like '%@gmail.com'
order by customer_id;

select customer_id
from Customers
where not customer_id ~ '^[0-9]+$';

-- alter table Customers
-- alter column customer_id type int
-- using customer_id::integer;

-- update Customers 
-- set customer_id = regexp-replace(customer_id,)

select concat(hotel_name, ' is a ', hotel_type, ' hotel') as hotel_info
from hotel_details
order by hotel_name desc;

select h.hotel_id, h.hotel_name, count(o.order_id) as no_of_orders
from hotel_details h
inner join orders o on h.hotel_id = o.hotel_id
group by h.hotel_id, h.hotel_name
having count(o.order_id) > 5
order by h.hotel_id asc;

select h.hotel_id, h.hotel_name,h.hotel_type
from hotel_details h
left join orders o on h.hotel_id = o.hotel_id
and o.order_date between '2019-05-01' and '2024-10-10'
where o.order_id is null
order by h.hotel_id asc;

select o.order_id, c.customer_name,h.hotel_name,o.order_amount
from orders o
join customers c on o.customer_id = c.customer_id
join hotel_details h on o.hotel_id = h.hotel_id
order by o.order_id asc;


create table pizza(
pizza_id varchar(10) primary key,
customer_id varchar(10),
partner_id varchar(10),
pizza_name varchar(15),
pizza_type varchar(15),
order_date date,
amount bigint
);

insert into pizza (pizza_id,customer_id,partner_id,pizza_name,pizza_type,order_date,amount)
values
('piz001','cust001','part001','margherita','Extra large','2023-09-12',15.00),
('piz002','cust002','part002','peproni','Medium','2023-09-13',12.00),
('piz003','cust003','part003','bbq cheese','Large','2023-09-14',18.00);

update pizza
set amount = amount * 0.97
where pizza_type = 'Extra large';

create table orderss(
order_no numeric(5),
purch_amt decimal(8,2),
order_date date,
customer_id numeric(5),
salesman_id numeric(5),
primary key (order_no),
foreign key (salesman_id) references salesman(salesman_id)
);
GO

create table supplier(
supplier_id numeric(5),
supplier_name varchar(150),
address varchar(150),
city varchar(50),
state varchar(15),
country varchar(15),
contact varchar(10)
);

insert into supplier(supplier_id,supplier_name,address,city,state,country,contact)
values
(10001,'abc','123 market','new york','ny','usa','1234567890'),
(10002,'adc','122 market','delhi','dl','india','1234567893'),
(10003,'avc','125 market','york','irk','iran','1234567899'),
(10004,'alc','124 market','karachi','yo','pak','1234567894');

alter table supplier
add constraint chk_contact_length 
check(length(contact) = 10);