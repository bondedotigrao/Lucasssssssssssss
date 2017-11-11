package controller;

import java.util.List;
import model.Contrato;
import model.implementacoes.ContratoHibernateDAO;

/**
 *
 * @author Jarvis
 */
public class ContratoController {
    private static ContratoController instance = null;
    private ContratoHibernateDAO contratoDAO = null;
    
    public static ContratoController getInstance(){
        if(instance == null){
            instance = new ContratoController();
        }
        
        return instance;
    }
    
    public ContratoController(){
        this.contratoDAO = new ContratoHibernateDAO();
    }
    
    public void inserir(Contrato contrato){
        this.contratoDAO.cadastar(contrato);
    }
    
    public void alterar(Contrato contrato){
        this.contratoDAO.alterar(contrato);
    }
    
    public Contrato recuperar(int codigo){
        return this.contratoDAO.recuperar(codigo);
    }
    
    public void deletar(Contrato contrato){
        this.contratoDAO.deletar(contrato);
    }
    
    public List<Contrato> recuperarTodos(){
        return this.contratoDAO.recuperarTodos();
    }
}
