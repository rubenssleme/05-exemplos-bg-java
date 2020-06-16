package br.org.lm.javaee7crud.repositorio;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import br.org.lm.javaee7crud.dominio.Servidor;
import br.org.lm.javaee7crud.utilitarios.Uteis;

@Stateless
public class RepositorioServidor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	Servidor servidor;
	@PersistenceContext()
	EntityManager entityManager;
	
	/***
	 * M�TODO RESPONS�VEL POR SALVAR UM NOVO SERVIDO
	 * @param servidor
	 * @return 
	 */
	
	public boolean salvarRegistro(Servidor servidor){
		boolean sucesso = false;
		String acao = "";
	//	entityManager = Uteis.JpaEntityManager();
				
		try{
			if(!servidor.posuiId()){
				entityManager.persist(servidor);
				entityManager.flush();
				acao = "Inclus�o";
			}else{
				entityManager.merge(servidor);
				acao = "Altera��o";
			}
			sucesso  = true;
			
		} catch (Exception e) {
			sucesso = false;
		}
		
		/*logger.info(acao + " do " + servidor
				+ " realizada com sucesso pelo CPF " + "" cpfUsuarioLogado + ".");*/
		return sucesso;
	
	}
}
