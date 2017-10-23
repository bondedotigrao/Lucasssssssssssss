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
        
       Cliente c = new Cliente(1,"Cucuzinho","2222222222",
               "curlosGatinhos2017@bobilinha.com","Rua do penteioo queimadu",
       "445577788899");
       
      conexaoHibernate.alterar(c);
       
//       conexaoHibernate.deletar(c);
       
               
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
