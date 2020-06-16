import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploMinusculas extends JFrame{
	JButton copiar,limpar;
	JLabel rotulo1,rotulo2;
	JTextField texto1,texto2;
	public ExemploMinusculas(){
		super("Exemplo de saídas minúsculas");
		Container tela = getContentPane();
		tela.setLayout(null);
		rotulo1 = new JLabel("Nome: ");
		rotulo2 = new JLabel("Nome: ");
		texto1 = new JTextField(20);
		texto2 = new JTextField(20);
		copiar = new JButton("Copiar");
		limpar = new JButton("Limpar");
		rotulo1.setBounds(20,30,50,20);
		rotulo2.setBounds(20,60,50,20);
		texto1.setBounds(60,30,180,20);
		texto2.setBounds(60,60,180,20);
		copiar.setBounds(20,130,100,20);
		limpar.setBounds(180,130,100,20);
		copiar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String texto;
				texto = texto1.getText().toUpperCase();
				texto1.setText(texto);
				texto2.setText(texto1.getText().toLowerCase());}});
		limpar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				texto1.setText("");
				texto2.setText("");
				texto1.requestFocus();}});
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(texto1);
		tela.add(texto2);
		tela.add(copiar);
		tela.add(limpar);
		setSize(300,200);
		setVisible(true);
		setLocationRelativeTo(null);}
	public static void main(String args[]){
		ExemploMinusculas app = new ExemploMinusculas();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}