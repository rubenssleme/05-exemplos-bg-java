package br.org.laramara.usse.testes.dominio;

import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.fabricas.ContextoServidor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leone.pizzoli
 */
public class ServidorTeste {

    @Test
    public void servidor_esta_com_dados_obrigatorios_preenhidos() {
        Servidor servidor = ContextoServidor.criarServidorComTodosOsDadosCorretos();
        servidor.validarDadosObrigatoriosServidor();

        assertTrue(servidor.validado());
        assertFalse(servidor.obterDescricaoErros().contains("Memória Instalada não foi preenchida!"));
        assertFalse(servidor.obterDescricaoErros().contains("Capacidade de Memória não foi preenchida!"));
        assertFalse(servidor.obterDescricaoErros().contains("Processador não preenchido!"));
        assertFalse(servidor.obterDescricaoErros().contains("Quantidade de Núcleos não preenchida!"));
        assertFalse(servidor.obterDescricaoErros().contains("ServiceTag não foi preenchida!"));
        assertFalse(servidor.obterDescricaoErros().contains("Express Service Tag não foi preenchido!"));
        assertFalse(servidor.obterDescricaoErros().contains("Quantidade de Fontes não foi preenchida!"));
        assertFalse(servidor.obterDescricaoErros().contains("Quantidade de HD não foi preenchida!"));
        assertFalse(servidor.obterDescricaoErros().contains("Quantidade de VMs não foi preenchida!"));
        assertFalse(servidor.obterDescricaoErros().contains("Sistema operacional não foi preenchido!"));
        assertFalse(servidor.obterDescricaoErros().contains("Versão de Sistema Operacional não foi preenchido"));
        assertFalse(servidor.obterDescricaoErros().contains("Slots de Rede não foi preenchido!"));
        assertFalse(servidor.obterDescricaoErros().contains("Nenhum tipo de Servidor selecionado!"));
        assertFalse(servidor.obterDescricaoErros().contains("Versão da Bios não foi preenchida!"));
        assertFalse(servidor.obterDescricaoErros().contains("Raid não selecionado"));
        assertFalse(servidor.obterDescricaoErros().contains("Data Cadastro não está sendo atribuída, contate o desenvolvedor!"));
        assertFalse(servidor.obterDescricaoErros().contains("Data Compra não foi preenchido"));
        assertFalse(servidor.obterDescricaoErros().contains("Nome não foi preenchido"));
        assertFalse(servidor.obterDescricaoErros().contains("Marca não foi preenchido"));
        assertFalse(servidor.obterDescricaoErros().contains("Modelo não foi preenchido"));
        assertFalse(servidor.obterDescricaoErros().contains("Endereço de IP não foi preenchido"));
        assertFalse(servidor.obterDescricaoErros().contains("O tipo de equipamento não foi selecionado"));
        assertFalse(servidor.obterDescricaoErros().contains("Usuario não foi preenchido"));
        assertFalse(servidor.obterDescricaoErros().contains("Senha não foi preenchido"));

    }

