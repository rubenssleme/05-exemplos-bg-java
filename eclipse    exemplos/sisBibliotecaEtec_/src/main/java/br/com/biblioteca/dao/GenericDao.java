/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.dao;

import br.com.biblioteca.utils.EntityManagerUtil;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.ClassType;

/**
 *
 * @author Caio
 */
public abstract class GenericDao<T extends Serializable> {

    @PersistenceContext(unitName = "TesteConexao")
    private final EntityManager entityManager;
    private final Class<T> persistentClass;

    public GenericDao() {
        this.entityManager = EntityManagerUtil.getEntityManager();
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    protected void save(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().persist(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    protected void update(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();
        try {
            tx.begin();
            getEntityManager().merge(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    protected void delete(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();
        try {
            tx.begin();
            getEntityManager().remove(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public List<T> findAll() throws Exception {
        Session session = (Session) getEntityManager().getDelegate();
        return session.createCriteria(persistentClass).list();
    }

    public <T extends Serializable> List<T> getPureList(String query,Object... params) {
        Session ses = (Session) getEntityManager().getDelegate();

        Query qr = ses.createQuery(query);
        for (int i = 1; i <= params.length; i++) {
            qr.setParameter(i, params[i-1]);
        }
        @SuppressWarnings("unchecked")
        List<T> toReturn = qr.list();
        ses.close();
        return toReturn;
    }

    public List<T> findByName(String field, String value) {
        Session session = (Session) getEntityManager().getDelegate();
        return session.createCriteria(persistentClass).add(Restrictions.like(field, "%" + value + "%").ignoreCase()).add(Restrictions.eq("ativo", true)).list();
    }

    public T findById(long id) {
        Session session = (Session) getEntityManager().getDelegate();
        return (T) session.createCriteria(persistentClass).add(Restrictions.eq("id", id)).uniqueResult();
    }

    public void close() {
        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
    }

    public Serializable SelectComParametros(String query, Object... params) {
        Session ses = (Session) getEntityManager().getDelegate();
        Query qr = ses.createQuery(query);
        for (int i = 0; i < params.length; i++) {
            qr.setParameter(i, params[i]);
        }
        Object toReturn = qr.uniqueResult();
        ses.close();
        return (Serializable) toReturn;
    }
}
