/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop1;

import dbutils.Database;
import java.util.Scanner;
import models.Customer;



/**
 *
 * @author George.Pasparakis
 */
public class EShop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cmdutils.Customer cmdCustomer = new cmdutils.Customer(sc);
        cmdutils.Product  cmdProduct  = new cmdutils.Product(sc);
        Database db = new Database();
       
//        System.out.println("Inserted: " + db.insertCustomer(cmdCustomer.askData(), 
//                           "customers") + " record!");
        
//        System.out.println("Inserted: " + db.insertProduct(cmdProduct.askData(), 
//                           "products") + " record!");
        
         db.insertOrder(sc);
        
    }
    
}
