package model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Jarvis
 */
@Entity
public class Contrato {
    @Id
    private int id;
    @OneToOne
    private Cliente cliente;
    @Column
    private Date inicioContrato;
    @Column
    private Date fimContrato;
    @Column
    private double valorTotal;
    
    public Contrato(){
        
    }

    public Contrato(int id, Cliente cliente, Date inicioContrato, Date fimContrato, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
        this.valorTotal = valorTotal;
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

    public Date getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(Date inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public Date getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(Date fimContrato) {
        this.fimContrato = fimContrato;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Contrato{" + "id=" + id + ", cliente=" + cliente + ", inicioContrato=" + inicioContrato + ", fimContrato=" + fimContrato + ", valorTotal=" + valorTotal + '}';
    }
    
    
}
