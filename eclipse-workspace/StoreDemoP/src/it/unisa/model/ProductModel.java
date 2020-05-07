package it.unisa.model;

import java.sql.SQLException;
import java.util.Collection;

public interface ProductModel <T>{	//per qualsiasi tipo di prodotto
	
	public T doRetrieveByKey(String code) throws SQLException;	//ricerca di un Bean dal codice
	
	public Collection<T> doRetriveAll(String order) throws SQLException; //lista ordinata dei prodotti
	
	public void doSave(T product) throws SQLException;	//salvataggio
			
	public void doUpdate(T product) throws SQLException;	//aggiornamento
		
	public void doDelete(T product) throws SQLException;	//elimina
	
}
