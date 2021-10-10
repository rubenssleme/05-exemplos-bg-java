/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.controller;

import br.com.biblioteca.dao.CursoDao;
import br.com.biblioteca.dao.EstadoDao;
import br.com.biblioteca.dao.GeneroDao;
import br.com.biblioteca.dao.ModuloDao;
import br.com.biblioteca.entity.Aluno;
import br.com.biblioteca.entity.Cidade;
import br.com.biblioteca.entity.Curso;
import br.com.biblioteca.entity.Genero;
import br.com.biblioteca.entity.Modulo;
import br.com.biblioteca.entity.Usuario;
import br.com.biblioteca.utils.DateUtils;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javassist.compiler.Parser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.cglib.core.Converter;

/**
 *
 * @author Caio
 */
public class AlunoController {

    public void inicializarTela(JComboBox modulo, JComboBox curso, JComboBox Estado) throws Exception{
        preencherCombo(modulo, new ModuloDao().findAll());
        preencherCombo(curso, new CursoDao().findAll());
        preencherCombo(Estado, new EstadoDao().findAll());
    }
    
    private Aluno giveAluno(JComboBox modulo, JComboBox curso, JTextField nome, JFormattedTextField dtNasc, JTextField rg, JFormattedTextField cpf, JTextField endereco, JTextField bairro, JFormattedTextField cep, JComboBox cidade, JFormattedTextField telefone, JFormattedTextField celular, JTextField email) {
        return new Aluno(nome.getText(), DateUtils.formataData(dtNasc.getText()), rg.getText(), cpf.getText(), endereco.getText(), bairro.getText(), cep.getText(), telefone.getText(), celular.getText(), email.getText(), true, DateUtils.getPegaDataAtual(), new Usuario(), (Modulo) modulo.getSelectedItem(), (Cidade) cidade.getSelectedItem(), (Curso) curso.getSelectedItem());
    }

    private void preencherCombo(JComboBox combo, List lista) {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            for (Object list : lista) {
                model.addElement(list);
            }
            combo.removeAllItems();
            combo.setModel(model);
        } catch (Exception e) {
        }
    }
    
    private List listarEstados() {
        EstadoDao dao = new EstadoDao();
        try {
            return dao.getPureList("from Estado est");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar generos\n" + e.getLocalizedMessage());
        }
        return null;
    }
    
    private List listarModulos() {
        ModuloDao dao = new ModuloDao();
        try {
            return dao.getPureList("from Modulo mdl");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar generos\n" + e.getLocalizedMessage());
        }
        return null;
    }
    
    private List listarCursos() {
        CursoDao dao = new CursoDao();
        try {
            return dao.getPureList("from Curso crs");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao localizar generos\n" + e.getLocalizedMessage());
        }
        return null;
    }
}
