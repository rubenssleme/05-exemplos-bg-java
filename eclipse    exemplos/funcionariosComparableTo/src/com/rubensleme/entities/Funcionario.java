package com.rubensleme.entities;

public class Funcionario implements Comparable<Funcionario> {
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    @Override
    public int compareTo(Funcionario outroFuncionario ) {
        return nome.compareTo(outroFuncionario.getNome());
        //return salario.compareTo(outroFuncionario.getSalario()); // Comparação por Salario.
        //return -salario.compareTo(outroFuncionario.getSalario());// Ordem decrescente por Salario.
    }
}
