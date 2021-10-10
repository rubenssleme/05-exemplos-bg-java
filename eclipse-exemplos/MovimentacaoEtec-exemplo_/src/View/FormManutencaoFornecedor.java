package View;
import java.awt.Container;
import java.awt.Frame;

import javax.swing.JLabel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class FormManutencaoFornecedor extends FormPaiManutencao {

	JLabel lCodigo,lNome,lEndereco,lComplemento,lBairro,lCidade,lEstado,lTelefone; //,lCelular,lCPF,lRG;
	JTextField tFCodigo,tFNome,tFEndereco,tFComplemento,tFBairro,tFCidade,tFEstado,tFTelefone; //,tFCelular,tFCPF,tFRG;

	public FormManutencaoFornecedor(Frame owner, String title,boolean modal) {
		super(owner,title,modal);
		Container tela = getContentPane();
		setLayout(null);

		lCodigo = new JLabel("Código: ");
		lCodigo.setBounds(70,50,100,20);
		tFCodigo = new JTextField(5);
		tFCodigo.setBounds(120, 50, 50, 20);

		lNome = new JLabel("Nome: ");
		lNome.setBounds(70,80,100,20);
		tFNome = new JTextField(50);
		tFNome.setBounds(120, 80, 380, 20);

		lEndereco = new JLabel("Endereço: ");
		lEndereco.setBounds(70,110,150,20);
		tFEndereco = new JTextField(50);
		tFEndereco.setBounds(140,110,380,20);
		
		lComplemento = new JLabel("Complemento: ");
		lComplemento.setBounds(70,140,180,20);
		tFComplemento = new JTextField(50);
		tFComplemento.setBounds(160,140,380,20);
		
		lBairro = new JLabel("Bairro: ");
		lBairro.setBounds(70,170,150,20);
		tFBairro = new JTextField(40);
		tFBairro.setBounds(120,170,280,20);
		
		lCidade = new JLabel("Cidade: ");
		lCidade.setBounds(70,200,150,20);
		tFCidade = new JTextField(40);
		tFCidade.setBounds(120,200,280,20);
		
		lEstado = new JLabel("Estado: ");
		lEstado.setBounds(70,230,150,20);
		tFEstado = new JTextField(2);
		tFEstado.setBounds(120,230,25,20);
		
		lTelefone = new JLabel("Telefone: ");
		lTelefone.setBounds(70,260,150,20);
		tFTelefone = new JTextField(12);
		tFTelefone.setBounds(130,260,180,20);

		/*
		lCelular = new JLabel("Celular: ");
		lCelular.setBounds(70,290,150,20);
		tFCelular = new JTextField(12);
		tFCelular.setBounds(120,290,180,20);
		
		lCPF = new JLabel("CPF: ");
		lCPF.setBounds(70,320,180,20);
		tFCPF = new JTextField(14);
		tFCPF.setBounds(120,320,380,20);
		
		lRG = new JLabel("RG: ");
		lRG.setBounds(70,350,180,20);
		tFRG = new JTextField(15);
		tFRG.setBounds(120,350,380,20);
		*/
		
		posicionaBotoes(400,100,20,20,10);

		tela.add(lCodigo);
		tela.add(tFCodigo);
		tela.add(lNome);
		tela.add(tFNome);
		tela.add(lEndereco);
		tela.add(tFEndereco);
		tela.add(lComplemento);
		tela.add(tFComplemento);
		tela.add(lBairro);
		tela.add(tFBairro);
		tela.add(lCidade);
		tela.add(tFCidade);
		tela.add(lEstado);
		tela.add(tFEstado);
		tela.add(lTelefone);
		tela.add(tFTelefone);
		/*
		tela.add(lCelular);
		tela.add(tFCelular);
		tela.add(lCPF);
		tela.add(tFCPF);
		tela.add(lRG);
		tela.add(tFRG);
		*/
		tela.add(bInclusao);
		tela.add(bAlteracao);
		tela.add(bExclusao);
		tela.add(bConsulta);
		tela.add(bSalvar);
		tela.add(bCancelar);
		
		desabilitaCampos();
		habilitaBotoes();
		setSize(710, 480);
		setResizable(false);
		setLocationRelativeTo(null);

	}

	public void acaoAlteracao() {
			
	}

	public void acaoConsulta() {
		
	}

	public void acaoExclusao() {
		
	}

	public void acaoInclusao() {
		
	}

	public void desabilitaCampos() {
		tFCodigo.setEnabled(false);
		tFNome.setEnabled(false);
		tFEndereco.setEnabled(false);
		tFComplemento.setEnabled(false);
		tFBairro.setEnabled(false);
		tFCidade.setEnabled(false);
		tFEstado.setEnabled(false);
		tFTelefone.setEnabled(false);
		/*
		tFCelular.setEnabled(false);
		tFCPF.setEnabled(false);
		tFRG.setEnabled(false);
		*/		
	}

	public void habilitaCampos() {
		tFCodigo.setEnabled(true);
		tFNome.setEnabled(true);
		tFEndereco.setEnabled(true);
		tFComplemento.setEnabled(true);
		tFBairro.setEnabled(true);
		tFCidade.setEnabled(true);
		tFEstado.setEnabled(true);
		tFTelefone.setEnabled(true);
		/*
		tFCelular.setEnabled(true);
		tFCPF.setEnabled(true);
		tFRG.setEnabled(true);
		*/
	}

	public void limpaCampos() {
		tFCodigo.setText("");
		tFNome.setText("");
		tFEndereco.setText("");
		tFComplemento.setText("");
		tFBairro.setText("");
		tFCidade.setText("");
		tFEstado.setText("");
		tFTelefone.setText("");
		/*
		tFCelular.setText("");
		tFCPF.setText("");
		tFRG.setText("");
		*/
	}

	public void posicionaFocoPrimeiro() {
		tFCodigo.requestFocus();
	}
	
}
