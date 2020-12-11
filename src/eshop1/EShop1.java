/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import models.Product;



/**
 *
 * @author George.Pasparakis
 */
public class EShop1 {
     @PersistenceUnit(unitName = "EShop1PU")
     static EntityManagerFactory emf;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        cmdutils.Customer cmdCustomer = new cmdutils.Customer(sc);
//        cmdutils.Product  cmdProduct  = new cmdutils.Product(sc);
//        Database db = new Database();
//       
//        System.out.println("Inserted: " + db.insertCustomer(cmdCustomer.askData(), 
//                           "customers") + " record!");
        
//        System.out.println("Inserted: " + db.insertProduct(cmdProduct.askData(), 
//                           "products") + " record!");
        
//         db.insertOrder(sc);
//        
         // INSERT INTO `products`(`name`, `price`, `quantity`) VALUES("All Kit", "111,11", "1")
        // VALUES("Fixit Kit", "187,65", "1")
        String sql = "INSERT INTO `products`(`name`, `price`, `quantity`) VALUES(\"All Kit\", \"111,11\", \"1\")";
        emf = Persistence.createEntityManagerFactory("EShop1PU");
        EntityManager em = emf.createEntityManager();
        //em.createNativeQuery(sql);
        // new product in db
//        Product product = new Product("All Kit 11", 111.11, 1);
//        em.getTransaction().begin();
//        em.persist(product);
//        product.setQuantity(200);
//        em.getTransaction().commit();
//        System.out.println(product);
        
        // update the same product
        Product product2 = em.find(Product.class, 48);
        em.getTransaction().begin();
        product2.setQuantity(400);
        em.getTransaction().commit();
        
        // delete
        em.getTransaction().begin();
        em.remove(product2);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
    
}
