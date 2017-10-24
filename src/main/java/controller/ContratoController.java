package controller;

import model.implementacoes.ContratoHibernateDAO;

/**
 *
 * @author Jarvis
 */
public class ContratoController {
    private static ContratoHibernateDAO instance = null;
    
    public static ContratoHibernateDAO getInstance(){
        if(instance == null){
            instance = new ContratoHibernateDAO();
        }
        
        return instance;
    }
}
