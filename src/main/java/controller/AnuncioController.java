package controller;

import java.util.List;
import model.Anuncio;
import model.implementacoes.AnuncioHibernateDAO;

/**
 *
 * @author Jarvis
 */
public class AnuncioController {
    private static AnuncioHibernateDAO instance = null;
    
    public static AnuncioHibernateDAO getInstance(){
        if(instance == null){
            instance = new AnuncioHibernateDAO();
        }
        
        return instance;
    } 
    
    
    public static void adicionar(Anuncio anuncio){
        instance.cadastar(anuncio);
    }
    
    public static void deletar(Anuncio anuncio){
        instance.deletar(anuncio);
    }
    
    public static Anuncio recuperar(int codigo){
        return instance.recuperar(codigo);
    }
    
    public static void alterar(Anuncio anuncio){
        instance.alterar(anuncio);
    }
    
    public static List<Anuncio> recuperarTodos(){
        return instance.recuperarTodos();
    }
}
