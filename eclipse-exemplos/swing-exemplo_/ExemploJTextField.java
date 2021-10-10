import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ExemploJTextField extends JFrame{
	JLabel lblNome;
	JTextField txtNome;
	JButton btnOK, jbuSair;
	public ExemploJTextField (){
		super("Exemplo com JTextField");
		Container tela = getContentPane();
		setLayout(null);
		lblNome = new JLabel ("Nome: ");
		lblNome.setBounds(50,10,80,20);
		txtNome = new JTextField(50);
		txtNome.setBounds(50,30,200,20);
		btnOK = new JButton("OK");
		btnOK.setBounds(50,150,60,20);
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String txtEndereco =  "Rua sem fim";
		JOptionPane.showMessageDialog(null, "Nome: " + txtNome.getText() + "\nEndereço: " + txtEndereco );		
				
			}
		});


		jbuSair = new JButton("Sair");
		jbuSair.setBounds(150,150,100,20);
		jbuSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Deseja Sair?","Tela Saida", JOptionPane.YES_NO_OPTION);
				if(i == JOptionPane.YES_OPTION){
					System.exit(0);
				}else{
					//JOptionPane.showMessageDialog(null, "OK");
				}
			}
		});
		
		tela.add(lblNome);
		tela.add(txtNome);
		tela.add(btnOK);
		tela.add(jbuSair);
		setSize(400, 250);
		setVisible(true);
		setLocationRelativeTo(null);

	}
	public static void main(String args[]){
		ExemploJTextField app = new ExemploJTextField();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}