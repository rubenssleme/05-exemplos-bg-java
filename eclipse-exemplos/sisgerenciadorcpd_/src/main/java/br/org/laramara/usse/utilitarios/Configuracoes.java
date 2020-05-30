/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.utilitarios;

/**
 *
 * @author leone.pizzoli
 */
public class Configuracoes {

    private static final String HOME = System.getProperty("user.home");
    public static final String EXTENSAO_EXPORTACAO_TABELA = ".csv";
    public static final String EXTENSAO_EXPORTACAO_TEXTO = ".txt";
    public static final long INTERVALO_VERIFICACAO_AVISO = 300000;
    public static final long INTERVALO_VERIFICACAO_FECHAMENTO_AUTOMATICO = 60000;
    public static final long INTERVALO_VERIFICACAO_PENDENCIAS = 10000;
    public static final String DIRETORIO_TEMPORARIO_ARQUIVOS = HOME + "\\SisGerenciadorCPD\\Temporario\\";
    public static final String DIRETORIO_PERMANENTE_ARQUIVOS = HOME + "\\SisGerenciadorCPD\\Permanente\\";
    public static final String PASTA_LOCALIZACAO_OFFICE = "pasta_localizacao_office.obj";
    public static final String APLICATIVO_WORD = "WinWord.exe";
    public static final String HD_PROCURAR_OFFICE = "c:\\";

}
