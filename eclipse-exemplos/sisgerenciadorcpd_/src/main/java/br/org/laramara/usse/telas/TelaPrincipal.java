package br.org.laramara.usse.telas;

import br.org.laramara.usse.controladores.ControladorTelaPrincipal;
import javax.swing.JDesktopPane;

/**
 *
 * @author l
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    TelaGerenciarEquipamentos telaGerenciadorServidores;

    private TelaPrincipal() {
        initComponents();
        controlador = new ControladorTelaPrincipal(this, desktop, menuCadastroServidores,
                menuCadastroFuncionario, menuCadastroUsuario, menuCadastroProduto,
                menuConsultar, menuRegistrarCompraProduto, menuRegistrarContribuicao,
                menuRegistrarDespesa, menuRegistrarVenda, menuCaixa, menuAjudaSobre,
                menuOpcoesConfiguracoes, menuOpcoesSair, lblUsuario, lblHora, lblDiaSemana, lblData);
    }

    private static TelaPrincipal telaPrincipal = new TelaPrincipal();

    public static TelaPrincipal obterInstancia() {
        return telaPrincipal;
    }

    public JDesktopPane obterJDesktop() {
        return desktop = new JDesktopPane();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        lblDiaSemana = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        Menu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadastroServidores = new javax.swing.JMenuItem();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SGCPD - Sistema de Gerenciamento do CPD.");
        setExtendedState(MAXIMIZED_BOTH);
        setMinimumSize(new java.awt.Dimension(901, 680));

        desktop.setBackground(new java.awt.Color(0, 102, 102));
        desktop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        desktop.setPreferredSize(new java.awt.Dimension(640, 480));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));
        jPanel1.setToolTipText("Nome do usuário logado no sistema");
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 100));

        lblUsuario.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(204, 0, 0));
        lblUsuario.setText("Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblData.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblData.setText("Data");

        lblDiaSemana.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        lblDiaSemana.setText("dia");

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDiaSemana)
                    .addComponent(lblData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addComponent(lblDiaSemana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/laramara/usse/icones/acesso/logo-lm.jpg"))); // NOI18N
        lblLogo.setMaximumSize(new java.awt.Dimension(256, 256));
        lblLogo.setPreferredSize(new java.awt.Dimension(791, 689));

        lblHora.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("Hora");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        );

        jTree1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Menu Principal");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Gerenciador");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Adicionar Equipamento");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Editar Equipamento");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Acessos");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Acesso Rapido");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("O.S");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ramais");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("CPD");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ajuda");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sobre");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTree1.setToggleClickCount(1);
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        Menu.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        menuCadastro.setText("Cadastro");

        menuCadastroServidores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menuCadastroServidores.setText("Servidores");
        menuCadastroServidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroServidoresActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroServidores);

        menuCadastroFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        menuCadastroFuncionario.setText("Funcionário");
        menuCadastro.add(menuCadastroFuncionario);

        menuCadastroUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menuCadastroUsuario.setText("Usuário");
        menuCadastroUsuario.setEnabled(false);
        menuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroUsuario);

        menuCadastroProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        menuCadastroProduto.setText("Produto");
        menuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroProduto);

        Menu.add(menuCadastro);

        menuConsultar.setText("Consultar");
        Menu.add(menuConsultar);

        menuRegistrar.setText("Registrar");

        menuRegistrarCompraProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        menuRegistrarCompraProduto.setText("Compra de Produto");
        menuRegistrar.add(menuRegistrarCompraProduto);

        menuRegistrarContribuicao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        menuRegistrarContribuicao.setText("Contribuição");
        menuRegistrar.add(menuRegistrarContribuicao);

        menuRegistrarDespesa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        menuRegistrarDespesa.setText("Despesa");
        menuRegistrar.add(menuRegistrarDespesa);

        menuRegistrarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        menuRegistrarVenda.setText("Venda");
        menuRegistrar.add(menuRegistrarVenda);

        Menu.add(menuRegistrar);

        menuRelatorio.setText("Relatório");
        menuRelatorio.setEnabled(false);

        menuRelatorioAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        menuRelatorioAlunos.setText("Alunos");
        menuRelatorio.add(menuRelatorioAlunos);

        menuRelatorioServicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menuRelatorioServicos.setText("Serviços");
        menuRelatorio.add(menuRelatorioServicos);

        Menu.add(menuRelatorio);

        menuCaixa.setText("Caixa");
        Menu.add(menuCaixa);

        menuAjuda.setText("Ajuda");

        menuAjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuAjudaSobre.setText("Sobre");
        menuAjuda.add(menuAjudaSobre);

        Menu.add(menuAjuda);

        menuOpcoes.setText("Opções");

        menuOpcoesConfiguracoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuOpcoesConfiguracoes.setText("Configurações");
        menuOpcoes.add(menuOpcoesConfiguracoes);

        menuOpcoesSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuOpcoesSair.setText("Sair");
        menuOpcoes.add(menuOpcoesSair);

        Menu.add(menuOpcoes);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        desktop.getAccessibleContext().setAccessibleParent(desktop);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroUsuarioActionPerformed
        controlador.telaCadastroUsuario();
    }//GEN-LAST:event_menuCadastroUsuarioActionPerformed

    private void menuCadastroServidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroServidoresActionPerformed
        controlador.telaEditarEquipamento();
    }//GEN-LAST:event_menuCadastroServidoresActionPerformed

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        if (jTree1.getLastSelectedPathComponent() != null) {
            String menu = jTree1.getLastSelectedPathComponent().toString();

            if (menu.equals("Editar Equipamento")) {
                controlador.telaGerenciarEquipamento();
            } else if (menu.equals("Adicionar Equipamento")) {
                controlador.telaEditarEquipamento();
            } else if (menu.equals("Clientes")) {
                controlador.telaCadastroCliente();
            } else if (menu.equals("Sobre")) {
                controlador.telaSobre();
            } else if (menu.equals("O.S")) {
                controlador.abrirOrdemServico();
            } else if (menu.equals("Ramais")) {
                controlador.abrirRamais();
            } else if (menu.equals("CPD")) {
                controlador.abrirPastaCPD();
            } else if (menu.equals("Acesso Rapido")) {
                controlador.acessoRapido();
            }
        }
    }//GEN-LAST:event_jTree1MouseClicked

    private void menuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDiaSemana;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLogo;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjudaSobre;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCadastroFuncionario;
    private javax.swing.JMenuItem menuCadastroProduto;
    private javax.swing.JMenuItem menuCadastroServidores;
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
    public javax.swing.JPanel panelInfo;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaPrincipal controlador;
}
