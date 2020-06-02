package br.com.locadorabrasil.tela;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.locadorabrasil.entidade.AluguelCarro;
import br.com.locadorabrasil.entidade.Veiculo;
import br.com.locadorabrasil.servico.AluguelCarroServico;
import br.com.locadorabrasil.servico.BrasilImpostoServico;

public class Tela {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		System.out.println("Entre com dados da Locação: ");
		System.out.print("Modelo do Veiculo: ");
		String modeloVeiculo = sc.nextLine();
		System.out.print("Data Locação (dd/MM/yyyy HH:mm): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Data de Retorno (dd/MM/yyyy HH:mm): ");
		Date finish = sdf.parse(sc.nextLine());

		AluguelCarro locadoraVeiculo = new AluguelCarro(start, finish, new Veiculo(modeloVeiculo));

		System.out.print("Entre com valor por Hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com Valor por Dia: ");
		double pricePerDay = sc.nextDouble();

		AluguelCarroServico locadoraServico = new AluguelCarroServico(pricePerDay, pricePerHour, new BrasilImpostoServico());

		locadoraServico.processamentoFatura(locadoraVeiculo);

		System.out.println("Nota Fiscal:");
		System.out
				.println("Pagamento S/ imposto: " + String.format("%.2f", locadoraVeiculo.getFatura().getValorSemImposto()));
		System.out.println("Valor do Imposto: " + String.format("%.2f", locadoraVeiculo.getFatura().getImposto()));
		System.out.println("Total a Pagar: " + String.format("%.2f", locadoraVeiculo.getFatura().getTotalDePagamento()));

		sc.close();
	}

}
