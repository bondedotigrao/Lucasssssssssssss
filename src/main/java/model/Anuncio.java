package model;

import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Jarvis
 */
@Entity
public class Anuncio {
    @Id
    private int id;
    @Column
    private Cliente cliente;
    @Column
    private Time tempo;
    
    public Anuncio(){
        
    }

    public Anuncio(int id, Cliente cliente, Time tempo) {
        this.id = id;
        this.cliente = cliente;
        this.tempo = tempo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Time getTempo() {
        return tempo;
    }

    public void setTempo(Time tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Anuncio{" + "id=" + id + ", cliente=" + cliente + ", tempo=" + tempo + '}';
    }
    
    
    
}
