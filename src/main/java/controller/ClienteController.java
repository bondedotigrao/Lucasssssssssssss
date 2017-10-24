package controller;

import java.util.List;
import model.Cliente;
import model.implementacoes.ClienteHibernateDAO;

/**
 *
 * @author Jarvis
 */
public class ClienteController {
    private static ClienteHibernateDAO instance = null;
    
    public static  ClienteHibernateDAO getInstance(){
        if(instance == null){
            instance = new ClienteHibernateDAO();
        }
        return instance;
    }
    
    public static void inserir(Cliente cliente){
        instance.cadastar(cliente);
    }
    
    public static void deletar(Cliente cliente){
        instance.deletar(cliente);
    }
    
    public static Cliente recuperar(int codigo){
        return instance.recuperar(codigo);
    }
    
    public static void alterar(Cliente cliente){
        instance.alterar(cliente);
    }
    
    public static List<Cliente> recuperarTodos(){
        return instance.recuperarTodos();
    }
}
