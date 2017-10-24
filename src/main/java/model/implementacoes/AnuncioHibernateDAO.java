package model.implementacoes;

import java.util.List;
import model.Anuncio;
import model.interfaces.AnuncioDAO;

/**
 *
 * @author Jarvis
 */
public class AnuncioHibernateDAO implements AnuncioDAO {

    @Override
    public void cadastar(Anuncio anuncio) {
    
    }

    @Override
    public Anuncio recuperar(int codigo) {
    
        return null;
    }

    @Override
    public void deletar(Anuncio anuncio) {
    
    }

    @Override
    public void alterar(Anuncio anuncio) {
       
    }

    @Override
    public List<Anuncio> recuperarTodos() {
        
        return null;
    }
    
}
