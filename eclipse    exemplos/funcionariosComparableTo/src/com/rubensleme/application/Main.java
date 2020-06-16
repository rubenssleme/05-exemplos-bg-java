package com.rubensleme.application;

import com.rubensleme.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> listaFuncionario = new ArrayList<>();
        String path = "C:\\temp\\in.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String arquivoFuncionario = bufferedReader.readLine();
            while (arquivoFuncionario != null) {
                String[] campos = arquivoFuncionario.split(",");
                listaFuncionario.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
                arquivoFuncionario = bufferedReader.readLine();
            }
            Collections.sort(listaFuncionario);
            for (Funcionario empregado: listaFuncionario) {
                System.out.println(empregado.getNome() + ", " + empregado.getSalario());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
