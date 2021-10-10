create database bdControleMovimentacao;

use bdControleMovimentacao;

create table usuarios(
  usuCod int identity not null,
  usuNome varchar(40),
  usuEmail varchar(40),
  usuTipo varchar(15),
  usuLogin varchar(12),
  usuSenha varchar(12),
  primary key (usuCod)
); 

insert into usuarios values('Aluno','aluno@exemplo.com.br','administrador','aluno','123');
insert into usuarios values('Aluno','aluno@exemplo.com.br','administrador','aluno','123');


select * from usuarios;