create database productmanagement;
use productmanagement;

create table product(
id bigint primary key,
sku varchar(255),
name varchar(255),
description varchar(255),
unitprice float,
imageurl varchar(255),
active bit(1),
unitsinstock int,
datecreated datetime(6),
lastupdated datetime(6),
categoryid bigint, 
foreign key(categoryid) references productcategory(categoryid));

create table productcategory(
categoryid bigint primary key,
categoryname varchar(255)
);

desc product;
desc productcategory;
truncate table product;

insert into productcategory values(1, "Furniture"),(2, "Electronics"),(3, "Fashion");

insert into product values
(101,"Furniture","couch","used to sit on",200000,"https://i5.walmartimages.com/asr/a1952b88-3d63-4b15-a19f-2b073db7194c.47b87fdee08b3c52763b51bc99c7cbfb.jpeg",true,200,"2019-07-11","2020-07-30",1),
(201,"Electronics","laptop","used to work on",210000,"https://i5.walmartimages.com/asr/2d10a256-68b7-4016-b054-9e566b15c8af_1.cc386d9dc265f52f289384b0003679a4.jpeg",true,200,"2019-07-11","2020-07-30",2),
(301,"Fashion","tshirt","used to wear on upperbody",210,"https://s3.amazonaws.com/images.ecwid.com/images/23401079/1276317004.jpg",true,200,"2019-07-11","2020-07-30",3);
select * from product; 
select * from productcategory;