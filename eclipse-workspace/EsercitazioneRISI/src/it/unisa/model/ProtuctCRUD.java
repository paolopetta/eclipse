package it.unisa.model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProtuctCRUD<T,S> {
    
    //Ci restituisce un oggetto T avente come chiave "code"
    public T doRetrieveByKey(S code) throws SQLException;

    //Ci restituisce tutti gli oggetti T ordinati secondo un order
    public ArrayList<T> doRetrieveAll(String order) throws  SQLException;
    
    //Salva un oggetto T nel db
    public void doSave(T product) throws SQLException;
    
    //Sostituisce l'oggetto T nel db
    public void doUpdate(T product) throws SQLException;
    
    //Elimina l'oggetto T nel db
    public void doDelete(T product) throws  SQLException;
}
