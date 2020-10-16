package br.org.bg.olamundojpa.test;

import br.org.bg.olamundojpa.beans.dominio.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.validation.constraints.AssertTrue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testEntidadePessoa {

    static EntityManager em = null;
    static EntityTransaction tx = null;
    static EntityManagerFactory emf = null;

    Logger log = LogManager.getRootLogger();

    @BeforeClass
    public static void init() throws Exception {
        emf = Persistence.createEntityManagerFactory(pessoaPU);
    }

    @Before
    public void setup() {
        try {
            emf.createEntityManager();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPessoaEntity() {
        log.debug("Iniciando teste de pessoa entity com JPA");
        assertTrue(em != null);
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Pessoa pessoa1 = new Pessoa("rubens leme", " pai", "mae", "email", "telefone");
        log.debug("Objeto a persistir:" + pessoa1);
        em.persist(pessoa1);
        tx.commit();
        assertTrue(pessoa1.getId() != null);
        log.debug("Objeto persistido:" + pessoa1);
        log.debug("Fin test Persona Entity con JPA");
    }

    @After
    public void tearDown() 
        throwsException {
    if (em != null) {
            em.close();
        }
    }

}
