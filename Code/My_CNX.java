/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Author: Bowale Adetunji
 * Date: 9 November 2021
 * Purpose: Culminating project - App that allows students to purchase food from the plaza using SQL database
 * http://localhost/phpmyadmin/sql.php?db=users_db&table=users&lang=en&pos=0
 */

/*Set of libraries used in the code*/

import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*This Code establishes a connection to the SQL Databse*/

public class My_CNX {
    
/*Block of code has the variables used initialized set to the values that match the server*/
    
private static String servername = "localhost"; 
        
private static String username = "root";

private static String dbname = "users_db";

private static Integer portnumber = 3306;

private static String password = "";
    
    public static Connection getConnection(){
        
        Connection cnx = null;
        
        /*Block of code sets the various characteristics of the server to the aprpriate names*/
        /*This block of code also manually configures the SQL Database in Java*/
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        
        datasource.setUser(username);
        
        datasource.setPassword(password);
        
        datasource.setDatabaseName(dbname);
        
        datasource.setPortNumber(portnumber);
        
    try {
        
        cnx = datasource.getConnection(); //Gets the coneection if it successfully connected and stores it in the variable CNX
        
    } catch (SQLException ex) {
        
        Logger.getLogger("Get Connection -> "+My_CNX.class.getName()).log(Level.SEVERE, null, ex);//Prevents error and stops the program if a connection is not established
    }
        return cnx; //Returns the value of cnx 
    
    }  
}
