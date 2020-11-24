CREATE DATABASE DBUSUARIO;
USE DBUSUARIO;

CREATE TABLE TBUSUARIO(
id int not null,
nome varchar(30),  
email varchar(25), 
tipo varchar(15),  
login varchar(25), 
senha varchar(25),
primary key (id)
);

