package br.org.laramara.usse.repositorios;

import br.org.laramara.usse.dominio.Usuario;
//import br.com.bg.sgfapm.utilitarios.Conexao;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

/**
 *
 * @author l
 */
public class RepositorioUsuario extends RepositorioGenerico<Usuario> {

    /*private Connection conexao;
    private final String TABLE = "TB_USUARIOS";

    public RepositorioUsuario() {
        this.conexao = new Conexao().getConnection();
    }
    
    public int buscarUltimoId(){
        String sql = "select ID_User from " + TABLE + " order by ID_USER desc limit 1";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                return (Integer.parseInt(rs.getString(1)) + 1);
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar último Id: " + e);
        }
        return 0;
    }

    public Usuario buscarPorUsuarioSenha(String usuario, String senha) {
        String sql = "select * from " + TABLE + " where USUARIO = ? and SENHA = ?;";
        try {
            PreparedStatement stmt = (PreparedStatement) conexao.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = Integer.parseInt(rs.getString(1));
                String nome = rs.getString(2);
                String perfil = rs.getString(5);

                return new Usuario(id, nome, perfil);
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar por usuário e senha: " + e);
        }
        return null;
    }

    public boolean inserir(Usuario usuario) {
        String sql = "insert into " + TABLE + " (nome, usuario, senha, perfil) values (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getUsuario());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getPerfil());

            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao inserir usuário: " + e);
        }
        return false;
    }*/
}
