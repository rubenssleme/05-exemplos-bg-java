import javax.swing.JOptionPane;

public class CalculaMediaDe4Alunos2 {
	public static void main(String[] args) {
		Double nota=0.d,  media=0.d; int i = 1;
		for(int qtdeNotas=0; qtdeNotas<4; qtdeNotas++){
			nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i)+ "º nota: "));
			media = media + nota;
			i++;
		}
		JOptionPane.showMessageDialog(null,"A  Média do Aluno  é : " + (media/(i-1)));
	}
}