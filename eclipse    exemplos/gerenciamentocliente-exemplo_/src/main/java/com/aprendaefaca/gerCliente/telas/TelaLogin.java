package com.aprendaefaca.gerCliente.telas;

import com.aprendaefaca.gerCliente.controladores.GerenciadorLogin;
import com.aprendaefaca.gerCliente.modelos.Usuario;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;

/**
 *
 * @author rubens.leme
 */
public class TelaLogin extends javax.swing.JFrame {
    
    GerenciadorLogin gerenciadorLogin = new GerenciadorLogin();
    Usuario usuario = new Usuario("Administrador", "Admin", "123"); // Inicializa??o dos atributos pelo construtor

    /**
     * Creates new form FLogin
     */
    public TelaLogin() {
        super("Tela de Login");
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tFLogin = new javax.swing.JTextField();
        tPSenha = new javax.swing.JPasswordField();
        bOk = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(TelaLogin.class);
        jLabel3.setIcon(resourceMap.getIcon("jLabel3.icon")); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Avatar"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        jPanel1.setLayout(null);

        lUsuario.setText("Usuario:");
        jPanel1.add(lUsuario);
        lUsuario.setBounds(10, 20, 60, 14);

        jLabel2.setText("Senha:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 70, 34, 14);

        tFLogin.setText("Admin");
        tFLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFLoginActionPerformed(evt);
            }
        });
        jPanel1.add(tFLogin);
        tFLogin.setBounds(10, 40, 230, 20);

        tPSenha.setText("123");
        jPanel1.add(tPSenha);
        tPSenha.setBounds(10, 90, 230, 20);

        bOk.setIcon(resourceMap.getIcon("bOk.icon")); // NOI18N
        bOk.setText("Acessar");
        bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOkActionPerformed(evt);
            }
        });
        jPanel1.add(bOk);
        bOk.setBounds(10, 120, 110, 33);
        bOk.getAccessibleContext().setAccessibleName("Acessar");

        bCancel.setIcon(resourceMap.getIcon("bCancel.icon")); // NOI18N
        bCancel.setText("Cancelar");
        jPanel1.add(bCancel);
        bCancel.setBounds(130, 120, 110, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOkActionPerformed
  // Obt?m a senha e converte para String
        String senha = new String(tPSenha.getPassword());
        // Verifica o retorno do metodo validarUsuario 
	if( gerenciadorLogin.validarUsuario( tFLogin.getText(), senha, usuario ) ){
	// Se for true carrega o formulario principal
	TelaPrincipal menu = new TelaPrincipal();
	menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBackground(Color.WHITE);
	menu.setVisible(true);
        menu.setLocationRelativeTo(this);
        menu.setMaximumSize(null);
        menu.setExtendedState(MAXIMIZED_BOTH);
        menu.setResizable(false);
	// Descarrega o formulario de login
	dispose();								
							}
        
    }//GEN-LAST:event_bOkActionPerformed

    private void tFLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFLoginActionPerformed


   
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
     /*   try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bOk;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JTextField tFLogin;
    private javax.swing.JPasswordField tPSenha;
    // End of variables declaration//GEN-END:variables
}
