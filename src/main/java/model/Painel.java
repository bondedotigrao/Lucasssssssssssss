package model;

import java.time.Duration;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;

/**
 *
 * @author Jarvis
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Painel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPainel;
    @Column(length = 50)
    private String endereco;
    @Column
    private Duration horarioOn;
    @ManyToMany
    @MapsId("id")
    @JoinColumn(name="id", referencedColumnName="idAnuncio")
    private List<Anuncio> anuncios;
    
    public Painel(){
        
    }

    public Painel(String endereco, Duration horarioOn, List<Anuncio> anuncios) {
        this.endereco = endereco;
        this.horarioOn = horarioOn;
        this.anuncios = anuncios;
    }

    public int getId() {
        return this.idPainel;
    }

    public void setId(int id) {
        this.idPainel = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Duration getHorarioOn() {
        return horarioOn;
    }

    public void setHorarioOn(Duration horarioOn) {
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
        return "Painel{" + "id=" + idPainel + ", endereco=" + endereco + ", horarioOn=" + horarioOn + ", anuncios=" + anuncios + '}';
    }

   
}
