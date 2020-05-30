package projetoLeituraDeArquivoTXT;


import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraTXT {
	Path pathname = Paths.get("C:\\arquivoTXT", "arquivo.txt");
	Charset charset = Charset.forName("ISO-8859-1");


	public void obtemArquivo(){
		try {
			List<String> linhas = Files.readAllLines(pathname,charset);
			for(String linha : linhas){
				System.out.println(linha);
				//System.out.println("teste");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public List obtemArquivoTXT(){
		
		try {
			List<String> linhas = Files.readAllLines(pathname,charset);
		return linhas;	
			
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;	
	}

}
