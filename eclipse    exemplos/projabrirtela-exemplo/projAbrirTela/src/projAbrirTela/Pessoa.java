package projAbrirTela;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome;
	private String email;
	private String cpf;
	private String rg;
	public Pessoa(String nome, String email, String cpf, String rg) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
	}
	public Pessoa() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public void exibirInfo(Pessoa p){
		if((p.getCpf() == null) &&(p.getRg() == null)){
			JOptionPane.showMessageDialog(null, "\n Nome: " + (p.getNome() + "\n Email: " + (p.getEmail())));	
		}
		else{
			JOptionPane.showMessageDialog(null, "\n cpf: " + (p.getCpf() + "\n rg: " + (p.getRg())));
		}
	}

}
