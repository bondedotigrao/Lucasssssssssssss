package controller;

import java.util.List;
import model.Cliente;
import model.implementacoes.ClienteHibernateDAO;

/**
 *
 * @author Jarvis
 */
public class ClienteController {
    private static ClienteController instance = null;
    ClienteHibernateDAO clienteDAO = null;
    
    public static  ClienteController getInstance(){
        if(instance == null){
            instance = new ClienteController();
        }
        return instance;
    }
    
    public ClienteController(){
       clienteDAO  = new ClienteHibernateDAO();
    }
    
    public  void inserir(Cliente cliente){
        clienteDAO.cadastar(cliente);
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
