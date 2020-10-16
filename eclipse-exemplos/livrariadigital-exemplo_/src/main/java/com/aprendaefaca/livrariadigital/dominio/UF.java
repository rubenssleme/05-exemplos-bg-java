/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprendaefaca.livrariadigital.dominio;

/**
 *
 * @author rubens.leme
 */
public enum UF {
    
    SP("São Paulo"),MG("Minas Gerais"),BA("Bahia"),RJ("Rio de Janeiro"),MS("Mato Grosso de Sul");
    String estado;
    
     UF(String estado){
        this.estado = estado;
        
    }

    public String getEstado() {
        return estado;
    }
          
     
    
    
    
    
    
}
