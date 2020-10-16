package br.laramara.ti.sismovimentacaoclient.telas;

import javax.swing.JFrame;

public class TelaInfoSistema extends javax.swing.JDialog {

    /** Creates new form TelaInfoSistema */
    public TelaInfoSistema(JFrame parent) {
        super(parent, true);
        initComponents();
        this.setLocationRelativeTo(parent);
        setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaInfoSistema = new javax.swing.JPanel();
        javax.swing.JLabel jlaLogo = new javax.swing.JLabel();
        javax.swing.JLabel appTitleLabel = new javax.swing.JLabel();
        javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
        jbuFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(br.laramara.ti.sismovimentacaoclient.telas.SisMovimentacaoClient.class).getContext().getResourceMap(TelaInfoSistema.class);
        setTitle(resourceMap.getString("telaInfo.title")); // NOI18N
        setName("telaInfo"); // NOI18N
        setResizable(false);

        jpaInfoSistema.setBorder(javax.swing.BorderFactory.createLineBorder(resourceMap.getColor("jpaInfoSistema.border.lineColor"))); // NOI18N
        jpaInfoSistema.setName("jpaInfoSistema"); // NOI18N
        jpaInfoSistema.setLayout(null);

        jlaLogo.setIcon(resourceMap.getIcon("jlaLogo.icon")); // NOI18N
        jlaLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jlaLogo.setName("jlaLogo"); // NOI18N
        jpaInfoSistema.add(jlaLogo);
        jlaLogo.setBounds(40, 40, 400, 304);
        jlaLogo.getAccessibleContext().setAccessibleName(resourceMap.getString("jlaLogo.AccessibleContext.accessibleName")); // NOI18N

        appTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        appTitleLabel.setText(resourceMap.getString("appTitleLabel.text")); // NOI18N
        appTitleLabel.setName("appTitleLabel"); // NOI18N
        jpaInfoSistema.add(appTitleLabel);
        appTitleLabel.setBounds(10, 360, 458, 22);
        appTitleLabel.getAccessibleContext().setAccessibleName(resourceMap.getString("appTitleLabel.AccessibleContext.accessibleName")); // NOI18N

        appDescLabel.setFont(resourceMap.getFont("appDescLabel.font")); // NOI18N
        appDescLabel.setText(resourceMap.getString("appDescLabel.text")); // NOI18N
        appDescLabel.setName("appDescLabel"); // NOI18N
        jpaInfoSistema.add(appDescLabel);
        appDescLabel.setBounds(10, 390, 458, 120);

        jbuFechar.setIcon(resourceMap.getIcon("jbuFechar.icon")); // NOI18N
        jbuFechar.setMnemonic('F');
        jbuFechar.setText(resourceMap.getString("jbuFechar.text")); // NOI18N
        jbuFechar.setToolTipText(resourceMap.getString("jbuFechar.toolTipText")); // NOI18N
        jbuFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuFechar.setName("jbuFechar"); // NOI18N
        jbuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuFecharActionPerformed(evt);
            }
        });
        jpaInfoSistema.add(jbuFechar);
        jbuFechar.setBounds(350, 510, 120, 33);
        jbuFechar.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuFechar.AccessibleContext.accessibleName")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaInfoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaInfoSistema, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jbuFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuFechar;
    private javax.swing.JPanel jpaInfoSistema;
    // End of variables declaration//GEN-END:variables

}