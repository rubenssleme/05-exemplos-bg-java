package br.com.bg.siscad.controlador;

import br.com.bg.siscad.controlador.ControladorTela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
 * @author l
 */
public class ControladorTelaPrincipal extends ControladorTela {

    private JMenuItem aluno,
            funcionario,
            usuario,
            produto,
            consultar,
            compraProduto,
            contribuicao,
            despesa,
            venda,
            caixa,
            sobre,
            configuracoes,
            sair;
    private JLabel lblUsuario,
            lblHora,
            lblDiaSemana,
            lblData;
    private Timer timer;

    public ControladorTelaPrincipal(JFrame telaPrincipal, JDesktopPane desktop,
            JMenuItem aluno, JMenuItem funcionario, JMenuItem usuario,
            JMenuItem produto, JMenuItem consultar, JMenuItem compraProduto,
            JMenuItem contribuicao, JMenuItem despesa, JMenuItem venda,
            JMenuItem caixa, JMenuItem sobre, JMenuItem configuracoes,
            JMenuItem sair, JLabel lblUsuario, JLabel lblHora, JLabel lblDiaSemana,
            JLabel lblData) {
        super(telaPrincipal, desktop);
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

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarHora();
            }
        });
        timer.start();

        atualizarData();
        acessoRapido(telaPrincipal, desktop);

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
//                telaCadastroProduto();
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
                sair();
            }
        });
        consultar.addMouseListener(new MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
//                telaConsulta();
            }
        });
        telaPrincipal.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                fechar();
            }
        });
    }

    private void atualizarHora() {
        // Hora
        lblHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    private void atualizarData() {
        // Data
        lblData.setText(DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));
        // Dia da semana
        lblDiaSemana.setText(new SimpleDateFormat("EEEE").format(new Date()));
        // Hora
        lblHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    public void fechar() {
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void sair() {
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
//            telaLogin();
        }
    }
}
