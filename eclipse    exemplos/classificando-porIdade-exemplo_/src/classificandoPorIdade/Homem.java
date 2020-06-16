package classificandoPorIdade;

import java.util.Random;

public class Homem {
	private String nome;
	private int idade;
	private char sexo;
	int	maioresDeIdade = 0;
	int	menoresDeIdade= 0;
	
	
	//Contrutores
	public Homem() {
	
	}

	public Homem(String nome, int idade, char sexo, int maioresDeIdade, int menoresDeIdade) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.maioresDeIdade = maioresDeIdade;
		this.menoresDeIdade = menoresDeIdade;
	}
	
	//Getters e Setters
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	//Metodos 
	private int obterIdadeAleatoria(){
		Random idade  = new Random();
		return idade.nextInt(23);
	}

	private void verificarIdade(){
		idade = obterIdadeAleatoria();
		if(idade >=18){
			maioresDeIdade = maioresDeIdade + 1;
		}else{
			menoresDeIdade = menoresDeIdade + 1;	
		}
	}

	private void imprimirQuantidade(){
		System.out.println("Total de Maior: "+ maioresDeIdade);
		System.out.println("Total de Menor: "+ menoresDeIdade);
	}

	private void imprimirIdade(){
		System.out.println("idade é: "+ idade);
	}

	public void iniciarEntrada(){
		int qtdeEntrada = 0;
		while(qtdeEntrada < 10){
			verificarIdade();
			imprimirIdade();
			qtdeEntrada ++;
		}
		imprimirQuantidade();

	}


}
