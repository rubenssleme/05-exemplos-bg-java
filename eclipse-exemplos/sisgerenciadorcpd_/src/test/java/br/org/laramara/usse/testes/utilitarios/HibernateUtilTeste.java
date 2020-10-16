package br.org.laramara.usse.testes.utilitarios;

import br.org.laramara.usse.utilitarios.HibernateUtil;
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
