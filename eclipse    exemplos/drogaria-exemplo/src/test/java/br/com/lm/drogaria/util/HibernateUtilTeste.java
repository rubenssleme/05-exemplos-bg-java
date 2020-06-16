package br.com.lm.drogaria.util;


import org.hibernate.Session;
import org.junit.Test;
import br.com.lm.drogaria.util.HibernateUtil;

public class HibernateUtilTeste {

	@Test
	public void conectar() {
		 Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		 sessao.close();
		 HibernateUtil.getFabricaDeSessoes().close();
	}

}
