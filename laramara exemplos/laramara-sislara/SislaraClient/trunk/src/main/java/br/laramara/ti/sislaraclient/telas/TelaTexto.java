/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.laramara.ti.sislaraclient.telas;

import java.awt.Point;

/**
 *
 * @author pbandeira
 */
public class TelaTexto extends javax.swing.JDialog {

    private static TelaTexto tela = new TelaTexto();

    public static void fechar() {
        tela.setVisible(false);
    }
    
    /**
     * Creates new form TelaTexto
     */
    private TelaTexto() {
        super();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspTexto = new javax.swing.JScrollPane();
        jtaTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OBS");
        setFocusable(false);
        setModal(true);
        setResizable(false);

        jspTexto.setAutoscrolls(true);
        jspTexto.setName("jspTexto"); // NOI18N

        jtaTexto.setEditable(false);
        jtaTexto.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jtaTexto.setColumns(20);
        jtaTexto.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jtaTexto.setRows(5);
        jtaTexto.setName("jtaTexto"); // NOI18N
        jspTexto.setViewportView(jtaTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jspTexto;
    private static javax.swing.JTextArea jtaTexto;
    // End of variables declaration//GEN-END:variables
    
    public static void exibir(Point localizacao, String texto){
        jtaTexto.setText(texto);
        tela.setLocation(localizacao.x-566, localizacao.y-10);
        tela.setVisible(true);
    }
}
