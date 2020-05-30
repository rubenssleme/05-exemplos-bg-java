create database DB_Pedido;

use DBPedido;

 create table Pagamento (
    Cod_ID_Pag     Integer not null Identity,
    Descricao_Pag  varchar (30),
    Primary Key (Cod_ID_Pag));   

 create table Estado(
   UF_ID_Est char(2) not null,
   Descricao_Est varchar(30),
   Primary Key (UF_ID_Est)); 


 create table Marca(
   Cod_ID_Mar integer not null identity,
   Descricao_Mar varchar(20),
   Primary Key (Cod_ID_Mar)); 


Insert InTo Estado Values ('SP','São Paulo');
Insert InTo Estado Values ('RJ','Rio de Janeiro');
Insert InTo Estado Values ('AM','Amazonas');
Insert InTo Estado Values ('AC','Acre');
Insert InTo Estado Values ('GO','Goias');
Insert InTo Estado Values ('MG','Minas Gerais');
Insert InTo Estado Values ('MS','Mato Grosso do Sul');
Insert InTo Estado Values ('CE','Ceará');
Insert InTo Estado Values ('DF','Distrito Federal');
Insert InTo Estado Values ('RN','Rio Grande do Norte'); 
Insert InTo Estado Values ('RS','Rio Grande do Sul');
Insert InTo Estado Values ('ES','Espirito Santo');
Insert InTo Estado Values ('BA','Bahia');
Insert InTo Estado Values ('AL','Alagoas');
Insert InTo Estado Values ('PE','Pernambuco');
Insert InTo Estado Values ('MT','Mato Grosso');
Insert InTo Estado Values ('PR','Paraná');
Insert InTo Estado Values ('SC','Santa Catarina');
Insert InTo Estado Values ('MA','Maranhão');
Insert InTo Estado Values ('RO','Rondonia');
Insert InTo Estado Values ('RR','Roraima');
Insert InTo Estado Values ('PA','Pará');
Insert InTo Estado Values ('MA','Maranhão');
Insert InTo Estado Values ('AP','Amapá');
Insert InTo Estado Values ('TO','Tocantins');
Insert InTo Estado Values ('PI','Piauí');
Insert InTo Estado Values ('PB','Paraíba');
Insert InTo Estado Values ('SE','Sergipe');

Select descricao_est From Estado
where uf_id_est = 'MG'

Select * From Estado

create table Cliente(
   Cod_ID_Cli      integer not null identity,
   Nome_Cli        varchar(60),
   Nascmento_Cli   datetime,
   CPF_Cli         varchar(11),
   RG_Cli          varchar(15),
   Endereço_Cli    varchar(50),
   Complemento_Cli varchar(20),
   Bairro_Cli      varchar(20),
   Cidade_Cli      varchar(40),
   UF_ID_Est       char(02),
   FoneCom_Cli     varchar(15),
   FoneRes_Cli     varchar(15),
   Celular_Cli     varchar(15),
   Primary Key     (Cod_ID_Cli),
   Foreign Key     (UF_ID_Est) References Estado);
 
 create table Produto(
   Cod_ID_Pro      integer not null identity,
   Descricao_Pro   varchar(40),
   Valor_Pro       numeric(10,2),
   Cod_ID_Mar      integer,
   Unidade_Pro     char(02),
   Primary Key     (Cod_ID_Pro),
   Foreign Key     (Cod_ID_Mar) References Marca);

 create table Pedido(
   Numero_ID_Ped   integer not null identity,
   Data_Ped        datetime,
   Cod_ID_Cli      integer,
   Cod_ID_Pag      integer,
   Subtotal_Ped    numeric(10,2),
   Desconto_Ped    numeric(10,2),
   Primary Key     (Numero_ID_Ped),
   Foreign Key     (Cod_ID_Cli) References Cliente,
   Foreign Key     (Cod_ID_Pag) References Pagamento);

 create table ItemPedido(
   Numero_ID_Ped   integer not null,
   Cod_ID_Pro      integer not null,
   Qnt_Item        numeric(5,3),
   Total_Item      numeric(10,2),
   Primary Key     (Numero_ID_Ped , Cod_ID_Pro),
   Foreign Key     (Numero_ID_Ped) References Pedido,
   Foreign Key     (Cod_ID_Pro) References Produto);
