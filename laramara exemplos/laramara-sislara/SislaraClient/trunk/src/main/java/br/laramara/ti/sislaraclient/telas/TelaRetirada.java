
package br.laramara.ti.sislaraclient.telas;

import br.laramara.ti.sislaraclient.controladores.ControladorTelaRetirada;
import javax.swing.JDialog;
import javax.swing.JFrame;

public abstract class TelaRetirada extends JDialog {

    /**
     * Creates new form TelaRetiradaEfetuar
     */
    public TelaRetirada(JFrame telaPai, boolean exibirPainelProfissional, String titulo) {
        super(telaPai, true);
        initComponents();
        setLocationRelativeTo(telaPai);
        jlaTitulo.setText(titulo);
        jpaProfissional.setVisible(exibirPainelProfissional);
        controlador = obterControlador();
        controlador.abrirTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaEditarPerfil = new javax.swing.JPanel();
        jpaTitulo = new javax.swing.JPanel();
        jlaTitulo = new javax.swing.JLabel();
        jbuFecharTitulo = new javax.swing.JButton();
        jlaProntuario = new javax.swing.JLabel();
        jftProntuario = new javax.swing.JFormattedTextField();
        jlaNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jpaProfissional = new javax.swing.JPanel();
        jlaProfissional = new javax.swing.JLabel();
        jcbProfissional = new javax.swing.JComboBox();
        jlaVoluntario = new javax.swing.JLabel();
        jcbVoluntario = new javax.swing.JComboBox();
        jbuEfetuar = new javax.swing.JButton();
        jbuFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(br.laramara.ti.sislaraclient.telas.SisLaraClient.class).getContext().getResourceMap(TelaRetirada.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setUndecorated(true);

        jpaEditarPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(resourceMap.getColor("jpaEditarPerfil.border.lineColor"))); // NOI18N
        jpaEditarPerfil.setName("jpaEditarPerfil"); // NOI18N
        jpaEditarPerfil.setLayout(null);

        jpaTitulo.setBackground(resourceMap.getColor("jpaTitulo.background")); // NOI18N
        jpaTitulo.setName("jpaTitulo"); // NOI18N

        jlaTitulo.setFont(resourceMap.getFont("jlaTitulo.font")); // NOI18N
        jlaTitulo.setForeground(resourceMap.getColor("jlaTitulo.foreground")); // NOI18N
        jlaTitulo.setText(resourceMap.getString("jlaTitulo.text")); // NOI18N
        jlaTitulo.setName("jlaTitulo"); // NOI18N

        jbuFecharTitulo.setBackground(resourceMap.getColor("jbuFecharTitulo.background")); // NOI18N
        jbuFecharTitulo.setIcon(resourceMap.getIcon("jbuFecharTitulo.icon")); // NOI18N
        jbuFecharTitulo.setBorder(null);
        jbuFecharTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuFecharTitulo.setFocusable(false);
        jbuFecharTitulo.setName("jbuFecharTitulo"); // NOI18N
        jbuFecharTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuFecharTituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpaTituloLayout = new javax.swing.GroupLayout(jpaTitulo);
        jpaTitulo.setLayout(jpaTituloLayout);
        jpaTituloLayout.setHorizontalGroup(
            jpaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpaTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 517, Short.MAX_VALUE)
                .addComponent(jbuFecharTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpaTituloLayout.setVerticalGroup(
            jpaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlaTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbuFecharTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpaEditarPerfil.add(jpaTitulo);
        jpaTitulo.setBounds(1, 1, 750, 26);

        jlaProntuario.setFont(resourceMap.getFont("jlaProntuario.font")); // NOI18N
        jlaProntuario.setText(resourceMap.getString("jlaProntuario.text")); // NOI18N
        jlaProntuario.setName("jlaProntuario"); // NOI18N
        jpaEditarPerfil.add(jlaProntuario);
        jlaProntuario.setBounds(10, 30, 110, 17);

        try {
            jftProntuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftProntuario.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        jftProntuario.setFont(resourceMap.getFont("jftProntuario.font")); // NOI18N
        jftProntuario.setName("jftProntuario"); // NOI18N
        jftProntuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jftProntuarioFocusLost(evt);
            }
        });
        jpaEditarPerfil.add(jftProntuario);
        jftProntuario.setBounds(10, 50, 110, 23);

        jlaNome.setFont(resourceMap.getFont("jlaNome.font")); // NOI18N
        jlaNome.setText(resourceMap.getString("jlaNome.text")); // NOI18N
        jlaNome.setName("jlaNome"); // NOI18N
        jpaEditarPerfil.add(jlaNome);
        jlaNome.setBounds(130, 30, 110, 17);

        jtfNome.setEditable(false);
        jtfNome.setFont(resourceMap.getFont("jtfNome.font")); // NOI18N
        jtfNome.setText(resourceMap.getString("jtfNome.text")); // NOI18N
        jtfNome.setName("jtfNome"); // NOI18N
        jpaEditarPerfil.add(jtfNome);
        jtfNome.setBounds(130, 50, 610, 23);

        jpaProfissional.setName("jpaProfissional"); // NOI18N
        jpaProfissional.setOpaque(false);

        jlaProfissional.setFont(resourceMap.getFont("jlaProfissional.font")); // NOI18N
        jlaProfissional.setText(resourceMap.getString("jlaProfissional.text")); // NOI18N
        jlaProfissional.setName("jlaProfissional"); // NOI18N

        jcbProfissional.setFont(resourceMap.getFont("jcbProfissional.font")); // NOI18N
        jcbProfissional.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jcbProfissional.setName("jcbProfissional"); // NOI18N

        jlaVoluntario.setFont(resourceMap.getFont("jlaVoluntario.font")); // NOI18N
        jlaVoluntario.setText(resourceMap.getString("jlaVoluntario.text")); // NOI18N
        jlaVoluntario.setName("jlaVoluntario"); // NOI18N

        jcbVoluntario.setFont(resourceMap.getFont("jcbVoluntario.font")); // NOI18N
        jcbVoluntario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jcbVoluntario.setName("jcbVoluntario"); // NOI18N

        javax.swing.GroupLayout jpaProfissionalLayout = new javax.swing.GroupLayout(jpaProfissional);
        jpaProfissional.setLayout(jpaProfissionalLayout);
        jpaProfissionalLayout.setHorizontalGroup(
            jpaProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(jpaProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpaProfissionalLayout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addGroup(jpaProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlaProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlaVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        jpaProfissionalLayout.setVerticalGroup(
            jpaProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jpaProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpaProfissionalLayout.createSequentialGroup()
                    .addGap(0, 2, Short.MAX_VALUE)
                    .addComponent(jlaProfissional)
                    .addGap(3, 3, 3)
                    .addComponent(jcbProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jlaVoluntario)
                    .addGap(3, 3, 3)
                    .addComponent(jcbVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );

        jpaEditarPerfil.add(jpaProfissional);
        jpaProfissional.setBounds(0, 80, 750, 100);

        jbuEfetuar.setFont(resourceMap.getFont("jbuEfetuar.font")); // NOI18N
        jbuEfetuar.setIcon(resourceMap.getIcon("jbuEfetuar.icon")); // NOI18N
        jbuEfetuar.setMnemonic('E');
        jbuEfetuar.setText(resourceMap.getString("jbuEfetuar.text")); // NOI18N
        jbuEfetuar.setName("jbuEfetuar"); // NOI18N
        jbuEfetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuEfetuarActionPerformed(evt);
            }
        });
        jpaEditarPerfil.add(jbuEfetuar);
        jbuEfetuar.setBounds(10, 190, 120, 33);

        jbuFechar.setFont(resourceMap.getFont("jbuFechar.font")); // NOI18N
        jbuFechar.setIcon(resourceMap.getIcon("jbuFechar.icon")); // NOI18N
        jbuFechar.setMnemonic('F');
        jbuFechar.setText(resourceMap.getString("jbuFechar.text")); // NOI18N
        jbuFechar.setName("jbuFechar"); // NOI18N
        jbuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuFecharActionPerformed(evt);
            }
        });
        jpaEditarPerfil.add(jbuFechar);
        jbuFechar.setBounds(610, 190, 130, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaEditarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuFecharTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharTituloActionPerformed
        controlador.fecharTela();
    }//GEN-LAST:event_jbuFecharTituloActionPerformed

    private void jbuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharActionPerformed
        controlador.fecharTela();
    }//GEN-LAST:event_jbuFecharActionPerformed

    private void jbuEfetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuEfetuarActionPerformed
        controlador.efetuar();
    }//GEN-LAST:event_jbuEfetuarActionPerformed

    private void jftProntuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftProntuarioFocusLost
        controlador.exibirNomeUsuario();
    }//GEN-LAST:event_jftProntuarioFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbuEfetuar;
    private javax.swing.JButton jbuFechar;
    private javax.swing.JButton jbuFecharTitulo;
    protected javax.swing.JComboBox jcbProfissional;
    protected javax.swing.JComboBox jcbVoluntario;
    protected javax.swing.JFormattedTextField jftProntuario;
    private javax.swing.JLabel jlaNome;
    private javax.swing.JLabel jlaProfissional;
    private javax.swing.JLabel jlaProntuario;
    protected javax.swing.JLabel jlaTitulo;
    private javax.swing.JLabel jlaVoluntario;
    private javax.swing.JPanel jpaEditarPerfil;
    private javax.swing.JPanel jpaProfissional;
    private javax.swing.JPanel jpaTitulo;
    protected javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaRetirada controlador;
    
    protected abstract ControladorTelaRetirada obterControlador();
}