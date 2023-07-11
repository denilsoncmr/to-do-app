/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Denilson
 */
public class ConnectionFactory {
 
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "";
    public static final String PASS = "";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception exception) {
            throw new RuntimeException("Falha na conexão com database" + exception.getMessage(), exception);
        }
    }
    
    public static void closeConnection(Connection connection){
        try {
            if(connection != null){
                connection.close();
            }
        } catch (Exception exception) {
            throw new RuntimeException("Falha ao fechar conexão com database", exception);
        }
    }
    public static void closeConnection(Connection connection, PreparedStatement statement){
        try {
            if(connection != null){
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
        } catch (Exception exception) {
            throw new RuntimeException("Falha ao fechar conexão com database", exception);
        }
    }
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet){
        try {
            if(connection != null){
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
            if(resultSet != null){
                resultSet.close();
            }
        } catch (Exception exception) {
            throw new RuntimeException("Falha ao fechar conexão com database", exception);
        }
    }
}
