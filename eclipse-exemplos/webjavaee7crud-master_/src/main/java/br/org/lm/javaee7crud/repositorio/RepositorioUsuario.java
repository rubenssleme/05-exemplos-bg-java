package br.org.lm.javaee7crud.repositorio;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.org.lm.javaee7crud.dominio.Usuario;


@Stateless
public class RepositorioUsuario implements Serializable {


	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager entityManager; 

	public Usuario ValidaUsuario(Usuario usuario){

		try {

			//QUERY QUE VAI SER EXECUTADA (UsuarioEntity.findUser) 	
			//Query query = Uteis.JpaEntityManager().createNamedQuery("UsuarioEntity.findUser");
			//Query query = Uteis.JpaEntityManager().createQuery("SELECT u FROM Usuario u WHERE u.usuario = :usuario AND u.senha = :senha", Usuario.class);
			Query query = entityManager.createQuery("SELECT u FROM Usuario u WHERE u.usuario = :usuario AND u.senha = :senha", Usuario.class);

			//PAR�METROS DA QUERY
			query.setParameter("usuario", usuario.getUsuario());
			query.setParameter("senha", usuario.getSenha());

			//RETORNA O USU�RIO SE FOR LOCALIZADO
			return (Usuario)query.getSingleResult();

		} catch (Exception e) {
			System.out.println(e.getMessage());

			return null;
		}



	}
}