/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jump;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Alastair
 */
public class connect {
    
    Connection cinn = null;
    public static Connection ConnectDB(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/Alastair/Desktop/CompsciFiles/jump/jumpproject.db");
            return conn;         
       
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

        
        
        
    }
    
}
