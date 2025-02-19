
package br.com.bg.siscad.tela;


public class Professor {
    private String nome;
    private String materia;
    private int idade;

    public Professor() {
    }
      

    public Professor(String nome, String materia, int idade) {
        this.nome = nome;
        this.materia = materia;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", materia=" + materia + ", idade=" + idade + '}';
    }
    
    
    
    
    
}
