package br.org.laramara.usse.telas;

import br.org.laramara.usse.controladores.ControladorTelaEditarEquipamento;
import br.org.laramara.usse.controladores.ControladorTelaPrincipal;
import br.org.laramara.usse.repositorios.RepositorioEquipamento;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

/**
 *
 * @author rubens.leme
 */
public class TelaEditarEquipamento extends javax.swing.JInternalFrame {

    private javax.swing.JPanel[] paineis; // isso é fora do metodo construtor

    public TelaEditarEquipamento() {
        initComponents();
        controladorTelaEditarEquipamento = new ControladorTelaEditarEquipamento(this, jtfDataCompra, jtfNomeEquipamento, jtfMarca, jtfModelo, jtfSistemaOperacional, jtfEnderecoIP, jcbTipoEquipamento, jcbTipoServidor, jtfDataManutencao, jtfQuantidadeVMs, jtfServiceTag, jtfCapacidadeMemoria, jtfDeptoDeDestino, jtfDeptoInstalacao, jtfExpressServiceTag, jtfUsuarioEquipamento, jtfMemoriaInstalada, jtfNomeEquipamento, jtfPortaAcesso, jtfProcessador, jtfQntdeFontes, jtfQntdeHD, jtfQntdeNucleosProcessador, jtfQntdePortas, jcbRaid, jtfSenhaEquipamento, jtfSlotsRede, jtfTempoGarantia, jtfUsuarioEquipamento, jtfVersaoBios, jtfEspacoArmazenamento, jtfVersaoSistemaOperacional, telaPrincipal, desktop);

        paineis = new javax.swing.JPanel[3];
        paineis[0] = jpaCamposServidor;
        paineis[1] = jpaCamposRoteador;
        paineis[2] = jpaCamposSwitch;

        bloquearLiberarCampos(paineis[0], false);
        bloquearLiberarCampos(paineis[1], false);
        bloquearLiberarCampos(paineis[2], false);

    }

