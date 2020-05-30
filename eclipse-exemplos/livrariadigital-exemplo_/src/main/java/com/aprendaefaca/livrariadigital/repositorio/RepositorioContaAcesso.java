package com.aprendaefaca.livrariadigital.repositorio;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.aprendaefaca.livrariadigital.dominio.ContaAcesso;
import com.aprendaefaca.livrariadigital.utilitarios.Criptografia;
import com.aprendaefaca.livrariadigital.utilitarios.Mensagem;
import java.util.List;
/**
 *
 * @author rubens.leme
 */
public class RepositorioContaAcesso extends RepositorioBase<ContaAcesso>{
    
    private static final String COMANDO_BASE = " SELECT * From Conta_Acesso ";
    private static final String COLUNA_LOGIN = "login";
    private static final String COLUNA_SENHA = "senha";
    private static final String COLUNA_ID = "id";
   
    //private JTextField tLogin;
    //private JPasswordField pSenha;
       
      
    
    public ContaAcesso autenticar(ContaAcesso contaAcesso){
         String sql = COMANDO_BASE + " WHERE " + COLUNA_LOGIN + " ='"
                + contaAcesso.getLogin() + "' and " + COLUNA_SENHA + "='"
                + Criptografia.converterParaMD5(contaAcesso.getSenha()) + "'";

        ResultSet contaAcessoObtida = super.obterPor(sql);

          ContaAcesso c = null;
        try {

           if (contaAcessoObtida.next()) {
                c = new ContaAcesso();
                c.setId(contaAcessoObtida.getInt(COLUNA_ID));
                c.setLogin(contaAcessoObtida.getString(COLUNA_LOGIN));
                c.setSenha(contaAcessoObtida.getString(COLUNA_SENHA));
            } else {
                Mensagem.exibirMensagem("Erro: Usuario ou senha invalido.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
      
        return c;
    }

    @Override
    public boolean salvar(ContaAcesso objeto) {
       return false;
    }

    @Override
    public boolean alterar(ContaAcesso objeto) {
       return false;
    }

    @Override
    public boolean excluir(Long id) {
        return false;
    }

    @Override
    public List<ContaAcesso> obterTodos() {
       return null;
    }

    @Override
    public ContaAcesso obterPorId(Long id) {
      return null;
    }

   
}
