
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploMsgJOptionPane extends JFrame{
	JButton erro, informacao, exclamacao, pergunta, nenhum;
	
	public ExemploMsgJOptionPane(){
		super("Exemplo de mensagens");
		Container tela = getContentPane();
		tela.setLayout(null);
		
		erro = new JButton("Erro");
		informacao = new JButton("Informa��o");
		exclamacao = new JButton("Exclama��o");
		pergunta = new JButton("Pergunta");
		nenhum = new JButton("Nenhum");
		
		erro.setBounds(30,20,100,20);
		informacao.setBounds(30,50,100,20);
		exclamacao.setBounds(30,80,150,20);
		pergunta.setBounds(30,110,100,20);
		nenhum.setBounds(30,140,100,20);
		
		tela.add(erro);
		tela.add(informacao);
		tela.add(exclamacao);
		tela.add(pergunta);
		tela.add(nenhum);
		
		erro.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						JOptionPane.showMessageDialog(null,"Voc� escolheu erro","Mensagem de Erro",JOptionPane.ERROR_MESSAGE,null);
					}
				}
		);
		
		informacao.addActionListener(
				new ActionListener(){ 
					public void actionPerformed(ActionEvent e){
						JOptionPane.showMessageDialog(null,"Voc� escolheu informa��o","Mensagem de Informa��o",JOptionPane.INFORMATION_MESSAGE,null);
					}
				}
		);
		
		exclamacao.addActionListener(
				new ActionListener(){ 
					public void actionPerformed(ActionEvent e){
						JOptionPane.showMessageDialog(null,"Voc� escolheu exclama��o","Mensagem de Exclama��o",JOptionPane.WARNING_MESSAGE,null);
					}
				}
		);
		
		pergunta.addActionListener(
				new ActionListener(){ 
					public void actionPerformed(ActionEvent e){
						JOptionPane.showMessageDialog(null,"Voc� escolheu pergunta","Mensagem de Pergunta",JOptionPane.QUESTION_MESSAGE,null);
					}
				}
		);
		
		nenhum.addActionListener(
				new ActionListener(){ 
					public void actionPerformed(ActionEvent e){
						JOptionPane.showMessageDialog(null,"Voc� escolheu nenhum","Mensagem",JOptionPane.PLAIN_MESSAGE,null);
					}
				}
		);
		
		setSize(300,200);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public static void main(String args[]){
		ExemploMsgJOptionPane app = new ExemploMsgJOptionPane();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}