/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author rubens.leme
 */
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Equipamento {
   

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = TamanhoMaximoGenerico.NOME, nullable = true)
    private String nomeEquipamento;
    @Column(length = TamanhoMaximoGenerico.MARCA, nullable = true)
    private String marca;
    @Column(length = TamanhoMaximoGenerico.MODELO, nullable = true)
    private String modelo;
    @Column(length = TamanhoMaximoGenerico.DATACADASTRO, nullable = true)
    private String dataCadastro;
    @Column(length = TamanhoMaximoGenerico.DATACOMPRA, nullable = true)
    private String dataCompra;
    @Column(length = TamanhoMaximoGenerico.SISTEMAOPERACIONAL, nullable = true)
    private String sistemaOperacional;
    @Column(length = TamanhoMaximoGenerico.ENDERECOIP, nullable = true)
    private String enderecoIP;
    @Column(length = TamanhoMaximoGenerico.TIPOEQUIPAMENTO, nullable = true)
    private String tipoEquipamento;
    @OneToOne
    @JoinColumn(name = "id_bios")
    private Bios bios;

    public Equipamento() {
    }

    public Equipamento(String dataCadastro, String dataCompra, String nomeServidor, String marca, String modelo, String sistemaOperacional,
            String enderecoIP, String tipoEquipamento, Bios bios) {
        this.dataCadastro = dataCadastro;
        this.dataCompra = dataCompra;
        this.nomeEquipamento = nomeServidor;
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.enderecoIP = enderecoIP;
        this.tipoEquipamento = tipoEquipamento;
        this.bios = bios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getEnderecoIP() {
        return enderecoIP;
    }

    public void setEnderecoIP(String enderecoIP) {
        this.enderecoIP = enderecoIP;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public Bios getBios() {
        return bios;
    }

    public void setBios(Bios bios) {
        this.bios = bios;
    }

    @Override
    public String toString() {
        return "Equipamento{" + ", nomeEquipamento=" + nomeEquipamento + ", marca=" + marca + ", modelo=" + modelo
                + ", dataCadastro=" + dataCadastro + ", dataCompra=" + dataCompra + ", sistemaOperacional=" + sistemaOperacional + ", enderecoIP=" + enderecoIP
                + ", tipoEquipamento=" + tipoEquipamento + ", bios=" + bios + '}';
    }
    
    

}
