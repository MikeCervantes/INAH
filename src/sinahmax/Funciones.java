/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinahmax;

import java.util.ArrayList;
import javax.swing.JComboBox;
import java.sql.*;
/**
 *
 * @author Cabo
 */
public class Funciones {
    DbConnection dc = new DbConnection();
    
    public ArrayList<String> llenarcombo (JComboBox cmbMunicipio){
        ArrayList<String> municipio = new ArrayList();
        
        try{
            
        Connection connection = dc.Connect();
        Statement statement = connection.createStatement();
        ResultSet buscar = statement.executeQuery("Select *From Municipio");
        
        
        while(buscar.next()){
            if(!buscar.isClosed())
            cmbMunicipio.addItem(buscar.getString("NombreMun"));
            System.out.println(buscar.getString("NombreMun"));
        }
        
        
        }
        
        catch(SQLException e){
            
        }
        
        return municipio;
    }
}
