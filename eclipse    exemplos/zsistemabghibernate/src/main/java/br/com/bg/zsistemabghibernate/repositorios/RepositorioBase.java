package br.com.bg.zsistemabghibernate.repositorios;

import br.com.bg.zsistemabghibernate.utilitarios.HibernateUtil;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class RepositorioBase<Entidade> {

    private final Class<Entidade> classe;

    public RepositorioBase() {
        this.classe = (Class<Entidade>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    public boolean salvar(Entidade entidade) {
        Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
        boolean retorno = false;
        Transaction transacao = null;
        try {
            transacao = sessao.beginTransaction();
            sessao.save(entidade);
            transacao.commit();
            retorno = true;
        } catch (RuntimeException e) {
            if (transacao != null) {
                transacao.rollback();
            }
            retorno = false;
            throw e;
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public List<Entidade> listar() {
        Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
        try {
            Criteria consulta = sessao.createCriteria(classe);
            List<Entidade> resultado = consulta.list();
            return resultado;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            sessao.close();
        }
    }

    public Entidade buscar(Long codigo) {
        Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
        try {
            Criteria consulta = sessao.createCriteria(classe);
            consulta.add(Restrictions.idEq(codigo));
            Entidade resultado = (Entidade) consulta.uniqueResult();
            return resultado;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            sessao.close();
        }

    }

    public void excluir(Entidade t) {
        Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
        Transaction transacao = null;
        try {
            transacao = sessao.beginTransaction();
            sessao.delete(t);
            transacao.commit();

        } catch (RuntimeException e) {
            if (transacao != null) {
                transacao.rollback();
            }
            throw e;
        } finally {
            sessao.close();
        }
    }

    public void editar(Entidade t) {
        Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
        Transaction transacao = null;
        try {
            transacao = sessao.beginTransaction();
            sessao.update(t);
            transacao.commit();

        } catch (RuntimeException e) {
            if (transacao != null) {
                transacao.rollback();
            }
            throw e;
        } finally {
            sessao.close();
        }
    }

    
    
}
