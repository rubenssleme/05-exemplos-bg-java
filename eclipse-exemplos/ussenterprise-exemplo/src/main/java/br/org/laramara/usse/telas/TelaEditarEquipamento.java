package br.org.laramara.usse.telas;

import br.org.laramara.usse.controladores.ControladorTelaEditarServidores;
import br.org.laramara.usse.controladores.ControladorTelaPrincipal;
import java.awt.Component;

/**
 *
 * @author rubens.leme
 */
public class TelaEditarEquipamento extends javax.swing.JInternalFrame {

      private javax.swing.JPanel[] paineis; // isso é fora do metodo construtor

    public TelaEditarEquipamento() {
        initComponents();
        controladorTelaEditarServidor = new ControladorTelaEditarServidores(this, jtfCodigo, jtfDataCompra, jtfNomeServidor, jtfMarca, jtfModelo,
                jtfSistemaOperacional, jtfEnderecoIP, jcbTipoEquipamento, jtfDataManutencao, jtfQuantidadeVMs, jtfServiceTag);

        paineis = new javax.swing.JPanel[3];
        paineis[0] = jpaCamposServidor;
        paineis[1] = jpaCamposRoteador;
        paineis[2] = jpaCamposSwitch;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlaCodigo = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jlaDataCadastro = new javax.swing.JLabel();
        jtfDataCompra = new javax.swing.JTextField();
        jbuFechar = new javax.swing.JButton();
        jbuSalvar = new javax.swing.JButton();
        jlaNomeServidor = new javax.swing.JLabel();
        jtfNomeServidor = new javax.swing.JTextField();
        jlaMarca = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jlaModelo = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jlaSistemaOperacional = new javax.swing.JLabel();
        jtfSistemaOperacional = new javax.swing.JTextField();
        jlaEnderecoIP = new javax.swing.JLabel();
        jtfEnderecoIP = new javax.swing.JTextField();
        jlaTipoEquipamento = new javax.swing.JLabel();
        jcbTipoEquipamento = new javax.swing.JComboBox<>();
        jpaCamposServidor = new javax.swing.JPanel();
        jlaDataManutencao = new javax.swing.JLabel();
        jtfDataManutencao = new javax.swing.JTextField();
        jlaQuantidadeVMs = new javax.swing.JLabel();
        jtfQuantidadeVMs = new javax.swing.JTextField();
        jlaServiceTag = new javax.swing.JLabel();
        jtfServiceTag = new javax.swing.JTextField();
        jpaCamposRoteador = new javax.swing.JPanel();
        jlaUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jlaSenha = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JTextField();
        jlaPortaAcesso = new javax.swing.JLabel();
        jtfPortaAcesso = new javax.swing.JTextField();
        jlaDeptoInstalacao = new javax.swing.JLabel();
        jtfDeptoInstalacao = new javax.swing.JTextField();
        jpaCamposSwitch = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Editar Servidores");
        setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jlaCodigo.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaCodigo.setText("Codigo");

        jtfCodigo.setEditable(false);
        jtfCodigo.setText("3");
        jtfCodigo.setPreferredSize(new java.awt.Dimension(60, 20));

        jlaDataCadastro.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaDataCadastro.setText("Data de Compra");
        jlaDataCadastro.setToolTipText("");

        jtfDataCompra.setEditable(false);
        jtfDataCompra.setText("22/05/2017");
        jtfDataCompra.setPreferredSize(new java.awt.Dimension(60, 20));

        jbuFechar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/laramara/usse/icones/Fechar.png"))); // NOI18N
        jbuFechar.setMnemonic('F');
        jbuFechar.setText("Fechar");
        jbuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuFecharActionPerformed(evt);
            }
        });

        jbuSalvar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jbuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/org/laramara/usse/icones/Salvar.png"))); // NOI18N
        jbuSalvar.setMnemonic('S');
        jbuSalvar.setText("Salvar");
        jbuSalvar.setToolTipText("");
        jbuSalvar.setMaximumSize(new java.awt.Dimension(111, 33));
        jbuSalvar.setMinimumSize(new java.awt.Dimension(111, 33));
        jbuSalvar.setPreferredSize(new java.awt.Dimension(111, 33));
        jbuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSalvarActionPerformed(evt);
            }
        });

        jlaNomeServidor.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaNomeServidor.setText("Nome Equipamento");
        jlaNomeServidor.setToolTipText("");

        jtfNomeServidor.setText("Server Rubão");
        jtfNomeServidor.setPreferredSize(new java.awt.Dimension(60, 20));

        jlaMarca.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaMarca.setText("Marca");
        jlaMarca.setToolTipText("");

        jtfMarca.setText("Dell");
        jtfMarca.setPreferredSize(new java.awt.Dimension(60, 20));

        jlaModelo.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaModelo.setText("Modelo:");
        jlaModelo.setToolTipText("");

        jtfModelo.setText("1540");
        jtfModelo.setPreferredSize(new java.awt.Dimension(60, 20));

        jlaSistemaOperacional.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaSistemaOperacional.setText("Sistema Operacional");
        jlaSistemaOperacional.setToolTipText("");

        jtfSistemaOperacional.setText("Linux");
        jtfSistemaOperacional.setPreferredSize(new java.awt.Dimension(60, 20));

        jlaEnderecoIP.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaEnderecoIP.setText("Endereço IP:");
        jlaEnderecoIP.setToolTipText("");

        jtfEnderecoIP.setText("10.10.10.100");
        jtfEnderecoIP.setPreferredSize(new java.awt.Dimension(60, 20));

        jlaTipoEquipamento.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaTipoEquipamento.setText("Tipo Equipamento");

        jcbTipoEquipamento.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jcbTipoEquipamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------------", "Servidor", "Roteador", "Switch", " " }));
        jcbTipoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoEquipamentoActionPerformed(evt);
            }
        });

        jpaCamposServidor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos Servidor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jpaCamposServidor.setEnabled(false);

        jlaDataManutencao.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaDataManutencao.setText("Data Manutenção:");
        jlaDataManutencao.setEnabled(false);

        jtfDataManutencao.setEnabled(false);
        jtfDataManutencao.setEnabled(false);

        jlaQuantidadeVMs.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaQuantidadeVMs.setText("Quantidade VMs:");
        jlaQuantidadeVMs.setEnabled(false);

        jtfQuantidadeVMs.setEnabled(false);
        jtfQuantidadeVMs.setEnabled(false);

        jlaServiceTag.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaServiceTag.setText("Service TAG:");
        jlaServiceTag.setEnabled(false);

        jtfServiceTag.setEnabled(false);
        jtfServiceTag.setEnabled(false);

        javax.swing.GroupLayout jpaCamposServidorLayout = new javax.swing.GroupLayout(jpaCamposServidor);
        jpaCamposServidor.setLayout(jpaCamposServidorLayout);
        jpaCamposServidorLayout.setHorizontalGroup(
            jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaDataManutencao)
                    .addComponent(jtfDataManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaQuantidadeVMs)
                    .addComponent(jtfQuantidadeVMs, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                        .addComponent(jlaServiceTag)
                        .addContainerGap())
                    .addComponent(jtfServiceTag)))
        );
        jpaCamposServidorLayout.setVerticalGroup(
            jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaDataManutencao)
                    .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlaQuantidadeVMs)
                        .addComponent(jlaServiceTag)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDataManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQuantidadeVMs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfServiceTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jpaCamposRoteador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos Roteador:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        jpaCamposRoteador.setEnabled(false);

        jlaUsuario.setText("Usuario:");

        jtfUsuario.setEnabled(false);

        jlaSenha.setText("Senha:");

        jtfSenha.setEnabled(false);

        jlaPortaAcesso.setText("Porta Acesso:");

        jtfPortaAcesso.setEnabled(false);

        jlaDeptoInstalacao.setText("Depto Laramara");

        jtfDeptoInstalacao.setEnabled(false);

        javax.swing.GroupLayout jpaCamposRoteadorLayout = new javax.swing.GroupLayout(jpaCamposRoteador);
        jpaCamposRoteador.setLayout(jpaCamposRoteadorLayout);
        jpaCamposRoteadorLayout.setHorizontalGroup(
            jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCamposRoteadorLayout.createSequentialGroup()
                .addGroup(jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaUsuario)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaSenha))
                .addGap(18, 18, 18)
                .addGroup(jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaPortaAcesso)
                    .addComponent(jtfPortaAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpaCamposRoteadorLayout.createSequentialGroup()
                        .addComponent(jlaDeptoInstalacao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtfDeptoInstalacao)))
        );
        jpaCamposRoteadorLayout.setVerticalGroup(
            jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCamposRoteadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaUsuario)
                    .addComponent(jlaSenha)
                    .addComponent(jlaPortaAcesso)
                    .addComponent(jlaDeptoInstalacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPortaAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDeptoInstalacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jpaCamposSwitch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos Switch:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jpaCamposSwitch.setEnabled(false);

        jLabel1.setText("Qtde Portas");

        jLabel2.setText("Depto Laramara");

        jTextField1.setText("jTextField1");
        jTextField1.setEnabled(false);

        jTextField2.setText("jTextField2");
        jTextField2.setEnabled(false);

        javax.swing.GroupLayout jpaCamposSwitchLayout = new javax.swing.GroupLayout(jpaCamposSwitch);
        jpaCamposSwitch.setLayout(jpaCamposSwitchLayout);
        jpaCamposSwitchLayout.setHorizontalGroup(
            jpaCamposSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCamposSwitchLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addGroup(jpaCamposSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jpaCamposSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpaCamposSwitchLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addComponent(jTextField2)))
        );
        jpaCamposSwitchLayout.setVerticalGroup(
            jpaCamposSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCamposSwitchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpaCamposSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaCamposSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpaCamposServidor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbuSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbuFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaMarca)
                            .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaModelo)
                            .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfSistemaOperacional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlaSistemaOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaEnderecoIP)
                            .addComponent(jtfEnderecoIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaCodigo)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaDataCadastro)
                            .addComponent(jtfDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlaNomeServidor)
                                .addGap(0, 179, Short.MAX_VALUE))
                            .addComponent(jtfNomeServidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jlaTipoEquipamento))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbTipoEquipamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jpaCamposRoteador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpaCamposSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlaCodigo)
                            .addComponent(jlaDataCadastro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlaNomeServidor)
                            .addComponent(jlaTipoEquipamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNomeServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlaModelo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlaSistemaOperacional)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfSistemaOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlaEnderecoIP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEnderecoIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlaMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpaCamposServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpaCamposRoteador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpaCamposSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbuFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharActionPerformed
        controladorTelaEditarServidor.ocultarTela();
    }//GEN-LAST:event_jbuFecharActionPerformed

    private void jbuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSalvarActionPerformed
        controladorTelaEditarServidor.salvar();
    }//GEN-LAST:event_jbuSalvarActionPerformed
    public void bloquearLiberarCampos(javax.swing.JPanel painel, boolean acao) {
        Component[] componentes = painel.getComponents(); // altere para o nome da variavel do seu painel
        for (Component componente : componentes) {
            componente.setEnabled(acao);
        }
    }
    private void jcbTipoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoEquipamentoActionPerformed
        String teste = (String) jcbTipoEquipamento.getSelectedItem();
        //Mensagem.exibirMensagem(teste);
        if (teste.equals("Servidor")) {
            bloquearLiberarCampos(paineis[0], true);
            bloquearLiberarCampos(paineis[1], false);
            bloquearLiberarCampos(paineis[2], false);
        } else if (teste.equals("Roteador")) {
            bloquearLiberarCampos(paineis[0], false);
            bloquearLiberarCampos(paineis[1], true);
            bloquearLiberarCampos(paineis[2], false);
        } else if (teste.equals("Switch")) {
            bloquearLiberarCampos(paineis[0], false);
            bloquearLiberarCampos(paineis[1], false);
            bloquearLiberarCampos(paineis[2], true);
        }

    }//GEN-LAST:event_jcbTipoEquipamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbuFechar;
    private javax.swing.JButton jbuSalvar;
    private javax.swing.JComboBox<String> jcbTipoEquipamento;
    private javax.swing.JLabel jlaCodigo;
    private javax.swing.JLabel jlaDataCadastro;
    private javax.swing.JLabel jlaDataManutencao;
    private javax.swing.JLabel jlaDeptoInstalacao;
    private javax.swing.JLabel jlaEnderecoIP;
    private javax.swing.JLabel jlaMarca;
    private javax.swing.JLabel jlaModelo;
    private javax.swing.JLabel jlaNomeServidor;
    private javax.swing.JLabel jlaPortaAcesso;
    private javax.swing.JLabel jlaQuantidadeVMs;
    private javax.swing.JLabel jlaSenha;
    private javax.swing.JLabel jlaServiceTag;
    private javax.swing.JLabel jlaSistemaOperacional;
    private javax.swing.JLabel jlaTipoEquipamento;
    private javax.swing.JLabel jlaUsuario;
    private javax.swing.JPanel jpaCamposRoteador;
    private javax.swing.JPanel jpaCamposServidor;
    private javax.swing.JPanel jpaCamposSwitch;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDataCompra;
    private javax.swing.JTextField jtfDataManutencao;
    private javax.swing.JTextField jtfDeptoInstalacao;
    private javax.swing.JTextField jtfEnderecoIP;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfNomeServidor;
    private javax.swing.JTextField jtfPortaAcesso;
    private javax.swing.JTextField jtfQuantidadeVMs;
    private javax.swing.JTextField jtfSenha;
    private javax.swing.JTextField jtfServiceTag;
    private javax.swing.JTextField jtfSistemaOperacional;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
ControladorTelaPrincipal controlador;
    ControladorTelaEditarServidores controladorTelaEditarServidor;
}
