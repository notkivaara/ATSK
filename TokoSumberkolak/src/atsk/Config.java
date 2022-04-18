/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atsk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author user
 */
public class Config {
    private static Connection mysqlConfig;
    public static Connection configDB() throws SQLException {
        try {
            String url;
            url = "jdbc:mysql://localhost:3306/toko_sumberkolak";
            String user = "root";
            String password = "";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Succesful");
        }
        catch (SQLException e){
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
        
        return mysqlConfig;
        
    }
    
    public static void main(String[] args) throws SQLException {
        configDB();
    }
}
