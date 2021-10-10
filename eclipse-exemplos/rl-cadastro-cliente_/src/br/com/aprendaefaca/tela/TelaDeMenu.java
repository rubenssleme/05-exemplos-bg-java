package br.com.aprendaefaca.tela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaDeMenu extends JFrame {

	 
	    JMenuBar barra;
	    JMenu opcoes,fonte,cor;
	    JMenuItem limpar,outro,estilo,tamanho,azul,verde,vermelho,amarelo,preto,sair;
	 
	    public TelaDeMenu(){
	 
	        super("Exemplo de Menus com submenus");
	        Container tela = getContentPane();
	        tela.setLayout(null);
	 
	        barra = new JMenuBar();
	        setJMenuBar(barra);
	 
	        opcoes = new JMenu("Opções");            
	        limpar = new JMenuItem("Limpar");
	        fonte = new JMenu("Fonte");
	        sair = new JMenuItem("Sair");
	        sair.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e){
	                int resposta;
	                resposta = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?","Mensagem do Programa",JOptionPane.YES_NO_OPTION);
	                if (resposta == 0)
	                    System.exit(0);
	            }
	        });
	 
	        cor = new JMenu("Cor");
	        azul = new JMenuItem("Azul");
	        verde = new JMenuItem("Verde");
	        vermelho = new JMenuItem("Vermelho");
	        amarelo = new JMenuItem("Amarelo");
	        preto = new JMenuItem("Preto");
	        estilo = new JMenuItem("Estilo");
	        tamanho = new JMenuItem("Tamanho");
	        outro = new JMenuItem("Outro");
	 
	        limpar.setMnemonic(KeyEvent.VK_L);
	        fonte.setMnemonic(KeyEvent.VK_F);
	        outro.setMnemonic(KeyEvent.VK_S);
	        cor.setMnemonic(KeyEvent.VK_C);
	        estilo.setMnemonic(KeyEvent.VK_E);
	        tamanho.setMnemonic(KeyEvent.VK_T);
	 
	        barra.add(opcoes);
	        barra.add(sair);
	        opcoes.add(limpar);
	        opcoes.add(fonte);
	        opcoes.addSeparator();
	        opcoes.add(outro);
	        fonte.add(cor);
	        fonte.add(estilo);
	        fonte.add(tamanho);
	        cor.add(azul);
	        cor.add(verde);
	        cor.add(vermelho);
	        cor.add(amarelo);
	        cor.add(preto);
	 
	        setSize(500,300);
	        setLocationRelativeTo(null);
	        setVisible(true);
	        setExtendedState(MAXIMIZED_BOTH);
	        setResizable(false);
	    }

		
	
	
	
	
}
