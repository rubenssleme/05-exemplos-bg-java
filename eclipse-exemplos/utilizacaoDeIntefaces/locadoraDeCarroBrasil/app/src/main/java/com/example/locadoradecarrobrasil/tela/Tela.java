@Test
public void teste() throws ParseException {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    System.out.println("Dados da Locação: ");
    System.out.print("Modelo do Veiculo: ");
    String modeloVeiculo = "Civic"; //Valor Digitado
    System.out.println(modeloVeiculo);
    System.out.print("Data Locação (dd/MM/yyyy HH:mm): ");
    Date start = sdf.parse("25/06/2018 10:30");//Valor Digitado
    System.out.println(start);
    System.out.print("Data de Retorno (dd/MM/yyyy HH:mm): ");
    Date finish = sdf.parse("25/06/2018 14:40");//Valor Digitado
    System.out.println(finish);

    AluguelCarro locadoraVeiculo = new AluguelCarro(start, finish, new Veiculo(modeloVeiculo));

    System.out.print("Entre com valor por Hora: ");
    double pricePerHour = 10.0;//Valor Digitado
    System.out.println(pricePerHour);
    System.out.print("Entre com Valor por Dia: ");
    double pricePerDay = 130.0;//Valor Digitado
    System.out.println(pricePerDay);

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