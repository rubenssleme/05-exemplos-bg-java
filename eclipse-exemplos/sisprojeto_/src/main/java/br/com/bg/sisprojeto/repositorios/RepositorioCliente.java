/*package br.com.bg.sisprojeto.repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.bg.sisprojeto.dominio.Cliente;
import br.com.bg.sisprojeto.utilitarios.Mensagem;

public class RepositorioCliente extends RepositorioBase<Cliente> {

    private static final String COMANDO_BASE = " SELECT * From Cliente ";
    private static final String CONDICIONAL_WHERE = " WHERE ";
    private static final String COLUNA_ID = "id";
    private static final String COLUNA_NOME = "nome";
    private static final String COLUNA_CNPJ = "cnpj";
    private static final String COLUNA_RAZAO_SOCIAL = "razao_social";
    private static final String COLUNA_EMAIL = "email";
    private static final String COLUNA_TELEFONE = "telefone";

    public boolean incluir(Cliente cliente) {
        String nome = cliente.getNome();
        String cnpj = cliente.getCnpj();
        String razaoSocial = cliente.getRazaoSocial();
        String email = cliente.getEmail();
        String telefone = cliente.getTelefone();

        String sql = "INSERT INTO Cliente (" + COLUNA_NOME
                + "," + COLUNA_CNPJ + ", " + COLUNA_RAZAO_SOCIAL + ", "
                + COLUNA_EMAIL + ", " + COLUNA_TELEFONE
                + ") VALUES ('" + nome + "','" + cnpj + "','"
                + razaoSocial + "','" + email + "','" + telefone + "')";

        if (cliente.validar()) {
            return super.salvar(sql);
        } else {
            return false;
        }

    }

    public boolean alterar(Cliente cliente) {
        String id = cliente.getId().toString();
        String nome = cliente.getNome();
        String cnpj = cliente.getCnpj();
        String razaoSocial = cliente.getRazaoSocial();
        String email = cliente.getEmail();
        String telefone = cliente.getTelefone();

        String sql = "UPDATE Cliente SET " + COLUNA_NOME + " = '" + nome
                + "', " + COLUNA_CNPJ + " = '" + cnpj + "', "
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

                Long id = clientesObtido.getLong(COLUNA_ID);
                String nome = clientesObtido.getString(COLUNA_NOME);
                String cnpj = clientesObtido.getString(COLUNA_CNPJ);
                String razaoSocial = clientesObtido
                        .getString(COLUNA_RAZAO_SOCIAL);
                String email = clientesObtido.getString(COLUNA_EMAIL);
                String telefone = clientesObtido.getString(COLUNA_TELEFONE);

                cliente.setId(id);
                cliente.setNome(nome);
                cliente.setCnpj(cnpj);
                cliente.setRazaoSocial(razaoSocial);
                cliente.setEmail(email);
                cliente.setTelefone(telefone);

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
                String cnpj = clienteObtido.getString(COLUNA_CNPJ);
                String razaoSocial = clienteObtido
                        .getString(COLUNA_RAZAO_SOCIAL);
                String email = clienteObtido.getString(COLUNA_EMAIL);
                String telefone = clienteObtido.getString(COLUNA_TELEFONE);

                c = new Cliente();
                c.setId(id);
                c.setNome(nome);
                c.setCnpj(cnpj);
                c.setRazaoSocial(razaoSocial);
                c.setEmail(email);
                c.setTelefone(telefone);
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

        Long id = cliente.getId();
        String nome = cliente.getNome();
        String cnpj = cliente.getCnpj();
        String razaoSocial = cliente.getRazaoSocial();
        String email = cliente.getEmail();
        String telefone = cliente.getTelefone();

        sql += COMANDO_BASE;

        if (cliente != null) {
            sql += CONDICIONAL_WHERE;
        }

        if (nome != null && !nome.isEmpty()) {
            sql += " nome = '" + nome + "'";
        } else if (cnpj != null && !cnpj.isEmpty()) {
            sql += " cnpj = '" + cnpj + "'";
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
                id = clienteObtido.getLong(COLUNA_ID);
                nome = clienteObtido.getString(COLUNA_NOME);
                cnpj = clienteObtido.getString(COLUNA_CNPJ);
                razaoSocial = clienteObtido.getString(COLUNA_RAZAO_SOCIAL);
                email = clienteObtido.getString(COLUNA_EMAIL);
                telefone = clienteObtido.getString(COLUNA_TELEFONE);

                c = new Cliente();

                c.setId(id);
                c.setNome(nome);
                c.setCnpj(cnpj);
                c.setRazaoSocial(razaoSocial);
                c.setEmail(email);
                c.setTelefone(telefone);

                clientes.add(c);
            }
        } catch (SQLException e) {
            Mensagem.exibirMensagem(e.getMessage());
        }

        return clientes;
    }

}
*/