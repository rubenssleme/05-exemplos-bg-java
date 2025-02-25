package br.laramara.ti.sislaraclient.telas;

import br.laramara.ti.sislaraclient.controladores.ControladorTelaGruposEditarAtendimentos;
import br.laramara.ti.sislaraclient.infra.PermissaoDeTelas;
import br.laramara.ti.sislaraclient.modelos.ModeloTabelaAtendimentoPreCadastro;
import br.laramara.ti.sislaraclient.modelos.ModeloTabelaAtendimentoProfissionalGrupo;
import br.laramara.ti.sislaraclient.modelos.ModeloTabelaAtendimentoUsuario;
import br.laramara.ti.sislaraclient.utilitarios.WordUtils;
import br.laramara.ti.sislaracommons.dtos.atendimento.AtendimentoGrupoDTO;
import br.laramara.ti.sislaracommons.dtos.grupo.GrupoDTO;
import br.laramara.ti.sislaracommons.dtos.grupo.ModuloPeriodoDTO;
import java.awt.Window;
import javax.swing.DefaultListModel;

public class TelaGruposEditarAtendimentos extends javax.swing.JDialog {

    /** Creates new form TelaGruposEditarAtendimentos */
    public TelaGruposEditarAtendimentos(Window parent, GrupoDTO grupoDto, ModuloPeriodoDTO moduloPeriodoDto, AtendimentoGrupoDTO atendimentoGrupoDto, boolean bloquearGrupo) {
        super(parent, ModalityType.APPLICATION_MODAL);
        initComponents();
        setLocationRelativeTo(parent);
        controlador = new ControladorTelaGruposEditarAtendimentos(this, grupoDto, moduloPeriodoDto, atendimentoGrupoDto, bloquearGrupo, jtfGrupo, jtfModuloAtividade, jtfData, jtfHoraInicio, jtfHoraTermino, jatDescricao, jatInterdisciplinar, jtaUsuarios, jtaComunidade, jtaProfissionais, jliArquivos);
        controlador.abrirSomenteSeHouverPermissao(PermissaoDeTelas.GRUPO_TELA_EDICAO_VISUALIZAR);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaEditarAtendimentos = new javax.swing.JPanel();
        jlaGrupo = new javax.swing.JLabel();
        jtfGrupo = new javax.swing.JTextField();
        jlaModuloAtividade = new javax.swing.JLabel();
        jtfModuloAtividade = new javax.swing.JTextField();
        jlaData = new javax.swing.JLabel();
        jtfData = new javax.swing.JTextField();
        jlaHoraInicio = new javax.swing.JLabel();
        jtfHoraInicio = new javax.swing.JTextField();
        jlaHoraTermino = new javax.swing.JLabel();
        jtfHoraTermino = new javax.swing.JTextField();
        jpaIntegrantes = new javax.swing.JPanel();
        jlaProfissionais = new javax.swing.JLabel();
        jspProfissionais = new javax.swing.JScrollPane();
        jtaProfissionais = new javax.swing.JTable();
        jbuAlterarProfissional = new javax.swing.JButton();
        jlaUsuarios = new javax.swing.JLabel();
        jspUsuarios = new javax.swing.JScrollPane();
        jtaUsuarios = new javax.swing.JTable();
        jbuAlterarUsuario = new javax.swing.JButton();
        jlaComunidade = new javax.swing.JLabel();
        jspComunidade = new javax.swing.JScrollPane();
        jtaComunidade = new javax.swing.JTable();
        jbuAlterarComunidade = new javax.swing.JButton();
        jpaRelatoAtendimento = new javax.swing.JPanel();
        jlaDescricao = new javax.swing.JLabel();
        jlaInterdisciplinar = new javax.swing.JLabel();
        jspDescricao = new javax.swing.JScrollPane();
        jatDescricao = new javax.swing.JTextArea();
        jspInterdisciplinar = new javax.swing.JScrollPane();
        jatInterdisciplinar = new javax.swing.JTextArea();
        jlaArquivos = new javax.swing.JLabel();
        jspArquivos = new javax.swing.JScrollPane();
        jliArquivos = new javax.swing.JList();
        jbuAdicionarArquivo = new javax.swing.JButton();
        jbuAbrirAquivo = new javax.swing.JButton();
        jbuRemoverArquivo = new javax.swing.JButton();
        jbuSalvar = new javax.swing.JButton();
        jbuFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(TelaGruposEditarAtendimentos.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setName("Form"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jpaEditarAtendimentos.setBorder(javax.swing.BorderFactory.createLineBorder(resourceMap.getColor("jpaEditarAtendimentos.border.lineColor"))); // NOI18N
        jpaEditarAtendimentos.setName("jpaEditarAtendimentos"); // NOI18N
        jpaEditarAtendimentos.setLayout(null);

        jlaGrupo.setFont(resourceMap.getFont("jlaGrupo.font")); // NOI18N
        jlaGrupo.setText(resourceMap.getString("jlaGrupo.text")); // NOI18N
        jlaGrupo.setName("jlaGrupo"); // NOI18N
        jpaEditarAtendimentos.add(jlaGrupo);
        jlaGrupo.setBounds(10, 30, 60, 17);

        jtfGrupo.setEditable(false);
        jtfGrupo.setFont(resourceMap.getFont("jtfGrupo.font")); // NOI18N
        jtfGrupo.setText(resourceMap.getString("jtfGrupo.text")); // NOI18N
        jtfGrupo.setName("jtfGrupo"); // NOI18N
        jpaEditarAtendimentos.add(jtfGrupo);
        jtfGrupo.setBounds(10, 50, 110, 23);
        jtfGrupo.getAccessibleContext().setAccessibleName(resourceMap.getString("jTextField1.AccessibleContext.accessibleName")); // NOI18N

        jlaModuloAtividade.setFont(resourceMap.getFont("jlaModuloAtividade.font")); // NOI18N
        jlaModuloAtividade.setText(resourceMap.getString("jlaModuloAtividade.text")); // NOI18N
        jlaModuloAtividade.setName("jlaModuloAtividade"); // NOI18N
        jpaEditarAtendimentos.add(jlaModuloAtividade);
        jlaModuloAtividade.setBounds(130, 30, 160, 17);

        jtfModuloAtividade.setEditable(false);
        jtfModuloAtividade.setFont(resourceMap.getFont("jtfModuloAtividade.font")); // NOI18N
        jtfModuloAtividade.setText(resourceMap.getString("jtfModuloAtividade.text")); // NOI18N
        jtfModuloAtividade.setName("jtfModuloAtividade"); // NOI18N
        jpaEditarAtendimentos.add(jtfModuloAtividade);
        jtfModuloAtividade.setBounds(130, 50, 550, 23);
        jtfModuloAtividade.getAccessibleContext().setAccessibleName(resourceMap.getString("jTextField2.AccessibleContext.accessibleName")); // NOI18N

        jlaData.setFont(resourceMap.getFont("jlaData.font")); // NOI18N
        jlaData.setText(resourceMap.getString("jlaData.text")); // NOI18N
        jlaData.setName("jlaData"); // NOI18N
        jpaEditarAtendimentos.add(jlaData);
        jlaData.setBounds(690, 30, 50, 17);

        jtfData.setEditable(false);
        jtfData.setFont(resourceMap.getFont("jtfData.font")); // NOI18N
        jtfData.setText(resourceMap.getString("jtfData.text")); // NOI18N
        jtfData.setName("jtfData"); // NOI18N
        jpaEditarAtendimentos.add(jtfData);
        jtfData.setBounds(690, 50, 110, 23);
        jtfData.getAccessibleContext().setAccessibleName(resourceMap.getString("jTextField3.AccessibleContext.accessibleName")); // NOI18N

        jlaHoraInicio.setFont(resourceMap.getFont("jlaHoraTermino.font")); // NOI18N
        jlaHoraInicio.setText(resourceMap.getString("jlaHoraInicio.text")); // NOI18N
        jlaHoraInicio.setName("jlaHoraInicio"); // NOI18N
        jpaEditarAtendimentos.add(jlaHoraInicio);
        jlaHoraInicio.setBounds(810, 30, 80, 17);

        jtfHoraInicio.setEditable(false);
        jtfHoraInicio.setFont(resourceMap.getFont("jtfHoraTermino.font")); // NOI18N
        jtfHoraInicio.setText(resourceMap.getString("jtfHoraInicio.text")); // NOI18N
        jtfHoraInicio.setName("jtfHoraInicio"); // NOI18N
        jpaEditarAtendimentos.add(jtfHoraInicio);
        jtfHoraInicio.setBounds(810, 50, 90, 23);
        jtfHoraInicio.getAccessibleContext().setAccessibleName(resourceMap.getString("jtfHoraInicio.AccessibleContext.accessibleName")); // NOI18N

        jlaHoraTermino.setFont(resourceMap.getFont("jlaHoraTermino.font")); // NOI18N
        jlaHoraTermino.setText(resourceMap.getString("jlaHoraTermino.text")); // NOI18N
        jlaHoraTermino.setName("jlaHoraTermino"); // NOI18N
        jpaEditarAtendimentos.add(jlaHoraTermino);
        jlaHoraTermino.setBounds(910, 30, 100, 16);

        jtfHoraTermino.setEditable(false);
        jtfHoraTermino.setFont(resourceMap.getFont("jtfHoraTermino.font")); // NOI18N
        jtfHoraTermino.setText(resourceMap.getString("jtfHoraTermino.text")); // NOI18N
        jtfHoraTermino.setName("jtfHoraTermino"); // NOI18N
        jpaEditarAtendimentos.add(jtfHoraTermino);
        jtfHoraTermino.setBounds(910, 50, 100, 22);
        jtfHoraTermino.getAccessibleContext().setAccessibleName(resourceMap.getString("jtfHoraTermino.AccessibleContext.accessibleName")); // NOI18N

        jpaIntegrantes.setName("jpaIntegrantes"); // NOI18N
        jpaIntegrantes.setLayout(null);

        jlaProfissionais.setFont(resourceMap.getFont("jlaProfissionais.font")); // NOI18N
        jlaProfissionais.setText(resourceMap.getString("jlaProfissionais.text")); // NOI18N
        jlaProfissionais.setName("jlaProfissionais"); // NOI18N
        jpaIntegrantes.add(jlaProfissionais);
        jlaProfissionais.setBounds(10, 0, 170, 14);

        jspProfissionais.setName("jspProfissionais"); // NOI18N

        jtaProfissionais.setAutoCreateRowSorter(true);
        jtaProfissionais.setFont(resourceMap.getFont("jtaProfissionais.font")); // NOI18N
        jtaProfissionais.setModel(new ModeloTabelaAtendimentoProfissionalGrupo());
        jtaProfissionais.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtaProfissionais.setName("jtaProfissionais"); // NOI18N
        jtaProfissionais.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtaProfissionais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtaProfissionaisKeyPressed(evt);
            }
        });
        jspProfissionais.setViewportView(jtaProfissionais);
        jtaProfissionais.getAccessibleContext().setAccessibleName(resourceMap.getString("jtaProfissionais.AccessibleContext.accessibleName")); // NOI18N

