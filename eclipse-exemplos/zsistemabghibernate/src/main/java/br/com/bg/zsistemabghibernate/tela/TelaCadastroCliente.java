/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.zsistemabghibernate.tela;

import br.com.bg.zsistemabghibernate.controladores.ControladorTelaCliente;
import br.com.bg.zsistemabghibernate.utilitarios.Mensagem;

/**
 *
 * @author ruben
 */
public class TelaCadastroCliente extends javax.swing.JInternalFrame {

    
    public TelaCadastroCliente() {
        initComponents();
        controladorTelaCliente = new ControladorTelaCliente(jtfNome, jtfCpf, jtfRg, jtfEMail);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlaNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlaEMail = new javax.swing.JLabel();
        jtfEMail = new javax.swing.JTextField();
        jlaCpf = new javax.swing.JLabel();
        jtfCpf = new javax.swing.JTextField();
        jlaRg = new javax.swing.JLabel();
        jtfRg = new javax.swing.JTextField();
        jlaTelefone = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jbuSalvar = new javax.swing.JButton();
        jbuCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Tela Cadastro Cliente");

        jlaNome.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaNome.setText("Nome:");

        jlaEMail.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaEMail.setText("e-Mail");

        jlaCpf.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaCpf.setText("CPF:");

        jlaRg.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaRg.setText("RG:");

        jlaTelefone.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaTelefone.setText("Telefone");

        jbuSalvar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuSalvar.setText("Salvar");
        jbuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSalvarActionPerformed(evt);
            }
        });

        jbuCancelar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jlaTelefone)
                        .addContainerGap(396, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfTelefone)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbuSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbuCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlaNome)
                                    .addComponent(jlaCpf)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jtfCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlaEMail)
                                    .addComponent(jtfEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlaRg)
                                    .addComponent(jtfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaNome)
                    .addComponent(jlaEMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaCpf)
                    .addComponent(jlaRg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jlaTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSalvarActionPerformed
      Mensagem.exibirMensagem(controladorTelaCliente.preecherCliente().toString());
    }//GEN-LAST:event_jbuSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuCancelar;
    private javax.swing.JButton jbuSalvar;
    private javax.swing.JLabel jlaCpf;
    private javax.swing.JLabel jlaEMail;
    private javax.swing.JLabel jlaNome;
    private javax.swing.JLabel jlaRg;
    private javax.swing.JLabel jlaTelefone;
    private javax.swing.JTextField jtfCpf;
    private javax.swing.JTextField jtfEMail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfRg;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
ControladorTelaCliente controladorTelaCliente;
}
