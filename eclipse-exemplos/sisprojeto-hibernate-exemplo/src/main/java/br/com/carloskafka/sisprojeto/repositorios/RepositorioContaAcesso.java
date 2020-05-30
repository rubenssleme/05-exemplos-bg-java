package br.com.carloskafka.sisprojeto.repositorios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.carloskafka.sisprojeto.dominio.ContaAcesso;
import br.com.carloskafka.sisprojeto.utilitarios.Mensagem;

public class RepositorioContaAcesso extends RepositorioBase<ContaAcesso> {

    private static final String COMANDO_BASE = " SELECT * From Conta_Acesso ";
    private static final String COLUNA_LOGIN = "login";
    private static final String COLUNA_SENHA = "senha";

    public ContaAcesso autenticar(ContaAcesso contaAcesso) {
        String sql = COMANDO_BASE + " WHERE " + COLUNA_LOGIN + " ='"
                + contaAcesso.getLogin() + "' and " + COLUNA_SENHA + "='"
                + contaAcesso.getSenha() + "'";
        ContaAcesso c = null;
        
        if (contaAcesso.validar()) {
            ResultSet contaAcessoObtida = super.obterPor(sql);
            try {

                if (contaAcessoObtida.next()) {
                    c = new ContaAcesso();
                    c.setLogin(contaAcessoObtida.getString(COLUNA_LOGIN));
                    c.setSenha(contaAcessoObtida.getString(COLUNA_SENHA));
                 
                } else {
                    Mensagem.exibirMensagem("Erro: Usuario ou senha invalido.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else {
            return null;
        }

        return c;
    }

    
    public boolean incluir(ContaAcesso objeto) {
        return false;
    }

    public boolean alterar(ContaAcesso objeto) {
        return false;
    }

    public boolean excluir(Long id) {
        return false;
    }

    public List<ContaAcesso> obterTodos() {
        return null;
    }

    public ContaAcesso obterPorId(Long id) {
        return null;
    }
}
