package it.unisa.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import com.mysql.jdbc.PreparedStatement;

public class ProductModelDM implements ProductModel<ProductBean> {

	@Override
	public ProductBean doRetrieveByKey(String code) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ProductBean> doRetriveAll(String order) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement= null;
		
		Collection<ProductBean> products= new LinkedList<ProductBean> ();
		
		String selectSQL= "SELECT * FROM product";
		
		if(order != null && !order.equals("")) {
			selectSQL += "ORDER BY " + order;
		}
		
		try {
			connection = DriverManagerConnectionPool.getConnection();
			preparedStatement = (PreparedStatement) connection.prepareStatement(selectSQL);
			
			System.out.println("doRetriveAll:" + preparedStatement.toString());
			ResultSet rs= preparedStatement.executeQuery();
			
			while(rs.next()) {
				ProductBean bean = new ProductBean();
				
				//prendo i dati e li assegno al bean temporaneo
				bean.setCode(rs.getInt("code"));
				bean.setName(rs.getString("name"));
				bean.setDescription(rs.getString("description"));
				bean.setPrice(rs.getInt("price"));
				bean.setQuantity(rs.getInt("quantity"));
				
				products.add(bean);
				
			}			
		} finally {
			try {
				if(preparedStatement != null)
					preparedStatement.close();
			}finally {
				DriverManagerConnectionPool.releaseConnection(connection);
			}
	
		}
		
		return products;	//ritorno la lista dei prodotti
	}

	@Override
	public void doSave(ProductBean product) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doUpdate(ProductBean product) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doDelete(ProductBean product) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
