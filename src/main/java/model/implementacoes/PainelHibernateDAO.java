package model.implementacoes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Painel;
import model.interfaces.PainelDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PainelHibernateDAO implements PainelDAO {
    private EntityManager em;
    private SessionFactory session;
    private static PainelHibernateDAO instance = null;
    
    public PainelHibernateDAO getInstance(){
        if(instance == null){
            instance = new PainelHibernateDAO();
        }
        
        return instance;
    }
    
    public PainelHibernateDAO(){
        Configuration cfg = new Configuration().configure();
        this.session = cfg.buildSessionFactory();
    }
    
    @Override
    public void cadastar(Painel painel) {
        Session secao = this.session.openSession();
        Transaction t  = secao.beginTransaction();
        
        try{
            secao.persist(painel);
            t.commit();
            
        }catch(Exception cadPainelError){
            System.out.println(cadPainelError.getCause()
                            + "\nOcorreu um erro ao cadastrar o painel.");
            t.rollback();
        }finally{
            secao.close();
        }
    }

    @Override
    public Painel recuperar(int codigo) {
        Session secao = this.session.openSession();
        
        try{
            return (Painel) secao.createQuery("From painel where id=" + codigo)
                    .getResultList().get(0);
            
        }catch(Exception getPainelError){
            System.out.println(getPainelError.getCause()
                            + "\nOcorreu um erro ao recuperar o painel.");
        }finally{
            secao.close();
        }
        return null;
    }

    @Override
    public void deletar(Painel painel) {
        Session secao = this.session.openSession();
        Transaction t = secao.beginTransaction();
        
        try{
            secao.delete(painel);
            t.commit();
        }catch(Exception delPainelError){
            System.out.println(delPainelError.getCause()
                            + "\nOcorreu um erro ao deletar um painel.");
            t.rollback();
        }finally{
            secao.close();
        }
    }

    @Override
    public void alterar(Painel painel) {
        Session secao = this.session.openSession();
        Transaction t = secao.beginTransaction();
        
        try{
            secao.update(painel);
            t.commit();
        }catch(Exception altPainelError){
            System.out.println(altPainelError.getCause()
                            + "\nOcorreu um erro ao alterar o painel");
            t.rollback();
        }finally{
            secao.close();
        }
    }

    @Override
    public List<Painel> recuperarTodos() {
        Session secao = this.session.openSession();
        List<Painel> listPainel = new ArrayList();
        
        try{
          listPainel =   secao.createQuery("from painel").getResultList();
        }catch(Exception getListPainelError){
            System.out.println(getListPainelError.getCause()
                            + "\nOcorreu um erro ao recuperar a lista de paineis");
        }finally{
            secao.close();
        }
        return listPainel;
    }

}
