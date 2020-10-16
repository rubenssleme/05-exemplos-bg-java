package importadorTXT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class LerQuebrarArquivo {


	
	public String lerArquivo() throws FileNotFoundException{
		Scanner scanner = new Scanner(new FileReader("dados.txt"));
		String line = scanner.nextLine();

		while (scanner.hasNextLine()) {
			
				
			// System.out.println(line);
			//JOptionPane.showMessageDialog(null, line);
		}
		return line;
	}
	
	
	public void quebrarArq(String txt){
		String c = txt ;
		String[] t = c.split (Pattern.quote (",")); 
		int i=0;
		while (t.length > i) {
			if (i == 6){
				String k =(	t[i]+ " - aqui -");
				i++;
				System.out.println(k + t[i]);
				i++;
			}
		System.out.println(t[i]);
		i++;
		}
		JOptionPane.showMessageDialog(null, t.length + "---" + i);
	}
	
}