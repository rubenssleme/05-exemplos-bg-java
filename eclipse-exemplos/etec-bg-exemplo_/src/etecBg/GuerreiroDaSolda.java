package etecBg;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GuerreiroDaSolda {
	static Path path = Paths.get("guerreiro.in");
	static String path1 = Paths.get("guerreiro.out").toString();
	
	public static void main(String[] args) throws IOException {
	  ler();
	}
	
	
	
	
	
	public static void ler() throws IOException{
        List<String> linhasArquivo = Files.readAllLines(path);
        List<String> arquivoOrganizado = new ArrayList<>();
        PrintWriter f0 = new PrintWriter(new FileWriter(path1));
        
        arquivoOrganizado.add(0, linhasArquivo.get(9));
        arquivoOrganizado.add(1, linhasArquivo.get(5));
        arquivoOrganizado.add(2, linhasArquivo.get(2));
        arquivoOrganizado.add(3, linhasArquivo.get(8));
        arquivoOrganizado.add(4, linhasArquivo.get(7));
        arquivoOrganizado.add(5, linhasArquivo.get(4));
        arquivoOrganizado.add(6, linhasArquivo.get(11));
        arquivoOrganizado.add(7, linhasArquivo.get(6));
        arquivoOrganizado.add(8, linhasArquivo.get(10));
        arquivoOrganizado.add(9, linhasArquivo.get(13));
        arquivoOrganizado.add(10, linhasArquivo.get(3));
       
       // System.out.println(linhasArquivo.size());
        int i = 0, V = 1,  A = 2, F = 3, N = 1,J = 4;
        StringBuffer sb = new StringBuffer();
     //   sb.append(linhasArquivo.toString());
        
       
      
       for (String linha : linhasArquivo) {
        	int endLine = linha.length();
        	//f0.println(linha);
        	//sb.append(linha);
        	//linha.
        	//System.out.println(linha);
       }
        f0.close();
	}

}
