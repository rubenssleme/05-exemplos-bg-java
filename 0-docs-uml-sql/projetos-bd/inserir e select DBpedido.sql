
use DBPEDIDO;

Insert InTo Cliente (Nome_Cli,Nascimento_Cli,CPF_Cli,RG_Cli,SIGLA_ID_EST,ENDERECO_CLI,Complemento_Cli,Bairro_Cli,Cidade_Cli,FoneCom_Cli,FoneRes_Cli,Celular_Cli)
 Values ('Camila',29/04/2012,'1111111','2222','SP','teste','comp','bairro','sao paulo','3333-','3334','9999');
Insert InTo Cliente (Nome_Cli,Nascimento_Cli,CPF_Cli,RG_Cli,SIGLA_ID_EST,ENDERECO_CLI,Complemento_Cli,Bairro_Cli,Cidade_Cli,FoneCom_Cli,FoneRes_Cli,Celular_Cli)
 Values ('marco',29/04/2012,'1111111','2222','SP','teste','comp','bairro','sao paulo','3333-','3334','9999');
insert into cliente  (nome_cli ,nascimento_cli, cpf_cli, rg_cli, ENDERECO_CLI, complemento_cli, bairro_cli, cidade_cli, SIGLA_ID_EST ,fonecom_cli, foneres_cli, celular_cli)
 values('q',21/04/2011,'1','2','7','4','SP','6','SP','8','9','0')
insert into cliente  (nome_cli ,nascimento_cli, cpf_cli, rg_cli, ENDERECO_CLI,complemento_cli, bairro_cli, SIGLA_ID_EST, cidade_cli ,fonecom_cli, foneres_cli, celular_cli)
values('111111111111111111111111111111',11/11/2012,'111.111.111-11','22.222.222-2','','','','','','(  )-    -','(  )-    -','(  )-    -')
insert into cliente  (nome_cli ,nascimento_cli, cpf_cli, rg_cli, ENDERECO_CLI,complemento_cli, bairro_cli, SIGLA_ID_EST, cidade_cli ,fonecom_cli, foneres_cli, celular_cli) 
values('rrrrr',21/04/2012,'11111111111','222222222','rr','cc','bb','ci','SP','111111111','222222222','333333333')

select * from Cliente
SELECT * FROM ESTADO;

insert into estado values('SP','São Paulo')
insert into estado values('MG','Minas Gerais')
insert into estado values('SP','São Paulo')
insert into estado values('MG','Minas Gerais')
insert into estado values('SP','São Paulo')
insert into estado values('MG','Minas Gerais')
insert into estado values('SP','São Paulo')
insert into estado values('MG','Minas Gerais')

select * from Estado;

Select * from Cliente;



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


insert into estado (SIGLA_ID_EST,Descricao_Est) values ('SP','Sao paulo');
insert into estado (SIGLA_ID_EST,Descricao_Est) values ('RJ','Sao paulo');
insert into estado (SIGLA_ID_EST,Descricao_Est) values ('MG','Sao paulo');
insert into estado (SIGLA_ID_EST,Descricao_Est) values ('AM','Sao paulo');

insert into estado (Descricao_Est) values ('AM')
insert into estado (Descricao_Est) values ('MG')


select * from estado

update  estado
set Descricao_est = 'Minas Gerais'
where SIGLA_ID_EST = 'MG';

update  estado
set Descricao_est = 'Rio de Janeiro'
where SIGLA_ID_EST = 'RJ';


delete estado
where SIGLA_ID_EST = 'sp'
