import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class FCadastra extends Frame implements ActionListener, WindowListener {
	
	private String operacao;
	private Button bCancelar, bOK, bConsultar, bExcluir, bAlterar, bEnviar;
	private TextField tNiveldeAcesso, tSenha, tApelido, tNome;
	private Label lNiveldeAcesso, lSenha, lApelido, lNome;
	
	public FCadastra(){
				
		
		lNome= new Label("Nome:");
		lNome.setSize(40,20);
		lNome.setLocation(150,50);
		
		tNome= new TextField();
		tNome.setSize(90,20);
		tNome.setLocation(150,50);
						
		lApelido= new Label("Apelido:");
		lApelido.setSize(60,20);
		lApelido.setLocation(50,100);
		
		tApelido= new TextField();
		tApelido.setSize(90,20);
		tApelido.setLocation(150,100);
				
		lSenha= new Label("Senha:");
		lSenha.setSize(40,20);
		lSenha.setLocation(50,150);
		
		tSenha= new TextField();
		tSenha.setSize(90,20);
		tSenha.setLocation(150,150);
		tSenha.setEchoChar('*');
		
		
		lNiveldeAcesso= new Label("Nivle de Acesso:");
		lNiveldeAcesso.setSize(100,20);
		lNiveldeAcesso.setLocation(50,200);
		
		tNiveldeAcesso= new TextField();
		tNiveldeAcesso.setSize(90,20);
		tNiveldeAcesso.setLocation(150,200);
				
		bEnviar= new Button("Enviar");
		bEnviar.setSize(70,30);
		bEnviar.setLocation(30,250);
		bEnviar.addActionListener(this);
		
		bAlterar= new Button("Alterar");
		bAlterar.setSize(70,30);
		bAlterar.setLocation(150,250);
		bAlterar.addActionListener(this);
		
		bExcluir= new Button("Excluir");
		bExcluir.setSize(70,30);
		bExcluir.setLocation(270,250);
		bExcluir.addActionListener(this);
		
		bConsultar= new Button("Consultar");
		bConsultar.setSize(70,30);
		bConsultar.setLocation(400,250);
		bConsultar.addActionListener(this);
		
		bOK= new Button("OK");
		bOK.setSize(70,30);
		bOK.setLocation(520,250);
		bOK.addActionListener(this);
		
		bCancelar= new Button("Cancelar");
		bCancelar.setSize(70,30);
		bCancelar.setLocation(640,250);
		bCancelar.addActionListener(this);
		
		this.operacao= "";
		
		this.setTitle("Cadastro");
		this.setResizable(false);
		this.setSize(750,400);
		this.setLocation(400,200);
		this.setBackground(Color.cyan);
		this.setLayout(null);
		this.habilitaCampos(false);
		this.habilitaBotoes(true);
		
		this.add(lNome);
		this.add(tNome);
		this.add(lApelido);
		this.add(tApelido);
		this.add(lSenha);
		this.add(tSenha);
		this.add(lNiveldeAcesso);
		this.add(tNiveldeAcesso);
		this.add(bEnviar);
		this.add(bAlterar);
		this.add(bExcluir);
		this.add(bConsultar);
		this.add(bOK);
		this.add(bCancelar);
		this.addWindowListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==bCancelar){
			System.exit(0);			
		}
		else{
			if(e.getSource()==bEnviar){
				this.operacao="Inclusão";
				this.habilitaCampos(true);
				this.habilitaBotoes(false);
				tNome.requestFocus();
				}
			else{
				if(e.getSource()==bAlterar){
					this.operacao="Alteracao";
					this.habilitaCampos(true);
					this.habilitaBotoes(false);
					tNome.requestFocus();
									
				}
				else{
					if(e.getSource()==bExcluir){
						int resposta= JOptionPane.showConfirmDialog(null, "Deseja confirmar a exclusão deste usuário?");
						if(resposta== JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null,  "Usuário excluído.");							
						}
						else{
							JOptionPane.showMessageDialog(null,"Usuário não excluído.");
						}						
					}
					else{
						if(e.getSource()==bConsultar){
							String apelido;
							apelido= JOptionPane.showInputDialog("Digite o Apelido do usuário procurado:");
						}
						else{
							if(e.getSource()==bOK){
								if(this.consisteCampos()){
									int resposta= JOptionPane.showConfirmDialog(null, "Deseja confirma a concatenação com o conteúdo da operação?");
									if(resposta== JOptionPane.YES_OPTION ){
										JOptionPane.showMessageDialog(null, this.operacao + " efetuada");
										this.limpaCampos();
										if(this.operacao=="Inclusão"){
											tNome.requestFocus();											
										}
										else{
											if(this.operacao=="Alteração"){
												this.habilitaCampos(false);
												this.habilitaBotoes(true);
												this.operacao="";
											}
										}
										
									}
								}
								else{
									tNome.requestFocus();
								}
							}
							else{
								if(e.getSource()== bCancelar){
									this.limpaCampos();
									this.habilitaCampos(false);
									this.habilitaBotoes(true);
									
								}
							}
						}
					}
				}
			}
		}
			}
	
	public void windowActivated(WindowEvent e){
		
	}
	
	public void windowClosed(WindowEvent e){
		
	}
	
	public void windowClosing(WindowEvent e){
		System.exit(0);		
	}
	
	public void windowDeactivated(WindowEvent e){
		
	}
	
	public void windowDeiconified(WindowEvent e){
		
	}
	
	public void windowIconified(WindowEvent e){
		
	}
	
	public void windowOpened(WindowEvent e){
		
	}
	
	public void habilitaCampos(boolean op){
		tNome.setEnabled(op);
		tApelido.setEnabled(op);
		tSenha.setEnabled(op);
		tNiveldeAcesso.setEnabled(op);
	}
	
	public void habilitaBotoes(boolean op){
		bEnviar.setEnabled(op);
		bAlterar.setEnabled(op);
		bExcluir.setEnabled(op);
		bConsultar.setEnabled(op);
		bOK.setEnabled(!op);
		bCancelar.setEnabled(!op);
		
	}
	
	public boolean consisteCampos(){
		
		if((tNome.getText().length()>0) && (tApelido.getText().length()>0)&& (tSenha.getText().length()>0) && (tNiveldeAcesso.getText().length()>0 )){
			return true;
		}
		else{
			if(tNome.getText().length()<=0){
			JOptionPane.showMessageDialog(null, "O Campo Nome não foi preenchido!");
			}
			else{
				if(tApelido.getText().length()<=0){
					JOptionPane.showMessageDialog(null, "O campo Apelido não foi preenchido!");
				}
				else{
					if(tSenha.getText().length()<=0){
						JOptionPane.showMessageDialog(null,"O campo Senha não foi preenchido!");
					}
					else{
						if(tNiveldeAcesso.getText().length()<=0){
							JOptionPane.showMessageDialog(null,"O campo Nível de Acesso não foi preenchido!");
							
						}
					}
				}
			}
		}
		return false;
		}
	
	public void limpaCampos(){
		tNome.setText(null);
		tApelido.setText(null);
		tSenha.setText(null);
		tNiveldeAcesso.setText(null);
	}
	}

