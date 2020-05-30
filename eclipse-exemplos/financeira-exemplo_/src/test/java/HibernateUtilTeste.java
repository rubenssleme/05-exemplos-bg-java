import br.com.apf.gerenciadorfinanceiro.utilitarios.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;


public class HibernateUtilTeste {
	@Test
	public void conectar() {
		 Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		 sessao.close();
		 HibernateUtil.getFabricaDeSessoes().close();
	}

}
