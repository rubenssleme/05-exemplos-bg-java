import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class DefinirIcone extends JFrame{
	JLabel lblIcone;
	public DefinirIcone(){
		super("Como definir o ícone para a janela");
		Container tela = getContentPane();
		setLocationRelativeTo(null);
		
		ImageIcon icone = new ImageIcon("cadeado.png");
		setIconImage(icone.getImage());
		
		
		lblIcone = new JLabel();
		lblIcone.setBounds(10,10,50,50);
		lblIcone.setBackground(new Color(0,255,255));
		lblIcone.setIcon(new ImageIcon("cadeado.png"));
		lblIcone.
	
		//tela.add(lblIcone);
		
		setSize(400, 250);
		setVisible(true);
	}
	
	public static void main(String args[]){
		DefinirIcone app = new DefinirIcone();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}