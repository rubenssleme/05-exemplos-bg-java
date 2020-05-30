drop table livro;

create table livro(
  id int Identity not null,
  ISBN_ID varchar(30),
  titulo varchar(40),
  data_publicacao varchar(20),
  id_fornecedor varchar(15),
  id_Editora varchar(12),
  valor_custo varchar(12),
  valor_venda varchar(12),
  primary key (id)
); 

INSERT INTO livro(titulo,data_publicacao, id_fornecedor, id_editora, valor_custo, valor_venda) VALUES ('Livro Java','29/10/2006','1','1','120.0','120.0')
  
  select * from livro;