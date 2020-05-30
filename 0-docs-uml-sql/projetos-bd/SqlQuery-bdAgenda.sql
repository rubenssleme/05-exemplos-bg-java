CREATE DATABASE DBCONTATOS;

USE DBCONTATOS;


create table tbContatos(
	id int IDENTITY  NOT NULL,
	nome varchar(50) NULL,
	sobrenome varchar(50) NULL,
	telefone varchar(50) NULL,
	endereco varchar(50) NULL,
	bairro varchar(50) NULL,
	data_nascimento varchar(50) NULL,
	cpf varchar(50) NULL,
	rg varchar(50) NULL,
	data_cadastro varchar(50) NULL,
	email varchar(50) NULL,
	id_
	observacao varchar(50) NULL,
	caminho_imagem varchar(50) NULL,
);

CREATE TABLE tbGrupos(
	id int IDENTITY NOT NULL,
	id_contato int NOT NULL,
	descricao varchar(35) NULL,
);

create table tbConta_Acesso(
id int IDENTITY(1,1) NOT NULL,
usuario varchar(30) NOT NULL,
senha varchar(15) NOT NULL,
);

CREATE TABLE tbEstados(
	id int IDENTITY NOT NULL,
	uf char(2) NOT NULL,
	descricao varchar(35) NULL,
); 

