package etecBg;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Detran {
	
	static Path path = Paths.get("D:\\home\\entrada.in");
	static String path1 = Paths.get("D:\\home\\saida.out").toString();
	
	
	public static void ler() throws IOException{
        List<String> linhasArquivo = Files.readAllLines(path);
        
        PrintWriter f0 = new PrintWriter(new FileWriter(path1));

        for (String linha : linhasArquivo) {
           
        	f0.println(linha);
        }
        f0.close();
	}
	
	
	/*public static void escrever() throws IOException{
	 PrintWriter f0 = new PrintWriter(new FileWriter(path1));
		
		for(i=0;i<10;i++)
		{
			Files.write(path1, linhaNova.getBytes());
		}
		
		
		
	}*/
	
	

	public static void main(String[] args) throws IOException {
	
		ler();
		//escrever();

	}

}
