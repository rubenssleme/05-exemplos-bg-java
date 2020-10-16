
import java.awt.Color;
import java.awt.Font;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rubens.leme
 */
public class ExemploComboCheckRadio extends javax.swing.JFrame {

// Preencher Uma comboBox    
    String cores[] = {"Sem Cor", "Vermelho", "Azul", "Verde", "Amarelo", "Branco", "Preto"};
    int estilo;
    int tamanhoFonte = 11;
    public void preencherCombo() {
        for (String cor : cores) {
            jcbCor.addItem(cor);
        }
    }

    public void escolherCores() {
        if (jcbCor.getSelectedItem().toString() == "Sem Cor") {
            jlaTexto.setForeground(Color.black);
        }
        if (jcbCor.getSelectedItem().toString() == "Vermelho") {
            jlaTexto.setForeground(Color.red);
        }
        if (jcbCor.getSelectedItem().toString() == "Azul") {
            jlaTexto.setForeground(Color.blue);
        }
        if (jcbCor.getSelectedItem().toString() == "Verde") {
            jlaTexto.setForeground(Color.GREEN);
        }
        if (jcbCor.getSelectedItem().toString() == "Amarelo") {
            jlaTexto.setForeground(Color.yellow);
        }
        if (jcbCor.getSelectedItem().toString() == "Branco") {
            jlaTexto.setForeground(Color.WHITE);
        }
        if (jcbCor.getSelectedItem().toString() == "Preto") {
            jlaTexto.setForeground(Color.black);
        }
    }
    public void escolherTamanhoFonte(){
        tamanhoFonte = 35;
    }
    public void escolherEstilo(){
        if(jcbNegrito.isSelected()){
            estilo = Font.BOLD;
            jcbItalico.setSelected(false);
            jcbNormal.setSelected(false);
            jcbNegritoItalico.setSelected(false);
            jlaTexto.setFont(new Font("", estilo, tamanhoFonte));
        } 
        if(jcbItalico.isSelected()){
            estilo = Font.ITALIC;
            jcbNegrito.setSelected(false);
            jcbNormal.setSelected(false);
            jcbNegritoItalico.setSelected(false);
            jlaTexto.setFont(new Font("", estilo, tamanhoFonte));
        }
        if(jcbNormal.isSelected()){
            estilo = Font.PLAIN;
            jcbNegrito.setSelected(false);
            jcbItalico.setSelected(false);
            jcbNegritoItalico.setSelected(false);
            jlaTexto.setFont(new Font("", estilo, tamanhoFonte));
        }
        if(jcbNegritoItalico.isSelected()){
            estilo = Font.BOLD+Font.ITALIC;
            jcbNegrito.setSelected(false);
            jcbItalico.setSelected(false);
            jcbNormal.setSelected(false);
            jlaTexto.setFont(new Font("", estilo, tamanhoFonte));
        }
    }

    public ExemploComboCheckRadio() {
        initComponents();
        preencherCombo();
        escolherTamanhoFonte();
        escolherEstilo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlaCor = new javax.swing.JLabel();
        jlaEstilo = new javax.swing.JLabel();
        jlaTamanho = new javax.swing.JLabel();
        jlaTexto = new javax.swing.JLabel();
        jcbCor = new javax.swing.JComboBox<>();
        jcbNegrito = new javax.swing.JCheckBox();
        jcbItalico = new javax.swing.JCheckBox();
        jcbNormal = new javax.swing.JCheckBox();
        jcbNegritoItalico = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplo de ComboBox, Check e Radio");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jlaCor.setText("Cor");

        jlaEstilo.setText("Estilo");

        jlaTamanho.setText("Tamanho");

        jlaTexto.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jlaTexto.setText("Programa feito em Java");

        jcbCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCorActionPerformed(evt);
            }
        });

        jcbNegrito.setText("Negrito");
        jcbNegrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNegritoActionPerformed(evt);
            }
        });

        jcbItalico.setText("Italico");
        jcbItalico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbItalicoActionPerformed(evt);
            }
        });

        jcbNormal.setText("Normal");
        jcbNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNormalActionPerformed(evt);
            }
        });

        jcbNegritoItalico.setText("Negrito Italico");
        jcbNegritoItalico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNegritoItalicoActionPerformed(evt);
            }
        });

        jRadioButton1.setText("20");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("25");

        jRadioButton3.setText("30");

        jRadioButton4.setText("35");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlaTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbCor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlaCor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaEstilo)
                            .addComponent(jcbNegritoItalico)
                            .addComponent(jcbNormal)
                            .addComponent(jcbItalico)
                            .addComponent(jcbNegrito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jlaTamanho)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton4))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaCor)
                    .addComponent(jlaEstilo)
                    .addComponent(jlaTamanho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbNegrito)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbItalico)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jcbNormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbNegritoItalico)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jlaTexto)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jcbCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCorActionPerformed
    escolherCores();
    }//GEN-LAST:event_jcbCorActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void jcbNegritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNegritoActionPerformed
        escolherEstilo();
    }//GEN-LAST:event_jcbNegritoActionPerformed

    private void jcbItalicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbItalicoActionPerformed
        escolherEstilo();
    }//GEN-LAST:event_jcbItalicoActionPerformed

    private void jcbNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNormalActionPerformed
       escolherEstilo();
    }//GEN-LAST:event_jcbNormalActionPerformed

    private void jcbNegritoItalicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNegritoItalicoActionPerformed
        escolherEstilo();
    }//GEN-LAST:event_jcbNegritoItalicoActionPerformed

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
            java.util.logging.Logger.getLogger(ExemploComboCheckRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExemploComboCheckRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExemploComboCheckRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExemploComboCheckRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExemploComboCheckRadio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JComboBox<String> jcbCor;
    private javax.swing.JCheckBox jcbItalico;
    private javax.swing.JCheckBox jcbNegrito;
    private javax.swing.JCheckBox jcbNegritoItalico;
    private javax.swing.JCheckBox jcbNormal;
    private javax.swing.JLabel jlaCor;
    private javax.swing.JLabel jlaEstilo;
    private javax.swing.JLabel jlaTamanho;
    private javax.swing.JLabel jlaTexto;
    // End of variables declaration//GEN-END:variables

}
