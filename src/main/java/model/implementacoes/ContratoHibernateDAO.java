package model.implementacoes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Contrato;
import model.interfaces.ContratoDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Jarvis
 */
public class ContratoHibernateDAO implements ContratoDAO {

    private EntityManager em;
    private SessionFactory sessions;
    private static ContratoHibernateDAO instance;

    public static ContratoHibernateDAO getInstance() {
        if (instance == null) {
            instance = new ContratoHibernateDAO();
        }

        return instance;
    }

    public ContratoHibernateDAO() {
        Configuration cfg = new Configuration().configure();
        sessions = cfg.buildSessionFactory();
    }

    @Override
    public void cadastar(Contrato contrato) {
        Session secao = this.sessions.openSession();
        Transaction t = secao.beginTransaction();

        try {
            secao.persist(contrato);
            t.commit();

        } catch (Exception cadContratoError) {
            System.out.println(cadContratoError.getCause()
                    + "\nOccoreu algum erro ao cadastrar um contrato.");
            t.rollback();
        } finally {
            secao.close();
        }
    }

    @Override
    public Contrato recuperar(int codigo) {
        Session secao = this.sessions.getCurrentSession();
        
        try{
            return (Contrato) secao.createQuery("from Contrato where id=" + codigo)
                    .getResultList().get(0);
        }catch(Exception getContratoError){
            System.out.println(getContratoError.getCause()
                            + "\nOcorreu um erro ao recuperar um contrato");
        }finally{
            secao.close();
        }
        return null;
    }

    @Override
    public void deletar(Contrato contrato) {
        Session secao = this.sessions.openSession();
        Transaction t = secao.beginTransaction();
        
        try{
            secao.persist(contrato);
            t.commit();
            
        }catch(Exception delContratoError){
            System.out.println(delContratoError.getCause()
                            + "\nOcorreu um erro ao deletar o contrato");
            t.rollback();
        }finally{
            secao.close();
        }
    }

    @Override
    public void alterar(Contrato contrato) {
        Session secao = this.sessions.openSession();
        Transaction t = secao.beginTransaction();
        
        try{
            secao.update(contrato);
            t.commit();
        }catch(Exception altContratoError){
            System.out.println(altContratoError.getCause()
                                + "\nOcorreu algum erro ao alterar um contrato.");
        }finally{
            secao.close();
        }
    }

    @Override
    public List<Contrato> recuperarTodos() {
    Session secao = this.sessions.openSession();
    List<Contrato> contratoList = new ArrayList();
    
    try{
        contratoList = secao.createQuery("from contrato").getResultList();
    }catch(Exception getListContratoError){
        System.out.println(getListContratoError.getCause()
                        + "\nOcorreu um erro ao recuperar a lista de contratos.");
    }finally{
        secao.close();
    }
    
        return contratoList;
    }

}
