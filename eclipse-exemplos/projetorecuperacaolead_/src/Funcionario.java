public class Funcionario extends Pessoa {

	private double salario;
	private String cargo;

	public Funcionario() {
		this(0, "", "", "", 0.0, "");
	}

	public Funcionario(int codigo, String nome, String rg, String telefone,
			double salario, String cargo) {
		super(codigo, nome, rg, telefone);
		this.salario = salario;
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void cadastrar(int codigo, String nome, String rg, String telefone,
			double salario, String cargo) {
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setRg(rg);
		this.setTelefone(telefone);
		this.setSalario(salario);
		this.setCargo(cargo);
	}

}
