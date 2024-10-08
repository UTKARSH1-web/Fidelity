create table tblCustomers(
CustomerID SERIAL primary key,
CompanyName VARCHAR(100),
ContactName VARCHAR(100),
ContactTitle VARCHAR(100),
Address VARCHAR(255),
City VARCHAR(100),
Region VARCHAR(100),
PostalCode VARCHAR(20),
Country VARCHAR(100) DEFAULT 'Canada',
Phone VARCHAR(20),
Fax VARCHAR(20)
);

create table tblSupplier (
SupplierID SERIAL primary key,
Name VARCHAR(100),
Address VARCHAR(255),
City VARCHAR(100),
Country VARCHAR(20)
);

create table tblShippers (
ShipperID SERIAL primary key,
CompanyName VARCHAR(100) UNIQUE
);
CREATE TABLE tblProducts(
ProductID serial primary key,
SupplierID int references tblSupplier(SupplierID),
CategoryID int,
ProductName varchar(100),
EnglishName varchar(100),
QuantityPerUnit varchar(100),
UnitPrice decimal (10,2)
);

create table tblOrders(
OrderID serial primary key,
CustomerID int references tblCustomers(CustomerID),
EmployeeID int,
ShipperID int references tblShippers(ShipperID),
ShipName varchar(100),
ShipAddress varchar(100),
ShipCountry varchar(20),
OrderDate  date,
ShippedDate date check(ShippedDate > OrderDate)
);

create table tblOrderDetails(
OrderID int references tblOrders(OrderID),
ProductID int references tblProducts(ProductID),
UnitPrice decimal(10,2),
Quantity int check (Quantity >10),
Discount decimal(3,2),
primary key (OrderID , ProductID)
);
insert into tblCustomers (CompanyName , ContactName,ContactTitle,Address,City,Region,PostalCode,Country,Phone,Fax)
values('Tech Corp','Alice','Manager','789 Main st','Toronto','on','M4B 1B3','Canada','123-456-7890','123-456-7890');
insert into tblOrders(CustomerID, EmployeeID, ShipperID,ShipName,ShipAddress, ShipCountry, OrderDate, ShippedDate,OrderID) 
values(1,1,1,'Ship 1','123 Ocean st' , 'New York','2023-10-05','2023-10-07',1);
insert into tblShippers (CompanyName) values ('Fast Shipping Co');
insert into tblProducts(SupplierID,CategoryId,ProductName,EnglishName,QuantityPerUnit,UnitPrice)
values(1,1,'Widget','Widget','10 pices',19.99);
insert into tblSupplier(Name, Address,City,Country)
values('Gadgets Supplier','101 supplier st','Toronto','Canada');
insert into tblOrderDetails(OrderID,ProductID,UnitPrice,Quantity,Discount)
values(1,1,19.00,12,0.1)


-- Voilate Error when the quantity is less than 10
insert into tblOrderDetails (OrderID, ProductID,UnitPrice,Quantity,Discount) 
values(1,101,15.99,9,0.05);

alter table tblCustomers
add Email varchar(255);
