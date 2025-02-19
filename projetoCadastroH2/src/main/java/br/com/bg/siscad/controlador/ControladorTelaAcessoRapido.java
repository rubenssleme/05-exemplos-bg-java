package br.com.bg.siscad.controlador;

import br.com.bg.siscad.controlador.ControladorTela;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author l
 */
public class ControladorTelaAcessoRapido extends ControladorTela {

    private JLabel lblConsultar,
            lblAluno,
            lblFuncionario,
            lblUsuario,
            lblProduto,
            lblContribuicao,
            lblVenda,
            lblCompraProduto,
            lblDespesa;

    public ControladorTelaAcessoRapido(JFrame telaPrincipal, JDesktopPane desktop, JLabel lblConsultar, 
            JLabel lblAluno, JLabel lblFuncionario, JLabel lblUsuario, JLabel lblProduto, JLabel lblContribuicao, JLabel lblVenda, JLabel lblCompraProduto, JLabel lblDespesa) {
        super(telaPrincipal, desktop);
        this.lblConsultar = lblConsultar;
        this.lblAluno = lblAluno;
        this.lblFuncionario = lblFuncionario;
        this.lblUsuario = lblUsuario;
        this.lblProduto = lblProduto;
        this.lblContribuicao = lblContribuicao;
        this.lblVenda = lblVenda;
        this.lblCompraProduto = lblCompraProduto;
        this.lblDespesa = lblDespesa;

        this.lblConsultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                //telaConsulta();
            }
        });
        this.lblAluno.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
              //  telaCadastroAluno();
            }
        });
        this.lblFuncionario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
              //  telaCadastroFuncionario();
            }
        });
        this.lblUsuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                telaCadastroUsuario();
            }
        });
        this.lblProduto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
//                telaCadastroProduto();
            }
        });
        this.lblContribuicao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
//                telaContribuicao();
            }
        });
        this.lblVenda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
//                telaVenda();
            }
        });
        this.lblCompraProduto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
//                telaCompraProduto();
            }
        });
        this.lblDespesa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
//                telaDespesa();
            }
        });
    }
}
