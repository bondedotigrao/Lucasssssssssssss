package model;

import java.sql.Time;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Jarvis
 */
@Entity
public class Painel {
    @Id
    private int id;
    @Column(length = 50)
    private String endereco;
    @Column
    private Time horarioOn;
    @Column
    private List<Anuncio> anuncios;
    
    public Painel(){
        
    }

    public Painel(int id, String endereco, Time horarioOn, List<Anuncio> anuncios) {
        this.id = id;
        this.endereco = endereco;
        this.horarioOn = horarioOn;
        this.anuncios = anuncios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Time getHorarioOn() {
        return horarioOn;
    }

    public void setHorarioOn(Time horarioOn) {
        this.horarioOn = horarioOn;
    }

    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    @Override
    public String toString() {
        return "Painel{" + "id=" + id + ", endereco=" + endereco + ", horarioOn=" + horarioOn + ", anuncios=" + anuncios + '}';
    }
    
    
}
