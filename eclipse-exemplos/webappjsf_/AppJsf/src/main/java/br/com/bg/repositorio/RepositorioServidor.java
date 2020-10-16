package br.com.bg.repositorio;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import br.com.bg.dominio.Servidor;
import br.com.bg.utilitarios.Uteis;

@Stateless
public class RepositorioServidor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	Servidor servidor;
	@PersistenceContext()
	EntityManager entityManager;
	
	/***
	 * MÉTODO RESPONSÁVEL POR SALVAR UM NOVO SERVIDO
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
				acao = "Inclusão";
			}else{
				entityManager.merge(servidor);
				acao = "Alteração";
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
