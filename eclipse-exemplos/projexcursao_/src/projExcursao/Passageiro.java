package projExcursao;

public abstract class Passageiro {
	private int  codigo;
	private String nome;
	private String eMail;
	private boolean possuiReserva;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public boolean isPossuiReserva() {
		return possuiReserva;
	}
	public void setPossuiReserva(boolean possuiReserva) {
		this.possuiReserva = possuiReserva;
	}
	
	
	
	
	

}
