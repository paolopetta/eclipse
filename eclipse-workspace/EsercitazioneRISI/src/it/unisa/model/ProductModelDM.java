package it.unisa.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductModelDM implements ProtuctCRUD<ProductBean,Integer>{

    public ProductBean doRetrieveByKey(Integer code) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ProductBean bean = new ProductBean();

        String sql = "SELECT * FROM product WHERE code = ?";

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, code);

            System.out.println("doRetrieveKey: " + preparedStatement.toString());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                bean.setCode(rs.getInt("code"));
                bean.setName(rs.getString("name"));
                bean.setDescription(rs.getString("description"));
                bean.setPrice(rs.getInt("price"));
                bean.setQuantity(rs.getInt("quantity"));
            }
        }
        finally {
            try{
                if(preparedStatement != null)
                    preparedStatement.close();
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }


        return bean;
    }

    public ArrayList<ProductBean> doRetrieveAll(String order) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<ProductBean> products = new ArrayList<ProductBean>();

        String sql = "SELECT * FROM product";

        if(order != null && !order.equals("") && (order.equals("code") || order.equals("name") || order.equals("description"))){
            sql += " ORDER BY " + order;
        }

        try {
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            System.out.println("doRetrieveAll: " + preparedStatement.toString());
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                ProductBean bean = new ProductBean();

                bean.setCode(result.getInt("code"));
                bean.setName(result.getString("name"));
                bean.setDescription(result.getString("description"));
                bean.setPrice(result.getInt("price"));
                bean.setQuantity(result.getInt("quantity"));

                products.add(bean);
            }
        } finally {
            if(preparedStatement != null) {
                preparedStatement.close();
            }
            DriverManagerConnectionPool.releaseConnection(connection);
        }

        return products;
    }

    public void doSave(ProductBean product) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO product (name, description, price, quantity) VALUES (?, ?, ?, ?)";

        try{
            connection = DriverManagerConnectionPool.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setInt(3, product.getPrice());
            preparedStatement.setInt(4, product.getQuantity());

            System.out.println("doSave: "+ preparedStatement.toString());
            preparedStatement.executeUpdate();

            connection.commit();
        }
        finally {
            try {
                if(preparedStatement != null)
                    preparedStatement.close();
            } finally {
                DriverManagerConnectionPool.releaseConnection(connection);
            }
        }
    }

    public void doUpdate(ProductBean product) throws SQLException {

    }

    public void doDelete(ProductBean product) throws SQLException {

    }
}
