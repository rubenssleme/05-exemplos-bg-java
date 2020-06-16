/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.fabricas;

import br.org.laramara.usse.dominio.Equipamento;
import br.org.laramara.usse.dominio.Roteador;
import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.utilitarios.Mensagem;

/**
 *
 * @author rubens.leme
 */
public class FabricaEquipamento {

    public static Equipamento obterEquipamento(String jtfDataCadastro, String jtfDataCompra, String jtfNomeEquipamento,
            String jtfMarca, String jtfModelo, String jtfSistemaOperacional, String jtfEnderecoIP, String jcbTipoEquipamento,
            String dataManutencao, Integer quantidadeVms, Long serviceTag, String deptoInstalacao, int portaAcesso, String usuario, String senha) {
        Equipamento equipamento = null;
        if (jcbTipoEquipamento != null) {

            if (jcbTipoEquipamento.equals("Servidor")) {
                equipamento = new Servidor();
                ((Servidor) equipamento).setDataManutencao(dataManutencao);
                ((Servidor) equipamento).setQuantidadesVms(quantidadeVms);
                ((Servidor) equipamento).setServiceTag(serviceTag);
            } else if (jcbTipoEquipamento.equals("Roteador")) {
                equipamento = new Roteador();
                ((Roteador) equipamento).setDeptoInstalacao(deptoInstalacao);
                ((Roteador) equipamento).setPortaAcesso(portaAcesso);
                ((Roteador) equipamento).setUsuario(usuario);
                ((Roteador) equipamento).setSenha(senha);
            }

        } else {

            Mensagem.exibirMensagem("Objeto nulo" + equipamento.getClass().getName().toString());
        }
        equipamento.setDataCadastro("25/01/2015");
        equipamento.setDataCompra(jtfDataCompra);
        equipamento.setNomeEquipamento(jtfNomeEquipamento);
        equipamento.setMarca(jtfMarca);
        equipamento.setModelo(jtfModelo);
        equipamento.setSistemaOperacional(jtfSistemaOperacional);
        equipamento.setEnderecoIP(jtfEnderecoIP);
        equipamento.setTipoEquipamento(jcbTipoEquipamento);

        return equipamento;
    }

}
