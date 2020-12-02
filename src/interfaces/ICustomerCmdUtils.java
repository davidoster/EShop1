/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import models.Customer;

/**
 *
 * @author George.Pasparakis
 */
public interface ICustomerCmdUtils {
    // ask from the cmd the customer's data and
    // return a new Customer
    public Customer askData();
}
