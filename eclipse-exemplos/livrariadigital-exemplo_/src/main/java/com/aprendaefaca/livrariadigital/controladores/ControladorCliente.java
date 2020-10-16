package com.aprendaefaca.livrariadigital.controladores;

import com.aprendaefaca.livrariadigital.dominio.Cliente;
import com.aprendaefaca.livrariadigital.repositorio.ClienteBD;
import com.aprendaefaca.livrariadigital.repositorio.RepositorioCliente;
import com.aprendaefaca.livrariadigital.utilitarios.Mensagem;
import com.aprendaefaca.livrariadigital.utilitarios.Sessao;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author rubens.leme
 */
public class ControladorCliente {

    private JTextField tLogin;
    private JPasswordField pSenha;
    private JTextField tNome ;
    private JTextField tEmail;
    private JTextField tCpf;
    private JTextField tTelefone;
    private JTextField tEndereco;
    private JTextField tBairro;
    private JTextField tCidade;
    private JTextField tUf;
    
    private Cliente cliente;
    private RepositorioCliente repositorioCliente;
    private JButton visitante;

    public ControladorCliente(JTextField tLogin, JPasswordField pSenha, JButton visitante) {
        this.tLogin = tLogin;
        this.pSenha = pSenha;
        this.visitante = visitante;
    }

    public ControladorCliente(JTextField tLogin, JPasswordField pSenha, JTextField tNome, JTextField tEmail, JTextField tCpf, JTextField tTelefone, JTextField tEndereco, JTextField tBairro, JTextField tCidade, JTextField tUf, Cliente cliente, JButton visitante) {
        this.tLogin = tLogin;
        this.pSenha = pSenha;
        this.tNome = tNome;
        this.tEmail = tEmail;
        this.tCpf = tCpf;
        this.tTelefone = tTelefone;
        this.tEndereco = tEndereco;
        this.tBairro = tBairro;
        this.tCidade = tCidade;
        this.tUf = tUf;
        this.cliente = cliente;
        this.visitante = visitante;
        repositorioCliente = new RepositorioCliente();
        
    }
    
      
    ClienteBD cliBD = new ClienteBD();
    

    public Cliente inicializarCliente(Cliente cliente) {
        cliente = new Cliente("a", "a", "Rubens Leme","Rubens@" ,"146.888.444-92",
                "3333-3333","R.Neslson","Jaragua","Sao Paulo", "SP");
        cliente.setLogin(tLogin.getText());    
        cliente.setSenha(String.valueOf(pSenha.getPassword()));
        
         return cliente;
    }
    
   
      
     public void salvar() {
        cliente = new Cliente();

        cliente = inicializarCliente(cliente);

        if (repositorioCliente.salvar(cliente)) {
            Mensagem.exibirMensagem("Cliente " + cliente.toString()
                    + " foi salvo com sucesso.");
        } else {
            Mensagem.exibirMensagem("Falha ao salvar o cliente "
                    + cliente.toString() + ".");
        }
    }

    
}
