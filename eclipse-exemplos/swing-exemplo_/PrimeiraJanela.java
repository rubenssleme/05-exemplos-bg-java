import javax.swing.*;

public class PrimeiraJanela extends JFrame{

	public PrimeiraJanela(){
		super("Nossa primeira janela");
		setSize(300, 150);
		setVisible(true); 
	}

	public static void main(String args[]){
		PrimeiraJanela app = new PrimeiraJanela();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	} 
	
}