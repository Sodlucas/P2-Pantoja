package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    
    public Connection getConnection() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");         
            
        } catch (Exception e) {
            e.printStackTrace();  
            
        }
        
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://jdbc:mysql://localhost:3306/p2", "root", "root2001");
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
                  
        return conn;
    }
    
}
