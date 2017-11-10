package view;

import java.sql.Timestamp;
import java.time.Instant;
import model.Anuncio;
import model.Cliente;
import model.implementacoes.AnuncioHibernateDAO;

/**
 *
 * @author Jarvis
 */
public class testeMain {
    public static void main(String args[]){
        
        Cliente cliente = new Cliente("papa","pipi","popo0","pupu","777777");
         Instant iFinal = Instant.now();
         Instant iStart = Instant.now();
        
        Timestamp duracao = new Timestamp(System.currentTimeMillis());
        
        Anuncio anuncio = new Anuncio(cliente,duracao);
        
        AnuncioHibernateDAO acd = new AnuncioHibernateDAO();
        
        acd.cadastar(anuncio);
//        
//     @JoinColumn(name="cod_cliente", referencedColumnName="idCliente")
//    private Cliente cliente;
//    @Column
//    private Duration duracao;
    
  
    }
}
