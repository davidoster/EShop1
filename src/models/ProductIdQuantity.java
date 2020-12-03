/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author George.Pasparakis
 */
public class ProductIdQuantity {
    private int productId;
    private int quantity;

    public ProductIdQuantity() {
    }

    public ProductIdQuantity(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductIdQuantity{productId=").append(productId);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}
