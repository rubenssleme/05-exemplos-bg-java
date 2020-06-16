/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.laramara.usse.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author rubens.leme
 */

@Entity
public class Servidor extends Equipamento {
   
  
    @Column(length = 35, nullable = true)
    private Long serviceTag;
    @Column(length = 3, nullable = true)
    private Integer quantidadesVms;
    @Column(length = 20, nullable = true)
    private String dataManutencao;

    public Servidor(){
        
    }
    public Servidor(Long serviceTag, Integer quantidadesVms, String dataManutencao) {
        this.serviceTag = serviceTag;
        this.quantidadesVms = quantidadesVms;
        this.dataManutencao = dataManutencao;
    }

    
    
    
    

    public Long getServiceTag() {
        return serviceTag;
    }

    public void setServiceTag(Long serviceTag) {
        this.serviceTag = serviceTag;
    }

    public Integer getQuantidadesVms() {
        return quantidadesVms;
    }

    public void setQuantidadesVms(Integer quantidadesVms) {
        this.quantidadesVms = quantidadesVms;
    }

    public String getDataManutencao() {
        return dataManutencao;
    }

    public void setDataManutencao(String dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    @Override
    public String toString() {
        return "Servidor{" + "serviceTag=" + serviceTag + ", quantidadesVms=" + quantidadesVms + ", dataManutencao=" + dataManutencao + '}';
    }
    
    
    
}
