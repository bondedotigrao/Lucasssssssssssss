package view;

import controller.ClienteController;
import model.implementacoes.ClienteHibernateDAO;
import model.Cliente;

/**
 *
 * @author Jarvis
 */
public class testeMain {
    public static void main(String args[]){
      
        
       Cliente c = new Cliente(666,"Tiãunbs","666",
               "sebasCuDeGato@boing.com","quebrada da brasilia,ta ligado?",
       "666");
       
      ClienteController.getInstance().cadastar(c);

    }
}
