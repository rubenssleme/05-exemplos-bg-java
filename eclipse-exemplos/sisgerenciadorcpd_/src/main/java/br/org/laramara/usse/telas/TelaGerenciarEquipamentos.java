/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.telas;

import br.org.laramara.usse.controladores.ControladorTelaGerenciarEquipamento;
import br.org.laramara.usse.dominio.Equipamento;
import br.org.laramara.usse.dominio.Servidor;
import br.org.laramara.usse.modelos.ModeloTabelaEquipamento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rubens.leme
 */
public class TelaGerenciarEquipamentos extends javax.swing.JInternalFrame {

    public TelaGerenciarEquipamentos() {
        initComponents();
        jtaPesquisaServidores.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

// DefaultTableModel modelo = (DefaultTableModel) jtaPesquisaServidores.getModel();
        //jtaPesquisaServidores.setRowSorter(new TableRowSorter(modelo));
        controlador = new ControladorTelaGerenciarEquipamento(telaPrincipal, desktop, this, jcbPesquisa, jbuPesquisar, jbuFechar, jtaPesquisaServidores, telaEditarEquipamento);
    }

    TelaPrincipal telaPrincipal = TelaPrincipal.obterInstancia();
    JDesktopPane desktop = telaPrincipal.obterJDesktop();


    /* public void lerJTable(){
         DefaultTableModel modelo = (DefaultTableModel) jtaPesquisaServidores.getModel();
         modelo.setNumRows(0);
         for (Servidor s : controlador.obterListaEquipamentos()){
             modelo.addRow(new Object[]{
             s.getId(),
             s.getServiceTag(),
             s.getQuantidadesVms(),
             s.getDataManutencao() 
             });
         }
         
    }*/
    TelaEditarEquipamento telaEditarEquipamento = new TelaEditarEquipamento();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlaPesquisa = new javax.swing.JLabel();
        jcbPesquisa = new javax.swing.JComboBox<>();
        jbuPesquisar = new javax.swing.JButton();
        jbuFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaPesquisaServidores = new javax.swing.JTable();
        jbuAlterarEquipamento = new javax.swing.JButton();

        setClosable(true);
        setTitle("Tela Servidores");
        setPreferredSize(new java.awt.Dimension(640, 480));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados para Pesquisa"));

        jlaPesquisa.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaPesquisa.setText("Pesquisar por:");

        jcbPesquisa.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jcbPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Servidor", "Roteador", "Switch" }));
        jcbPesquisa.setPreferredSize(new java.awt.Dimension(60, 30));
        jcbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPesquisaActionPerformed(evt);
            }
        });

        jbuPesquisar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/laramara/usse/icones/Adicionar.png"))); // NOI18N
        jbuPesquisar.setMnemonic('P');
        jbuPesquisar.setText("Pesquisar");
        jbuPesquisar.setName(""); // NOI18N
        jbuPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jcbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(516, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbuPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuPesquisar))
                .addGap(9, 9, 9)
                .addComponent(jcbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbuFechar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/laramara/usse/icones/Fechar.png"))); // NOI18N
        jbuFechar.setMnemonic('F');
        jbuFechar.setText("Fechar");
        jbuFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuFecharActionPerformed(evt);
            }
        });

        jtaPesquisaServidores.setModel(new br.org.laramara.usse.modelos.ModeloTabelaEquipamento());
        jScrollPane1.setViewportView(jtaPesquisaServidores);

        jbuAlterarEquipamento.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuAlterarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/laramara/usse/icones/Alterar.png"))); // NOI18N
        jbuAlterarEquipamento.setText("Alterar");
        jbuAlterarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAlterarEquipamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbuAlterarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbuFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbuFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbuAlterarEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharActionPerformed
        controlador.ocultarTela();
    }//GEN-LAST:event_jbuFecharActionPerformed

    private void jbuPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuPesquisarActionPerformed
        controlador.pesquisarResultados();
        //  lerJTable();
        //instancia a tabela já com o model como argumento
        // this.jtaPesquisaServidores = new JTable(modelo);
        // List<Servidor> servidores = controlador.obterListaEquipamentos();

        // modelo = new ModeloTabelaEquipamento(servidores);
        // this.jScrollPane1 = new JScrollPane(jtaPesquisaServidores);
        // this.add(jScrollPane1);
        // this.pack();
    }//GEN-LAST:event_jbuPesquisarActionPerformed

    private void jbuAlterarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAlterarEquipamentoActionPerformed
        controlador.alterar();
    }//GEN-LAST:event_jbuAlterarEquipamentoActionPerformed

    private void jcbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbuAlterarEquipamento;
    private javax.swing.JButton jbuFechar;
    private javax.swing.JButton jbuPesquisar;
    private javax.swing.JComboBox<String> jcbPesquisa;
    private javax.swing.JLabel jlaPesquisa;
    private javax.swing.JTable jtaPesquisaServidores;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaGerenciarEquipamento controlador;
    // private ModeloTabelaEquipamento modelo;
}
