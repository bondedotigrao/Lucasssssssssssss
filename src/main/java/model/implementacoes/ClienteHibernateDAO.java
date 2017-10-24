package model.implementacoes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import model.interfaces.ClienteDAO;

/**
 *
 * @author Jarvis
 */
public class ClienteHibernateDAO implements ClienteDAO {
    private EntityManager em;
    private SessionFactory session;
    private static ClienteHibernateDAO instance = null;
    
    public static ClienteHibernateDAO getInstance(){
        if(instance == null){
            instance = new ClienteHibernateDAO();
        }
        
        return instance;
    }
    
    public ClienteHibernateDAO(){
        Configuration cfg = new Configuration().configure();
        this.session = cfg.buildSessionFactory();
    }

    @Override
    public void cadastar(Cliente cliente) {
        Session secao = this.session.openSession();
        Transaction t  = secao.beginTransaction();
        
        try{
            
            secao.persist(cliente);
            t.commit();
            
        }catch(Exception cadastroBug){
            
            System.out.println("Cadastrado não foi efetuado,ocorreu algum erro.");
            t.rollback();
            
        }finally{
            secao.close();
        }
    }

    @Override
    public Cliente recuperar(int codigo) {
        Session secao = this.session.openSession();
        
        try{
            return (Cliente) secao.getSession().createQuery("From Cliente where codigo=" + codigo).getResultList().get(0);
        }catch(Exception recuperaCliente){
            System.out.println("Ocorreu algum erro ao pesquisar o cliente com o código " + codigo);
        }finally{
            secao.close();
        }
        return null;
    }

    @Override
    public void deletar(Cliente cliente) {
        Session secao = this.session.openSession();
        Transaction t  = secao.beginTransaction();
        
        try{
            
            secao.delete(cliente);
            t.commit();
            
        }catch(Exception deletarCliente){
            
            System.out.println("Cliente não foi deletado,ocorreu algum erro.");
            t.rollback();
            
        }finally{
            secao.close();
        }    
    
    }

    @Override
    public void alterar(Cliente cliente) {
        Session session = this.session.openSession();
        Transaction t = session.beginTransaction();
        
        try{
        
        session.update(cliente);
        t.commit();
        
        
        }catch(Exception alteraClienteException){
            System.out.println(alteraClienteException.getMessage() + "\nAlgo de inesperado aconteceu ao alterar o cliente");
            t.rollback();
        }finally{
            session.close();
        }
        
    }

    @Override
    public List<Cliente> recuperarTodos() {
       Session secao = this.session.openSession();
       List<Cliente> lista = new ArrayList();
       
       try{
           lista = secao.createQuery("FROM Cliente").list();
       }catch(Exception listarClienteErro){
           System.out.println("Ocorreu algum erro ao listar todos os cliente");
           
       }finally{
           secao.close();
       }
       
       return lista;
    }
    
}
