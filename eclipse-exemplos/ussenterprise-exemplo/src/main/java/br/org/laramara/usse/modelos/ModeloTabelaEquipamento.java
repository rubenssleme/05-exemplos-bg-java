package br.org.laramara.usse.modelos;

import br.org.laramara.usse.dominio.Equipamento;
import br.org.laramara.usse.dominio.Roteador;
import br.org.laramara.usse.dominio.Servidor;

/**
 *
 * @author rubens.leme
 */
public class ModeloTabelaEquipamento extends ModeloTabela<Equipamento> {

    public ModeloTabelaEquipamento() {
        super(new String[]{"ID", "nomeEquipamento","marca","modelo","dataCadastro","dataCompra","sistemaOperacional","enderecoIP", "serviceTag", "quantidadesVms", "dataManutencao","usuario","senha","portaAcesso","deptoInstalacao"},
                new Class[]{Long.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class, Long.class, Integer.class, String.class,String.class,String.class,Integer.class,String.class},
                new int[]{80,80,80,80,80,80,80,80, 100, 80, 80,80,80,80,80});
    }

    @Override
    public void adicionarDado(Equipamento equipamento) {
        Long id = equipamento.getId();
        
        String nomeEquipamento = equipamento.getDataCadastro();
        String marca = equipamento.getMarca();
        String modelo = equipamento.getModelo();
        String dataCadastro = equipamento.getDataCadastro();
        String dataCompra = equipamento.getDataCompra();
        String sistemaOperacional = equipamento.getSistemaOperacional();
        String enderecaoIP = equipamento.getEnderecoIP();
        
        
        Long serviceTag = null;
        Integer quantidadeVms = null;
        String dataManutencao = null;
        if(equipamento instanceof Servidor){
            serviceTag = ((Servidor) equipamento).getServiceTag();
            quantidadeVms = ((Servidor) equipamento).getQuantidadesVms();
            dataManutencao = ((Servidor) equipamento).getDataManutencao();
        }
        String usuario = null;
        String senha = null;
        Integer portaAcesso = null;
        String deptoInstalacao = null;
        if(equipamento instanceof Roteador){
            usuario = ((Roteador) equipamento).getUsuario();
            senha = ((Roteador) equipamento).getSenha();
            portaAcesso = ((Roteador) equipamento).getPortaAcesso();
            deptoInstalacao = ((Roteador) equipamento).getDeptoInstalacao();
        }
        addRow(new Object[]{
            id,
            nomeEquipamento,
            marca,
            modelo,
            dataCadastro,
            dataCompra,
            sistemaOperacional,
            enderecaoIP,
            serviceTag,
            quantidadeVms,
            dataManutencao,
            usuario,
            senha,
            portaAcesso,
            deptoInstalacao
        });
    }

}
