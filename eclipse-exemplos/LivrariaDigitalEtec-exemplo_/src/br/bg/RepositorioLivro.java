package br.bg;

import java.util.List;

/**
 *
 * @author rubens.leme
 */
public class RepositorioLivro extends RepositorioBase<Livro>{
     private static final String COMANDO_BASE = " SELECT * From Livro ";
     private static final String COLUNA_ISBN_ID = "ISBN_ID";
     private static final String COLUNA_TITULO = "titulo";
     private static final String COLUNA_DATA_PUBLICACAO = "data_publicacao";
     private static final String COLUNA_FORMATO = "formato";
     private static final String COLUNA_ID_FORNECEDOR = "id_fornecedor";
     private static final String COLUNA_ID_EDITORA = "id_editora";
     private static final String COLUNA_VALOR_CUSTO = "valor_custo";
     private static final String COLUNA_VALOR_VENDA = "valor_venda";
          
    @Override
    public boolean incluir(Livro livro) {
        String ISBN_ID  = livro.getISBN_ID();
        String titulo = livro.getTitulo();
        String dataPublicacao = livro.getDataPublicacao();
        String formato = livro.getFormato();
        Long idFornecedor  =  livro.getIdFornecedor();
        Long idEditora = livro.getIdEditora();
        double valorCusto = livro.getValorCusto();
        double valorVenda  =  livro.getValorVenda();
        
         String sql = "INSERT INTO Livro ("+ COLUNA_ISBN_ID + "," + COLUNA_TITULO
                + "," + COLUNA_DATA_PUBLICACAO + ", " + COLUNA_FORMATO + ", " + COLUNA_ID_FORNECEDOR + ", "
                + COLUNA_ID_EDITORA + ", " + COLUNA_VALOR_CUSTO + ", " + COLUNA_VALOR_VENDA
                + ") VALUES ('"+ ISBN_ID + "','" + titulo + "','" + dataPublicacao+ "','" + formato + "','"
                + idFornecedor + "','" + idEditora + "','" + valorCusto +  "','" + valorVenda + "')";
             
        return super.salvar(sql);
    }

    @Override
    public boolean alterar(Livro objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Livro> obterTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Livro obterPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
