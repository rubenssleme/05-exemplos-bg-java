import javax.swing.JOptionPane;


public class ControleDeFluxo {

	//Declaração de Atributos
	String nome;
	int idade;


	//Contrutor sem argumentos 
	public ControleDeFluxo() {
		this("",0);
	}
	//Contrutor com  argumento
	public ControleDeFluxo(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	
	//	meus metodos 
	public void perguntaNomeIdade(){
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade: "));
		//	double teste = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Idade: "));
		this.setNome(nome);
		this.setIdade(idade);
	}

	public void retornaNomeIdadeVerificados(){
		String message = "voce é menor de idade ";
		String  messageOld = "voce é maior de idade ";
		if(this.getIdade()<=18){
			//JOptionPane.showMessageDialog(null, messageOld);
			JOptionPane.showMessageDialog(null,"Olá "+ this.getNome()+ "\n" + message + "tem " + this.getIdade() + " anos"
					+ "\nENTRADA Não PERMITIDA...");


		}else{

			//JOptionPane.showMessageDialog(null, messageOld);
			JOptionPane.showMessageDialog(null,"Olá "+ this.getNome()+ "\n" + messageOld + "tem " + this.getIdade() + " anos"
					+ "\nPor Favor Entre...");

		}

	}




}
