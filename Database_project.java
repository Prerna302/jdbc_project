/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kumar
 */
public class Database_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con;
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Hospital_management");
        }
        catch(SQLException p){
            System.out.println(p.getMessage());
        }
    }
}
