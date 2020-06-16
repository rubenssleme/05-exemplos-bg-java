package test;

import beans.OlaMundoEJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class OlaMundoEJBTest {

    private static EJBContainer container;
    private static Context contexto;
    private static OlaMundoEJB ejb;

    @Before
    public void iniciarContainer() throws Exception {
        System.err.println("Iniciar EJB Container");
        container = EJBContainer.createEJBContainer();
        contexto = container.getContext();
        ejb = (OlaMundoEJB) contexto.lookup("java:global/classes/OlaMundoEJB!beans.OlaMundoEJB");
    }
    @Test
    public void testAddNumbers() throws Exception{
        int n1 = 3;
        int n2 = 5;
        int resultado = ejb.somar(n1, n2);
        assertEquals((n1+n2), resultado);
        System.out.println("\nOperação terminada, resultado:  " + resultado + "\n");
        
    }

}
