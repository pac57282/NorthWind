/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author wende
 */
public class ConnectionFactory {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/northwind?characterEncoding=latin1&useConfigs=maxPerformance";
    
    public static Connection createConnectionToMySQL() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;
    }
    
    public static void main(String[] args) throws Exception{
        Connection con = createConnectionToMySQL();
        if (con != null){
            System.out.println("Conexão bem sucedida!");
            con.close();
        }
    }
    
}
