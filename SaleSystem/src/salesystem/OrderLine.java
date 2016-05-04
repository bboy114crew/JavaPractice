/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesystem;

/**
 *
 * @author pc
 */
public class OrderLine {
    public Product product;
    public float price;
    public int quantity;
    public float totalMoney()
    {
        return price * quantity;
    }

    public OrderLine(Product product, float price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }
    
}
