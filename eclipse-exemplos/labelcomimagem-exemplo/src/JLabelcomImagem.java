import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabelcomImagem extends JFrame{
	JLabel imagem, jvelocidade;
	JButton botaosair;
	public JLabelcomImagem(){
		super("Uso da classe JLabel do Swing com Imagem");
		Container tela = getContentPane();
		ImageIcon icone = new ImageIcon("Duke.jpg");
		imagem = new JLabel(icone);
		//jvelocidade = new JLabel();
		
		
		setLayout(null);
		botaosair = new JButton ("Sair");
		botaosair.setBounds(200,50,100,20);
		botaosair.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						//System.exit(0);
						exibeV();
						
					}
				}
		);
		
		//tela.add(imagem);
		tela.add(botaosair);
		setSize(500, 460);
		setVisible(true);		
		
	}
	
	
	
	//Metodos calculo 
	public JLabel calculaVelocidade(){
		
		int velocidade = 0;
		velocidade = velocidade + 1;
		jvelocidade.setText(String.valueOf(velocidade));
		
		return jvelocidade;
		
	}
	
	public void exibeV(){
		
		jvelocidade = new JLabel(calculaVelocidade().toString());
		jvelocidade.setBounds(100,50,100,20);
		//tela.add(jvelocidade);
	}
	
	
	
}