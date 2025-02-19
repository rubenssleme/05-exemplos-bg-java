package br.com.bg.siscad.controlador;

import br.com.bg.siscad.tela.TelaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Rubens Leme
 */
public class ControladorTelaMenu extends ControladorTela {

    private JLabel jlaHora;
    private JLabel jlaData;
    private JLabel jlaDiaSemana;
    private JLabel jlaUsuarioLogado;
    private Timer timer;
    
     private JMenuItem aluno, funcionario,usuario, produto, consultar,compraProduto,
            contribuicao,despesa,venda,caixa,sobre,configuracoes,sair;
    private JLabel lblUsuario,
            lblHora,
            lblDiaSemana,
            lblData;
    

    public ControladorTelaMenu(JFrame telaMenu, JDesktopPane desktop,  
            JMenuItem aluno, JMenuItem funcionario, JMenuItem usuario,
            JMenuItem produto, JMenuItem consultar, JMenuItem compraProduto,
            JMenuItem contribuicao, JMenuItem despesa, JMenuItem venda,
            JMenuItem caixa, JMenuItem sobre, JMenuItem configuracoes,
            JMenuItem sair,JLabel jlaUsuarioLogado,JLabel jlaHora, 
            JLabel jlaData, JLabel jlaDiaSemana) {
        super(telaMenu, desktop);
        this.jlaHora = jlaHora;
        this.jlaData = jlaData;
        this.jlaDiaSemana = jlaDiaSemana;
        this.jlaUsuarioLogado = jlaUsuarioLogado;
             
        this.aluno = aluno;
        this.funcionario = funcionario;
        this.usuario = usuario;
        this.produto = produto;
        this.consultar = consultar;
        this.compraProduto = compraProduto;
        this.contribuicao = contribuicao;
        this.despesa = despesa;
        this.venda = venda;
        this.caixa = caixa;
        this.sobre = sobre;
        this.configuracoes = configuracoes;
        this.sair = sair;
        this.lblUsuario = lblUsuario;
        this.lblHora = lblHora;
        this.lblDiaSemana = lblDiaSemana;
        this.lblData = lblData;
        
        
        
        
        atualizacaoTimer();
        acessoRapido(telaMenu, desktop);
                aluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                telaCadastroAluno();
            }
        });
        funcionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                telaCadastroFuncionario();
            }
        });
        usuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                telaCadastroUsuario();
            }
        });
        produto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              telaCadastroProduto();
            }
        });
        consultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                telaConsulta();
            }
        });
        compraProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                telaCompraProduto();
            }
        });
        contribuicao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                telaContribuicao();
            }
        });
        despesa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                telaDespesa();
            }
        });
        venda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                telaVenda();
            }
        });
        caixa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //telaCaixa();
            }
        });
        sobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                telaSobre();
            }
        });
        configuracoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                telaConfiguracoes();
            }
        });
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });
        consultar.addMouseListener(new MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
//                telaConsulta();
            }
        });
        telaMenu.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                fechar();
            }
        });
    }
    
    

    private void atualizarHora() {
        // Hora
        jlaHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    private void atualizarData() {
        // Data
        jlaData.setText(DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date()));
        // Dia da semana
        jlaDiaSemana.setText(new SimpleDateFormat("EEEE").format(new Date()));
        // Hora
        jlaHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    private void atualizacaoTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarHora();

            }
        });
        timer.start();

        atualizarData();

    }
    public void fechar() {
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
    private void sair(){
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
//            telaLogin();
        }
    }

}