    @Test
    public void servidor_nao_esta_com_dados_obrigatorios_preenchidos() {
        Servidor servidor = ContextoServidor.criarServidorComOsDadosNaoPreenchidos();
        servidor.validarDadosObrigatoriosServidor();
        //ContextoServidor.criarServidorComOsDadosNaoPreenchidos(servidor);

        assertFalse(servidor.validado());
        assertTrue(servidor.obterDescricaoErros().contains("Memória Instalada não foi preenchida!"));
        assertTrue(servidor.obterDescricaoErros().contains("Capacidade de Memória não foi preenchida!"));
        assertTrue(servidor.obterDescricaoErros().contains("Processador não preenchido!"));
        assertTrue(servidor.obterDescricaoErros().contains("Quantidade de Núcleos não preenchida!"));
        assertTrue(servidor.obterDescricaoErros().contains("ServiceTag não foi preenchida!"));
        assertTrue(servidor.obterDescricaoErros().contains("Express Service Tag não foi preenchido!"));
        assertTrue(servidor.obterDescricaoErros().contains("Quantidade de Fontes não foi preenchida!"));
        assertTrue(servidor.obterDescricaoErros().contains("Quantidade de HD não foi preenchida!"));
        assertTrue(servidor.obterDescricaoErros().contains("Quantidade de VMs não foi preenchida!"));
        assertTrue(servidor.obterDescricaoErros().contains("Sistema operacional não foi preenchido!"));
        assertTrue(servidor.obterDescricaoErros().contains("Versão de Sistema Operacional não foi preenchido"));
        assertTrue(servidor.obterDescricaoErros().contains("Slots de Rede não foi preenchido!"));
        assertTrue(servidor.obterDescricaoErros().contains("Nenhum tipo de Servidor selecionado!"));
        assertTrue(servidor.obterDescricaoErros().contains("Versão da Bios não foi preenchida!"));
        assertTrue(servidor.obterDescricaoErros().contains("Raid não selecionado"));
        assertTrue(servidor.obterDescricaoErros().contains("Data Compra não foi preenchido"));
        assertTrue(servidor.obterDescricaoErros().contains("Nome não foi preenchido"));
        assertTrue(servidor.obterDescricaoErros().contains("Marca não foi preenchido"));
        assertTrue(servidor.obterDescricaoErros().contains("Modelo não foi preenchido"));
        assertTrue(servidor.obterDescricaoErros().contains("Endereço de IP não foi preenchido"));
        assertTrue(servidor.obterDescricaoErros().contains("O tipo de equipamento não foi selecionado"));
        assertTrue(servidor.obterDescricaoErros().contains("Usuario não foi preenchido"));
        assertTrue(servidor.obterDescricaoErros().contains("Senha não foi preenchido"));

    }

    @Test
    public void servidor_esta_com_dados_consistentes() {
        Servidor servidor = ContextoServidor.criarServidorComTodosOsDadosCorretos();

        servidor.validarInconsistenciaServidor();

        assertTrue(servidor.validado());
        assertFalse(servidor.obterDescricaoErros().contains("Raid não foi preenchido corretamente"));
        assertFalse(servidor.obterDescricaoErros().contains("Ultima Manutenção foi preenchida de forma incorreta!"));
        assertFalse(servidor.obterDescricaoErros().contains("Data Compra foi preenchido de forma incorreta"));
        assertFalse(servidor.obterDescricaoErros().contains("Quantidade de Nucleos Processador foi preenchido incorretamente"));
        assertFalse(servidor.obterDescricaoErros().contains("Quantidade de VMs foi preenchida de forma incorreta"));
        assertFalse(servidor.obterDescricaoErros().contains("Quantidade de Fontes preenchida de forma incorreta"));
        assertFalse(servidor.obterDescricaoErros().contains("Slots de Rede foi preenchido de forma incorreta"));
        assertFalse(servidor.obterDescricaoErros().contains("Quantidade de HD foi preenchido de forma incorreta"));
        assertFalse(servidor.obterDescricaoErros().contains("Tempo Garantia foi preenchido de forma incorreta"));
        assertFalse(servidor.obterDescricaoErros().contains("Express ServiceTag foi preenchido de forma incorreta"));
    }

    @Test
    public void servidor_nao_esta_com_dados_consistentes() {
        Servidor servidor = ContextoServidor.criarServidorComOsDadosNaoConsistentes();

        servidor.validarInconsistenciaServidor();

        assertFalse(servidor.validado());
        assertTrue(servidor.obterDescricaoErros().contains("Raid não foi preenchido corretamente"));
        assertTrue(servidor.obterDescricaoErros().contains("Ultima Manutenção foi preenchida de forma incorreta!"));
        assertTrue(servidor.obterDescricaoErros().contains("Data Compra foi preenchido de forma incorreta"));
        assertTrue(servidor.obterDescricaoErros().contains("Quantidade de Nucleos Processador foi preenchido incorretamente"));
        assertTrue(servidor.obterDescricaoErros().contains("Quantidade de VMs foi preenchida de forma incorreta"));
        assertTrue(servidor.obterDescricaoErros().contains("Quantidade de Fontes preenchida de forma incorreta"));
        assertTrue(servidor.obterDescricaoErros().contains("Slots de Rede foi preenchido de forma incorreta"));
        assertTrue(servidor.obterDescricaoErros().contains("Quantidade de HD foi preenchido de forma incorreta"));
        assertTrue(servidor.obterDescricaoErros().contains("Tempo Garantia foi preenchido de forma incorreta"));
        assertTrue(servidor.obterDescricaoErros().contains("Express ServiceTag foi preenchido de forma incorreta"));
    }

}
