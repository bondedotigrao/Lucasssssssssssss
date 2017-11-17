package model;

import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Jarvis
 */
@Entity
public class Anuncio {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int idAnuncio;
    @OneToOne
    @JoinColumn(name="cod_cliente", referencedColumnName="idCliente")
    private Cliente cliente;
    @Column
    private Timestamp duracao;
    @ManyToMany
    @JoinColumn(name="id_painel", referencedColumnName="idPainel")
    private List<Painel> paineis;
    
    public Anuncio(){
        
    }

    public Anuncio(Cliente cliente, Timestamp duracao, List<Painel> paineis) {
        this.cliente = cliente;
        this.duracao = duracao;
        this.paineis = paineis;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Timestamp getDuracao() {
        return duracao;
    }

    public void setDuracao(Timestamp duracao) {
        this.duracao = duracao;
    }

    public List<Painel> getPaineis() {
        return paineis;
    }

    public void setPaineis(List<Painel> paineis) {
        this.paineis = paineis;
    }

    @Override
    public String toString() {
        return "Anuncio{" + "idAnuncio=" + idAnuncio + ", cliente=" + cliente + ", duracao=" + duracao + ", paineis=" + paineis + '}';
    }

   
}
