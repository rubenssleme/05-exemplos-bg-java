package teste;

public class Usuario {
private String nome;
private int idade;
private String sexo;
private String eMail;

public Usuario() {

}

public Usuario(String nome, int idade, String sexo, String eMail) {
	this.nome = nome;
	this.idade = idade;
	this.sexo = sexo;
	this.eMail = eMail;
}

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

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public String geteMail() {
	return eMail;
}

public void seteMail(String eMail) {
	this.eMail = eMail;
}



@Override
public String toString() {
	return "Usuario [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", eMail=" + eMail + "]";
}

public void imprimirNaTela(Usuario usuario){
	System.out.println(usuario.toString());
}





}
