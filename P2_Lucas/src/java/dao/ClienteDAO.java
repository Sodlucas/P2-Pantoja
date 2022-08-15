package dao;

import model.Cliente;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class ClienteDAO {
    
    public void cadastrarCliente(Cliente cliente) {
        String sql = "INSERT INTO USUARIO VALUES (null,?,?,?,?)";
        PreparedStatement pStatement = null;
        Connection conn = null;
        
        try {
            conn = new MySQLConnection().getConnection();
            pStatement = conn.prepareStatement(sql);
            pStatement.setString(1, cliente.getNome());
            pStatement.setString(2, cliente.getTelefone());
            pStatement.setString(3, cliente.getUsuario());
            pStatement.setString(4, cliente.getSenha());
            pStatement.execute();
            
        } catch (Exception e) {
            e.printStackTrace();  
            
        } finally {
            
            try {
            if(pStatement != null)
                pStatement.close();
            
            } catch (Exception e2) {
            e2.printStackTrace();  
            
            }
            
            try {
            if(conn != null)
                conn.close();
            
            } catch (Exception e2) {
            e2.printStackTrace();  
            
            }
            
        }
        
    }
    
}
