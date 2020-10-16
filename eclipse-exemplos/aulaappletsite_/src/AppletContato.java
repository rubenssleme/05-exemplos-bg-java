
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;


// Extende a classe JDialog com o intuito de definir um comportamento modal ao formulário 

@SuppressWarnings("serial")
public class AppletContato extends Applet implements ActionListener{
	
	// Declaração dos componentes
	private Button bInclusao,bConfirmar,bCancelar;
	private Label lData,lNome,lEmail,lMensagem;
	private TextField tfData,tfNome,tfEmail;
	private TextArea taMensagem;

	
	// O construtor fica preparado para receber os tres paramâtros
	public void init() {

		SimpleDateFormat formatoSDF = new SimpleDateFormat("dd MMM yyyy - HH:mm:ss");
		
		// Instancia os componentes (new) de define seu tamanho e posicionamento através do método setBounds
		lData = new Label("Data: ");
		lData.setBounds(20,20,70,20);
		lData.setBackground(Color.lightGray);
		tfData = new TextField(50);
		tfData.setBounds(100, 20, 140, 20);
		tfData.setText( formatoSDF.format(new Date()));
		tfData.setEnabled(false);
		
		lNome = new Label("Nome: ");
		lNome.setBounds(20,50,70,20);
		lNome.setBackground(Color.lightGray);
		tfNome = new TextField(50);
		tfNome.setBounds(100,50,300,20);

		lEmail = new Label("Email: ");
		lEmail.setBounds(20,80,70,20);
		lEmail.setBackground(Color.lightGray);
		tfEmail = new TextField(40);
		tfEmail.setBounds(100,80,300,20);

		lMensagem = new Label("Mensagem: ");
		lMensagem.setBounds(20,110,70,20);
		lMensagem.setBackground(Color.lightGray);
		taMensagem = new TextArea();
		taMensagem.setBounds(100,110,300,150);		

		bInclusao = new Button("Inclusão");
		bInclusao.setBounds(15, 300, 90, 25);
		bInclusao.addActionListener(this);

		bConfirmar = new Button("Salvar");
		bConfirmar.setBounds(115, 300, 90, 25);
		bConfirmar.addActionListener(this);

		bCancelar = new Button("Cancelar");
		bCancelar.setBounds(215, 300, 90, 25);
		bCancelar.addActionListener(this);

		
		// Adiciona os componentes criados ao container 
		add(lData);
		add(tfData);
		add(lNome);
		add(tfNome);
		add(lEmail);
		add(tfEmail);
		add(lMensagem);
		add(taMensagem);
		add(bInclusao);
		add(bConfirmar);
		add(bCancelar);

		// Define as propriedades da visualização do Applet
		setBackground(Color.lightGray);
		setLayout(null);
		desabilitaCampos();
		habilitaBotoes();
		setSize(420, 350);

	}

	// Métodos de comportamento do formulário

	public void habilitaBotoes(){
		bInclusao.setEnabled(true);
		bConfirmar.setEnabled(false);
		bCancelar.setEnabled(false);
	}

	public void desabilitaBotoes(){
		bInclusao.setEnabled(false);
		bConfirmar.setEnabled(true);
		bCancelar.setEnabled(true);
	}

	public void desabilitaCampos() {
		tfNome.setEnabled(false);
		tfEmail.setEnabled(false);
		taMensagem.setEnabled(false);
	}

	public void habilitaCampos() {
		tfNome.setEnabled(true);
		tfEmail.setEnabled(true);
		taMensagem.setEnabled(true);
	}

	public void limpaCampos() {
		tfNome.setText("");
		tfEmail.setText("");
		taMensagem.setText("");
	}

	public void posicionaFocoPrimeiro() {
		tfNome.requestFocus();
	}


	
	public void actionPerformed(ActionEvent e) {
		
		int resposta;
		
		if (e.getSource() == bInclusao){
			// Realiza chamadas a métodos da própria classe que contém as regras de navegabilidade 
			// dos componentes e tratamento dos dados obtidos pelo formulário
			habilitaCampos();
			desabilitaBotoes();
			posicionaFocoPrimeiro();
		}
		
		if (e.getSource() == bConfirmar){	
			resposta = JOptionPane.showConfirmDialog(null,"Confirma a inclusão?", "Confirmação.",JOptionPane.YES_NO_OPTION);
			if (resposta == 0) {
				acaoInclusao();
				limpaCampos();
				posicionaFocoPrimeiro();
			}		
		}
		
		if (e.getSource() == bCancelar){
			resposta = JOptionPane.showConfirmDialog(null,"Deseja realmente cancelar ?","Atenção.",JOptionPane.YES_NO_OPTION);
			if (resposta == 0) {
				desabilitaCampos();
				habilitaBotoes();
			}
		}
		
	}

		
		
		// Métodos que tratam (tratarão em breve) os dados obtidos pelo formulário
		
		public void acaoInclusao() {
			JOptionPane.showMessageDialog(null, "Realizará a inclusão no banco de dados","Em construção",JOptionPane.OK_OPTION);
		}
		

		
		
}
