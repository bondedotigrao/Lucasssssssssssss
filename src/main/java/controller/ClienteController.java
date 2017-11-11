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
    private ClienteHibernateDAO clienteDAO = null;
    
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
        this.clienteDAO.cadastar(cliente);
    }
    
    public  void deletar(Cliente cliente){
        this.clienteDAO.deletar(cliente);
    }
    
    public  Cliente recuperar(int codigo){
        return this.clienteDAO.recuperar(codigo);
    }
    
    public  void alterar(Cliente cliente){
       this.clienteDAO.alterar(cliente);
    }
    
    public  List<Cliente> recuperarTodos(){
        return this.clienteDAO.recuperarTodos();
    }
}
