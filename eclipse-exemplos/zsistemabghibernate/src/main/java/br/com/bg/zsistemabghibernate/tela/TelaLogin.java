package br.com.bg.zsistemabghibernate.tela;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5448
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlaUsuario = new javax.swing.JLabel();
        jlaSenha = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jlaImagem = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jbuOK = new javax.swing.JButton();
        jbuCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Login");

        jlaUsuario.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jlaUsuario.setText("Usuario:");

        jlaSenha.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jlaSenha.setText("Senha:");

        jTextField1.setText("a");

        jlaImagem.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bg/zsistemabghibernate/icones/icone-users.png"))); // NOI18N
        jlaImagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N

        jpfSenha.setText("a");

        jbuOK.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jbuOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bg/zsistemabghibernate/icones/Salvar.png"))); // NOI18N
        jbuOK.setText("OK");
        jbuOK.setPreferredSize(new java.awt.Dimension(113, 33));
        jbuOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuOKActionPerformed(evt);
            }
        });

        jbuCancelar.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jbuCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bg/zsistemabghibernate/icones/Cancelar.png"))); // NOI18N
        jbuCancelar.setText("Cancelar");
        jbuCancelar.setPreferredSize(new java.awt.Dimension(113, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlaImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaUsuario)
                            .addComponent(jlaSenha)
                            .addComponent(jbuOK, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbuCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpfSenha)
                    .addComponent(jTextField1))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlaImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jlaUsuario)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlaSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbuOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbuCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuOKActionPerformed
       TelaPrincipal telaPrincipal = new TelaPrincipal();
       telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jbuOKActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbuCancelar;
    private javax.swing.JButton jbuOK;
    private javax.swing.JLabel jlaImagem;
    private javax.swing.JLabel jlaSenha;
    private javax.swing.JLabel jlaUsuario;
    private javax.swing.JPasswordField jpfSenha;
    // End of variables declaration//GEN-END:variables
}
