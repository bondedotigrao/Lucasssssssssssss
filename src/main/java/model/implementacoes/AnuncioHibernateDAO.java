package model.implementacoes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Anuncio;
import model.interfaces.AnuncioDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Jarvis
 */
public class AnuncioHibernateDAO implements AnuncioDAO {

    private EntityManager em;
    private SessionFactory session;
    private static AnuncioHibernateDAO instance = null;

    public static AnuncioHibernateDAO getInstance() {
        if (instance == null) {
            instance = new AnuncioHibernateDAO();
        }

        return instance;
    }

    public AnuncioHibernateDAO() {
        Configuration cfg = new Configuration().configure();
        this.session = cfg.buildSessionFactory();
    }

    @Override
    public void cadastar(Anuncio anuncio) {
        Session secao = this.session.openSession();
        Transaction t = secao.beginTransaction();

        try {
            secao.persist(anuncio);
            t.commit();
        } catch (Exception CadAnuncioError) {
            System.out.println(CadAnuncioError.getCause()
                    + "\nOcorreu um erro ao cadastrar um anuncio");
            t.rollback();
        } finally {
            secao.close();
        }

    }

    @Override
    public Anuncio recuperar(int codigo) {
        Session secao = this.session.openSession();

        try {
            return (Anuncio) secao.getSession().createQuery("from Anuncio where codigo=" + codigo)
                    .getResultList().get(0);
        } catch (Exception getAnuncioError) {
            System.out.println(getAnuncioError.getCause()
                    + "\nOcorreu um erro ao recuperar um anúncio.");
        } finally {
            secao.close();
        }
        return null;
    }

    @Override
    public void deletar(Anuncio anuncio) {
        Session secao = this.session.openSession();
        Transaction t = secao.beginTransaction();

        try {
            secao.delete(anuncio);
            t.commit();
        } catch (Exception DelAnuncioError) {
            System.out.println(DelAnuncioError.getCause()
                    + "\nOcorreu um erro ao deletar um anuncio.");
            t.rollback();
        } finally {
            secao.close();
        }
    }

    @Override
    public void alterar(Anuncio anuncio) {
        Session secao = this.session.openSession();
        Transaction t = secao.beginTransaction();

        try {
            secao.update(anuncio);
            t.commit();
        } catch (Exception AltAnuncioError) {
            System.out.println(AltAnuncioError.getCause()
                    + "\nOcorreu um erro alterar um anúncio.");
            t.rollback();
        } finally {
            secao.close();
        }
    }

    @Override
    public List<Anuncio> recuperarTodos() {
        Session secao = this.session.openSession();
        List<Anuncio> anuncioList = new ArrayList();

        try {
            anuncioList = secao.createQuery("from anuncio").list();
        } catch (Exception listAnuncioError) {
            System.out.println(listAnuncioError.getCause()
                    + "\nOcorreu um erro ao recuperar uma lista de anúncios");
        } finally {
            secao.close();
        }
        return anuncioList;

    }

}