    TelaPrincipal telaPrincipal;
    JDesktopPane desktop = getDesktopPane();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlaUsuarioEquipamento = new javax.swing.JLabel();
        jtfUsuarioEquipamento = new javax.swing.JTextField();
        jlaDataCadastro = new javax.swing.JLabel();
        jbuFechar = new javax.swing.JButton();
        jbuSalvar = new javax.swing.JButton();
        jlaNomeEquipamento = new javax.swing.JLabel();
        jtfNomeEquipamento = new javax.swing.JTextField();
        jlaMarca = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jlaModelo = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jlaEnderecoIP = new javax.swing.JLabel();
        jlaTipoEquipamento = new javax.swing.JLabel();
        jcbTipoEquipamento = new javax.swing.JComboBox<>();
        jpaCamposRoteador = new javax.swing.JPanel();
        jlaPortaAcesso = new javax.swing.JLabel();
        jtfPortaAcesso = new javax.swing.JTextField();
        jlaDeptoInstalacao = new javax.swing.JLabel();
        jtfDeptoInstalacao = new javax.swing.JTextField();
        jpaCamposSwitch = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfQntdePortas = new javax.swing.JTextField();
        jtfDeptoDeDestino = new javax.swing.JTextField();
        jpaCamposServidor = new javax.swing.JPanel();
        jlaQuantidadeVMs = new javax.swing.JLabel();
        jlaServiceTag = new javax.swing.JLabel();
        jtfServiceTag = new javax.swing.JTextField();
        jlaSistemaOperacional = new javax.swing.JLabel();
        jtfSistemaOperacional = new javax.swing.JTextField();
        jlaMemoriaInstalada = new javax.swing.JLabel();
        jtfMemoriaInstalada = new javax.swing.JTextField();
        jlaCapacidadeMemoria = new javax.swing.JLabel();
        jtfCapacidadeMemoria = new javax.swing.JTextField();
        jlaProcessador = new javax.swing.JLabel();
        jtfProcessador = new javax.swing.JTextField();
        jlaQntdeNucleosProcessador = new javax.swing.JLabel();
        jlaExpressServiceTag = new javax.swing.JLabel();
        jtfExpressServiceTag = new javax.swing.JTextField();
        jlaRaid = new javax.swing.JLabel();
        jlaTipoServidor = new javax.swing.JLabel();
        jcbTipoServidor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jlaSlotsRede = new javax.swing.JLabel();
        jlaQntdeHD = new javax.swing.JLabel();
        jlaVersaoBios = new javax.swing.JLabel();
        jtfVersaoBios = new javax.swing.JTextField();
        jlaEspacoArmazenamento = new javax.swing.JLabel();
        jtfEspacoArmazenamento = new javax.swing.JTextField();
        jlaVersaoSistemaOperacional = new javax.swing.JLabel();
        jtfVersaoSistemaOperacional = new javax.swing.JTextField();
        jlaDataManutencao = new javax.swing.JLabel();
        jtfDataManutencao = new javax.swing.JFormattedTextField();
        jcbRaid = new javax.swing.JComboBox<>();
        jtfQntdeNucleosProcessador = new javax.swing.JFormattedTextField();
        jtfQuantidadeVMs = new javax.swing.JFormattedTextField();
        jtfSlotsRede = new javax.swing.JFormattedTextField();
        jtfQntdeFontes = new javax.swing.JFormattedTextField();
        jtfQntdeHD = new javax.swing.JFormattedTextField();
        jlaSenhaEquipamento = new javax.swing.JLabel();
        jtfSenhaEquipamento = new javax.swing.JTextField();
        jtfDataCompra = new javax.swing.JFormattedTextField();
        jlaTempoGarantia = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfEnderecoIP = new javax.swing.JFormattedTextField();
        jtfTempoGarantia = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Adicionar Equipamentos");
        setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jlaUsuarioEquipamento.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaUsuarioEquipamento.setText("Usuario - Login:");

