package desafioEssential;

import java.io.Closeable;
import java.io.IOException;

public class Exer29MyResource1 implements AutoCloseable{
	public void close() throws IOException {
		System.out.println("1");
	}
}

public class Exer29MyResource2 implements Closeable{
	public void close() throws IOException {
		throw new IOException();
	}
}

public class Teste{
	public static void main(String[] args) {
		try(Exer29MyResource1 r1 = new Exer29MyResource1();
			Exer29MyResource1 r2 = new Exer29MyResource2();){
			System.out.println("T");
		}catch (Exception e) {
			System.out.println("IOE");
		}finally {
			System.out.println("F");
		}
	
	try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	}
}