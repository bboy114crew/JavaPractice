/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesystem;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pc
 */
public class Order {

    public int id;
    public String paymentMethod;
    public Date date;
    public Customer customer;
    ArrayList<OrderLine> orderlines
            = new ArrayList();

    public void addOrderLine(OrderLine line) {
        orderlines.add(line);
    }

    public float totalMoney() {
        float sum = 0;
        for (OrderLine orderline : orderlines) {
            sum += orderline.totalMoney();
        }
        return sum;
    }

    public Order(int id, String paymentMethod, Date date, Customer customer) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.date = date;
        this.customer = customer;
    }

    @Override
    public String toString() {
        String display = "";
        display += " Order Number: " + id + "\n";
        display += " Customer: " + customer.name + "\n";
        display += " Payment Method: " + paymentMethod + "\n";
        display += " Customer has bought: \n";
        for (OrderLine orderline : orderlines) {
            display += " Product: " + orderline.product.name
                    + " Quantity: " + orderline.quantity
                    + " Price: " + orderline.price
                    + "\n";
        }
        display += " Total money: " + totalMoney();
        return display;
    }

}
