package model;

import java.util.List;

/**
 *
 * @author Jarvis
 */
public interface InterfaceDAO<T> {
    
    void cadastar(T t);
    T recuperar(int codigo);
    void deletar(T t);
    void alterar(T t);
    List<T> recuperarTodos();
    
}
