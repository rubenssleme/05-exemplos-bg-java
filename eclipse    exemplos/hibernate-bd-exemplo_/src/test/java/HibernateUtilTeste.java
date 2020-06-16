import br.com.bg.bghibernate.utilitarios.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

/**
 *
 * @author Rubens Leme
 */
public class HibernateUtilTeste {
    @Test
	public void conectar() {
		 Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		 sessao.close();
		 HibernateUtil.getFabricaDeSessoes().close();
	}
}
