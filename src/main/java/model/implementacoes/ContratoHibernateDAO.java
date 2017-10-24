package model.implementacoes;

import java.util.List;
import model.Contrato;
import model.interfaces.ContratoDAO;

/**
 *
 * @author Jarvis
 */
public class ContratoHibernateDAO implements ContratoDAO {

    @Override
    public void cadastar(Contrato contrato) {
    
    }
    @Override
    public Contrato recuperar(int codigo) {
   
        return null;
    }

    @Override
    public void deletar(Contrato contrato) {
    
    }

    @Override
    public void alterar(Contrato t) {
       
    }

    @Override
    public List<Contrato> recuperarTodos() {
    
        return null;
    }
    
}
