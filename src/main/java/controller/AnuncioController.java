package controller;

import java.util.List;
import model.Anuncio;
import model.implementacoes.AnuncioHibernateDAO;

/**
 *
 * @author Jarvis
 */
public class AnuncioController {
    private static AnuncioController instance = null;
    private AnuncioHibernateDAO anuncioDAO = null;
    
    public static AnuncioController getInstance(){
        if(instance == null){
            instance = new AnuncioController();
        }
        
        return instance;
    } 
    
    public AnuncioController(){
        anuncioDAO = new AnuncioHibernateDAO();
    }
    
    public  void adicionar(Anuncio anuncio){
        anuncioDAO.cadastar(anuncio);
    }
    
    public  void deletar(Anuncio anuncio){
        anuncioDAO.deletar(anuncio);
    }
    
    public  Anuncio recuperar(int codigo){
        return anuncioDAO.recuperar(codigo);
    }
    
    public  void alterar(Anuncio anuncio){
        anuncioDAO.alterar(anuncio);
    }
    
    public  List<Anuncio> recuperarTodos(){
        return anuncioDAO.recuperarTodos();
    }
}
