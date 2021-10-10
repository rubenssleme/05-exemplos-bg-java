package br.com.carloskafka.sishibernateclient.controladores;

import java.rmi.RemoteException;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.com.carloskafka.sishibernateclient.utilitarios.TextoUtils;
import br.com.carloskafka.sishibernatecommons.dtos.cliente.ClienteDTO;
import br.com.carloskafka.sishibernatecommons.dtos.cliente.ResultadoEdicaoClienteDTO;
import br.com.carloskafka.sishibernatecommons.utilitarios.Mensagem;

public class ControladorTelaEditarCliente extends ControladorTelaEditar {
	private JTextField nome;
	private JTextField cnpj;
	private JTextField razaoSocial;
	private JTextField email;
	private JTextField telefone;
	
	public ControladorTelaEditarCliente(JFrame telaPai, JTextField nome,
			JTextField cnpj, JTextField razaoSocial, JTextField email,
			JTextField telefone, ClienteDTO clienteDto) {
		super(telaPai, clienteDto);
		this.nome = nome;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.email = email;
		this.telefone = telefone;
		ajustarTitulo("Tela Cliente");
	}
	
	private void ajustarTitulo(String titulo) {
		((JFrame) telaPai).setTitle(titulo);
	}

	public void prepararDtoParaEditar() {
		obterObjetoDto().setNome(TextoUtils.obterTexto(nome));
		obterObjetoDto().setCnpj(TextoUtils.obterTexto(cnpj));
		obterObjetoDto().setRazaoSocial(TextoUtils.obterTexto(razaoSocial));
		obterObjetoDto().setEmail(TextoUtils.obterTexto(email));
		obterObjetoDto().setTelefone(TextoUtils.obterTexto(telefone));
	}
	
	private ClienteDTO obterObjetoDto() {
		return (ClienteDTO) objetoDto;
	}

	public void salvar() {
		prepararDtoParaEditar();
		ClienteDTO clienteDtoObtido = obterObjetoDto(); 
		try {
			ResultadoEdicaoClienteDTO resultadoEdicaoClienteDto = servicoSisHibernateServer
					.editarCliente(clienteDtoObtido);
			if (resultadoEdicaoClienteDto.sucesso()) {
				Mensagem.exibirMensagem(resultadoEdicaoClienteDto.obterMensagens());
			} else {
				Mensagem.exibirMensagem(resultadoEdicaoClienteDto.obterMensagens());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
