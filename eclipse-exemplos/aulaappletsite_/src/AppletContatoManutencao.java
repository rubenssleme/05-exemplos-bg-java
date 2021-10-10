
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


// Extende a classe JDialog com o intuito de definir um comportamento modal ao formul�rio 

@SuppressWarnings("serial")
public class AppletContatoManutencao extends Applet implements ActionListener{
	
	// Declara��o dos componentes
	private Button bInclusao,bAlteracao,bExclusao,bConsulta,bPesquisar,bConfirmar,bCancelar;
	private Label lCodigo,lData,lNome,lEmail,lMensagem;
	private TextField tfCodigo,tfData,tfNome,tfEmail;
	private TextArea taMensagem;

	// Atributo respons�vel pela disten��o entre inclus�o e altera��o no m�todo actionPerformed do bot�o salvar (bSalvar)
	private String operacao;
	
	// Inicializa��o das vari�veis que controlam tamanho e posicionamento dos bot�es
	int bLinha = 320;
	int bLargura = 90;
	int bAltura = 25;
	int bMargem = 15;
	int bDistancia = 10;
	
	// O construtor fica preparado para receber os tres param�tros
	public void init() {

		lCodigo = new Label("Codigo: ");
		lCodigo.setBounds(120,20,70,20);
		lCodigo.setBackground(Color.BLACK);
		lCodigo.setForeground(Color.WHITE);
		tfCodigo = new TextField();
		tfCodigo.setBounds(200,20,50,20);
		
		SimpleDateFormat formatoSDF = new SimpleDateFormat("dd MMM yyyy - HH:mm:ss");

		// Instancia os componentes (new) de define seu tamanho e posicionamento atrav�s do m�todo setBounds
		lData = new Label("Data: ");
		lData.setBounds(120,50,70,20);
		lData.setBackground(Color.BLACK);
		lData.setForeground(Color.WHITE);
		tfData = new TextField();
		tfData.setBounds(200,50,140,20);
		tfData.setText( formatoSDF.format(new Date()));
		tfData.setEnabled(false);
		
		lNome = new Label("Nome: ");
		lNome.setBounds(120,80,70,20);
		lNome.setBackground(Color.BLACK);
		lNome.setForeground(Color.WHITE);
		tfNome = new TextField();
		tfNome.setBounds(200,80,300,20);

		lEmail = new Label("Email: ");
		lEmail.setBounds(120,110,70,20);
		lEmail.setBackground(Color.BLACK);
		lEmail.setForeground(Color.WHITE);
		tfEmail = new TextField();
		tfEmail.setBounds(200,110,300,20);

		lMensagem = new Label("Mensagem: ");
		lMensagem.setBounds(120,140,70,20);
		lMensagem.setBackground(Color.BLACK);
		lMensagem.setForeground(Color.WHITE);
		taMensagem = new TextArea();
		taMensagem.setBounds(200,140,300,150);		

		bInclusao = new Button("Inclus�o");
		bInclusao.setBounds( bMargem, bLinha, bLargura, bAltura);
		bInclusao.addActionListener(this);

		bAlteracao = new Button("Altera��o");
		bAlteracao.setBounds( bLargura + bDistancia + bMargem, bLinha, bLargura, bAltura);
		bAlteracao.addActionListener(this);

		bExclusao = new Button("Exclus�o");
		bExclusao.setBounds( ( ( bLargura + bDistancia )*2) + bMargem, bLinha, bLargura, bAltura);
		bExclusao.addActionListener(this);

		bConsulta = new Button("Consulta");
		bConsulta.setBounds( ( ( bLargura + bDistancia )*3) + bMargem, bLinha, bLargura, bAltura);
		bConsulta.addActionListener(this);

		bPesquisar = new Button("Pesquisar");
		bPesquisar.setBounds(260, 20, 140, 20);
		bPesquisar.addActionListener(this);
		
		bConfirmar = new Button("Confirma");
		bConfirmar.setBounds( ( ( bLargura + bDistancia )*4) + bMargem, bLinha, bLargura, bAltura);
		bConfirmar.addActionListener(this);

		bCancelar = new Button("Cancelar");
		bCancelar.setBounds( ( ( bLargura + bDistancia)*5) + bMargem, bLinha, bLargura, bAltura);
		bCancelar.addActionListener(this);

		// Adiciona os componentes criados ao container 
		add(lCodigo);
		add(tfCodigo);
		add(lData);
		add(tfData);
		add(lNome);
		add(tfNome);
		add(lEmail);
		add(tfEmail);
		add(lMensagem);
		add(taMensagem);
		add(bInclusao);
		add(bAlteracao);
		add(bExclusao);
		add(bConsulta);
		add(bPesquisar);
		add(bConfirmar);
		add(bCancelar);

		
		// Define as propriedades do JFrame (janela)
		setLayout(null);
		setBackground(Color.BLACK);
		desabilitaCampos();
		habilitaBotoes();
		setSize(620, 380);

	}