        jtfUsuarioEquipamento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfUsuarioEquipamento.setPreferredSize(new java.awt.Dimension(60, 20));
        jtfUsuarioEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioEquipamentoActionPerformed(evt);
            }
        });

        jlaDataCadastro.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaDataCadastro.setText("Data de Compra");
        jlaDataCadastro.setToolTipText("");

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

        jlaNomeEquipamento.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaNomeEquipamento.setText("Nome Equipamento");
        jlaNomeEquipamento.setToolTipText("");

        jtfNomeEquipamento.setText("Server ");
        jtfNomeEquipamento.setPreferredSize(new java.awt.Dimension(60, 20));
        jtfNomeEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeEquipamentoActionPerformed(evt);
            }
        });

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

        jlaEnderecoIP.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaEnderecoIP.setText("Endereço IP:");
        jlaEnderecoIP.setToolTipText("");

        jlaTipoEquipamento.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaTipoEquipamento.setText("Tipo Equipamento:");

        jcbTipoEquipamento.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jcbTipoEquipamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------------", "Servidor", "Roteador", "Switch", "" }));
        jcbTipoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoEquipamentoActionPerformed(evt);
            }
        });

        jpaCamposRoteador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos Roteador:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jpaCamposRoteador.setEnabled(false);

        jlaPortaAcesso.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaPortaAcesso.setText("Porta Acesso:");

        jtfPortaAcesso.setEnabled(false);

        jlaDeptoInstalacao.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaDeptoInstalacao.setText("Depto Laramara:");

        jtfDeptoInstalacao.setEnabled(false);

        javax.swing.GroupLayout jpaCamposRoteadorLayout = new javax.swing.GroupLayout(jpaCamposRoteador);
        jpaCamposRoteador.setLayout(jpaCamposRoteadorLayout);
        jpaCamposRoteadorLayout.setHorizontalGroup(
            jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCamposRoteadorLayout.createSequentialGroup()
                .addGroup(jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfPortaAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaPortaAcesso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpaCamposRoteadorLayout.createSequentialGroup()
                        .addComponent(jlaDeptoInstalacao)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpaCamposRoteadorLayout.createSequentialGroup()
                        .addComponent(jtfDeptoInstalacao, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpaCamposRoteadorLayout.setVerticalGroup(
            jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCamposRoteadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaPortaAcesso)
                    .addComponent(jlaDeptoInstalacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaCamposRoteadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPortaAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDeptoInstalacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jpaCamposSwitch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos Switch:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jpaCamposSwitch.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel1.setText("Quantidade Portas:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel2.setText("Depto de Destino:");

        jtfQntdePortas.setEnabled(false);
        jtfQntdePortas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfQntdePortasActionPerformed(evt);
            }
        });

        jtfDeptoDeDestino.setEnabled(false);
        jtfDeptoDeDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDeptoDeDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpaCamposSwitchLayout = new javax.swing.GroupLayout(jpaCamposSwitch);
        jpaCamposSwitch.setLayout(jpaCamposSwitchLayout);
        jpaCamposSwitchLayout.setHorizontalGroup(
            jpaCamposSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCamposSwitchLayout.createSequentialGroup()
                .addGroup(jpaCamposSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtfQntdePortas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpaCamposSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfDeptoDeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jtfQntdePortas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDeptoDeDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jpaCamposServidor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos Servidor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 13))); // NOI18N
        jpaCamposServidor.setEnabled(false);

        jlaQuantidadeVMs.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaQuantidadeVMs.setText("Quantidade VMs:");
        jlaQuantidadeVMs.setEnabled(false);

        jlaServiceTag.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaServiceTag.setText("Service TAG:");
        jlaServiceTag.setEnabled(false);

        jtfServiceTag.setEnabled(false);
        jtfServiceTag.setEnabled(false);
        jtfServiceTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfServiceTagActionPerformed(evt);
            }
        });

        jlaSistemaOperacional.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaSistemaOperacional.setText("Sistema Operacional:");
        jlaSistemaOperacional.setToolTipText("");

        jtfSistemaOperacional.setText("Linux");
        jtfSistemaOperacional.setPreferredSize(new java.awt.Dimension(6, 20));

        jlaMemoriaInstalada.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaMemoriaInstalada.setText("Memória Instalada:");

        jlaCapacidadeMemoria.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaCapacidadeMemoria.setText("Capacidade Memória:");

        jlaProcessador.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaProcessador.setText("Processador:");

        jlaQntdeNucleosProcessador.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaQntdeNucleosProcessador.setText("Quantidade de Nucleos:");

        jlaExpressServiceTag.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaExpressServiceTag.setText("Express Service Tag:");

        jlaRaid.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaRaid.setText("Raid");

        jlaTipoServidor.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaTipoServidor.setText("Tipo de Servidor:");

        jcbTipoServidor.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jcbTipoServidor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------------", "Torre", "Gaveta" }));
        jcbTipoServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoServidorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel3.setText("Quantidade de Fontes:");

        jlaSlotsRede.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaSlotsRede.setText("Slots de Rede");

        jlaQntdeHD.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaQntdeHD.setText("Quantidade de HDs:");

        jlaVersaoBios.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaVersaoBios.setText("Versão da Bios:");

        jlaEspacoArmazenamento.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaEspacoArmazenamento.setText("Espaço Armazenamento:");

        jlaVersaoSistemaOperacional.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaVersaoSistemaOperacional.setText("Versão Sistema Operacional");

        jlaDataManutencao.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaDataManutencao.setText("Última Manutenção:");
        jlaDataManutencao.setEnabled(false);

        try {
            jtfDataManutencao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfDataManutencao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfDataManutencao.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        jtfDataManutencao.setName("jtfDataManutencao"); // NOI18N
        jtfDataManutencao.setNavigationFilter(null);
        jtfDataManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDataManutencaoActionPerformed(evt);
            }
        });

        jcbRaid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "0", "1", "2", "5", "6", "01", "10", "50", "100" }));
        jcbRaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRaidActionPerformed(evt);
            }
        });

        try {
            jtfQntdeNucleosProcessador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfQntdeNucleosProcessador.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        try {
            jtfQuantidadeVMs.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfQuantidadeVMs.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        try {
            jtfSlotsRede.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfSlotsRede.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        try {
            jtfQntdeFontes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfQntdeFontes.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        try {
            jtfQntdeHD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfQntdeHD.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        jtfQntdeHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfQntdeHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpaCamposServidorLayout = new javax.swing.GroupLayout(jpaCamposServidor);
        jpaCamposServidor.setLayout(jpaCamposServidorLayout);
        jpaCamposServidorLayout.setHorizontalGroup(
            jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                        .addComponent(jtfServiceTag, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfExpressServiceTag, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                        .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                                .addComponent(jlaMemoriaInstalada)
                                .addGap(32, 32, 32))
                            .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                                .addComponent(jtfMemoriaInstalada, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlaCapacidadeMemoria)
                            .addComponent(jtfCapacidadeMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlaProcessador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaQntdeNucleosProcessador)
                            .addComponent(jtfQntdeNucleosProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                        .addComponent(jlaSistemaOperacional)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlaVersaoSistemaOperacional)
                        .addGap(26, 26, 26)
                        .addComponent(jlaQuantidadeVMs))
                    .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                        .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlaQntdeHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfQntdeHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaRaid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbRaid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEspacoArmazenamento, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlaEspacoArmazenamento))
                        .addGap(32, 32, 32)
                        .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlaTipoServidor)
                            .addComponent(jcbTipoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                        .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfSistemaOperacional, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jlaSlotsRede)
                            .addComponent(jtfSlotsRede))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlaVersaoBios, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfVersaoBios, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfQntdeFontes)))
                            .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                                .addComponent(jtfVersaoSistemaOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfQuantidadeVMs, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                        .addComponent(jlaServiceTag)
                        .addGap(107, 107, 107)
                        .addComponent(jlaExpressServiceTag))
                    .addComponent(jlaDataManutencao)
                    .addComponent(jtfDataManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpaCamposServidorLayout.setVerticalGroup(
            jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaCamposServidorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlaCapacidadeMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlaProcessador)
                        .addComponent(jlaMemoriaInstalada))
                    .addComponent(jlaQntdeNucleosProcessador, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfCapacidadeMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfQntdeNucleosProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfMemoriaInstalada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaEspacoArmazenamento)
                    .addComponent(jlaQntdeHD)
                    .addComponent(jlaRaid)
                    .addComponent(jlaTipoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbRaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEspacoArmazenamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQntdeHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaSistemaOperacional)
                    .addComponent(jlaVersaoSistemaOperacional)
                    .addComponent(jlaQuantidadeVMs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSistemaOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfVersaoSistemaOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQuantidadeVMs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlaVersaoBios)
                    .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlaSlotsRede)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfVersaoBios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSlotsRede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQntdeFontes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaServiceTag)
                    .addComponent(jlaExpressServiceTag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpaCamposServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfServiceTag, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfExpressServiceTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlaDataManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtfDataManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtfDataManutencao.getAccessibleContext().setAccessibleName("Data de Manutenção");
        jtfDataManutencao.getAccessibleContext().setAccessibleDescription("Data de Manutenção do Equipamento");

        jlaSenhaEquipamento.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaSenhaEquipamento.setText("Senha:");

        try {
            jtfDataCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfDataCompra.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        jtfDataCompra.setName("jftDataCompra"); // NOI18N

        jlaTempoGarantia.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jlaTempoGarantia.setText("Tempo de Garantia:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel4.setText("meses");

        try {
            jtfEnderecoIP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfEnderecoIP.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        jtfEnderecoIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEnderecoIPActionPerformed(evt);
            }
        });

        try {
            jtfTempoGarantia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfTempoGarantia.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbuSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbuFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlaMarca)
                                            .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(187, 187, 187)
                                                .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlaUsuarioEquipamento)
                                            .addComponent(jtfUsuarioEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlaSenhaEquipamento)
                                            .addComponent(jtfSenhaEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jpaCamposServidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jpaCamposSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpaCamposRoteador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlaModelo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfNomeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlaNomeEquipamento)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlaDataCadastro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlaTempoGarantia)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfTempoGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlaEnderecoIP)
                                    .addComponent(jtfEnderecoIP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbTipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlaTipoEquipamento))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaDataCadastro)
                    .addComponent(jlaNomeEquipamento)
                    .addComponent(jlaTipoEquipamento)
                    .addComponent(jlaTempoGarantia)
                    .addComponent(jlaEnderecoIP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNomeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtfEnderecoIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTempoGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlaModelo)
                    .addComponent(jlaUsuarioEquipamento)
                    .addComponent(jlaSenhaEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlaMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfUsuarioEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSenhaEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpaCamposRoteador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpaCamposSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpaCamposServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbuSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbuFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        jtfDataCompra.getAccessibleContext().setAccessibleName("Data de Compra");
        jtfDataCompra.getAccessibleContext().setAccessibleDescription("Data de compra do equipamento em questão");
        jtfDataCompra.getAccessibleContext().setAccessibleParent(jtfDataCompra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharActionPerformed
        controladorTelaEditarEquipamento.fecharTela();
    }//GEN-LAST:event_jbuFecharActionPerformed

    private void jbuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSalvarActionPerformed
        controladorTelaEditarEquipamento.cadastrarEquipamento();
    }//GEN-LAST:event_jbuSalvarActionPerformed
    public void bloquearLiberarCampos(javax.swing.JPanel painel, boolean acao) {
        Component[] componentes = painel.getComponents(); // altere para o nome da variavel do seu painel
        for (Component componente : componentes) {
            componente.setEnabled(acao);
        }
    }
    private void jcbTipoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoEquipamentoActionPerformed
        String indicador = (String) jcbTipoEquipamento.getSelectedItem();
        //Mensagem.exibirMensagem(indicador);
        if (indicador.equals("Servidor")) {
            bloquearLiberarCampos(paineis[0], true);
            bloquearLiberarCampos(paineis[1], false);
            bloquearLiberarCampos(paineis[2], false);
        } else if (indicador.equals("Roteador")) {
            bloquearLiberarCampos(paineis[0], false);
            bloquearLiberarCampos(paineis[1], true);
            bloquearLiberarCampos(paineis[2], false);
        } else if (indicador.equals("Switch")) {
            bloquearLiberarCampos(paineis[0], false);
            bloquearLiberarCampos(paineis[1], false);
            bloquearLiberarCampos(paineis[2], true);
        }

    }//GEN-LAST:event_jcbTipoEquipamentoActionPerformed

    private void jtfQntdePortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQntdePortasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQntdePortasActionPerformed

    private void jtfDeptoDeDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDeptoDeDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDeptoDeDestinoActionPerformed

    private void jtfNomeEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeEquipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeEquipamentoActionPerformed

    private void jtfUsuarioEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioEquipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioEquipamentoActionPerformed

    private void jtfServiceTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfServiceTagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfServiceTagActionPerformed

    private void jtfDataManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDataManutencaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDataManutencaoActionPerformed

    private void jcbTipoServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoServidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoServidorActionPerformed

    private void jcbRaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbRaidActionPerformed

    private void jtfEnderecoIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEnderecoIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEnderecoIPActionPerformed

    private void jtfQntdeHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQntdeHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQntdeHDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbuFechar;
    private javax.swing.JButton jbuSalvar;
    private javax.swing.JComboBox<String> jcbRaid;
    private javax.swing.JComboBox<String> jcbTipoEquipamento;
    private javax.swing.JComboBox<String> jcbTipoServidor;
    private javax.swing.JLabel jlaCapacidadeMemoria;
    private javax.swing.JLabel jlaDataCadastro;
    private javax.swing.JLabel jlaDataManutencao;
    private javax.swing.JLabel jlaDeptoInstalacao;
    private javax.swing.JLabel jlaEnderecoIP;
    private javax.swing.JLabel jlaEspacoArmazenamento;
    private javax.swing.JLabel jlaExpressServiceTag;
    private javax.swing.JLabel jlaMarca;
    private javax.swing.JLabel jlaMemoriaInstalada;
    private javax.swing.JLabel jlaModelo;
    private javax.swing.JLabel jlaNomeEquipamento;
    private javax.swing.JLabel jlaPortaAcesso;
    private javax.swing.JLabel jlaProcessador;
    private javax.swing.JLabel jlaQntdeHD;
    private javax.swing.JLabel jlaQntdeNucleosProcessador;
    private javax.swing.JLabel jlaQuantidadeVMs;
    private javax.swing.JLabel jlaRaid;
    private javax.swing.JLabel jlaSenhaEquipamento;
    private javax.swing.JLabel jlaServiceTag;
    private javax.swing.JLabel jlaSistemaOperacional;
    private javax.swing.JLabel jlaSlotsRede;
    private javax.swing.JLabel jlaTempoGarantia;
    private javax.swing.JLabel jlaTipoEquipamento;
    private javax.swing.JLabel jlaTipoServidor;
    private javax.swing.JLabel jlaUsuarioEquipamento;
    private javax.swing.JLabel jlaVersaoBios;
    private javax.swing.JLabel jlaVersaoSistemaOperacional;
    private javax.swing.JPanel jpaCamposRoteador;
    private javax.swing.JPanel jpaCamposServidor;
    private javax.swing.JPanel jpaCamposSwitch;
    private javax.swing.JTextField jtfCapacidadeMemoria;
    private javax.swing.JFormattedTextField jtfDataCompra;
    private javax.swing.JFormattedTextField jtfDataManutencao;
    private javax.swing.JTextField jtfDeptoDeDestino;
    private javax.swing.JTextField jtfDeptoInstalacao;
    private javax.swing.JFormattedTextField jtfEnderecoIP;
    private javax.swing.JTextField jtfEspacoArmazenamento;
    private javax.swing.JTextField jtfExpressServiceTag;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfMemoriaInstalada;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfNomeEquipamento;
    private javax.swing.JTextField jtfPortaAcesso;
    private javax.swing.JTextField jtfProcessador;
    private javax.swing.JFormattedTextField jtfQntdeFontes;
    private javax.swing.JFormattedTextField jtfQntdeHD;
    private javax.swing.JFormattedTextField jtfQntdeNucleosProcessador;
    private javax.swing.JTextField jtfQntdePortas;
    private javax.swing.JFormattedTextField jtfQuantidadeVMs;
    private javax.swing.JTextField jtfSenhaEquipamento;
    private javax.swing.JTextField jtfServiceTag;
    private javax.swing.JTextField jtfSistemaOperacional;
    private javax.swing.JFormattedTextField jtfSlotsRede;
    private javax.swing.JFormattedTextField jtfTempoGarantia;
    private javax.swing.JTextField jtfUsuarioEquipamento;
    private javax.swing.JTextField jtfVersaoBios;
    private javax.swing.JTextField jtfVersaoSistemaOperacional;
    // End of variables declaration//GEN-END:variables
ControladorTelaPrincipal controlador;
    ControladorTelaEditarEquipamento controladorTelaEditarEquipamento;

}
