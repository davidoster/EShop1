/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmdutils;

import java.util.Scanner;

/**
 *
 * @author George.Pasparakis
 */
public class Command {
    
    public String getField(Scanner sc, String message) {
        System.out.println(message);
        return(sc.nextLine());
    }
    
}
