/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinahmax;

/**
 *
 * @author Cabo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    public Connection Connect() {
        try {
            Connection conn =  DriverManager.getConnection("jdbc:mariadb://localhost:3306/bdinah?user=root&password=12345");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }//Constructor

}//Clas

