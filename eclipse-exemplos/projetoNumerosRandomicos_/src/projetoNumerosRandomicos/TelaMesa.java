package projetoNumerosRandomicos;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaMesa extends JFrame {
	Random r = new Random();
	JLabel jlaImagem;
	JButton jbuJogar;
	int i = 0;

	//Usando contrutor
	public TelaMesa(){
		super("Definindo a cor de fundo do formulario"); 
		Container tela = getContentPane(); 
		tela.setBackground(Color.blue);
		Icon imagem = gerarNumeroEImagem(i);

		jlaImagem = new JLabel(null,imagem,JLabel.CENTER);
		jbuJogar = new JButton("Jogar");
		jbuJogar.setBounds(195,50,200,30);
		jbuJogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Icon imagem = gerarNumeroEImagem(i);
				jlaImagem.setIcon(imagem);
				tela.repaint();
	
			}
		});

		tela.add(jbuJogar);
		tela.add(jlaImagem);
		setSize(600, 600);
		setVisible(true);
	}

	private Icon gerarNumeroEImagem(int i2) {
		i = r.nextInt(52);
		Icon imagem = new ImageIcon("D:\\06-arquivo-backup\\file-clouds\\OneDrive - Centro Paula Souza - Etec\\02-documentos\\cartas\\"+ i +".png");
		return imagem;
	}


}



