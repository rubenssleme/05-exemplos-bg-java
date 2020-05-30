/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.utilitarios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author leone.pizzoli
 */
public abstract class Relogio {

    private static LocalDateTime dataHoraAtual;

    public Relogio() {
    }


    public static LocalDateTime obterDataHoraAtual() {
        return dataHoraAtual == null ? LocalDateTime.now() : dataHoraAtual;
    }

    public static LocalDateTime mudarDataHoraAtual(String textoDataHora) {
        dataHoraAtual = DataHoraUtils.criarDataHoraSemHora(textoDataHora);
        return dataHoraAtual;
    }

    public static LocalDateTime mudarDataHoraAtual(LocalDateTime dataHora) {
        return dataHoraAtual;
    }

    public static void restaurarDataHoraOriginal() {
        dataHoraAtual = null;
    }

}
