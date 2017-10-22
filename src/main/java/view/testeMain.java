package view;

import controller.ClienHibernateController;
import model.Cliente;

/**
 *
 * @author Jarvis
 */
public class testeMain {
    public static void main(String args[]){
       ClienHibernateController conexaoHibernate = new  ClienHibernateController();
        
       Cliente c = new Cliente(1,"Curlos","123",
               "curlosGatinhos2017@bol.com","Rua do cipó",
       "123");
       
       conexaoHibernate.cadastar(c);
       
               
//                   @Id
//    private int id;
//    @Column(length = 50)
//    private String nome;
//    @Column(length = 14)
//    private String telefone;
//    @Column(length = 45)
//    private String email;
//    @Column(length = 50)
//    private String endereco;
//    @Column(length = 14)
//    private String cadNacional;
    }
}
