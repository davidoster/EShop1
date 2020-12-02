/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Customer;
import models.Product;

/**
 *
 * @author George.Pasparakis
 */
public class Database {
    public String server;
    public String username;
    public String password;
    public String database;
    
    Connection con;
    Statement statement;
    PreparedStatement prStatement;
    ResultSet rs;
    
    public Database() {
        
        username = "root";
        password = "CB12FT_Java!";
        database = "eshop1";
        server = "jdbc:mysql://localhost/" + database + "?useSSL=false&serverTimezone=Europe/Athens";
        try {
            con = DriverManager.getConnection(server, username, password);
            System.out.println("Connected!");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection is not established");
        }
    }
    
    // INSERT, UPDATE, DELETE <--- int result ----> executeUpdate
    // SELECT                 <--- ResultSet  ----> executeQuery
    
    // insert into customers
    public int insertCustomer(Customer c, String tableName) {
        // INSERT INTO `customers`(first_name, last_name, tel, email) 
        // VALUES("John", "Johnakos", "2111111", "j@j.jjj")
        int result = 0;
        StringBuilder sb = new StringBuilder();
        
        sb.append("INSERT INTO ");
        sb.append("`"); sb.append(tableName); sb.append("`");
        sb.append("(`first_name`, `last_name`, `tel`, `email`)");
        sb.append(" VALUES(");
        sb.append("\""); sb.append(c.getFirstName()); sb.append("\""); sb.append(",");
        sb.append("\""); sb.append(c.getLastName()); sb.append("\""); sb.append(",");
        sb.append("\""); sb.append(c.getTel()); sb.append("\""); sb.append(",");
        sb.append("\""); sb.append(c.getEmail()); sb.append("\"");
        sb.append(")");
        try {
            //        System.out.println(sb.toString());
            statement = con.createStatement();
            result = statement.executeUpdate(sb.toString());
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return(result);
    }
    
    public int insertProduct(Product p, String tableName) {
        // INSERT INTO `products`(`name`, `price`, `quantity`) 
        // VALUES("Fixit Kit", "187,65", "1")
        int result = 0;
        StringBuilder sb = new StringBuilder();
        
        sb.append("INSERT INTO ");
        sb.append("`"); sb.append(tableName); sb.append("`");
        sb.append("(`name`, `price`, `quantity`)");
        sb.append(" VALUES(");
        sb.append("\""); sb.append(p.getName()); sb.append("\""); sb.append(",");
        sb.append("\""); sb.append(p.getPrice()); sb.append("\""); sb.append(",");
        sb.append("\""); sb.append(p.getQuantity()); sb.append("\"");
        sb.append(")");
        try {
            //        System.out.println(sb.toString());
            statement = con.createStatement();
            result = statement.executeUpdate(sb.toString());
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return(result);
    }
    
}
