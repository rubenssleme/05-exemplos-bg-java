import javax.swing.JOptionPane;

public class CalculaMediaDe4Alunos2 {
	public static void main(String[] args) {
		Double nota=0.d,  media=0.d; int i = 1;
		for(int qtdeNotas=0; qtdeNotas<4; qtdeNotas++){
			nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i)+ "� nota: "));
			media = media + nota;
			i++;
		}
		JOptionPane.showMessageDialog(null,"A  M�dia do Aluno  � : " + (media/(i-1)));
	}
}