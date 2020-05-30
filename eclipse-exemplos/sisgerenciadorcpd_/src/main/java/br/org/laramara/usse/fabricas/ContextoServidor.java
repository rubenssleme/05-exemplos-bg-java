package br.org.laramara.usse.fabricas;

import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.utilitarios.Relogio;

/**
 *
 * @author leone.pizzoli
 */
public class ContextoServidor {

    public static Servidor criarServidorComTodosOsDadosCorretos() {
        Servidor servidor = new Servidor();
        try {
            servidor.setQuantidadeVMs("1");
            servidor.setServiceTag("abcde");
            servidor.setNome("Servidor - Teste");
            servidor.setSistemaOperacional("Windows Server");
            servidor.setEnderecoIP("10.10.10.103");
            servidor.setDataCadastro(Relogio.obterDataHoraAtual());
            servidor.setDataCompra("05/03/2018");
            servidor.setModelo("154");
            servidor.setMarca("Dell");
            servidor.setCapacidadeMemoria("12GB");
            servidor.setExpressServiceTag("1234");
            servidor.setMemoriaInstalada("8GB");
            servidor.setProcessador("Core 2 Duo");
            servidor.setQuantidadeFonte("2");
            servidor.setQuantidadeNucleosProcessador("5");
            servidor.setRaid("100");
            servidor.setSlotsRede("2");
            servidor.setTipoServidor("Gaveta");
            servidor.setVersaoBios("abcde");
            servidor.setQuantidadeHD("2");
            servidor.setEspacoArmazenamento("5TB");
            servidor.setVersaoSistemaOperacional("Win 2002");
            servidor.setTipoEquipamento("Servidor");
            servidor.setSenha("1234");
            servidor.setUsuario("leone.pizzoli");
            servidor.setUltimaManutencao("26/12/2000");
            servidor.setTempoGarantia("12");
        } catch (Exception e) {
            servidor = null;
        }
        return servidor;
    }

    public static Servidor criarServidorComOsDadosNaoPreenchidos() {
        Servidor servidor = new Servidor();

        try {
            servidor.setQuantidadeVMs("");
            servidor.setServiceTag("");
            servidor.setNome("");
            servidor.setSistemaOperacional("");
            servidor.setEnderecoIP("   .   .   .   ");
            servidor.setDataCompra("");
            servidor.setModelo("");
            servidor.setMarca("");
            servidor.setCapacidadeMemoria("");
            servidor.setExpressServiceTag("");
            servidor.setMemoriaInstalada("");
            servidor.setProcessador("");
            servidor.setQuantidadeFonte("");
            servidor.setQuantidadeNucleosProcessador("");
            servidor.setRaid("");
            servidor.setSlotsRede("");
            servidor.setTipoServidor("");
            servidor.setVersaoBios("");
            servidor.setQuantidadeHD("");
            servidor.setEspacoArmazenamento("");
            servidor.setVersaoSistemaOperacional("");
            servidor.setTipoEquipamento("");
            servidor.setSenha("");
            servidor.setUsuario("");
            servidor.setUltimaManutencao("");
            servidor.setTempoGarantia("");

        } catch (Exception e) {
            servidor = null;
        }
        return servidor;
    }
    public static Servidor criarServidorComOsDadosNaoConsistentes() {
        Servidor servidor = new Servidor();

        try {
            servidor.setQuantidadeVMs("asd");
            servidor.setServiceTag("da");
            servidor.setNome("ad");
            servidor.setSistemaOperacional("asd");
            servidor.setEnderecoIP("1234654");
            servidor.setDataCompra("12/13/2000");
            servidor.setModelo("asd");
            servidor.setMarca("dasd");
            servidor.setCapacidadeMemoria("ads");
            servidor.setExpressServiceTag("asd");
            servidor.setMemoriaInstalada("ads");
            servidor.setProcessador("das");
            servidor.setQuantidadeFonte("das");
            servidor.setQuantidadeNucleosProcessador("dsa");
            servidor.setRaid("da");
            servidor.setSlotsRede("da");
            servidor.setTipoServidor("dsa");
            servidor.setVersaoBios("dsa");
            servidor.setQuantidadeHD("das");
            servidor.setEspacoArmazenamento("das");
            servidor.setVersaoSistemaOperacional("das");
            servidor.setTipoEquipamento("dsa");
            servidor.setSenha("dsa");
            servidor.setUsuario("dsa");
            servidor.setUltimaManutencao("dsa");
            servidor.setTempoGarantia("dsad");

        } catch (Exception e) {
            servidor = null;
        }
        return servidor;
    }
}