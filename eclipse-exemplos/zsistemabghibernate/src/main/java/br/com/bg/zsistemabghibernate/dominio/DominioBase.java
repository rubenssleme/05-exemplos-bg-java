package br.com.bg.zsistemabghibernate.dominio;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author rubens.leme
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class DominioBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

}
