
package br.laramara.ti.sismovimentacaoclient.telas;

import br.laramara.ti.sismovimentacaoclient.controladores.ControladorTelaEditarPerfil;
import br.laramara.ti.sismovimentacaoclient.infra.PermissaoDeTelas;
import br.laramara.ti.sismovimentacaocommons.dtos.seguranca.PerfilDTO;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;

public class TelaEditarPerfil extends JDialog {

    /** Creates new form TelaEditarPerfil */
    public TelaEditarPerfil(JDialog parent, PerfilDTO perfilDto) {
        super(parent, true);
        initComponents();
        setLocationRelativeTo(parent);
        controlador = new ControladorTelaEditarPerfil(this, perfilDto, jtfDescricao, jcbPermissao, jliPermissoes);
        controlador.abrirSomenteSeHouverPermissao(PermissaoDeTelas.PERFIL_TELA_EDICAO_VISUALIZAR);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaEditarPerfil = new javax.swing.JPanel();
        jlaDescricao = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        jcbPermissao = new javax.swing.JComboBox();
        jlaPermissao = new javax.swing.JLabel();
        jbuAdicionar = new javax.swing.JButton();
        Permisses = new javax.swing.JLabel();
        jcpPermissoes = new javax.swing.JScrollPane();
        jliPermissoes = new javax.swing.JList();
        jbuRemover = new javax.swing.JButton();
        jbuFechar = new javax.swing.JButton();
        jbuSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(br.laramara.ti.sismovimentacaoclient.telas.SisMovimentacaoClient.class).getContext().getResourceMap(TelaEditarPerfil.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setModal(true);
        setName("Form"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jpaEditarPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(resourceMap.getColor("jpaEditarPerfil.border.lineColor"))); // NOI18N
        jpaEditarPerfil.setName("jpaEditarPerfil"); // NOI18N
        jpaEditarPerfil.setLayout(null);

        jlaDescricao.setText(resourceMap.getString("jlaDescricao.text")); // NOI18N
        jlaDescricao.setName("jlaDescricao"); // NOI18N
        jpaEditarPerfil.add(jlaDescricao);
        jlaDescricao.setBounds(10, 10, 110, 14);

        jtfDescricao.setText(resourceMap.getString("jtfDescricao.text")); // NOI18N
        jtfDescricao.setName("jtfDescricao"); // NOI18N
        jpaEditarPerfil.add(jtfDescricao);
        jtfDescricao.setBounds(10, 30, 350, 20);
        jtfDescricao.getAccessibleContext().setAccessibleName(resourceMap.getString("jTextField1.AccessibleContext.accessibleName")); // NOI18N

        jcbPermissao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jcbPermissao.setName("jcbPermissao"); // NOI18N
        jpaEditarPerfil.add(jcbPermissao);
        jcbPermissao.setBounds(10, 80, 850, 22);

        jlaPermissao.setText(resourceMap.getString("jlaPermissao.text")); // NOI18N
        jlaPermissao.setName("jlaPermissao"); // NOI18N
        jpaEditarPerfil.add(jlaPermissao);
        jlaPermissao.setBounds(10, 60, 140, 14);

        jbuAdicionar.setIcon(resourceMap.getIcon("jbuAdicionar.icon")); // NOI18N
        jbuAdicionar.setMnemonic('a');
        jbuAdicionar.setText(resourceMap.getString("jbuAdicionar.text")); // NOI18N
        jbuAdicionar.setToolTipText(resourceMap.getString("jbuAdicionar.toolTipText")); // NOI18N
        jbuAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuAdicionar.setName("jbuAdicionar"); // NOI18N
        jbuAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAdicionarActionPerformed(evt);
            }
        });
        jpaEditarPerfil.add(jbuAdicionar);
        jbuAdicionar.setBounds(870, 80, 140, 33);

        Permisses.setText(resourceMap.getString("Permisses.text")); // NOI18N
        Permisses.setName("Permisses"); // NOI18N
        jpaEditarPerfil.add(Permisses);
        Permisses.setBounds(10, 110, 200, 14);

        jcpPermissoes.setName("jcpPermissoes"); // NOI18N

        jliPermissoes.setModel(new DefaultListModel());
        jliPermissoes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jliPermissoes.setName("jliPermissoes"); // NOI18N
        jcpPermissoes.setViewportView(jliPermissoes);

        jpaEditarPerfil.add(jcpPermissoes);
        jcpPermissoes.setBounds(10, 130, 850, 460);

        jbuRemover.setIcon(resourceMap.getIcon("jbuRemover.icon")); // NOI18N
        jbuRemover.setMnemonic('r');
        jbuRemover.setText(resourceMap.getString("jbuRemover.text")); // NOI18N
        jbuRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuRemover.setName("jbuRemover"); // NOI18N
        jbuRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuRemoverActionPerformed(evt);
            }
        });
        jpaEditarPerfil.add(jbuRemover);
        jbuRemover.setBounds(870, 130, 140, 33);

        jbuFechar.setIcon(resourceMap.getIcon("jbuFechar.icon")); // NOI18N
        jbuFechar.setMnemonic('f');
        jbuFechar.setText(resourceMap.getString("jbuFechar.text")); // NOI18N
        jbuFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuFechar.setName("jbuFechar"); // NOI18N
        jbuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuFecharActionPerformed(evt);
            }
        });
        jpaEditarPerfil.add(jbuFechar);
        jbuFechar.setBounds(900, 600, 95, 33);

        jbuSalvar.setIcon(resourceMap.getIcon("jbuSalvar.icon")); // NOI18N
        jbuSalvar.setMnemonic('S');
        jbuSalvar.setText(resourceMap.getString("jbuSalvar.text")); // NOI18N
        jbuSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuSalvar.setName("jbuSalvar"); // NOI18N
        jbuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSalvarActionPerformed(evt);
            }
        });
        jpaEditarPerfil.add(jbuSalvar);
        jbuSalvar.setBounds(10, 600, 120, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaEditarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaEditarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharActionPerformed
        controlador.fecharTela();
    }//GEN-LAST:event_jbuFecharActionPerformed

    private void jbuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSalvarActionPerformed
        controlador.salvar();
    }//GEN-LAST:event_jbuSalvarActionPerformed

    private void jbuAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAdicionarActionPerformed
        controlador.adicionarPermissao();
    }//GEN-LAST:event_jbuAdicionarActionPerformed

    private void jbuRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuRemoverActionPerformed
        controlador.removerPermissaoSelecionada();
    }//GEN-LAST:event_jbuRemoverActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        controlador.fecharTela();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Permisses;
    private javax.swing.JButton jbuAdicionar;
    private javax.swing.JButton jbuFechar;
    private javax.swing.JButton jbuRemover;
    private javax.swing.JButton jbuSalvar;
    private javax.swing.JComboBox jcbPermissao;
    private javax.swing.JScrollPane jcpPermissoes;
    private javax.swing.JLabel jlaDescricao;
    private javax.swing.JLabel jlaPermissao;
    private javax.swing.JList jliPermissoes;
    private javax.swing.JPanel jpaEditarPerfil;
    private javax.swing.JTextField jtfDescricao;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaEditarPerfil controlador;
}
