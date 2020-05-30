package dominio;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;


@WebServlet("/TesteServlet")
public class TesteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource
	private UserTransaction ut;

	@PersistenceContext
	private EntityManager em;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Produto p = new Produto();
		p.setDescricao("Caneta");
		p.setPreco(9.50);

		try{
			ut.begin();
			em.persist(p);
			ut.commit();

		}catch(Exception e){
			throw new ServletException(); 
		}
		response.getWriter().append("Produto criado : " + p.getId()).close();
	}

}
