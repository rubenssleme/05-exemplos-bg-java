/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.dominio;

import br.org.laramara.usse.utilitarios.TamanhoMaximoGenerico;
import br.org.laramara.usse.utilitarios.DataHoraUtils;
import br.org.laramara.usse.utilitarios.LocalDateTimeConverter;
import br.org.laramara.usse.utilitarios.Relogio;
import br.org.laramara.usse.utilitarios.TextoUtils;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;

/**
 *
 * @author rubens.leme
 */
@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "Equipamento")
public abstract class Equipamento extends Validavel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = TamanhoMaximoGenerico.NOME, nullable = true)
    private String nome;

    @Column(length = TamanhoMaximoGenerico.MARCA, nullable = true)
    private String marca;

    @Column(length = TamanhoMaximoGenerico.MODELO, nullable = true)
    private String modelo;

    @Column
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime dataCadastro;

    @Column
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime dataCompra;

    @Column(length = TamanhoMaximoGenerico.ENDERECOIP, nullable = true)
    private String enderecoIP;

    @Column(length = TamanhoMaximoGenerico.TIPOEQUIPAMENTO, nullable = true)
    private String tipoEquipamento;

    @Column(length = TamanhoMaximoGenerico.USUARIO, nullable = true)
    private String usuario;

    @Column(length = TamanhoMaximoGenerico.SENHA, nullable = true)
    private String senha;

    public Equipamento() {
        this(null, null, "", "", "", "", "", "", "");
    }

    public Equipamento(LocalDateTime dataCadastro, LocalDateTime dataCompra, String nomeServidor, String marca, String modelo,
            String enderecoIP, String tipoEquipamento, String usuario, String senha) {
        this.dataCadastro = dataCadastro;
        this.dataCompra = dataCompra;
        this.nome = nomeServidor;
        this.marca = marca;
        this.modelo = modelo;
        this.enderecoIP = enderecoIP;
        this.tipoEquipamento = tipoEquipamento;
        this.usuario = usuario;
        this.senha = senha;
        this.dataCadastro = Relogio.obterDataHoraAtual();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String data) {
        this.dataCompra = DataHoraUtils.obterDataHoraValidaInvalidaOuNulo(data);
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Equipamento{" + "id=" + id + ", nome=" + nome + ", marca=" + marca + ", modelo=" + modelo + ", dataCadastro=" + dataCadastro + ", dataCompra=" + dataCompra + ", enderecoIP=" + enderecoIP + ", tipoEquipamento=" + tipoEquipamento + ", usuario=" + usuario + ", senha=" + senha + '}';
    }

}
