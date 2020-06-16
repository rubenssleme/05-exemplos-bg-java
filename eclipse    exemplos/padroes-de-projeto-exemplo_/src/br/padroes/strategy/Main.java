package br.padroes.strategy;

public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				5000);
		System.out.println(umFuncionario.calcularSalarioComImposto());

		Funcionario outroFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				3000);
		System.out.println(outroFuncionario.calcularSalarioComImposto());
	}
}
