/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apf.gerenciadorfinanceiro.repositorios;

import br.com.apf.gerenciadorfinanceiro.utilitarios.HibernateUtil;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rubens.leme
 */
public class RepositorioGenerico<Entidade> {

    private final Class<Entidade> classe;

    public RepositorioGenerico() {
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

    public void Excluir(Entidade t) {
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

    public void Editar(Entidade t) {
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
