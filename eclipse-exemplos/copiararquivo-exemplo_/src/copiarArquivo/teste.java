package copiarArquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class teste {
	public static void main(String[] args) throws IOException {
		File arquivoOrigem = new File("c:/temp/original.txt");
		FileReader fis = new FileReader(arquivoOrigem);
		BufferedReader bufferedReader = new BufferedReader(fis);
		StringBuilder buffer = new StringBuilder();
		String line = "";
		while ((line = bufferedReader.readLine()) != null) {
			buffer.append(line).append("\n");			
		}
		fis.close();
		bufferedReader.close();
		File arquivoDestino = new File("C:/temp/copia.txt");
		FileWriter writer = new FileWriter(arquivoDestino);
		writer.write(buffer.toString());
		writer.flush();
		writer.close();
		System.out.println("Done.");
	}
}