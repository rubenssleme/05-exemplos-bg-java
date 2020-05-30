package com.exemplo.sisPagbank.dominio;

import com.exemplo.sisPagbank.utilitarios.TamanhoMaximoGenerico;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = TamanhoMaximoGenerico.NOME, nullable = false)
    private String nomeCliente;
}
