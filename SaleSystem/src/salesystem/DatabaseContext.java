/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesystem;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class DatabaseContext {

    public ArrayList<Customer> customers
            = new ArrayList();
    public ArrayList<Product> products
            = new ArrayList();
    public ArrayList<Order> orders
            = new ArrayList();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order findOrderByID(int id) {
        for (Order order : orders) {
            if (order.id == id) {
                return order;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProductByID(int id) {
        for (Product product : products) {
            if (product.id == id) {
                return product;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer findCustomerByID(String id) {
        for (Customer customer : customers) {
            if (customer.id.equals(id)) {
                return customer;
            }
        }
        return null;
    }

}
