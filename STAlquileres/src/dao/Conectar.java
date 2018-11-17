
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
    
    private Connection con = null;

    public  Connection Conectar() {
        try {
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbalquiler", "root", "root");
            System.out.println("conectado");        
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error");
        }
         
        return null;
           
    }
    
    
}
