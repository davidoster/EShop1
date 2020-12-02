/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmdutils;

import interfaces.IProductCmdUtils;
import java.util.Scanner;

/**
 *
 * @author George.Pasparakis
 */
public class Product implements IProductCmdUtils {
    private Scanner sc;
    
    public Product(Scanner sc) {
        this.sc = sc;
    }
    
    @Override
    public models.Product askData() {
        Command cmd = new Command();
        models.Product product = new models.Product();
        
        // firstName, lastName, tel, email
        product.setName(cmd.getField(sc, "Type the Name of the Product"));
        product.setPrice(cmd.getDoubleField(sc, "Type Product's Price"));
        product.setQuantity(cmd.getIntField(sc, "Type Product's Quantity"));
        return(product);
    }
}
