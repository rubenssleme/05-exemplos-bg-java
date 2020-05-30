/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.projetomanipulacaoenum;

/**
 *
 * @author rubens.leme
 */
public enum EstadosDaFederacao {
    BAIXO_PESO_MUITO_GRAVE("Baixo peso muito grave.", "ee"),
    BAIXO_PESO_GRAVE("Baixo peso grave.", "ss");
    private final String idEstado;

    private final String descricaoEstado;

    private EstadosDaFederacao(String idEstado, String descricaoEstado) {
        this.idEstado = idEstado;
        this.descricaoEstado = descricaoEstado;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public String getDescricaoEstado() {
        return descricaoEstado;
    }

    
    
}
