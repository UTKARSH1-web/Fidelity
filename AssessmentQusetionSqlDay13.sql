create table Worker(
worker_id int primary key,
frist_name varchar(50),
last_name varchar(50),
salary int,
joining_date date,
department varchar(50)
);
create table Bonus(
worker_ref_id int,
bonus_amount int,
bonus_date date,
foreign key(worker_ref_id) references Worker(worker_id)
);
create table Title(
worker_ref_id int,
worker_title varchar(50),
affected_from date,
foreign key (worker_ref_id) references Worker(worker_id)
);
insert into Worker(worker_id,frist_name,last_name,salary,joining_date,department)
values
(1,'Monika','Arora',100000,'2020-02-14','HR'),
(2,'Nihanka','Verma',80000,'2011-02-14','Admin'),
(3,'Vishal','Singhal',300000,'2020-02-14','HR'),
(4,'Amitabh','Singh',500000,'2020-02-14','Admin'),
(5,'Vivek','Bhati',500000,'2011-02-14','Admin'),
(6,'Vipul','Diwan',200000,'2011-06-14','Account'),
(7,'Satish','Kumar',75000,'2020-01-14','Account');

insert into Bonus(worker_ref_id,bonus_amount,bonus_date) 
values
(1,5000,'2020-02-16'),
(2,3000,'2011-06-16'),
(3,4000,'2020-02-16'),
(4,4500,'2011-06-16'),
(5,3500,'2020-06-16'),
(6,4500,'2020-02-16'),
(7,3500,'2011-02-16');
insert into Title(worker_ref_id,worker_title,affected_from)
values
(1,'Manager','2016-02-20'),
(2,'Executive','2016-06-11'),
(5,'Manager','2016-06-11'),
(4,'Asts. Manager','2016-06-11'),
(7,'Executive','2016-02-11'),
(6,'Lead','2016-06-11'),
(3,'Lead','2016-06-11');

select W.frist_name,W.salary,T.worker_title
from Worker W
join Title T on W.worker_id = T.worker_ref_id;

create or replace function get_worker_count_by_nth_highest_salary(n int)
returns int as $$
declare
    nth_salary numeric;
	worker_count int;
begin
    select distinct salary
	into nth_salary
	from Worker
	order by salary DESC
	limit 1 offset (n-1);

	select count(*)
	into worker_count
	from Worker
	where salary = nth_salary;

	return worker_count;
end;
$$ language plpgsql;

select get_worker_count_by_nth_highest_salary(1);