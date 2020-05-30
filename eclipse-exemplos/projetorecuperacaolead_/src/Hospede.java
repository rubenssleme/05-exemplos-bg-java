
public class Hospede extends Pessoa{

	private String cidade;

	public Hospede() {
		this(0,"","","","");
	}

	public Hospede(int codigo,String nome,String rg,String telefone,String cidade) {
		super(codigo,nome,rg,telefone);
		this.cidade = cidade;

	}


	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}




	public void cadastrar(int codigo,String nome,String rg,String telefone,String cidade){
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setRg(rg);
		this.setTelefone(telefone);
		this.setCidade(cidade);
	}

	@Override
	public String toString() {
		return "Hospede [cidade=" + cidade + ", codigo=" + codigo + ", nome="
				+ nome + ", rg=" + rg + ", telefone=" + telefone + "]";
	}
	
	
	

}
