package com.br.rubensleme.dominio.utilitario;


import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public  class LeituraArquivoTXT {
	
	Path pathname = Paths.get("C:\\arquivoTXT", "arquivo.txt");
	Charset charset = Charset.forName("ISO-8859-1");
	List<String> linhas;

	public List<String> getLinhas() {

		try {
			List<String> linhas = Files.readAllLines(pathname,charset);
			return linhas;	

		} catch (Exception e) {
			System.out.println(e);
		}

		return linhas;
	}


	public void setLinhas(List<String> linhas) {
		this.linhas = linhas;
	}





}
