package view;

import controller.AnuncioController;
import controller.PainelController;
import java.time.Duration;
import java.util.List;
import model.Anuncio;
import model.Painel;

/**
 *
 * @author Jarvis
 */
public class testeMain {
    public static void main(String args[]){
//        
//        Cliente cliente = new Cliente("asd","dsa","123","5555","777777");
//        
//        ClienteController cc1 = new ClienteController();
//        
//        cc1.inserir(cliente);
////        
////          @JoinColumn(name="cod_cliente", referencedColumnName="idCliente")
////    private Cliente cliente;
////    @Column
////    private Date inicioContrato;
////    @Column
////    private Date fimContrato;
////    @Column
////    private double valorTotal;
//
//        Contrato contrato = new Contrato(cliente,new Date(),new Date(),165.33);
//        
//        ContratoController cc = new ContratoController();
//        
//        cc.inserir(contrato);
////        
////     @JoinColumn(name="cod_cliente", referencedColumnName="idCliente")
////    private Cliente cliente;
////    @Column
////    private Duration duracao;

// private String endereco;
//    @Column
//    private Timestamp horarioOn;
//    @ManyToMany
//    @MapsId("id")
//    @JoinColumn(name="id", referencedColumnName="idAnuncio")
//    private List<Anuncio> anuncios;
//      
    Duration duracao = Duration.ofMinutes(3);
    
    AnuncioController ac = new AnuncioController();
    List<Anuncio> anuncios = ac.recuperarTodos();
    Painel painel = new Painel("Jupi citie",duracao,anuncios);
    PainelController pc = new PainelController();
    
    pc.inserir(painel);
    }
}
