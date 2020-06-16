/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public abstract class ModeloTabela<T> extends DefaultTableModel {

    private Class[] tiposColunas;
    private int[] tamanhosColunas;
    protected List<T> objetosDmo;

    public ModeloTabela(String[] tituloColunas, Class[] tiposColunas, int[] tamanhosColunas) {
        setColumnIdentifiers(tituloColunas);
        this.tiposColunas = tiposColunas;
        this.tamanhosColunas = tamanhosColunas;
        objetosDmo = new ArrayList<>();
    }

    public int obterTamanhoPreferido(int coluna) {
        return tamanhosColunas[coluna];
    }

    @Override
    public Class<?> getColumnClass(int coluna) {
        return tiposColunas[coluna];
    }

    @Override
    public boolean isCellEditable(int row, int colunm) {
        return false;
    }

    public T obterObjetoDto(int index) {
        return objetosDmo.get(index);
    }

    public void atualizarObjetoDto(T objetoDto) {
        int indice = objetosDmo.indexOf(objetoDto);
        objetosDmo.set(indice, objetoDto);
        adicionarDMOS(objetosDmo);
    }

    public void removerDMO(int indice) {
        objetosDmo.remove(indice);
        adicionarDMOS(objetosDmo);
    }

    public void incluirObjetoDmo(int indice, T objetoDmo) {
        objetosDmo.set(indice, objetoDmo);
        adicionarDMOS(objetosDmo);
    }

    public void limparDados() {
        setRowCount(0);
    }

    public void adicionarDMOS(List<T> objetosDmo) {
        limparDados();
        if (objetosDmo != null && !objetosDmo.isEmpty()) {
            this.objetosDmo = objetosDmo;

            for (T objetoDmo : objetosDmo) {
                adicionarDado(objetoDmo);
            }
        }
    }

    public void adicionarDMO(T objetoDmo) {
        this.objetosDmo.add(objetoDmo);
        adicionarDado(objetoDmo);
    }

    public List<T> obterDMOS() {
        return this.objetosDmo;
    }

    public boolean existe(T objeto) {
        return objetosDmo.contains(objeto);
    }

    public abstract void adicionarDado(T objetoDmo);
}
