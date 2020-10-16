/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.fabricas;

import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.utilitarios.Relogio;

/**
 *
 * @author rubens.leme
 */
public class FabricaServidor {

    public static Servidor obterServidor(String dataCompra, String nomeEquipamento,
            String marca, String modelo, String sistemaOperacional, String enderecoIP, String tipoEquipamento,
            String dataManutencao, String quantidadeVms, String serviceTag, String usuario, String senha, String memoriaInstalada,
            String capacidadeMemoria, String processador, String quantidadeNucleosProcessador, String expressServiceTag, String raid, String tipoServidor, String quantidadeFonte,
            String slotsRede, String quantidadeHD, String versaoBios, String tempoGarantia, String espacoArmazenamento, String versaoSistemaOperacional) {

        Servidor servidor = new Servidor();

        servidor.setQuantidadeVMs(quantidadeVms);
        servidor.setServiceTag(serviceTag);
        servidor.setNome(nomeEquipamento);
        servidor.setSistemaOperacional(sistemaOperacional);
        servidor.setEnderecoIP(enderecoIP);
        servidor.setDataCadastro(Relogio.obterDataHoraAtual());
        servidor.setDataCompra(dataCompra);
        servidor.setModelo(modelo);
        servidor.setMarca(marca);
        servidor.setCapacidadeMemoria(capacidadeMemoria);
        servidor.setExpressServiceTag(expressServiceTag);
        servidor.setMemoriaInstalada(memoriaInstalada);
        servidor.setProcessador(processador);
        servidor.setQuantidadeFonte(quantidadeFonte);
        servidor.setQuantidadeNucleosProcessador(quantidadeNucleosProcessador);
        servidor.setRaid(raid);
        servidor.setSlotsRede(slotsRede);
        servidor.setTipoServidor(tipoServidor);
        servidor.setVersaoBios(versaoBios);
        servidor.setQuantidadeHD(quantidadeHD);
        servidor.setEspacoArmazenamento(espacoArmazenamento);
        servidor.setVersaoSistemaOperacional(versaoSistemaOperacional);
        servidor.setTipoEquipamento(tipoEquipamento);
        servidor.setSenha(senha);
        servidor.setUsuario(usuario);
        servidor.setUltimaManutencao(dataManutencao);
        servidor.setTempoGarantia(tempoGarantia);
        return servidor;

    }

}
