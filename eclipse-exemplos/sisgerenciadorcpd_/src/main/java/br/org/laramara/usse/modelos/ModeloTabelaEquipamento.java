package br.org.laramara.usse.modelos;

import br.org.laramara.usse.dominio.Equipamento;
import br.org.laramara.usse.dominio.Roteador;
import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.utilitarios.DataHoraUtils;
import br.org.laramara.usse.utilitarios.Relogio;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author rubens.leme
 */
public class ModeloTabelaEquipamento extends ModeloTabela<Equipamento> {

    Integer expressServiceTag;
    String serviceTag;
    Integer portaAcesso;
    String deptoInstalacao;
    String quantidadeVms;
    String dataManutencao;
    String sistemaOperacional;
    String memoriaInstalada;
    String capacidadeMemoria;
    String processador;
    Integer quantidadeNucleos;
    Integer raid;
    String tipoServidor;
    Integer quantidadeFontes;
    Integer slotsRede;

    public ModeloTabelaEquipamento() {
        super(new String[]{"nome equipamento", "enderecoIP", "marca", "modelo", "data cadastro", "data compra", "usuario", "senha", "sistema operacional", "quantidade Vms", "serviceTag", "express serviceTag", "data manutencao", "memoria instalada", "capacidade memoria", "processador", "quantidade núcleos", "raid", "tipo Servidor", "quantidade fontes", "slotsRede"},
                new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, Integer.class, String.class, String.class, String.class, String.class, Integer.class, String.class, Integer.class, Integer.class},
                new int[]{80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80});
    }

    @Override
    public void adicionarDado(Equipamento equipamento) {
        Long id = equipamento.getId();

        String nomeEquipamento = equipamento.getNome();
        String marca = equipamento.getMarca();
        String modelo = equipamento.getModelo();
        String dataCadastro = DataHoraUtils.formatarData(equipamento.getDataCadastro());
        String dataCompra = DataHoraUtils.formatarData(equipamento.getDataCompra());
        String enderecaoIP = equipamento.getEnderecoIP();
        String usuario = equipamento.getUsuario();
        String senha = equipamento.getSenha();

        if (equipamento.getTipoEquipamento().equals("Servidor")) {
            sistemaOperacional = ((Servidor) equipamento).getSistemaOperacional();
            quantidadeVms = ((Servidor) equipamento).getQuantidadeVMs().toString();
            serviceTag = ((Servidor) equipamento).getServiceTag();
            expressServiceTag = ((Servidor) equipamento).getExpressServiceTag();
            dataManutencao = DataHoraUtils.formatarData(((Servidor) equipamento).getUltimaManutencao());
            memoriaInstalada = ((Servidor) equipamento).getMemoriaInstalada();
            capacidadeMemoria = ((Servidor) equipamento).getCapacidadeMemoria();
            processador = ((Servidor) equipamento).getProcessador();
            quantidadeNucleos = ((Servidor) equipamento).getQuantidadeNucleosProcessador();
            raid = ((Servidor) equipamento).getRaid();
            tipoServidor = ((Servidor) equipamento).getTipoServidor();
            quantidadeFontes = ((Servidor) equipamento).getQuantidadeFonte();
            slotsRede = ((Servidor) equipamento).getSlotsRede();
        }
        if (equipamento instanceof Roteador) {
            portaAcesso = ((Roteador) equipamento).getPortaAcesso();
            deptoInstalacao = ((Roteador) equipamento).getDeptoInstalacao();
        }
        addRow(new Object[]{
            nomeEquipamento,
            enderecaoIP,
            marca,
            modelo,
            dataCadastro,
            dataCompra,
            usuario,
            senha,
            sistemaOperacional,
            quantidadeVms,
            serviceTag,
            expressServiceTag,
            dataManutencao,
            memoriaInstalada,
            capacidadeMemoria,
            processador,
            quantidadeNucleos,
            raid,
            tipoServidor,
            quantidadeFontes,
            slotsRede
        });
    }

}
