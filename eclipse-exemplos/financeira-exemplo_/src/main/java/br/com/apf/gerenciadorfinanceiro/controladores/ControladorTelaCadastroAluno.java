package br.com.apf.gerenciadorfinanceiro.controladores;

import br.com.apf.gerenciadorfinanceiro.dominio.Aluno;
import br.com.apf.gerenciadorfinanceiro.repositorios.RepositorioAluno;
import br.com.apf.gerenciadorfinanceiro.telas.TelaCadastroAluno;
import br.com.apf.gerenciadorfinanceiro.utilitarios.Mensagem;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Rubens Leme
 */
public class ControladorTelaCadastroAluno {

    private TelaCadastroAluno telaCadastroAluno;
    private JTextField jtfNomeAluno, jtfCPF, jtfRG;
    private JComboBox<String> jcbSexo;
    private JButton jbtSalvar, jbtVoltar;
    private Aluno aluno;
    private RepositorioAluno repositorioAluno = new RepositorioAluno();
    

    public ControladorTelaCadastroAluno(TelaCadastroAluno telaCadastroAluno, JTextField jtfNomeAluno, JTextField jtfCPF, 
            JTextField jtfRG, JComboBox<String> jcbSexo, JButton jbtSalvar, JButton jbtVoltar) {
        this.telaCadastroAluno = telaCadastroAluno;
        this.jtfNomeAluno = jtfNomeAluno;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jcbSexo = jcbSexo;
        this.jbtSalvar = jbtSalvar;
        this.jbtVoltar = jbtVoltar;
    }

    private void limparCampos() {
        jtfNomeAluno.setText(null);
        jtfCPF.setText(null);
        jtfRG.setText(null);
        jcbSexo.setSelectedIndex(0);
    }

    private boolean camposPreenchidos() {
        return !(jtfNomeAluno.getText().isEmpty()
                || jtfCPF.getText().isEmpty()
                || jtfRG.getText().isEmpty()
                || jcbSexo.getSelectedItem().equals(null));
    }

    public void salvar() {

        if (camposPreenchidos()) {
            if (salvarAluno()) {
                Mensagem.exibirMensagem("Aluno salvo com sucesso!");
                limparCampos();
            } else {
                Mensagem.exibirMensagem("Aluno não salvo!");
            }
        } else {
            Mensagem.exibirMensagem("Preencha todos os campos obrigatórios");
        }
    }

    private boolean salvarAluno() {
        return repositorioAluno.salvar(new Aluno(jtfNomeAluno.getText(), Integer.parseInt(jtfCPF.getText()), Integer.parseInt(jtfRG.getText()), jcbSexo.getSelectedItem().toString()));
    }

}
