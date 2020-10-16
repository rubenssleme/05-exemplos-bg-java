package importadorTXT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ImportadorTXT {
	
	

	public static void main(String[] args) throws Exception {
	
		LerQuebrarArquivo txt = new LerQuebrarArquivo();
		//txt.lerArquivo();
		txt.quebrarArq(txt.lerArquivo());
		
		}
		
		
		
		
		
	}


