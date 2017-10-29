package model;

import java.io.Serializable;
import java.sql.Time;
import java.time.Duration;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Jarvis
 */
@Entity
public class Anuncio implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="idAnuncio")
    private int idAnuncio;
    @ManyToOne
    private Cliente cliente;
    @Column
    private Duration duracao;
    @ManyToOne
    private Painel painel;
    
    public Anuncio(){
        
    }

    public Anuncio(int idAnuncio, Cliente cliente, Duration duracao, Painel painel) {
        this.idAnuncio = idAnuncio;
        this.cliente = cliente;
        this.duracao = duracao;
        this.painel = painel;
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

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    public Painel getPainel() {
        return painel;
    }

    public void setPainel(Painel painel) {
        this.painel = painel;
    }

    @Override
    public String toString() {
        return "Anuncio{" + "idAnuncio=" + idAnuncio + ", cliente=" + cliente + ", duracao=" + duracao + ", painel=" + painel + '}';
    }

   
    
    
}
