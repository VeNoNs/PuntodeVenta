/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apptic;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DaniShin
 */
public class conexion {
    
    public static Connection getConexion(){
        
        Connection conexion = null;
        
        try{
            
           /* Class.forName("com.mysql.jdbc.Driver");*/
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3305/tienda", "root", "1234");
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return conexion;
    }
}
