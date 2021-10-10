package exemplo.ejb;
//
import exemplo.dao.PessoaDAO;
import exemplo.modelo.Pessoa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PessoaBean implements PessoaRemote {

    @PersistenceContext(unitName= "PessoaPU")
    private EntityManager em;

    @Override

    public Pessoa salvar(Pessoa p) throws Exception {
        PessoaDAO dao = new PessoaDAO(em);
        dao.salvar(p);
        return p;
    }

    @Override
    public Pessoa consultarPorId(Long id) {
        PessoaDAO dao = new PessoaDAO(em);
        return dao.consultaPorId(id);
    }

    @Override
    public void remover(Long id) {
        PessoaDAO dao = new PessoaDAO(em);
        dao.remover(id);
    }

}
