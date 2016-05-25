/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guiapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Felix
 */
public class sqlStuff 
{

ArrayList<Tutors> tutors = new ArrayList<Tutors>(); 
sqlStuff(){}
    
 ArrayList<Tutors> doSql()
{
    System.out.println("MySQL Connect Example.");
        Connection conn = null;
        String serverName = "purple-tutors.com";
        String mydatabase = "ptdatabase";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
        String driver = "com.mysql.jdbc.Driver";//I left this as is
        String userName = "fram2014"; //mysql user name
        String password = "platdev2014";//password
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url,userName,password);
            System.out.println("Connected to the database");
            
            
    Statement stmt = null;
    String query = "SELECT * FROM tutors";
    try {
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query); 
        while (rs.next()) 
        {
            Tutors tempT = new Tutors(rs.getString("fullname"),rs.getString("id"),rs.getString("payrate"));
           // System.out.println(rs.getString("fullname") + " " + rs.getString("id") + " "  + rs.getString("payrate"));
           tutors.add(tempT);
        }
    } catch (SQLException e ) {
    } finally {
        if (stmt != null) { stmt.close(); }
    }
            
            conn.close();
            System.out.println("Disconnected from database");
        } catch (Exception e) {
            e.printStackTrace();
}
        return tutors;
}

}
