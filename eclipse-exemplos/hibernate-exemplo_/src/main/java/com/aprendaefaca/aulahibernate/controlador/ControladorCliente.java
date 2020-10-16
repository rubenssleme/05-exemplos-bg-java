/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprendaefaca.aulahibernate.controlador;


import com.aprendaefaca.aulahibernate.utils.HibernateUtil;



import com.aprendaefaca.aulahibernate.dominio.Cliente;



import com.aprendaefaca.aulahibernate.utils.HibernateUtil;

import com.aprendaefaca.aulahibernate.utils.Mensagem;
import org.hibernate.Session;


/**
 *
 * @author rubens.leme
 */
public class ControladorCliente {

    Session s = HibernateUtil.getSessionFactory().getCurrentSession();

    public void cadastrar(String nome, String cpf, String email, String telefone) {
        Cliente cliente = new Cliente();

        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEmail(email);
        cliente.setTelefone(telefone);

        s.beginTransaction();

        try {
            s.save(cliente);
            Mensagem.exibirMensagem("Salvo com sucesso!");
        } catch (org.hibernate.exception.ConstraintViolationException ex) {
            Mensagem.exibirMensagem("Erro no salvamento" + ex.toString());

        }
        s.getTransaction().commit();
    }
}
