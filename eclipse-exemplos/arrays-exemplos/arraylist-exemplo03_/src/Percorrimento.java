import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Percorrimento {

	public static void main(String args[]){
		String entradaNome = "";
		String entradaCodigo = "";
		
		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
			
		do{	
			entradaCodigo = JOptionPane.showInputDialog("Digite o codigo do aluno");
			if (entradaCodigo.equals("0")) 
				break;
			
			entradaNome = JOptionPane.showInputDialog("Digite o nome do aluno");
				
			Pessoa p = new Pessoa(entradaCodigo, entradaNome);
			
			//Não é possível inserir um valor diferente de Pessoa
			//listaTipada.add(entradaNome);
			
			listaPessoa.add(p);
		}while( true );
		
		StringBuilder msg = new StringBuilder();
		
		for (Pessoa p : listaPessoa) {
			msg.append(p.toString());
			msg.append("\n");
		}
		
		JOptionPane.showMessageDialog(null, msg);
		
		
	}
}



