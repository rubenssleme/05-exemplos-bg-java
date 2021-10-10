package testAntesEDepois;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AntesEDepois {
	
	@Before
	public void antesDoTeste(){
	  
		//LOGGER.log(Level.INFO, "@Before");
		
	}
	@After
	public void depoisDoTeste(){
		System.out.println("@After");
		
 	}
	@BeforeClass
	public static void antesDeTodosOsTestes(){
		System.out.println("@BeforeClass");
	}
	@AfterClass
	public static void depoisDeTodosOsTestes(){
		System.out.println("@AfterClass");
	}

	@Test
	public void teste1() {
		System.out.println("teste1");
	}
	@Test
	public void teste2() {
		System.out.println("teste2");
	}
	@Test
	public void teste3() {
		System.out.println("teste3");
	}
	

}
