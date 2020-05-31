package com.company;

import com.company.entidade.Contrato;
import com.company.entidade.Parcela;
import com.company.service.ContratoService;
import com.company.service.PaypalService;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Entre com Dados do Contrato");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date data = sdf.parse(sc.next());
        System.out.print("Valor do Contrato: ");
        double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);

        System.out.print("Entre com numero de parcelas: ");
        int n = sc.nextInt();

        ContratoService contratoService = new ContratoService(new PaypalService());

        contratoService.processarContrato(contrato, n);

        System.out.println("Installments:");
        for (Parcela parcela : contrato.getNumeroParcelas()) {
            System.out.println(parcela);
        }











        sc.close();
    }
}
