
package com.aprendaefaca.livrariadigital.repositorio;

import com.aprendaefaca.livrariadigital.dominio.Cliente;

/**
 *
 * @author rubens.leme
 */
public class ClienteBD {

    public boolean validarCliente(Cliente cliente) {
        boolean eValido = false;
        if (cliente != null) {
            if ((cliente.getLogin().equals("a")) && (cliente.getSenha().equals("a"))) {
                eValido = true;
            }
        }
        return eValido;
        
    }

}
