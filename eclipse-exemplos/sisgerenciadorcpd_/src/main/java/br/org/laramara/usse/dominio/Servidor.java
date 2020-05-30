/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.dominio;

import br.org.laramara.usse.utilitarios.DataHoraUtils;
import br.org.laramara.usse.utilitarios.LocalDateTimeConverter;
import br.org.laramara.usse.utilitarios.NumeroUtils;
import br.org.laramara.usse.utilitarios.TextoUtils;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

/**
 *
 * @author rubens.leme
 */
@Entity(name = "Servidor")
public class Servidor extends Equipamento implements Serializable {

    @Column(length = 35, nullable = true)
    private String memoriaInstalada;

    @Column(length = 35, nullable = true)
    private String capacidadeMemoria;

    @Column(length = 35, nullable = true)
    private String processador;

    @Column(length = 35, nullable = true)
    private Integer quantidadeNucleosProcessador;

    @Column(length = 35, nullable = true)
    private String serviceTag;

    @Column(length = 35, nullable = true)
    private Integer expressServiceTag;

    @Column(length = 35, nullable = true)
    private Integer raid;

    @Column(length = 35, nullable = true)
    private String tipoServidor;

    @Column(length = 35, nullable = true)
    private Integer quantidadeFonte;

    @Column(length = 35, nullable = true)
    private Integer slotsRede;

    @Column(length = 35, nullable = true)
    private Integer quantidadeHD;

    @Column(length = 35, nullable = true)
    private String versaoBios;

    @Column(length = 3, nullable = true)
    private Integer quantidadeVMs;

    @Column(length = 35, nullable = true)
    private String espacoArmazenamento;

    @Column
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime ultimaManutencao;

    @Column(length = 30, nullable = false)
    private String sistemaOperacional;

    @Column(length = 30, nullable = false)
    private String versaoSistemaOperacional;

    @Column(length = 6, nullable = false)
    private Integer tempoGarantia;

    private static Servidor unicaInstancia = new Servidor();

    public Servidor() {
    }

    public Servidor(LocalDateTime dataCadastro, LocalDateTime dataCompra, String nomeServidor, String marca, String modelo, String enderecoIP, String tipoEquipamento, String usuario, String senha) {
        super(dataCadastro, dataCompra, nomeServidor, marca, modelo, enderecoIP, tipoEquipamento, usuario, senha);
    }

    public static Servidor getIntance() {
        return unicaInstancia;
    }

