/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.utils;

/**
 *
 * @author Caio
 */
public enum ModuloEnum {
    
    Primeiro("1º Módulo"),Segundo("2º Módulo"),Terceiro("3º Módulo");
    
    private String modulo;
    
    ModuloEnum(String modulo){
        this.modulo = modulo;
    }
    
    String getModulo(){
        return modulo;
    }
    
        public String toString()
    {
        return modulo;
    }
}