	// get e set do atributo operacao usado para distinguir entre inclus�o e altera��o

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	
	// M�todos de comportamento do formul�rio

	public void habilitaBotoes(){
		bInclusao.setEnabled(true);
		bAlteracao.setEnabled(true);
		bExclusao.setEnabled(true);
		bConsulta.setEnabled(true);

		bConfirmar.setEnabled(false);
		bCancelar.setEnabled(false);
	}

	public void desabilitaBotoes(){
		bInclusao.setEnabled(false);
		bAlteracao.setEnabled(false);
		bExclusao.setEnabled(false);
		bConsulta.setEnabled(false);

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
			setOperacao("Inclus�o");
			habilitaCampos();
			desabilitaBotoes();
			posicionaFocoPrimeiro();
		}
		
		if (e.getSource() == bAlteracao){
			setOperacao("Altera��o");
			habilitaCampos();
			desabilitaBotoes();
			posicionaFocoPrimeiro();
		}
		
		if (e.getSource() == bExclusao){
			resposta = JOptionPane.showConfirmDialog(null,"Confirma a Exclus�o ?","Aten��o.",JOptionPane.YES_NO_OPTION);
			if (resposta == 0) {
				acaoExclusao();
				desabilitaCampos();
				habilitaBotoes();
			}
		}

		
		if (e.getSource() == bConsulta){
			acaoConsulta();
		}

		if (e.getSource() == bPesquisar){
			acaoPesquisar();
		}

		
		if (e.getSource() == bConfirmar){
			resposta = JOptionPane.showConfirmDialog(null,"Confirma a " + operacao + " ?", "Confirma��o.",JOptionPane.YES_NO_OPTION);
			if (resposta == 0) {
				if (operacao.equals("Inclus�o")){
					acaoInclusao();
					limpaCampos();
					posicionaFocoPrimeiro();
				}
				else {
					if (operacao.equals("Altera��o"))
						acaoAlteracao();
					desabilitaCampos();
					habilitaBotoes();
				}
			}
		}
		
		
		if (e.getSource() == bCancelar){
			resposta = JOptionPane.showConfirmDialog(null,"Deseja realmente cancelar ?","Aten��o.",JOptionPane.YES_NO_OPTION);
			if (resposta == 0) {
				desabilitaCampos();
				habilitaBotoes();
			}
		}
		
	}

	
	
	
	// M�dotos que tratam (tratar�o em breve) os dados obtidos pelo formul�rio
	
	public void acaoInclusao() {
		JOptionPane.showMessageDialog(null, "Realizar� a inclus�o no banco de dados","Em constru��o",JOptionPane.OK_OPTION);
	}
	
	public void acaoAlteracao() {
		JOptionPane.showMessageDialog(null, "Realizar� a altera��o no banco de dados","Em constru��o",JOptionPane.OK_OPTION);
	}

	public void acaoConsulta() {
		JOptionPane.showMessageDialog(null, "Realizar� a consulta no banco de dados","Em constru��o",JOptionPane.OK_OPTION);
	}

	public void acaoPesquisar() {
		JOptionPane.showMessageDialog(null, "Realizar� uma pesquisa no banco de dados","Em constru��o",JOptionPane.OK_OPTION);
	}

	public void acaoExclusao() {
		JOptionPane.showMessageDialog(null, "Realizar� a exclus�o no banco de dados","Em constru��o",JOptionPane.OK_OPTION);
	}



}
