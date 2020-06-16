create database "dbSisProdutos";

create table "tbProdutos" (
				id bigserial not null,
				nome varchar(50) not null,
				categoria varchar(100) not null,
				preco numeric not null,
				constraint pk_id primary key (id)
			  );

create table "tbLogin" (
				id bigserial not null,
				usuario varchar(50) not null,
				senha varchar(50) not null,
				constraint primarykey_id primary key (id)
			);
			
INSERT INTO "tbLogin" (usuario, senha) 
select 'admin', '81dc9bdb52d04dc20036dbd8313ed055'
where
	not exists ( 
		select * from "tbLogin" where usuario = 'admin'
);