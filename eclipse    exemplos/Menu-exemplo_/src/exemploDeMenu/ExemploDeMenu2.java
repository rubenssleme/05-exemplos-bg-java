package exemploDeMenu;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class ExemploDeMenu2 extends JFrame{
	JMenuBar jmbBarra;
	JMenu jmeOpcoes,jmeFonte,jmeCor;
	JMenuItem jmiLimpar,jmiOutro,jmiEstilo,jmiTamanho,
	jmiAzul,jmiVerde,jmiVermelho,jmiAmarelo,jmiPreto,jmiSair;
	Container tela;
    AlterarCorDeFundo alterarCorDeFundo1 = new AlterarCorDeFundo();
	public ExemploDeMenu2(){
		super("Exemplo de Menus com submenus");
		 tela = getContentPane();
		 
		
				
		jmbBarra = new JMenuBar();
		setJMenuBar(jmbBarra);

		jmeOpcoes = new JMenu("Opções");			
		jmiLimpar = new JMenuItem("Limpar");
		jmeFonte = new JMenu("Fonte");
		jmiSair = new JMenuItem("Sair");
		jmiSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta;
				resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", 
						"Mensagem do Programa", JOptionPane.YES_NO_OPTION);
				if(resposta == 0){
					System.exit(EXIT_ON_CLOSE);
				}
				
			}
		});
		
		jmeCor = new JMenu("Cor");
		jmiAzul = new JMenuItem("Azul");
		jmiAzul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tela = alterarCorDeFundo1.mudarCorDeFundo(tela,jmiAzul.getText());		
			}
		});
		jmiVerde = new JMenuItem("Verde");
		jmiVerde.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tela = alterarCorDeFundo1.mudarCorDeFundo(tela,jmiVerde.getText());
				
			}
		});
		jmiVermelho = new JMenuItem("Vermelho");
		jmiAmarelo = new JMenuItem("Amarelo");
		jmiPreto = new JMenuItem("Preto");
		jmiEstilo = new JMenuItem("Estilo");
		jmiTamanho = new JMenuItem("Tamanho");


		jmiOutro = new JMenuItem("Outro");

		jmiLimpar.setMnemonic(KeyEvent.VK_L);
		jmeFonte.setMnemonic(KeyEvent.VK_F);
		jmiOutro.setMnemonic(KeyEvent.VK_S);
		jmeCor.setMnemonic(KeyEvent.VK_C);
		jmiEstilo.setMnemonic(KeyEvent.VK_E);
		jmiTamanho.setMnemonic(KeyEvent.VK_T);


		jmbBarra.add(jmeOpcoes);
		jmbBarra.add(jmiSair);
		jmeOpcoes.add(jmiLimpar);
		jmeOpcoes.add(jmeFonte);
		jmeOpcoes.addSeparator();
		jmeOpcoes.add(jmiOutro);
		jmeFonte.add(jmeCor);
		jmeFonte.add(jmiEstilo);
		jmeFonte.add(jmiTamanho);
		jmeCor.add(jmiAzul);
		jmeCor.add(jmiVerde);
		jmeCor.add(jmiVermelho);
		jmeCor.add(jmiAmarelo);
		jmeCor.add(jmiPreto);


		setSize(500,300);
		setVisible(true);

	}


}
