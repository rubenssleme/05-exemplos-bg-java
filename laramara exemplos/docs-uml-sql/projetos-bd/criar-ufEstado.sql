create database bdEstado;


create table municipios(
id_municipio int identity not null,
descricao varchar(35) not null,
);


select * from municipios; 

insert into municipios(descricao)values('São Paulo');
insert into municipios(descricao)values('Rio de Janeiro');
insert into municipios(descricao)values('Belo Horizonte');
insert into municipios(descricao)values('Porto Alegre');
insert into municipios(descricao)values('Goiania');
insert into municipios(descricao)values('Quintana');
