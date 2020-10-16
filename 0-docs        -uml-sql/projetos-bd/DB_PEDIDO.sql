'cRIAR '
drop database DBPEDIDO

Create Database DBPEDIDO

use DBPEDIDO

CREATE TABLE Pagamento(
Codigo_ID_Pag		Integer not null Identity,
Descricao_Pag 		Varchar(30),
Primary Key(Codigo_ID_Pag));

CREATE TABLE Estado(
UF_ID_Est		Char(2) not null,
Descricao_Est		Varchar(30),
Primary Key(UF_ID_Est));

CREATE TABLE Marca(
Codigo_ID_Mar		Integer not null Identity,
Descricao_Mar		Varchar(20),
Primary Key(Codigo_ID_Mar));

create table Cliente(
codigo_ID_cli integer not null identity,
nome_cli			varchar(60),
nascimento_cli		datetime,
cpf_cli				varchar(11),
rg_cli				varchar(15),
endereco_cli		varchar(50),
complemento_cli		varchar(20),
bairro_cli			varchar(20),
cidade_cli			varchar(40),
estado_ID_est		char(2),
fone_com_cli		varchar(15),
fone_res_cli		varchar(15),
celular_cli			varchar(15),
primary key(codigo_ID_cli),
foreign key(estado_ID_est) references estado);

create table produto(
codigo_ID_prod integer not null identity,
descricao_prod				varchar(40),
valor_prod					numeric(10,2),
codigo_ID_mar				integer,
unidade_prod				char(2),
primary key(codigo_ID_prod),
foreign key(codigo_ID_mar) references marca);

create table pedido(
codigo_ID_ped integer not null identity,
descricao_ped				varchar(20),
data_ped					datetime,
codigo_ID_cli				integer,
codigo_ID_pag				integer,
subtotal_ped				numeric(10,2),
desconto_ped				numeric(10,2),
primary key(codigo_ID_ped),
foreign key(codigo_ID_cli) references cliente,
foreign key(codigo_ID_pag) references pagamento);

create table itempedido(
codigo_ID_ped		integer not null,
codigo_ID_prod		integer not null,
qtdade_item			numeric(5,3),
total_item			numeric(10,2),
primary key(codigo_ID_ped, codigo_ID_prod),
foreign key(codigo_ID_ped) references pedido,
foreign key(codigo_ID_prod) references produto);

insert into cliente (nome_cli) values ('Jefferson')
insert into cliente (nome_cli) values ('Camila')
insert into cliente (nome_cli) values ('Rafael')
insert into cliente (nome_cli) values ('Nathalia')
insert into cliente (nome_cli) values ('Anderson')
insert into cliente (nome_cli) values ('Marcos')
insert into cliente (nome_cli) values ('André')
insert into cliente (nome_cli) values ('Lucas')
insert into cliente (nome_cli) values ('Maria')
insert into cliente (nome_cli) values ('Mariana')
select * from cliente

insert into marca (descricao_mar) values ('Nike')
insert into marca (descricao_mar) values ('Adidas')
insert into marca (descricao_mar) values ('Hering')
insert into marca (descricao_mar) values ('Itautec')
insert into marca (descricao_mar) values ('HP')
select * from marca

insert into pagamento (descricao_pag) values ('À vista')
insert into pagamento (descricao_pag) values ('À Prazo sem juros')
insert into pagamento (descricao_pag) values ('À Prazo com juros')
insert into pagamento (descricao_pag) values ('Cartão Visa')
insert into pagamento (descricao_pag) values ('Cartão MasterCard')
select * from pagamento

insert into produto (descricao_prod) values ('Arroz')
insert into produto (descricao_prod) values ('Feijão')
insert into produto (descricao_prod) values ('Macarrão')
insert into produto (descricao_prod) values ('Óleo')
insert into produto (descricao_prod) values ('Miojo')


insert into estado (UF_ID_Est,Descricao_Est) values ('SP','Sao paulo');
insert into estado (UF_ID_Est,Descricao_Est) values ('RJ','Sao paulo');
insert into estado (UF_ID_Est,Descricao_Est) values ('MG','Sao paulo');
insert into estado (UF_ID_Est,Descricao_Est) values ('AM','Sao paulo');

insert into estado (Descricao_Est) values ('AM')
insert into estado (Descricao_Est) values ('MG')


select * from estado

update  estado
set Descricao_est = 'Minas Gerais'
where uf_id_est = 'MG';

delete estado
where uf_id_est = 'sp'