create database  Final
use Final


create table estado (
uf_id_est  char (2) NOT NULL ,
descricao_est VARCHAR (30),
primary key(uf_id_est));

select * from usuario



create table usuario(
codigo_id_usu integer not null identity,
nome_usu varchar (60),
sobrenome_usu  varchar (30),
funcao_usu  varchar (30),
login_usu  varchar(30),
senha_usu varchar (30),
nivel_usu varchar(30),
primary key (codigo_id_usu));


create table hr_logon (
codigo_id_hr integer not null identity,
hora_log  varchar (10),
data_log date,
codigo_id_usu integer not null,
primary key (codigo_id_hr),
foreign key (codigo_id_usu) references usuario);

create table cliente (
codigo_id_cli integer not null identity,
nome_cli varchar (60),
nasc_cli date,
sexo_cli char(1),
cpf_cli varchar (14),
rg_cli varchar (15),
endereco_cli varchar (50),
numero_cli varchar (10),
complemento_cli varchar (30),
bairro_cli varchar (30),
cidade_cli varchar (30),
uf_id_est char (2),
cep_cli varchar (9),
email_cli varchar (35),
dddfixo_cli char(2),
fonefixo_cli varchar (9),
dddcel_cli char (2),
fonecel_cli varchar (9),
primary key (codigo_id_cli),
foreign key (uf_id_est) references estado);



create table empresaaerea (
codigo_id_ea integer not null identity,
cnpj_ea varchar (18),
nome_ea varchar (40),
endereco_ea varchar (50),
numero_ea varchar (15),
complemento_ea varchar (30),
bairro_ea varchar (30),
cidade_ea varchar (30),
uf_id_est char (2),
cep_ea varchar (9),
ddd_ea char(2),
telefone_ea varchar (12),
primary key (codigo_id_ea),
foreign key (uf_id_est) references estado);


create table hotel (
codigo_id_hot integer not null identity,
cnpj_hot varchar (18),
nome_hot varchar (40),
tipo_hot  varchar(30),
endereco_hot varchar (50),
numero_hot varchar (10),
complemento_hot varchar (30),
bairro_hot varchar (30),
cidade_hot varchar (30),
uf_id_est char (2),
cep_hot varchar (9),
email_hot varchar (30),
ddd_hot varchar (2),
telefone_hot varchar (9),
primary key (codigo_id_hot),
foreign key (uf_id_est) references estado);








create table pedido (
codigo_id_ped integer not null identity,
codigo_id_cli integer not null,
codigo_id_ea integer not null,
codigo_id_usu integer not null,
dataped_ped date,
status_ped varchar (15),
dataida_ped date,
horavoo_ped varchar (10),
datavolta_ped date,
aeroporto_ped varchar(30),
destino_ped varchar(30),
horavolta_ped varchar (10),
aeroportovolta_ped varchar(30),
destinovolta_ped varchar(30),
classe_ped varchar (40),

valor_ped Decimal (10, 2),
hr_ped varchar (10),
primary key (codigo_id_ped),
foreign key (codigo_id_cli) references cliente,
foreign key (codigo_id_ea) references empresaaerea,
foreign key (codigo_id_usu) references usuario);


create table Ped_Hot(
codigo_id_ped integer not null,
codigo_id_hot integer not null,
estadia_ph integer,
tipohosp_ph varchar (30),
primary key (codigo_id_ped, codigo_id_hot),
foreign key(codigo_id_ped) references pedido,
foreign key (codigo_id_hot) references hotel);



INSERT INTO estado VALUES ('AC','Acre');
INSERT INTO estado VALUES ('AL','Alagoas');
INSERT INTO estado VALUES ('AP','Amapá');
INSERT INTO estado VALUES ('AM','Amazonas');
INSERT INTO estado VALUES ('BA','Bahia');
INSERT INTO estado VALUES ('CE','Ceará');
INSERT INTO estado VALUES ('DF','Distrito Federal');
INSERT INTO estado VALUES ('ES','Espírito Santo');
INSERT INTO estado VALUES ('GO','Goiás');
INSERT INTO estado VALUES ('MA','Maranhão');
INSERT INTO estado VALUES ('MT','Mato Grosso');
INSERT INTO estado VALUES ('MS','Mato Grosso do Sul');
INSERT INTO estado VALUES ('MG','Minas Gerais');
INSERT INTO estado VALUES ('PA','Pará');
INSERT INTO estado VALUES ('PB','Paraíba');
INSERT INTO estado VALUES ('PR','Paraná');
INSERT INTO estado VALUES ('PE','Pernambuco');
INSERT INTO estado VALUES ('PI','Piauí');
INSERT INTO estado VALUES ('RJ','Rio de Janeiro');
INSERT INTO estado VALUES ('RN','Rio Grande do Norte');
INSERT INTO estado VALUES ('RS','Rio Grande do Sul');
INSERT INTO estado VALUES ('RO','Rondônia');
INSERT INTO estado VALUES ('RR','Roraima');
INSERT INTO estado VALUES ('SC','Santa Catarina');
INSERT INTO estado VALUES ('SE','Sergipe');
INSERT INTO estado VALUES ('TO','Tocantins');
INSERT INTO estado VALUES ('SP','São Paulo');

