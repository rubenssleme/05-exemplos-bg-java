package br.com.bg.tela;




import br.com.bg.controladores.ControladorTelaCadastroUsuario;
import br.com.bg.modelo.Usuario;
import br.com.bg.utilitarios.Mensagem;

public class TelaCadastroUsuario extends javax.swing.JFrame {
   
    public TelaCadastroUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        controladorTelaCadastroUsuario = new ControladorTelaCadastroUsuario(jtfCodigo,jtfNome,jtfEMail,jcbTipo,jtfLogin,jtfSenha);
        
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlaCodigo = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jbuPesquisar = new javax.swing.JButton();
        jlaNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlaEMail = new javax.swing.JLabel();
        jtfEMail = new javax.swing.JTextField();
        jcbTipo = new javax.swing.JComboBox<>();
        jlaTipo = new javax.swing.JLabel();
        jlaLogin = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jlaSenha = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JTextField();
        jbuIncluir = new javax.swing.JButton();
        jbuAlterar = new javax.swing.JButton();
        jbuExcluir = new javax.swing.JButton();
        jbuConsultar = new javax.swing.JButton();
        jbuTestarConexao = new javax.swing.JButton();
        jbuSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manutenção de Usuario");
        setResizable(false);

        jlaCodigo.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaCodigo.setText("Codigo:");

        jbuPesquisar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pesquisar (2).png"))); // NOI18N
        jbuPesquisar.setText("Pesquisar");

        jlaNome.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaNome.setText("Nome:");

        jlaEMail.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaEMail.setText("E-Mail:");

        jcbTipo.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));

        jlaTipo.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaTipo.setText("Tipo:");

        jlaLogin.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaLogin.setText("Login:");

        jlaSenha.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaSenha.setText("Senha:");

        jbuIncluir.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Salvar.png"))); // NOI18N
        jbuIncluir.setText("Incluir");
        jbuIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuIncluirActionPerformed(evt);
            }
        });

        jbuAlterar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Alterar.png"))); // NOI18N
        jbuAlterar.setText("Alterar");

        jbuExcluir.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Remover.png"))); // NOI18N
        jbuExcluir.setText("Excluir");

        jbuConsultar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pesquisar.png"))); // NOI18N
        jbuConsultar.setText("Consultar");

        jbuTestarConexao.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuTestarConexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/db-ok.png"))); // NOI18N
        jbuTestarConexao.setText("Testar Con");
        jbuTestarConexao.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbuTestarConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuTestarConexaoActionPerformed(evt);
            }
        });

        jbuSair.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Fechar.png"))); // NOI18N
        jbuSair.setText("Sair");
        jbuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbuIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbuConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbuAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbuTestarConexao, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbuSair, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbuExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaCodigo)
                            .addComponent(jlaNome)
                            .addComponent(jlaEMail)
                            .addComponent(jlaLogin)
                            .addComponent(jlaSenha)
                            .addComponent(jlaTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbuPesquisar))
                            .addComponent(jtfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                            .addComponent(jtfSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfEMail)
                            .addComponent(jtfNome)
                            .addComponent(jcbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaCodigo)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaEMail)
                    .addComponent(jtfEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaLogin)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaSenha)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuIncluir)
                    .addComponent(jbuAlterar)
                    .addComponent(jbuExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuConsultar)
                    .addComponent(jbuTestarConexao)
                    .addComponent(jbuSair))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuIncluirActionPerformed
        usuario = new Usuario();    
        controladorTelaCadastroUsuario.preencherObjeto(usuario);
        Mensagem.exibirMensagem(usuario.toString());
    }//GEN-LAST:event_jbuIncluirActionPerformed

    private void jbuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSairActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jbuSairActionPerformed

    private void jbuTestarConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuTestarConexaoActionPerformed
        
      //  Mensagem msg = new Mensagem();

        
        Mensagem.exibirMensagem("Não existe banco de dados!!!");
    }//GEN-LAST:event_jbuTestarConexaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuAlterar;
    private javax.swing.JButton jbuConsultar;
    private javax.swing.JButton jbuExcluir;
    private javax.swing.JButton jbuIncluir;
    private javax.swing.JButton jbuPesquisar;
    private javax.swing.JButton jbuSair;
    private javax.swing.JButton jbuTestarConexao;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel jlaCodigo;
    private javax.swing.JLabel jlaEMail;
    private javax.swing.JLabel jlaLogin;
    private javax.swing.JLabel jlaNome;
    private javax.swing.JLabel jlaSenha;
    private javax.swing.JLabel jlaTipo;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEMail;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfSenha;
    // End of variables declaration//GEN-END:variables
    ControladorTelaCadastroUsuario controladorTelaCadastroUsuario;
    Usuario usuario;
}
