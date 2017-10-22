package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
    @Id
    private int id;
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
    
    public Cliente(){
        
    }

    public Cliente(int id, String nome, String telefone, String email, String endereco, String cadNacional) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cadNacional = cadNacional;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco + ", cadNacional=" + cadNacional + '}';
    }
    
    
    
    
}
