
abstract class Pessoa {
	protected int codigo;
	protected String nome;
	protected String rg;
	protected String telefone;


	public Pessoa(){
		this(0,"","","");
	}

	public Pessoa(int codigo,String nome,String rg,String telefone){
		this.codigo = codigo;
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
}
