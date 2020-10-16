import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ExemploRadioButton extends JFrame{
	
	JRadioButton primeira,segunda,terceira,quarta,quinta;
	JLabel rotulo,rotulo2;
	JButton exibir;
	ButtonGroup grupo;
	
	public ExemploRadioButton(){
		
		super("Exemplo de um JRadioButton");
		Container tela = getContentPane();
		tela.setLayout(null);
		
		rotulo = new JLabel("Escolha uma cidade: ");
		rotulo.setBounds(50,20,200,20);
		
		rotulo2 = new JLabel("");
		rotulo2.setBounds(150,240,400,20);
		
		exibir = new JButton ("Exibir");
		exibir.setBounds(200,200,120,20);

		primeira = new JRadioButton("Rio de Janeiro");
		segunda = new JRadioButton("São Paulo");
		terceira = new JRadioButton("Minas Gerais");
		quarta = new JRadioButton("Amazonas");
		quinta = new JRadioButton("Rio Grande do Sul");

		grupo = new ButtonGroup();
		
		primeira.setBounds(50,50,120,20);
		segunda.setBounds(50,80,120,20);
		terceira.setBounds(50,110,120,20);
		quarta.setBounds(50,140,120,20);
		quinta.setBounds(50,170,200,20);

		primeira.setMnemonic(KeyEvent.VK_J);
		segunda.setMnemonic(KeyEvent.VK_C);
		terceira.setMnemonic(KeyEvent.VK_D);
		quarta.setMnemonic(KeyEvent.VK_V);
		quinta.setMnemonic(KeyEvent.VK_P);
		
		grupo.add(primeira);
		grupo.add(segunda);
		grupo.add(terceira);
		grupo.add(quarta);
		grupo.add(quinta);

		tela.add(rotulo);
		tela.add(primeira);
		tela.add(segunda);
		tela.add(terceira);
		tela.add(quarta);
		tela.add(quinta);
		tela.add(exibir);
		tela.add(rotulo2);
		setSize(500,300);
		setLocationRelativeTo(null);
		setVisible(true);
			
		
		exibir.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if (primeira.isSelected() == true)
							rotulo2.setText("A cidade escolhida foi: " + primeira.getText());
						if (segunda.isSelected() == true)
							rotulo2.setText("A cidade escolhida foi: " + segunda.getText());
						if (terceira.isSelected() == true)
							rotulo2.setText("A cidade escolhida foi: " + terceira.getText());
						if (quarta.isSelected() == true)
							rotulo2.setText("A cidade escolhida foi: " + quarta.getText());
						if (quinta.isSelected() == true)
							rotulo2.setText("A cidade escolhida foi: " + quinta.getText());
					}
				}
		);

		
	}
	public static void main (String args[]){
		ExemploRadioButton app = new ExemploRadioButton();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}