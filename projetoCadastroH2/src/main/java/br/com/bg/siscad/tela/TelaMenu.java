package br.com.bg.siscad.tela;

import br.com.bg.siscad.controlador.ControladorTelaMenu;
import static br.com.bg.siscad.tela.TelaPrincipal.menuCadastroUsuario;

/**
 *
 * @author Rubens Leme
 */
public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
        controladorTelaMenu = new ControladorTelaMenu(this, jdpTelaFilha,
                menuCadastroAluno,menuCadastroFuncionario, menuCadastroUsuario, menuCadastroProduto,
                menuConsultar, menuRegistrarCompraProduto, menuRegistrarContribuicao,
                menuRegistrarDespesa, menuRegistrarVenda, menuCaixa, menuAjudaSobre,
                menuOpcoesConfiguracoes, menuOpcoesSair,
                jlaUsuarioLogado, jlaHora, jlaData, jlaDiaSemana);
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaBarraInformacao = new javax.swing.JPanel();
        jpaUsuarioLogado = new javax.swing.JPanel();
        jlaUsuarioLogado = new javax.swing.JLabel();
        jpaLogoEmpresa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpaInfoDataHora = new javax.swing.JPanel();
        jlaHora = new javax.swing.JLabel();
        jlaDiaSemana = new javax.swing.JLabel();
        jlaData = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jdpTelaFilha = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadastroAluno = new javax.swing.JMenuItem();
        menuCadastroFuncionario = new javax.swing.JMenuItem();
        menuCadastroUsuario = new javax.swing.JMenuItem();
        menuCadastroProduto = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenu();
        menuRegistrar = new javax.swing.JMenu();
        menuRegistrarCompraProduto = new javax.swing.JMenuItem();
        menuRegistrarContribuicao = new javax.swing.JMenuItem();
        menuRegistrarDespesa = new javax.swing.JMenuItem();
        menuRegistrarVenda = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuRelatorioAlunos = new javax.swing.JMenuItem();
        menuRelatorioServicos = new javax.swing.JMenuItem();
        menuCaixa = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenu();
        menuAjudaSobre = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        menuOpcoesConfiguracoes = new javax.swing.JMenuItem();
        menuOpcoesSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Menu");
        setExtendedState(6);
        setFocusCycleRoot(false);
        setResizable(false);

        jpaUsuarioLogado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário logado:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(204, 0, 0))); // NOI18N

        jlaUsuarioLogado.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jlaUsuarioLogado.setForeground(new java.awt.Color(153, 0, 0));
        jlaUsuarioLogado.setText("Usuario Logado");

        javax.swing.GroupLayout jpaUsuarioLogadoLayout = new javax.swing.GroupLayout(jpaUsuarioLogado);
        jpaUsuarioLogado.setLayout(jpaUsuarioLogadoLayout);
        jpaUsuarioLogadoLayout.setHorizontalGroup(
            jpaUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaUsuarioLogadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlaUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpaUsuarioLogadoLayout.setVerticalGroup(
            jpaUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaUsuarioLogadoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlaUsuarioLogado)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jpaLogoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Logo Empresa:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo_bg.png"))); // NOI18N

        javax.swing.GroupLayout jpaLogoEmpresaLayout = new javax.swing.GroupLayout(jpaLogoEmpresa);
        jpaLogoEmpresa.setLayout(jpaLogoEmpresaLayout);
        jpaLogoEmpresaLayout.setHorizontalGroup(
            jpaLogoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaLogoEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpaLogoEmpresaLayout.setVerticalGroup(
            jpaLogoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        jpaInfoDataHora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N

        jlaHora.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jlaHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlaHora.setText("Hora");

        jlaDiaSemana.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jlaDiaSemana.setForeground(new java.awt.Color(102, 0, 0));
        jlaDiaSemana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlaDiaSemana.setText("dia");

        jlaData.setFont(new java.awt.Font("Cantarell", 1, 26)); // NOI18N
        jlaData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlaData.setText("Data");

        javax.swing.GroupLayout jpaInfoDataHoraLayout = new javax.swing.GroupLayout(jpaInfoDataHora);
        jpaInfoDataHora.setLayout(jpaInfoDataHoraLayout);
        jpaInfoDataHoraLayout.setHorizontalGroup(
            jpaInfoDataHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlaData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlaDiaSemana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlaHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpaInfoDataHoraLayout.setVerticalGroup(
            jpaInfoDataHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpaInfoDataHoraLayout.createSequentialGroup()
                .addComponent(jlaDiaSemana)
                .addGap(45, 45, 45)
                .addComponent(jlaData)
                .addGap(40, 40, 40)
                .addComponent(jlaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpaBarraInformacaoLayout = new javax.swing.GroupLayout(jpaBarraInformacao);
        jpaBarraInformacao.setLayout(jpaBarraInformacaoLayout);
        jpaBarraInformacaoLayout.setHorizontalGroup(
            jpaBarraInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaBarraInformacaoLayout.createSequentialGroup()
                .addGroup(jpaBarraInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpaBarraInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jpaInfoDataHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpaUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpaLogoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpaBarraInformacaoLayout.setVerticalGroup(
            jpaBarraInformacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaBarraInformacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpaUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpaInfoDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jpaLogoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jdpTelaFilha.setBackground(new java.awt.Color(0, 51, 51));
        jdpTelaFilha.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jdpTelaFilhaLayout = new javax.swing.GroupLayout(jdpTelaFilha);
        jdpTelaFilha.setLayout(jdpTelaFilhaLayout);
        jdpTelaFilhaLayout.setHorizontalGroup(
            jdpTelaFilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jdpTelaFilhaLayout.setVerticalGroup(
            jdpTelaFilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaFilha, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaFilha)
        );

        menuCadastro.setText("Cadastro");

        menuCadastroAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCadastroAluno.setText("Aluno");
        menuCadastro.add(menuCadastroAluno);

        menuCadastroFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCadastroFuncionario.setText("Funcionário");
        menuCadastro.add(menuCadastroFuncionario);

        menuCadastroUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCadastroUsuario.setText("Usuário");
        menuCadastroUsuario.setEnabled(false);
        menuCadastro.add(menuCadastroUsuario);

        menuCadastroProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuCadastroProduto.setText("Produto");
        menuCadastro.add(menuCadastroProduto);

        jMenuBar1.add(menuCadastro);

        menuConsultar.setText("Consultar");
        jMenuBar1.add(menuConsultar);

        menuRegistrar.setText("Registrar");

        menuRegistrarCompraProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuRegistrarCompraProduto.setText("Compra de Produto");
        menuRegistrar.add(menuRegistrarCompraProduto);

        menuRegistrarContribuicao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuRegistrarContribuicao.setText("Contribuição");
        menuRegistrar.add(menuRegistrarContribuicao);

        menuRegistrarDespesa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuRegistrarDespesa.setText("Despesa");
        menuRegistrar.add(menuRegistrarDespesa);

        menuRegistrarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuRegistrarVenda.setText("Venda");
        menuRegistrar.add(menuRegistrarVenda);

        jMenuBar1.add(menuRegistrar);

        menuRelatorio.setText("Relatório");
        menuRelatorio.setEnabled(false);

        menuRelatorioAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuRelatorioAlunos.setText("Alunos");
        menuRelatorio.add(menuRelatorioAlunos);

        menuRelatorioServicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuRelatorioServicos.setText("Serviços");
        menuRelatorio.add(menuRelatorioServicos);

        jMenuBar1.add(menuRelatorio);

        menuCaixa.setText("Caixa");
        jMenuBar1.add(menuCaixa);

        menuAjuda.setText("Ajuda");

        menuAjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuAjudaSobre.setText("Sobre");
        menuAjuda.add(menuAjudaSobre);

        jMenuBar1.add(menuAjuda);

        menuOpcoes.setText("Opções");

        menuOpcoesConfiguracoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuOpcoesConfiguracoes.setText("Configurações");
        menuOpcoes.add(menuOpcoesConfiguracoes);

        menuOpcoesSair.setText("Sair");
        menuOpcoes.add(menuOpcoesSair);

        jMenuBar1.add(menuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpaBarraInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpaBarraInformacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setUsuarioLogado(String usuario) {
        this.jlaUsuarioLogado.setText(usuario);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jdpTelaFilha;
    private javax.swing.JLabel jlaData;
    private javax.swing.JLabel jlaDiaSemana;
    private javax.swing.JLabel jlaHora;
    private javax.swing.JLabel jlaUsuarioLogado;
    private javax.swing.JPanel jpaBarraInformacao;
    private javax.swing.JPanel jpaInfoDataHora;
    private javax.swing.JPanel jpaLogoEmpresa;
    private javax.swing.JPanel jpaUsuarioLogado;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjudaSobre;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCadastroAluno;
    private javax.swing.JMenuItem menuCadastroFuncionario;
    private javax.swing.JMenuItem menuCadastroProduto;
    public static javax.swing.JMenuItem menuCadastroUsuario;
    private javax.swing.JMenu menuCaixa;
    private javax.swing.JMenu menuConsultar;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem menuOpcoesConfiguracoes;
    private javax.swing.JMenuItem menuOpcoesSair;
    private javax.swing.JMenu menuRegistrar;
    private javax.swing.JMenuItem menuRegistrarCompraProduto;
    private javax.swing.JMenuItem menuRegistrarContribuicao;
    private javax.swing.JMenuItem menuRegistrarDespesa;
    private javax.swing.JMenuItem menuRegistrarVenda;
    public static javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem menuRelatorioAlunos;
    private javax.swing.JMenuItem menuRelatorioServicos;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaMenu controladorTelaMenu;
}
