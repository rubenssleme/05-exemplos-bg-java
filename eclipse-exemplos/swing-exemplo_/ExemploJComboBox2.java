import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploJComboBox2 extends JFrame{
	JComboBox lista;
	String cidades[] = {"Rio de Janeiro","S�o Paulo","Minas Gerais","Esp�rito Santo",
			            "Bahia","Pernambuco","Rio Grande do Sul","Acre"};
			JButton exibir;
			JLabel rotulo;
			public ExemploJComboBox2(){
				super("Exemplo de JComboBox");
				Container tela = getContentPane();
				setLayout(null);
				exibir = new JButton("Exibir");
				rotulo = new JLabel("");
				lista = new JComboBox(cidades);
				lista.setEditable(true);
				lista.setMaximumRowCount(5);
				lista.setBounds(50,50,150,30);
				exibir.setBounds(270,50,100,30);
				rotulo.setBounds(50,150,200,30);
				exibir.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						rotulo.setText("o estado �: "+lista.getSelectedItem().toString());
					}});
				tela.add(lista);
				tela.add(exibir);
				tela.add(rotulo);
				setSize(400, 250);
				setVisible(true);
			}
			public static void main(String args[]){
				ExemploJComboBox2 app = new ExemploJComboBox2();
				app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			} }