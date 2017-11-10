package model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Jarvis
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idContrato;
    @OneToOne
    @JoinColumn(name="cod_cliente", referencedColumnName="idCliente")
    private Cliente cliente;
    @Column
    private Date inicioContrato;
    @Column
    private Date fimContrato;
    @Column
    private double valorTotal;
    
    public Contrato(){
        
    }

    public Contrato(Cliente cliente, Date inicioContrato, Date fimContrato, double valorTotal) {
        this.cliente = cliente;
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return idContrato;
    }

    public void setId(int idContrato) {
        this.idContrato = idContrato;
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
        return "Contrato{" + "id=" + idContrato + ", cliente=" + cliente + ", inicioContrato=" + inicioContrato + ", fimContrato=" + fimContrato + ", valorTotal=" + valorTotal + '}';
    }
    
    
}
