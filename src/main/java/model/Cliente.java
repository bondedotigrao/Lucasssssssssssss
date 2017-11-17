package model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(length = 50)
    private String nome;
    @Column(length = 14)
    private String telefone;
    @Column(length = 45)
    private String email;
    @Column(length = 50)
    private String endereco;
    @Column(length = 14)
    private String cadNacional;


    public Cliente() {
    }

    public Cliente( String nome, String telefone, String email, String endereco, String cadNacional) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cadNacional = cadNacional;

    }

    public int getId() {
        return idCliente;
    }

    public void setId(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCadNacional() {
        return cadNacional;
    }

    public void setCadNacional(String cadNacional) {
        this.cadNacional = cadNacional;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + idCliente + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco + ", cadNacional=" + cadNacional + '}';
    }

}