        jpaIntegrantes.add(jspProfissionais);
        jspProfissionais.setBounds(10, 20, 530, 100);

        jbuAlterarProfissional.setFont(resourceMap.getFont("jbuAlterarProfissional.font")); // NOI18N
        jbuAlterarProfissional.setIcon(resourceMap.getIcon("jbuAlterarProfissional.icon")); // NOI18N
        jbuAlterarProfissional.setText(resourceMap.getString("jbuAlterarProfissional.text")); // NOI18N
        jbuAlterarProfissional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuAlterarProfissional.setName("jbuAlterarProfissional"); // NOI18N
        jbuAlterarProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAlterarProfissionalActionPerformed(evt);
            }
        });
        jpaIntegrantes.add(jbuAlterarProfissional);
        jbuAlterarProfissional.setBounds(410, 127, 130, 35);
        jbuAlterarProfissional.getAccessibleContext().setAccessibleName(resourceMap.getString("jButton3.AccessibleContext.accessibleName")); // NOI18N

        jlaUsuarios.setFont(resourceMap.getFont("jlaUsuarios.font")); // NOI18N
        jlaUsuarios.setText(resourceMap.getString("jlaUsuarios.text")); // NOI18N
        jlaUsuarios.setName("jlaUsuarios"); // NOI18N
        jpaIntegrantes.add(jlaUsuarios);
        jlaUsuarios.setBounds(10, 160, 170, 17);

        jspUsuarios.setName("jspUsuarios"); // NOI18N

        jtaUsuarios.setAutoCreateRowSorter(true);
        jtaUsuarios.setFont(resourceMap.getFont("jtaUsuarios.font")); // NOI18N
        jtaUsuarios.setModel(new ModeloTabelaAtendimentoUsuario());
        jtaUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtaUsuarios.setName("jtaUsuarios"); // NOI18N
        jtaUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtaUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtaUsuariosKeyPressed(evt);
            }
        });
        jspUsuarios.setViewportView(jtaUsuarios);
        jtaUsuarios.getAccessibleContext().setAccessibleName(resourceMap.getString("jtaUsuarios.AccessibleContext.accessibleName")); // NOI18N

        jpaIntegrantes.add(jspUsuarios);
        jspUsuarios.setBounds(10, 180, 530, 150);

        jbuAlterarUsuario.setFont(resourceMap.getFont("jbuAlterarUsuario.font")); // NOI18N
        jbuAlterarUsuario.setIcon(resourceMap.getIcon("jbuAlterarUsuario.icon")); // NOI18N
        jbuAlterarUsuario.setText(resourceMap.getString("jbuAlterarUsuario.text")); // NOI18N
        jbuAlterarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuAlterarUsuario.setName("jbuAlterarUsuario"); // NOI18N
        jbuAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAlterarUsuarioActionPerformed(evt);
            }
        });
        jpaIntegrantes.add(jbuAlterarUsuario);
        jbuAlterarUsuario.setBounds(410, 337, 130, 35);
        jbuAlterarUsuario.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuAlterarUsuario.AccessibleContext.accessibleName")); // NOI18N
        jbuAlterarUsuario.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jbuAlterarUsuario.AccessibleContext.accessibleDescription")); // NOI18N

        jlaComunidade.setFont(resourceMap.getFont("jlaComunidade.font")); // NOI18N
        jlaComunidade.setText(resourceMap.getString("jlaComunidade.text")); // NOI18N
        jlaComunidade.setName("jlaComunidade"); // NOI18N
        jpaIntegrantes.add(jlaComunidade);
        jlaComunidade.setBounds(10, 370, 170, 17);

        jspComunidade.setFont(resourceMap.getFont("jspComunidade.font")); // NOI18N
        jspComunidade.setName("jspComunidade"); // NOI18N

        jtaComunidade.setAutoCreateRowSorter(true);
        jtaComunidade.setFont(resourceMap.getFont("jtaComunidade.font")); // NOI18N
        jtaComunidade.setModel(new ModeloTabelaAtendimentoPreCadastro());
        jtaComunidade.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtaComunidade.setName("jtaComunidade"); // NOI18N
        jtaComunidade.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtaComunidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtaComunidadeKeyPressed(evt);
            }
        });
        jspComunidade.setViewportView(jtaComunidade);
        jtaComunidade.getAccessibleContext().setAccessibleName(resourceMap.getString("jtaComunidade.AccessibleContext.accessibleName")); // NOI18N

        jpaIntegrantes.add(jspComunidade);
        jspComunidade.setBounds(10, 390, 530, 150);

        jbuAlterarComunidade.setFont(resourceMap.getFont("jbuAlterarComunidade.font")); // NOI18N
        jbuAlterarComunidade.setIcon(resourceMap.getIcon("jbuAlterarComunidade.icon")); // NOI18N
        jbuAlterarComunidade.setText(resourceMap.getString("jbuAlterarComunidade.text")); // NOI18N
        jbuAlterarComunidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuAlterarComunidade.setName("jbuAlterarComunidade"); // NOI18N
        jbuAlterarComunidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAlterarComunidadeActionPerformed(evt);
            }
        });
        jpaIntegrantes.add(jbuAlterarComunidade);
        jbuAlterarComunidade.setBounds(410, 550, 130, 35);
        jbuAlterarComunidade.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuAlterarComunidade.AccessibleContext.accessibleName")); // NOI18N

        jpaEditarAtendimentos.add(jpaIntegrantes);
        jpaIntegrantes.setBounds(2, 80, 550, 590);

        jpaRelatoAtendimento.setName("jpaRelatoAtendimento"); // NOI18N
        jpaRelatoAtendimento.setLayout(null);

        jlaDescricao.setFont(resourceMap.getFont("jlaDescricao.font")); // NOI18N
        jlaDescricao.setText(resourceMap.getString("jlaDescricao.text")); // NOI18N
        jlaDescricao.setName("jlaDescricao"); // NOI18N
        jpaRelatoAtendimento.add(jlaDescricao);
        jlaDescricao.setBounds(2, 0, 130, 17);

        jlaInterdisciplinar.setFont(resourceMap.getFont("jlaInterdisciplinar.font")); // NOI18N
        jlaInterdisciplinar.setText(resourceMap.getString("jlaInterdisciplinar.text")); // NOI18N
        jlaInterdisciplinar.setName("jlaInterdisciplinar"); // NOI18N
        jpaRelatoAtendimento.add(jlaInterdisciplinar);
        jlaInterdisciplinar.setBounds(2, 270, 130, 17);

        jspDescricao.setName("jspDescricao"); // NOI18N

        jatDescricao.setColumns(20);
        jatDescricao.setFont(resourceMap.getFont("jatDescricao.font")); // NOI18N
        jatDescricao.setLineWrap(true);
        jatDescricao.setRows(5);
        jatDescricao.setWrapStyleWord(true);
        jatDescricao.setName("jatDescricao"); // NOI18N
        jatDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jatDescricaoKeyPressed(evt);
            }
        });
        jspDescricao.setViewportView(jatDescricao);
        jatDescricao.getAccessibleContext().setAccessibleName(resourceMap.getString("jatDescricao.AccessibleContext.accessibleName")); // NOI18N
        jatDescricao.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jatDescricao.AccessibleContext.accessibleDescription")); // NOI18N

        jpaRelatoAtendimento.add(jspDescricao);
        jspDescricao.setBounds(0, 20, 460, 250);

        jspInterdisciplinar.setName("jspInterdisciplinar"); // NOI18N

        jatInterdisciplinar.setColumns(20);
        jatInterdisciplinar.setFont(resourceMap.getFont("jatInterdisciplinar.font")); // NOI18N
        jatInterdisciplinar.setLineWrap(true);
        jatInterdisciplinar.setRows(5);
        jatInterdisciplinar.setWrapStyleWord(true);
        jatInterdisciplinar.setName("jatInterdisciplinar"); // NOI18N
        jatInterdisciplinar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jatInterdisciplinarKeyPressed(evt);
            }
        });
        jspInterdisciplinar.setViewportView(jatInterdisciplinar);
        jatInterdisciplinar.getAccessibleContext().setAccessibleName(resourceMap.getString("jatInterdisciplinar.AccessibleContext.accessibleName")); // NOI18N
        jatInterdisciplinar.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jatInterdisciplinar.AccessibleContext.accessibleDescription")); // NOI18N

        jpaRelatoAtendimento.add(jspInterdisciplinar);
        jspInterdisciplinar.setBounds(0, 290, 460, 150);

        jlaArquivos.setFont(resourceMap.getFont("jlaArquivos.font")); // NOI18N
        jlaArquivos.setText(resourceMap.getString("jlaArquivos.text")); // NOI18N
        jlaArquivos.setName("jlaArquivos"); // NOI18N
        jpaRelatoAtendimento.add(jlaArquivos);
        jlaArquivos.setBounds(0, 440, 130, 17);

        jspArquivos.setName("jspArquivos"); // NOI18N

        jliArquivos.setFont(resourceMap.getFont("jlaArquivos.font")); // NOI18N
        jliArquivos.setModel(new DefaultListModel());
        jliArquivos.setName("jliArquivos"); // NOI18N
        jspArquivos.setViewportView(jliArquivos);
        jliArquivos.getAccessibleContext().setAccessibleName(resourceMap.getString("jliArquivos.AccessibleContext.accessibleName")); // NOI18N

        jpaRelatoAtendimento.add(jspArquivos);
        jspArquivos.setBounds(0, 460, 320, 100);

        jbuAdicionarArquivo.setFont(resourceMap.getFont("jlaArquivos.font")); // NOI18N
        jbuAdicionarArquivo.setIcon(resourceMap.getIcon("jbuAdicionarArquivo.icon")); // NOI18N
        jbuAdicionarArquivo.setMnemonic('d');
        jbuAdicionarArquivo.setText(resourceMap.getString("jbuAdicionarArquivo.text")); // NOI18N
        jbuAdicionarArquivo.setToolTipText(resourceMap.getString("jbuAdicionarArquivo.toolTipText")); // NOI18N
        jbuAdicionarArquivo.setName("jbuAdicionarArquivo"); // NOI18N
        jbuAdicionarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAdicionarArquivoActionPerformed(evt);
            }
        });
        jpaRelatoAtendimento.add(jbuAdicionarArquivo);
        jbuAdicionarArquivo.setBounds(330, 500, 130, 33);
        jbuAdicionarArquivo.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuAdicionarArquivo.AccessibleContext.accessibleName")); // NOI18N

        jbuAbrirAquivo.setFont(resourceMap.getFont("jlaArquivos.font")); // NOI18N
        jbuAbrirAquivo.setIcon(resourceMap.getIcon("jbuAbrirAquivo.icon")); // NOI18N
        jbuAbrirAquivo.setMnemonic('A');
        jbuAbrirAquivo.setText(resourceMap.getString("jbuAbrirAquivo.text")); // NOI18N
        jbuAbrirAquivo.setName("jbuAbrirAquivo"); // NOI18N
        jbuAbrirAquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAbrirAquivoActionPerformed(evt);
            }
        });
        jpaRelatoAtendimento.add(jbuAbrirAquivo);
        jbuAbrirAquivo.setBounds(330, 460, 130, 33);
        jbuAbrirAquivo.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuAbrirAquivo.AccessibleContext.accessibleName")); // NOI18N

        jbuRemoverArquivo.setFont(resourceMap.getFont("jbuRemoverArquivo.font")); // NOI18N
        jbuRemoverArquivo.setIcon(resourceMap.getIcon("jbuRemoverArquivo.icon")); // NOI18N
        jbuRemoverArquivo.setMnemonic('R');
        jbuRemoverArquivo.setText(resourceMap.getString("jbuRemoverArquivo.text")); // NOI18N
        jbuRemoverArquivo.setName("jbuRemoverArquivo"); // NOI18N
        jbuRemoverArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuRemoverArquivoActionPerformed(evt);
            }
        });
        jpaRelatoAtendimento.add(jbuRemoverArquivo);
        jbuRemoverArquivo.setBounds(330, 540, 130, 33);
        jbuRemoverArquivo.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuRemoverArquivo.AccessibleContext.accessibleName")); // NOI18N

        jpaEditarAtendimentos.add(jpaRelatoAtendimento);
        jpaRelatoAtendimento.setBounds(552, 80, 460, 590);

        jbuSalvar.setFont(resourceMap.getFont("jbuSalvar.font")); // NOI18N
        jbuSalvar.setIcon(resourceMap.getIcon("jbuSalvar.icon")); // NOI18N
        jbuSalvar.setMnemonic('S');
        jbuSalvar.setText(resourceMap.getString("jbuSalvar.text")); // NOI18N
        jbuSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuSalvar.setName("jbuSalvar"); // NOI18N
        jbuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuSalvarActionPerformed(evt);
            }
        });
        jpaEditarAtendimentos.add(jbuSalvar);
        jbuSalvar.setBounds(10, 670, 120, 33);
        jbuSalvar.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuSalvar.AccessibleContext.accessibleName")); // NOI18N

        jbuFechar.setFont(resourceMap.getFont("jbuFechar.font")); // NOI18N
        jbuFechar.setIcon(resourceMap.getIcon("jbuFechar.icon")); // NOI18N
        jbuFechar.setMnemonic('F');
        jbuFechar.setText(resourceMap.getString("jbuFechar.text")); // NOI18N
        jbuFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbuFechar.setName("jbuFechar"); // NOI18N
        jbuFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuFecharActionPerformed(evt);
            }
        });
        jpaEditarAtendimentos.add(jbuFechar);
        jbuFechar.setBounds(890, 670, 120, 33);
        jbuFechar.getAccessibleContext().setAccessibleName(resourceMap.getString("jbuFechar.AccessibleContext.accessibleName")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaEditarAtendimentos, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpaEditarAtendimentos, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuSalvarActionPerformed
        controlador.salvar();
    }//GEN-LAST:event_jbuSalvarActionPerformed

    private void jbuFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuFecharActionPerformed
        controlador.desbloquearDTOeFecharTela();
    }//GEN-LAST:event_jbuFecharActionPerformed

    private void jtaUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaUsuariosKeyPressed
        controlador.transferirFocoNaTabulacao(evt);
        controlador.abrirTelaDeAlteracaoAtendimentoUsuario(evt);
    }//GEN-LAST:event_jtaUsuariosKeyPressed

    private void jbuAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAlterarUsuarioActionPerformed
        controlador.alterarAtendimentoUsuario();
    }//GEN-LAST:event_jbuAlterarUsuarioActionPerformed

    private void jtaProfissionaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaProfissionaisKeyPressed
        controlador.transferirFocoNaTabulacao(evt);
        controlador.abrirTelaDeAlteracaoAtendimentoProfissional(evt);
    }//GEN-LAST:event_jtaProfissionaisKeyPressed

    private void jbuAlterarProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAlterarProfissionalActionPerformed
        controlador.alterarAtendimentoProfissional();
    }//GEN-LAST:event_jbuAlterarProfissionalActionPerformed

    private void jbuAlterarComunidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAlterarComunidadeActionPerformed
        controlador.alterarAtendimentoComunidade();
    }//GEN-LAST:event_jbuAlterarComunidadeActionPerformed

    private void jtaComunidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaComunidadeKeyPressed
        controlador.transferirFocoNaTabulacao(evt);
        controlador.abrirTelaDeAlteracaoAtendimentoPreCadastro(evt);
    }//GEN-LAST:event_jtaComunidadeKeyPressed

    private void jatDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jatDescricaoKeyPressed
        WordUtils.abrirWord(evt, jatDescricao);
    }//GEN-LAST:event_jatDescricaoKeyPressed

    private void jatInterdisciplinarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jatInterdisciplinarKeyPressed
        WordUtils.abrirWord(evt, jatInterdisciplinar);
    }//GEN-LAST:event_jatInterdisciplinarKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        controlador.desbloquearDTOeFecharTela();
    }//GEN-LAST:event_formWindowClosed

    private void jbuAbrirAquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAbrirAquivoActionPerformed
        controlador.abrirArquivo();
    }//GEN-LAST:event_jbuAbrirAquivoActionPerformed

    private void jbuAdicionarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAdicionarArquivoActionPerformed
        controlador.adicionarArquivo();
    }//GEN-LAST:event_jbuAdicionarArquivoActionPerformed

    private void jbuRemoverArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuRemoverArquivoActionPerformed
        controlador.removerArquivoSelecionado();
    }//GEN-LAST:event_jbuRemoverArquivoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jatDescricao;
    private javax.swing.JTextArea jatInterdisciplinar;
    private javax.swing.JButton jbuAbrirAquivo;
    private javax.swing.JButton jbuAdicionarArquivo;
    private javax.swing.JButton jbuAlterarComunidade;
    private javax.swing.JButton jbuAlterarProfissional;
    private javax.swing.JButton jbuAlterarUsuario;
    private javax.swing.JButton jbuFechar;
    private javax.swing.JButton jbuRemoverArquivo;
    private javax.swing.JButton jbuSalvar;
    private javax.swing.JLabel jlaArquivos;
    private javax.swing.JLabel jlaComunidade;
    private javax.swing.JLabel jlaData;
    private javax.swing.JLabel jlaDescricao;
    private javax.swing.JLabel jlaGrupo;
    private javax.swing.JLabel jlaHoraInicio;
    private javax.swing.JLabel jlaHoraTermino;
    private javax.swing.JLabel jlaInterdisciplinar;
    private javax.swing.JLabel jlaModuloAtividade;
    private javax.swing.JLabel jlaProfissionais;
    private javax.swing.JLabel jlaUsuarios;
    private javax.swing.JList jliArquivos;
    private javax.swing.JPanel jpaEditarAtendimentos;
    private javax.swing.JPanel jpaIntegrantes;
    private javax.swing.JPanel jpaRelatoAtendimento;
    private javax.swing.JScrollPane jspArquivos;
    private javax.swing.JScrollPane jspComunidade;
    private javax.swing.JScrollPane jspDescricao;
    private javax.swing.JScrollPane jspInterdisciplinar;
    private javax.swing.JScrollPane jspProfissionais;
    private javax.swing.JScrollPane jspUsuarios;
    private javax.swing.JTable jtaComunidade;
    private javax.swing.JTable jtaProfissionais;
    private javax.swing.JTable jtaUsuarios;
    private javax.swing.JTextField jtfData;
    private javax.swing.JTextField jtfGrupo;
    private javax.swing.JTextField jtfHoraInicio;
    private javax.swing.JTextField jtfHoraTermino;
    private javax.swing.JTextField jtfModuloAtividade;
    // End of variables declaration//GEN-END:variables
    private ControladorTelaGruposEditarAtendimentos controlador;
}
