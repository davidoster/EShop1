/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmdutils;

import interfaces.ICustomerCmdUtils;
import java.util.Scanner;

/**
 *
 * @author George.Pasparakis
 */
public class Customer implements ICustomerCmdUtils {
    private Scanner sc;
    
    public Customer(Scanner sc) {
        this.sc = sc;
    }
    
    @Override
    public models.Customer askData() {
        Command cmd = new Command();
        models.Customer customer = new models.Customer();
        
        // firstName, lastName, tel, email
        customer.setFirstName(cmd.getField(sc, "Type your First Name"));
        customer.setLastName(cmd.getField(sc, "Type your Last Name"));
        customer.setTel(cmd.getField(sc, "Type your Telephone Name"));
        customer.setEmail(cmd.getField(sc, "Type your Email Name"));
        
        return(customer);
    }
    
   
}
