/**
 * Author:  rubens.leme
 * Created: 22/02/2017
 * version: 1.0
 */

Select * from Servidor;
Select * from Roteador;
Select * from Equipamento;
select * from USUARIO;

Select * from Equipamento as t1,Servidor as t2 
where t1.id = t2.id;

Select * from Equipamento as t1,Roteador as t2 
where t1.id = t2.id;




INSERT INTO USUARIO (nome, perfil, senha, titulo, usuario) 
values('Administrador','Admin','a','Admin','a');