    public String getServiceTag() {
        return serviceTag;
    }

    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
    }

    public String getMemoriaInstalada() {
        return memoriaInstalada;
    }

    public void setMemoriaInstalada(String memoriaInstalada) {
        this.memoriaInstalada = memoriaInstalada;
    }

    public String getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(String capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public Integer getQuantidadeNucleosProcessador() {
        return quantidadeNucleosProcessador;
    }

    public void setQuantidadeNucleosProcessador(String qtdeNucleosProcessador) {

        this.quantidadeNucleosProcessador = NumeroUtils.retornaInteiroOuInvalido(qtdeNucleosProcessador);
    }

    public Integer getExpressServiceTag() {
        return expressServiceTag;
    }

    public void setExpressServiceTag(String exServiceTag) {
        this.expressServiceTag = NumeroUtils.retornaInteiroOuInvalido(exServiceTag);
    }

    public Integer getRaid() {
        return raid;
    }

    public void setRaid(String raid) {
       this.raid = NumeroUtils.retornaInteiroOuInvalido(raid);
                  
    }

    public String getTipoServidor() {
        return tipoServidor;
    }

    public void setTipoServidor(String tipoServidor) {
        this.tipoServidor = TextoUtils.removerCaracteresInvalidosEAnularVazio(tipoServidor);
    }

    public Integer getQuantidadeFonte() {
        return quantidadeFonte;
    }

    public void setQuantidadeFonte(String qtdeFonte) {
        this.quantidadeFonte = NumeroUtils.retornaInteiroOuInvalido(qtdeFonte);
    }

    public Integer getSlotsRede() {
        return slotsRede;
    }

    public void setSlotsRede(String sRede) {
        this.slotsRede = NumeroUtils.retornaInteiroOuInvalido(sRede);
    }

    public Integer getQuantidadeHD() {
        return quantidadeHD;
    }

    public void setQuantidadeHD(String qtdeHD) {
        this.quantidadeHD = NumeroUtils.retornaInteiroOuInvalido(qtdeHD);
    }

    public String getVersaoBios() {
        return versaoBios;
    }

    public void setVersaoBios(String versaoBios) {
        this.versaoBios = versaoBios;
    }

    public Integer getQuantidadeVMs() {
        return quantidadeVMs;
    }

    public void setQuantidadeVMs(String qtdeVMs) {
        this.quantidadeVMs = NumeroUtils.retornaInteiroOuInvalido(qtdeVMs);
    }

    public LocalDateTime getUltimaManutencao() {
        return ultimaManutencao;
    }

    public void setUltimaManutencao(String data) {
        this.ultimaManutencao = DataHoraUtils.obterDataHoraValidaInvalidaOuNulo(data);
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getEspacoArmazenamento() {
        return espacoArmazenamento;
    }

    public void setEspacoArmazenamento(String espacoArmazenamento) {
        this.espacoArmazenamento = espacoArmazenamento;
    }

    public String getVersaoSistemaOperacional() {
        return versaoSistemaOperacional;
    }

    public void setVersaoSistemaOperacional(String versaoSistemaOperacional) {
        this.versaoSistemaOperacional = versaoSistemaOperacional;
    }

    public Integer getTempoGarantia() {
        return tempoGarantia;
    }

    public void setTempoGarantia(String tGarantia) {
        this.tempoGarantia = NumeroUtils.retornaInteiroOuInvalido(tGarantia);
    }

    @Override
    public String toString() {
        return "Servidor{" + "memoriaInstalada=" + memoriaInstalada + ", capacidadeMemoria=" + capacidadeMemoria + ", processador=" + processador + ", quantidadeNucleosProcessador=" + quantidadeNucleosProcessador + ", serviceTag=" + serviceTag + ", expressServiceTag=" + expressServiceTag + ", raid=" + raid + ", tipoServidor=" + tipoServidor + ", quantidadeFonte=" + quantidadeFonte + ", slotsRede=" + slotsRede + ", quantidadeHD=" + quantidadeHD + ", versaoBios=" + versaoBios + ", quantidadeVMs=" + quantidadeVMs + ", espacoArmazenamento=" + espacoArmazenamento + ", ultimaManutencao=" + ultimaManutencao + ", sistemaOperacional=" + sistemaOperacional + ", versaoSistemaOperacional=" + versaoSistemaOperacional + ", tempoGarantia=" + tempoGarantia + '}';
    }

    public void validarServidor() {
        validarDadosObrigatoriosServidor();
        validarInconsistenciaServidor();
    }

    public void validarDadosObrigatoriosServidor() {

        if (memoriaInstalada.equals("") || memoriaInstalada == null) {
            adicionarErro("Memória Instalada não foi preenchida!");
        }

        if (capacidadeMemoria.equals("") || capacidadeMemoria == null) {
            adicionarErro("Capacidade de Memória não foi preenchida!");
        }

        if (processador.equals("") || processador == null) {
            adicionarErro("Processador não preenchido!");
        }

        if (quantidadeNucleosProcessador == null || quantidadeNucleosProcessador == 0) {
            adicionarErro("Quantidade de Núcleos não preenchida!");
        }

        if (serviceTag.equals("") || serviceTag == null) {
            adicionarErro("ServiceTag não foi preenchida!");
        }

        if (expressServiceTag == null || expressServiceTag == 0) {
            adicionarErro("Express Service Tag não foi preenchido!");
        }

        if (quantidadeFonte == null || quantidadeFonte == 0) {
            adicionarErro("Quantidade de Fontes não foi preenchida!");
        }

        if (quantidadeHD == null || quantidadeHD == 0) {
            adicionarErro("Quantidade de HD não foi preenchida!");
        }

        if (quantidadeVMs == null || quantidadeVMs == 0) {
            adicionarErro("Quantidade de VMs não foi preenchida!");
        }

        if (sistemaOperacional.equals("") || sistemaOperacional == null) {
            adicionarErro("Sistema operacional não foi preenchido!");
        }

        if (versaoSistemaOperacional.equals("") || versaoSistemaOperacional == null) {
            adicionarErro("Versão de Sistema Operacional não foi preenchido");
        }

        if (slotsRede == null || slotsRede == 0) {
            adicionarErro("Slots de Rede não foi preenchido!");
        }

        if (tipoServidor.equals("")) {
            adicionarErro("Nenhum tipo de Servidor selecionado!");
        }

        if (versaoBios.equals("") || versaoBios == null) {
            adicionarErro("Versão da Bios não foi preenchida!");
        }
        
        if (raid == null){
            adicionarErro("Raid não selecionado");
        }
        
        if (getDataCompra() == null){
            adicionarErro("Data Compra não foi preenchido");
        }

        if (getNome().equals("")) {
            adicionarErro("Nome não foi preenchido");
        }

        if (getMarca().equals("")) {
            adicionarErro("Marca não foi preenchido");
        }

        if (getModelo().equals("")) {
            adicionarErro("Modelo não foi preenchido");
        }

        if (getEnderecoIP().equals("   .   .   .   ")) {
            adicionarErro("Endereço de IP não foi preenchido");
        }

        if (getTipoEquipamento().equals("")) {
            adicionarErro("O tipo de equipamento não foi selecionado");
        }

        if (getUsuario().equals("")) {
            adicionarErro("Usuario não foi preenchido");
        }

        if (getSenha().equals("")) {
            adicionarErro("Senha não foi preenchido");
        }
    }

    public void validarInconsistenciaServidor() {
        if (ultimaManutencao != null && ultimaManutencao.equals(DataHoraUtils.obterDataInvalida())) {
            adicionarErro("Ultima Manutenção foi preenchida de forma incorreta!");
        }
        if (getDataCompra() != null && getDataCompra().equals(DataHoraUtils.obterDataInvalida())) {
            adicionarErro("Data Compra foi preenchido de forma incorreta");
        }
        if (raid != null && raid.equals(NumeroUtils.obterNumeroInteiroInvalido())){
            adicionarErro("Raid não foi preenchido corretamente");
        }
        if (quantidadeNucleosProcessador != null && quantidadeNucleosProcessador.equals(NumeroUtils.obterNumeroInteiroInvalido())){
            adicionarErro("Quantidade de Nucleos Processador foi preenchido incorretamente");
        }
        if (quantidadeVMs != null && quantidadeVMs.equals(NumeroUtils.obterNumeroInteiroInvalido())){
            adicionarErro("Quantidade de VMs foi preenchida de forma incorreta");
        }
        if (quantidadeFonte != null && quantidadeFonte.equals(NumeroUtils.obterNumeroInteiroInvalido())){
            adicionarErro("Quantidade de Fontes preenchida de forma incorreta");
        }
        if (slotsRede != null && slotsRede.equals(NumeroUtils.obterNumeroInteiroInvalido())){
            adicionarErro("Slots de Rede foi preenchido de forma incorreta");
        }
        if(quantidadeHD != null && quantidadeHD.equals(NumeroUtils.obterNumeroInteiroInvalido())){
            adicionarErro("Quantidade de HD foi preenchido de forma incorreta");
        }
        if (tempoGarantia != null && tempoGarantia.equals(NumeroUtils.obterNumeroInteiroInvalido())){
            adicionarErro("Tempo Garantia foi preenchido de forma incorreta");
        }
        if (expressServiceTag != null && expressServiceTag.equals(NumeroUtils.obterNumeroInteiroInvalido())){
            adicionarErro("Express ServiceTag foi preenchido de forma incorreta");
        }
    }
}
