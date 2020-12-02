/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop1;

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
        
        Customer customer = new Customer();
        cmdutils.Customer cmdCustomer = new cmdutils.Customer(sc);
        customer = cmdCustomer.askData();
        System.out.println(customer);
    }
    
}
