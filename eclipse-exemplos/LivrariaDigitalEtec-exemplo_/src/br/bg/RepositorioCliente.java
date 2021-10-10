package br.bg;
/**
 *
 * @author rubens.leme
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.bg.Cliente;
import br.bg.Mensagem;

public class RepositorioCliente extends RepositorioBase<Cliente> {

    private static final String COMANDO_BASE = " SELECT * From Cliente ";
    private static final String COLUNA_ID = "login_id_cli";
    private static final String COLUNA_SENHA = "senha_cli";
    private static final String COLUNA_NOME = "nome_cli";
    private static final String COLUNA_CNPJ = "cnpj";
    private static final String COLUNA_RAZAO_SOCIAL = "razao_social";
    private static final String COLUNA_EMAIL = "email";
    private static final String COLUNA_TELEFONE = "telefone";
    private static final String CONDICIONAL_WHERE = " WHERE ";
    
      

    public boolean incluir(Cliente cliente) {
        String id = cliente.getLogin_id_cli();
        String senha_cli = cliente.getSenha_cli();
        String nome = cliente.getNome_cli();
        String cpf = cliente.getCpf_cli();
        String razaoSocial = cliente.getCpf_cli();
        String email = cliente.getEmail_cli();
        String telefone = cliente.getTelefone_cli();

        String sql = "INSERT INTO Cliente ("+ COLUNA_NOME
                + "," + COLUNA_CNPJ + ", " + COLUNA_RAZAO_SOCIAL + ", "
                + COLUNA_EMAIL + ", " + COLUNA_TELEFONE
                + ") VALUES ('" + nome + "','" + cpf + "','"
                + razaoSocial + "','" + email + "','" + telefone + "')";
       
        
     /*   if (cliente.validar()) {
            return super.salvar(sql);
        }else{
            return false;
        }*/
   return false;
    }
    
       

    public boolean alterar(Cliente cliente) {
        String id = cliente.getLogin_id_cli();
        String senha = cliente.getSenha_cli();
        String nome = cliente.getNome_cli();
        String cpf = cliente.getCpf_cli();
        String razaoSocial = cliente.getCpf_cli();
        String email = cliente.getEmail_cli();
        String telefone = cliente.getTelefone_cli();

        String sql = "UPDATE Cliente SET " + COLUNA_NOME + " = '" + nome
                + "', " + COLUNA_CNPJ + " = '" + cpf + "', "
                + COLUNA_RAZAO_SOCIAL + " = '" + razaoSocial + "', "
                + COLUNA_EMAIL + " = '" + email + "', " + COLUNA_TELEFONE
                + " = '" + telefone + "'" + CONDICIONAL_WHERE + COLUNA_ID
                + " = " + id;

        return super.alterar(sql);
    }

    public boolean excluir(Long id) {
        String sql = "DELETE FROM Cliente " + CONDICIONAL_WHERE + COLUNA_ID
                + " = " + String.valueOf(id);
        return super.excluir(sql);
    }
    
       
    

    public List<Cliente> obterTodos() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            ResultSet clientesObtido = super.obterPor(COMANDO_BASE);

            while (clientesObtido.next()) {
                Cliente cliente = new Cliente();

                String id = clientesObtido.getString(COLUNA_ID);
                String nome = clientesObtido.getString(COLUNA_NOME);
                String cpf = clientesObtido.getString(COLUNA_CNPJ);
                String razaoSocial = clientesObtido
                        .getString(COLUNA_RAZAO_SOCIAL);
                String email = clientesObtido.getString(COLUNA_EMAIL);
                String telefone = clientesObtido.getString(COLUNA_TELEFONE);

                cliente.setLogin_id_cli(id);
                cliente.setNome_cli(nome);
                cliente.setCpf_cli(cpf);
                cliente.setCpf_cli(razaoSocial);
                cliente.setEmail_cli(email);
                cliente.setTelefone_cli(telefone);

                clientes.add(cliente);
            }
            encerrarComando();
        } catch (SQLException e) {
            Mensagem.exibirMensagem(e.getMessage());
        }
        return clientes;
    }

    public Cliente obterPorId(Long id) {
        Cliente c = null;
        try {
            String sql = COMANDO_BASE + CONDICIONAL_WHERE + COLUNA_ID + " = "
                    + String.valueOf(id);
            ResultSet clienteObtido = super.obterPor(sql);
            if (clienteObtido.next()) {
                id = clienteObtido.getLong(COLUNA_ID);
                String nome = clienteObtido.getString(COLUNA_NOME);
                String cpf = clienteObtido.getString(COLUNA_CNPJ);
                String razaoSocial = clienteObtido
                        .getString(COLUNA_RAZAO_SOCIAL);
                String email = clienteObtido.getString(COLUNA_EMAIL);
                String telefone = clienteObtido.getString(COLUNA_TELEFONE);

                c = new Cliente();
                c.setLogin_id_cli(id.toString());
                c.setNome_cli(nome);
                c.setCpf_cli(cpf);
                c.setCpf_cli(cpf);
                c.setEmail_cli(email);
                c.setTelefone_cli(telefone);
            } else {
                Mensagem.exibirMensagem("Nenhum registro foi encontrado.");
            }
        } catch (SQLException e) {
            Mensagem.exibirMensagem(e.getMessage());
        }

        return c;
    }

    public List<Cliente> pesquisar(Cliente cliente) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        String sql = "";

        String id = cliente.getLogin_id_cli();
        String nome = cliente.getNome_cli();
        String cpf = cliente.getCpf_cli();
        String razaoSocial = cliente.getCpf_cli();
        String email = cliente.getEmail_cli();
        String telefone = cliente.getTelefone_cli();

        sql += COMANDO_BASE;

        if (cliente != null) {
            sql += CONDICIONAL_WHERE;
        }

        if (nome != null && !nome.isEmpty()) {
            sql += " nome = '" + nome + "'";
        } else if (cpf != null && !cpf.isEmpty()) {
            sql += " cpf = '" + cpf + "'";
        } else if (razaoSocial != null && !razaoSocial.isEmpty()) {
            sql += " razao_social = '" + razaoSocial + "'";
        } else if (email != null && !email.isEmpty()) {
            sql += " email = '" + email + "'";
        } else if (telefone != null && !telefone.isEmpty()) {
            sql += " telefone = '" + telefone + "'";
        }
        Cliente c = null;
        try {
            ResultSet clienteObtido = super.obterPor(sql);

            while (clienteObtido.next()) {
                id = clienteObtido.getString(COLUNA_ID);
                nome = clienteObtido.getString(COLUNA_NOME);
                cpf = clienteObtido.getString(COLUNA_CNPJ);
                razaoSocial = clienteObtido.getString(COLUNA_RAZAO_SOCIAL);
                email = clienteObtido.getString(COLUNA_EMAIL);
                telefone = clienteObtido.getString(COLUNA_TELEFONE);

                c = new Cliente();

                c.setLogin_id_cli(id);
                c.setNome_cli(nome);
                c.setCpf_cli(cpf);
                c.setCpf_cli(cpf);
                c.setEmail_cli(email);
                c.setTelefone_cli(telefone);

                clientes.add(c);
            }
        } catch (SQLException e) {
            Mensagem.exibirMensagem(e.getMessage());
        }

        return clientes;
    }

}
