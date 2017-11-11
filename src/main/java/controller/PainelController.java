package controller;

import java.util.List;
import model.Painel;
import model.implementacoes.PainelHibernateDAO;

/**
 *
 * @author Jarvis
 */
public class PainelController {
    private static PainelController instance = null;
    private PainelHibernateDAO painelDAO = null;
    
    public PainelController getInstance(){
        if(instance == null){
            instance = new PainelController();
        }
        
        return instance;
    }
    
    public PainelController(){
        painelDAO = new PainelHibernateDAO();
    }
    
    public void inserir(Painel painel){
        this.painelDAO.cadastar(painel);
    }
    
    public void alterar(Painel painel){
         this.painelDAO.alterar(painel);
    }
    
    public Painel recuperar(int codigo){
        return  this.painelDAO.recuperar(codigo);
    }
    
    public void deletar(Painel painel){
         this.painelDAO.deletar(painel);
    }
    
    public List<Painel> recuperarTodos(){
        return  this.painelDAO.recuperarTodos();
    }
}
