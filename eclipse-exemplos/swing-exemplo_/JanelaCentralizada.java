import javax.swing.*;
public class JanelaCentralizada extends JFrame{
	public JanelaCentralizada (){
		super("Janela Centralizada");
		setSize(300, 150);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String args[]){
		JanelaCentralizada app = new JanelaCentralizada ();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}