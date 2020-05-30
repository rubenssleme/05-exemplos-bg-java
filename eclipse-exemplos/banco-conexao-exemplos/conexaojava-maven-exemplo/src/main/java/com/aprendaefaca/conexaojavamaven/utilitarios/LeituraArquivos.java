package com.aprendaefaca.conexaojavamaven.utilitarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class LeituraArquivos {

	private static final String CAMINHO_ARQUIVO_PROPERTIES = "application.properties";

	public ArrayList<String> Ler_Arquivo_Do_Banco_De_Dados(
			String caminho_do_arquivo) throws IOException {
		ArrayList<String> listaPropriedades = new ArrayList<String>();
		
		listaPropriedades.add(Ler_Arquivo(CAMINHO_ARQUIVO_PROPERTIES));	

		System.out
				.println("==================================================\nArquivo de Configura��o: "
						+ CAMINHO_ARQUIVO_PROPERTIES
						+ "\n==================================================\nPropriedades\n==================================================");
		for (String string : listaPropriedades) {
			System.out.println(string);
		}
		return listaPropriedades;
	}

	public String Ler_Arquivo(String caminho_do_arquivo) {
		Properties propriedade = new Properties();
		FileInputStream arquivo;
		StringBuilder sb = new StringBuilder();
		
		try {
			arquivo = new FileInputStream(caminho_do_arquivo);
			propriedade.load(arquivo);
			

			for (String properties : propriedade.stringPropertyNames()) {
				sb.append("[" + properties + "]: "
						+ propriedade.getProperty(properties) + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		LeituraArquivos u = new LeituraArquivos();

		u.Ler_Arquivo_Do_Banco_De_Dados(CAMINHO_ARQUIVO_PROPERTIES);

	}
}
